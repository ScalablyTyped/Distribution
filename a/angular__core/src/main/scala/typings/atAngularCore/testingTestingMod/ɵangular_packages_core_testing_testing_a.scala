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

@JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
class ɵangular_packages_core_testing_testing_a ()
  extends Injector
     with TestBed {
  var _activeFixtures: js.Any = js.native
  var _aotSummaries: js.Any = js.native
  var _assertNotInstantiated: js.Any = js.native
  var _compiler: js.Any = js.native
  var _compilerOptions: js.Any = js.native
  var _componentOverrides: js.Any = js.native
  var _createCompilerAndModule: js.Any = js.native
  var _declarations: js.Any = js.native
  var _directiveOverrides: js.Any = js.native
  var _imports: js.Any = js.native
  var _initIfNeeded: js.Any = js.native
  var _instantiated: js.Any = js.native
  var _isRoot: js.Any = js.native
  var _moduleFactory: js.Any = js.native
  var _moduleOverrides: js.Any = js.native
  var _moduleRef: js.Any = js.native
  var _pipeOverrides: js.Any = js.native
  var _providers: js.Any = js.native
  var _rootProviderOverrides: js.Any = js.native
  var _schemas: js.Any = js.native
  var _templateOverrides: js.Any = js.native
  var _testEnvAotSummaries: js.Any = js.native
  var overrideProviderImpl: js.Any = js.native
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
@JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
object ɵangular_packages_core_testing_testing_a extends js.Object {
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
  def configureCompiler(config: Anon_Providers): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
  /**
    * @deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): ɵangular_packages_core_testing_testing_a = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): ɵangular_packages_core_testing_testing_a = js.native
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
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): ɵangular_packages_core_testing_testing_a = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): ɵangular_packages_core_testing_testing_a = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  /**
    * Overwrites all providers for the given token with the given provider definition.
    *
    * Note: This works for JIT and AOTed components as well.
    */
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
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

