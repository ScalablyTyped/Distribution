package typings.angularCore.testingMod

import typings.angularCore.anon.Deps
import typings.angularCore.anon.Providers
import typings.angularCore.anon.UseValue
import typings.angularCore.mod.AbstractType
import typings.angularCore.mod.Component
import typings.angularCore.mod.Directive
import typings.angularCore.mod.InjectFlags
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Type
import typings.angularCore.testingTestingMod.MetadataOverride
import typings.angularCore.testingTestingMod.TestBedStatic
import typings.angularCore.testingTestingMod.TestModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
class ɵangularPackagesCoreTestingTestingA ()
  extends typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA

/* static members */
@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
object ɵangularPackagesCoreTestingTestingA extends js.Object {
  /**
    * Compile components with a `templateUrl` for the test's NgModule.
    * It is necessary to call this function
    * as fetching urls is asynchronous.
    */
  def compileComponents(): js.Promise[_] = js.native
  /**
    * Allows overriding default compiler providers and settings
    * which are defined in test_injector.js
    */
  def configureCompiler(config: Providers): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): typings.angularCore.testingTestingMod.ComponentFixture[T] = js.native
  /**
    * @deprecated from v9.0.0 use TestBed.inject
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  /** @deprecated from v9.0.0 use TestBed.inject */
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
  /**
    * Initialize the environment for testing with a compiler factory, a PlatformRef, and an
    * angular module. These are common to every test in the suite.
    *
    * This may only be called once, to set up the common providers for the current test
    * suite on the current platform. If you absolutely need to change the providers,
    * first use `resetTestEnvironment`.
    *
    * Test modules and platforms for individual platforms are available from
    * '@angular/<platform_name>/testing'.
    */
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
  def inject[T](token: AbstractType[T]): T | Null = js.native
  def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
  def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  def inject[T](token: InjectionToken[T]): T | Null = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  def inject[T](token: Type[T]): T | Null = js.native
  def inject[T](token: Type[T], notFoundValue: T): T = js.native
  def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
  def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
  @JSName("inject")
  def inject_T_T[T](token: AbstractType[T]): T = js.native
  @JSName("inject")
  def inject_T_T[T](token: InjectionToken[T]): T = js.native
  @JSName("inject")
  def inject_T_T[T](token: Type[T]): T = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  /**
    * Overwrites all providers for the given token with the given provider definition.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = js.native
  def overrideTemplate(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Overrides the template of the given component, compiling the template
    * in the context of the TestingModule.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideTemplateUsingTestingModule(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Reset the providers for the test injector.
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

