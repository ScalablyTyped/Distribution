package typings.angularCore.testingTestingMod

import org.scalablytyped.runtime.TopLevel
import typings.angularCore.AnonDeps
import typings.angularCore.AnonDepsUseFactory
import typings.angularCore.AnonProviders
import typings.angularCore.AnonUseValue
import typings.angularCore.mod.Component
import typings.angularCore.mod.Directive
import typings.angularCore.mod.InjectFlags
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestBed extends js.Object {
  var ngModule: Type[_] | js.Array[Type[_]] = js.native
  var platform: PlatformRef = js.native
  def compileComponents(): js.Promise[_] = js.native
  def configureCompiler(config: AnonProviders): Unit = js.native
  def configureTestingModule(moduleDef: TestModuleMetadata): Unit = js.native
  def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
  def execute(tokens: js.Array[_], fn: js.Function): js.Any = js.native
  def execute(tokens: js.Array[_], fn: js.Function, context: js.Any): js.Any = js.native
  /**
    * deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    * This does not use the deprecated jsdoc tag on purpose
    * because it renders all overloads as deprecated in TSLint
    * due to https://github.com/palantir/tslint/issues/4522.
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): Unit = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): Unit = js.native
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
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): Unit = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): Unit = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): Unit = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): Unit = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): Unit = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): Unit = js.native
  /**
    * Overwrites all providers for the given token with the given provider definition.
    */
  def overrideProvider(token: js.Any, provider: AnonDeps): Unit = js.native
  def overrideProvider(token: js.Any, provider: AnonDepsUseFactory): Unit = js.native
  def overrideProvider(token: js.Any, provider: AnonUseValue): Unit = js.native
  def overrideTemplateUsingTestingModule(component: Type[_], template: String): Unit = js.native
  /**
    * Reset the providers for the test injector.
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): Unit = js.native
}

@JSImport("@angular/core/testing/testing", "TestBed")
@js.native
object TestBed extends TopLevel[TestBedStatic]

