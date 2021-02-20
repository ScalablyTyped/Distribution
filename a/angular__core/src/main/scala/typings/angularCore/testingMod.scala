package typings.angularCore

import typings.angularCore.anon.Deps
import typings.angularCore.anon.ProcessNewMacroTasksSynchronously
import typings.angularCore.anon.Providers
import typings.angularCore.anon.UseValue
import typings.angularCore.mod.AbstractType
import typings.angularCore.mod.Component
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.Directive
import typings.angularCore.mod.InjectFlags
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Type
import typings.angularCore.testingTestingMod.MetadataOverride
import typings.angularCore.testingTestingMod.TestBedStatic
import typings.angularCore.testingTestingMod.TestModuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/core/testing", "ComponentFixture")
  @js.native
  class ComponentFixture[T] protected ()
    extends typings.angularCore.testingTestingMod.ComponentFixture[T] {
    def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
    def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
  }
  
  @JSImport("@angular/core/testing", "ComponentFixtureAutoDetect")
  @js.native
  val ComponentFixtureAutoDetect: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing", "ComponentFixtureNoNgZone")
  @js.native
  val ComponentFixtureNoNgZone: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing", "InjectSetupWrapper")
  @js.native
  class InjectSetupWrapper protected ()
    extends typings.angularCore.testingTestingMod.InjectSetupWrapper {
    def this(_moduleDef: js.Function0[TestModuleMetadata]) = this()
  }
  
  @JSImport("@angular/core/testing", "TestBed")
  @js.native
  val TestBed: TestBedStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/core/testing", "TestBed")
  @js.native
  class TestBedCls protected ()
    extends typings.angularCore.testingTestingMod.TestBed {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("@angular/core/testing", "TestComponentRenderer")
  @js.native
  class TestComponentRenderer ()
    extends typings.angularCore.testingTestingMod.TestComponentRenderer
  
  @JSImport("@angular/core/testing", "async")
  @js.native
  def async(fn: js.Function): js.Function1[/* done */ js.Any, _] = js.native
  
  @JSImport("@angular/core/testing", "__core_private_testing_placeholder__")
  @js.native
  val corePrivateTestingPlaceholder: /* "" */ String = js.native
  
  @JSImport("@angular/core/testing", "discardPeriodicTasks")
  @js.native
  def discardPeriodicTasks(): Unit = js.native
  
  @JSImport("@angular/core/testing", "fakeAsync")
  @js.native
  def fakeAsync(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSImport("@angular/core/testing", "flush")
  @js.native
  def flush(): Double = js.native
  @JSImport("@angular/core/testing", "flush")
  @js.native
  def flush(maxTurns: Double): Double = js.native
  
  @JSImport("@angular/core/testing", "flushMicrotasks")
  @js.native
  def flushMicrotasks(): Unit = js.native
  
  @JSImport("@angular/core/testing", "getTestBed")
  @js.native
  def getTestBed(): typings.angularCore.testingTestingMod.TestBed = js.native
  
  @JSImport("@angular/core/testing", "inject")
  @js.native
  def inject(tokens: js.Array[_], fn: js.Function): js.Function0[_] = js.native
  
  @JSImport("@angular/core/testing", "resetFakeAsyncZone")
  @js.native
  def resetFakeAsyncZone(): Unit = js.native
  
  @JSImport("@angular/core/testing", "tick")
  @js.native
  def tick(): Unit = js.native
  @JSImport("@angular/core/testing", "tick")
  @js.native
  def tick(millis: js.UndefOr[scala.Nothing], tickOptions: ProcessNewMacroTasksSynchronously): Unit = js.native
  @JSImport("@angular/core/testing", "tick")
  @js.native
  def tick(millis: Double): Unit = js.native
  @JSImport("@angular/core/testing", "tick")
  @js.native
  def tick(millis: Double, tickOptions: ProcessNewMacroTasksSynchronously): Unit = js.native
  
  @JSImport("@angular/core/testing", "waitForAsync")
  @js.native
  def waitForAsync(fn: js.Function): js.Function1[/* done */ js.Any, _] = js.native
  
  @JSImport("@angular/core/testing", "withModule")
  @js.native
  def withModule(moduleDef: TestModuleMetadata): typings.angularCore.testingTestingMod.InjectSetupWrapper = js.native
  @JSImport("@angular/core/testing", "withModule")
  @js.native
  def withModule(moduleDef: TestModuleMetadata, fn: js.Function): js.Function0[_] = js.native
  
  @JSImport("@angular/core/testing", "\u0275MetadataOverrider")
  @js.native
  class ɵMetadataOverrider ()
    extends typings.angularCore.testingTestingMod.ɵMetadataOverrider
  
  @JSImport("@angular/core/testing", "\u0275TestingCompiler")
  @js.native
  class ɵTestingCompiler ()
    extends typings.angularCore.testingTestingMod.ɵTestingCompiler
  
  @JSImport("@angular/core/testing", "\u0275TestingCompilerFactory")
  @js.native
  abstract class ɵTestingCompilerFactory ()
    extends typings.angularCore.testingTestingMod.ɵTestingCompilerFactory
  
  @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
  @js.native
  class ɵangularPackagesCoreTestingTestingA ()
    extends typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA
  /* static members */
  object ɵangularPackagesCoreTestingTestingA {
    
    /**
      * Compile components with a `templateUrl` for the test's NgModule.
      * It is necessary to call this function
      * as fetching urls is asynchronous.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.compileComponents")
    @js.native
    def compileComponents(): js.Promise[_] = js.native
    
    /**
      * Allows overriding default compiler providers and settings
      * which are defined in test_injector.js
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.configureCompiler")
    @js.native
    def configureCompiler(config: Providers): TestBedStatic = js.native
    
    /**
      * Allows overriding default providers, directives, pipes, modules of the test injector,
      * which are defined in test_injector.js
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.configureTestingModule")
    @js.native
    def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.createComponent")
    @js.native
    def createComponent[T](component: Type[T]): typings.angularCore.testingTestingMod.ComponentFixture[T] = js.native
    
    /**
      * @deprecated from v9.0.0 use TestBed.inject
      * @suppress {duplicate}
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get(token: js.Any): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: InjectionToken[T]): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
    /** @deprecated from v9.0.0 use TestBed.inject */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: Type[T]): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.initTestEnvironment")
    @js.native
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
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: AbstractType[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: InjectionToken[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: Type[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject_T_T[T](token: AbstractType[T]): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject_T_T[T](token: InjectionToken[T]): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.inject")
    @js.native
    def inject_T_T[T](token: Type[T]): T = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideComponent")
    @js.native
    def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideDirective")
    @js.native
    def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideModule")
    @js.native
    def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overridePipe")
    @js.native
    def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
    
    /**
      * Overwrites all providers for the given token with the given provider definition.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideProvider")
    @js.native
    def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideProvider")
    @js.native
    def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideTemplate")
    @js.native
    def overrideTemplate(component: Type[_], template: String): TestBedStatic = js.native
    
    /**
      * Overrides the template of the given component, compiling the template
      * in the context of the TestingModule.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.overrideTemplateUsingTestingModule")
    @js.native
    def overrideTemplateUsingTestingModule(component: Type[_], template: String): TestBedStatic = js.native
    
    /**
      * Reset the providers for the test injector.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.resetTestEnvironment")
    @js.native
    def resetTestEnvironment(): Unit = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a.resetTestingModule")
    @js.native
    def resetTestingModule(): TestBedStatic = js.native
  }
  
  @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b")
  @js.native
  class ɵangularPackagesCoreTestingTestingB ()
    extends typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB
  /* static members */
  object ɵangularPackagesCoreTestingTestingB {
    
    /**
      * Compile components with a `templateUrl` for the test's NgModule.
      * It is necessary to call this function
      * as fetching urls is asynchronous.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.compileComponents")
    @js.native
    def compileComponents(): js.Promise[_] = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.configureCompiler")
    @js.native
    def configureCompiler(config: Providers): TestBedStatic = js.native
    
    /**
      * Allows overriding default providers, directives, pipes, modules of the test injector,
      * which are defined in test_injector.js
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.configureTestingModule")
    @js.native
    def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.createComponent")
    @js.native
    def createComponent[T](component: Type[T]): typings.angularCore.testingTestingMod.ComponentFixture[T] = js.native
    
    /** @deprecated from v9.0.0 use TestBed.inject */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get(token: js.Any): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: InjectionToken[T]): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
    /** @deprecated from v9.0.0 use TestBed.inject */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: Type[T]): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.get")
    @js.native
    def get[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): js.Any = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typings.angularCore.testingTestingMod.TestBed = js.native
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
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.initTestEnvironment")
    @js.native
    def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typings.angularCore.testingTestingMod.TestBed = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: AbstractType[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: InjectionToken[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: Type[T]): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: T): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: js.UndefOr[scala.Nothing], flags: InjectFlags): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject_T_T[T](token: AbstractType[T]): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject_T_T[T](token: InjectionToken[T]): T = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.inject")
    @js.native
    def inject_T_T[T](token: Type[T]): T = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideComponent")
    @js.native
    def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideDirective")
    @js.native
    def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideModule")
    @js.native
    def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overridePipe")
    @js.native
    def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideProvider")
    @js.native
    def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = js.native
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideProvider")
    @js.native
    def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideTemplate")
    @js.native
    def overrideTemplate(component: Type[_], template: String): TestBedStatic = js.native
    
    /**
      * Overrides the template of the given component, compiling the template
      * in the context of the TestingModule.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.overrideTemplateUsingTestingModule")
    @js.native
    def overrideTemplateUsingTestingModule(component: Type[_], template: String): TestBedStatic = js.native
    
    /**
      * Reset the providers for the test injector.
      *
      * @publicApi
      */
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.resetTestEnvironment")
    @js.native
    def resetTestEnvironment(): Unit = js.native
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b.resetTestingModule")
    @js.native
    def resetTestingModule(): TestBedStatic = js.native
  }
  
  @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_c")
  @js.native
  def ɵangularPackagesCoreTestingTestingC(): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB = js.native
}
