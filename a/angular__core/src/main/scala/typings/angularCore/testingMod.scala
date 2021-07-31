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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/core/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    extends StObject
       with typings.angularCore.testingTestingMod.TestBed {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("@angular/core/testing", "TestComponentRenderer")
  @js.native
  class TestComponentRenderer ()
    extends typings.angularCore.testingTestingMod.TestComponentRenderer
  
  @scala.inline
  def async(fn: js.Function): js.Function1[/* done */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ js.Any, js.Any]]
  
  @JSImport("@angular/core/testing", "__core_private_testing_placeholder__")
  @js.native
  val corePrivateTestingPlaceholder: /* "" */ String = js.native
  
  @scala.inline
  def discardPeriodicTasks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("discardPeriodicTasks")().asInstanceOf[Unit]
  
  @scala.inline
  def fakeAsync(fn: js.Function): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def flush(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Double]
  @scala.inline
  def flush(maxTurns: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(maxTurns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def flushMicrotasks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushMicrotasks")().asInstanceOf[Unit]
  
  @scala.inline
  def getTestBed(): typings.angularCore.testingTestingMod.TestBed = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestBed")().asInstanceOf[typings.angularCore.testingTestingMod.TestBed]
  
  @scala.inline
  def inject(tokens: js.Array[js.Any], fn: js.Function): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(tokens.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  
  @scala.inline
  def resetFakeAsyncZone(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFakeAsyncZone")().asInstanceOf[Unit]
  
  @scala.inline
  def tick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[Unit]
  @scala.inline
  def tick(millis: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def tick(millis: Double, tickOptions: ProcessNewMacroTasksSynchronously): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any], tickOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def tick(millis: Unit, tickOptions: ProcessNewMacroTasksSynchronously): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any], tickOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def waitForAsync(fn: js.Function): js.Function1[/* done */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ js.Any, js.Any]]
  
  @scala.inline
  def withModule(moduleDef: TestModuleMetadata): typings.angularCore.testingTestingMod.InjectSetupWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.testingTestingMod.InjectSetupWrapper]
  @scala.inline
  def withModule(moduleDef: TestModuleMetadata, fn: js.Function): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  
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
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compile components with a `templateUrl` for the test's NgModule.
      * It is necessary to call this function
      * as fetching urls is asynchronous.
      */
    @scala.inline
    def compileComponents(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileComponents")().asInstanceOf[js.Promise[js.Any]]
    
    /**
      * Allows overriding default compiler providers and settings
      * which are defined in test_injector.js
      */
    @scala.inline
    def configureCompiler(config: Providers): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("configureCompiler")(config.asInstanceOf[js.Any]).asInstanceOf[TestBedStatic]
    
    /**
      * Allows overriding default providers, directives, pipes, modules of the test injector,
      * which are defined in test_injector.js
      */
    @scala.inline
    def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("configureTestingModule")(moduleDef.asInstanceOf[js.Any]).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def createComponent[T](component: Type[T]): typings.angularCore.testingTestingMod.ComponentFixture[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(component.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.testingTestingMod.ComponentFixture[T]]
    
    /**
      * @deprecated from v9.0.0 use TestBed.inject
      * @suppress {duplicate}
      */
    @scala.inline
    def get(token: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get(token: js.Any, notFoundValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    /** @deprecated from v9.0.0 use TestBed.inject */
    @scala.inline
    def get[T](token: Type[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def initTestEnvironment(ngModule: js.Array[Type[js.Any]], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA]
    @scala.inline
    def initTestEnvironment(
      ngModule: js.Array[Type[js.Any]],
      platform: PlatformRef,
      aotSummaries: js.Function0[js.Array[js.Any]]
    ): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA]
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
    @scala.inline
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA]
    @scala.inline
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef, aotSummaries: js.Function0[js.Array[js.Any]]): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingA]
    
    @scala.inline
    def inject[T](token: AbstractType[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def inject_T_T[T](token: AbstractType[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def inject_T_T[T](token: InjectionToken[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def inject_T_T[T](token: Type[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def overrideComponent(component: Type[js.Any], `override`: MetadataOverride[Component]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideComponent")(component.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideDirective(directive: Type[js.Any], `override`: MetadataOverride[Directive]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideDirective")(directive.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideModule(ngModule: Type[js.Any], `override`: MetadataOverride[NgModule]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideModule")(ngModule.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overridePipe(pipe: Type[js.Any], `override`: MetadataOverride[Pipe]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overridePipe")(pipe.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    /**
      * Overwrites all providers for the given token with the given provider definition.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @scala.inline
    def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideProvider")(token.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    @scala.inline
    def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideProvider")(token.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideTemplate(component: Type[js.Any], template: String): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTemplate")(component.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    /**
      * Overrides the template of the given component, compiling the template
      * in the context of the TestingModule.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @scala.inline
    def overrideTemplateUsingTestingModule(component: Type[js.Any], template: String): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTemplateUsingTestingModule")(component.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    /**
      * Reset the providers for the test injector.
      */
    @scala.inline
    def resetTestEnvironment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTestEnvironment")().asInstanceOf[Unit]
    
    @scala.inline
    def resetTestingModule(): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTestingModule")().asInstanceOf[TestBedStatic]
  }
  
  @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b")
  @js.native
  class ɵangularPackagesCoreTestingTestingB ()
    extends typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB
  /* static members */
  object ɵangularPackagesCoreTestingTestingB {
    
    @JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_b")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compile components with a `templateUrl` for the test's NgModule.
      * It is necessary to call this function
      * as fetching urls is asynchronous.
      */
    @scala.inline
    def compileComponents(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileComponents")().asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def configureCompiler(config: Providers): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("configureCompiler")(config.asInstanceOf[js.Any]).asInstanceOf[TestBedStatic]
    
    /**
      * Allows overriding default providers, directives, pipes, modules of the test injector,
      * which are defined in test_injector.js
      */
    @scala.inline
    def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("configureTestingModule")(moduleDef.asInstanceOf[js.Any]).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def createComponent[T](component: Type[T]): typings.angularCore.testingTestingMod.ComponentFixture[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(component.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.testingTestingMod.ComponentFixture[T]]
    
    /** @deprecated from v9.0.0 use TestBed.inject */
    @scala.inline
    def get(token: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get(token: js.Any, notFoundValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    /** @deprecated from v9.0.0 use TestBed.inject */
    @scala.inline
    def get[T](token: Type[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: T): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def initTestEnvironment(ngModule: js.Array[Type[js.Any]], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.TestBed]
    @scala.inline
    def initTestEnvironment(
      ngModule: js.Array[Type[js.Any]],
      platform: PlatformRef,
      aotSummaries: js.Function0[js.Array[js.Any]]
    ): typings.angularCore.testingTestingMod.TestBed = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.TestBed]
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
    @scala.inline
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.TestBed]
    @scala.inline
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef, aotSummaries: js.Function0[js.Array[js.Any]]): typings.angularCore.testingTestingMod.TestBed = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[typings.angularCore.testingTestingMod.TestBed]
    
    @scala.inline
    def inject[T](token: AbstractType[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: AbstractType[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
    @scala.inline
    def inject[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], notFoundValue.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def inject_T_T[T](token: AbstractType[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def inject_T_T[T](token: InjectionToken[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def inject_T_T[T](token: Type[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def overrideComponent(component: Type[js.Any], `override`: MetadataOverride[Component]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideComponent")(component.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideDirective(directive: Type[js.Any], `override`: MetadataOverride[Directive]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideDirective")(directive.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideModule(ngModule: Type[js.Any], `override`: MetadataOverride[NgModule]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideModule")(ngModule.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overridePipe(pipe: Type[js.Any], `override`: MetadataOverride[Pipe]): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overridePipe")(pipe.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideProvider")(token.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    @scala.inline
    def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideProvider")(token.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    @scala.inline
    def overrideTemplate(component: Type[js.Any], template: String): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTemplate")(component.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    /**
      * Overrides the template of the given component, compiling the template
      * in the context of the TestingModule.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    @scala.inline
    def overrideTemplateUsingTestingModule(component: Type[js.Any], template: String): TestBedStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTemplateUsingTestingModule")(component.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[TestBedStatic]
    
    /**
      * Reset the providers for the test injector.
      *
      * @publicApi
      */
    @scala.inline
    def resetTestEnvironment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTestEnvironment")().asInstanceOf[Unit]
    
    @scala.inline
    def resetTestingModule(): TestBedStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTestingModule")().asInstanceOf[TestBedStatic]
  }
  
  @scala.inline
  def ɵangularPackagesCoreTestingTestingC(): typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_testing_testing_c")().asInstanceOf[typings.angularCore.testingTestingMod.ɵangularPackagesCoreTestingTestingB]
}
