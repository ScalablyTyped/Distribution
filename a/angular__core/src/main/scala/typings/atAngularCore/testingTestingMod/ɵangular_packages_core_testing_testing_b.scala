package typings.atAngularCore.testingTestingMod

import typings.atAngularCore.Anon_Deps
import typings.atAngularCore.Anon_Providers
import typings.atAngularCore.Anon_UseValue
import typings.atAngularCore.atAngularCoreMod.Component
import typings.atAngularCore.atAngularCoreMod.Directive
import typings.atAngularCore.atAngularCoreMod.InjectFlags
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgModule
import typings.atAngularCore.atAngularCoreMod.Pipe
import typings.atAngularCore.atAngularCoreMod.PlatformRef
import typings.atAngularCore.atAngularCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing/testing", "ɵangular_packages_core_testing_testing_b")
@js.native
class ɵangular_packages_core_testing_testing_b ()
  extends Injector
     with TestBed {
  var _activeFixtures: js.Any = js.native
  var _compiler: js.Any = js.native
  var _globalCompilationChecked: js.Any = js.native
  var _testModuleRef: js.Any = js.native
  var assertNotInstantiated: js.Any = js.native
  /**
    * Check whether the module scoping queue should be flushed, and flush it if needed.
    *
    * When the TestBed is reset, it clears the JIT module compilation queue, cancelling any
    * in-progress module compilation. This creates a potential hazard - the very first time the
    * TestBed is initialized (or if it's reset without being initialized), there may be pending
    * compilations of modules declared in global scope. These compilations should be finished.
    *
    * To ensure that globally declared modules have their components scoped properly, this function
    * is called whenever TestBed is initialized or reset. The _first_ time that this happens, prior
    * to any other operations, the scoping queue is flushed.
    */
  var checkGlobalCompilationFinished: js.Any = js.native
  val compiler: js.Any = js.native
  var destroyActiveFixtures: js.Any = js.native
  val testModuleRef: js.Any = js.native
  /**
    * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  /* InferMemberOverrides */
  override def get(token: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def get[T](token: InjectionToken[T]): T with js.Any = js.native
  /* InferMemberOverrides */
  override def get[T](token: InjectionToken[T], notFoundValue: T): T with js.Any = js.native
  /* InferMemberOverrides */
  override def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T with js.Any = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  /* InferMemberOverrides */
  override def get[T](token: Type[T]): T with js.Any = js.native
  /* InferMemberOverrides */
  override def get[T](token: Type[T], notFoundValue: T): T with js.Any = js.native
  /* InferMemberOverrides */
  override def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T with js.Any = js.native
}

/* static members */
@JSImport("@angular/core/testing/testing", "ɵangular_packages_core_testing_testing_b")
@js.native
object ɵangular_packages_core_testing_testing_b extends js.Object {
  /**
    * Compile components with a `templateUrl` for the test's NgModule.
    * It is necessary to call this function
    * as fetching urls is asynchronous.
    */
  def compileComponents(): js.Promise[_] = js.native
  def configureCompiler(config: Anon_Providers): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
  /**
    * @deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): TestBed = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): TestBed = js.native
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
    *
    * @publicApi
    */
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): TestBed = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): TestBed = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: Anon_Deps): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: Anon_UseValue): TestBedStatic = js.native
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
    *
    * @publicApi
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

