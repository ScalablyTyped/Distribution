package typings.angularCore

import org.scalablytyped.runtime.Instantiable1
import typings.angularCore.anon.Deps
import typings.angularCore.anon.InstantiableC
import typings.angularCore.anon.ProcessNewMacroTasksSynchronously
import typings.angularCore.anon.Providers
import typings.angularCore.anon.UseFactory
import typings.angularCore.anon.UseValue
import typings.angularCore.mod.AbstractType
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.CompilerOptions
import typings.angularCore.mod.Component
import typings.angularCore.mod.ComponentFactory
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.Directive
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.InjectFlags
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.SchemaMetadata
import typings.angularCore.mod.Type
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/core/testing/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core/testing/testing", "ComponentFixture")
  @js.native
  class ComponentFixture[T] protected () extends StObject {
    def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
    def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
    
    var _autoDetect: js.Any = js.native
    
    var _getRenderer: js.Any = js.native
    
    var _isDestroyed: js.Any = js.native
    
    var _isStable: js.Any = js.native
    
    var _onErrorSubscription: js.Any = js.native
    
    var _onMicrotaskEmptySubscription: js.Any = js.native
    
    var _onStableSubscription: js.Any = js.native
    
    var _onUnstableSubscription: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    var _renderer: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    var _tick: js.Any = js.native
    
    /**
      * Set whether the fixture should autodetect changes.
      *
      * Also runs detectChanges once so that any existing change is detected.
      */
    def autoDetectChanges(): Unit = js.native
    def autoDetectChanges(autoDetect: Boolean): Unit = js.native
    
    /**
      * The ChangeDetectorRef for the component
      */
    var changeDetectorRef: ChangeDetectorRef = js.native
    
    /**
      * Do a change detection run to make sure there were no changes.
      */
    def checkNoChanges(): Unit = js.native
    
    /**
      * The instance of the root component class.
      */
    var componentInstance: T = js.native
    
    var componentRef: ComponentRef[T] = js.native
    
    /**
      * The DebugElement associated with the root element of this component.
      */
    var debugElement: DebugElement = js.native
    
    /**
      * Trigger component destruction.
      */
    def destroy(): Unit = js.native
    
    /**
      * Trigger a change detection cycle for the component.
      */
    def detectChanges(): Unit = js.native
    def detectChanges(checkNoChanges: Boolean): Unit = js.native
    
    /**
      * The ElementRef for the element at the root of the component.
      */
    var elementRef: ElementRef[js.Any] = js.native
    
    /**
      * Return whether the fixture is currently stable or has async tasks that have not been completed
      * yet.
      */
    def isStable(): Boolean = js.native
    
    /**
      * The native element at the root of the component.
      */
    var nativeElement: js.Any = js.native
    
    var ngZone: NgZone | Null = js.native
    
    /**
      * Get a promise that resolves when the ui state is stable following animations.
      */
    def whenRenderingDone(): js.Promise[js.Any] = js.native
    
    /**
      * Get a promise that resolves when the fixture is stable.
      *
      * This can be used to resume testing after events have triggered asynchronous activity or
      * asynchronous change detection.
      */
    def whenStable(): js.Promise[js.Any] = js.native
  }
  
  @JSImport("@angular/core/testing/testing", "ComponentFixtureAutoDetect")
  @js.native
  val ComponentFixtureAutoDetect: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing/testing", "ComponentFixtureNoNgZone")
  @js.native
  val ComponentFixtureNoNgZone: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing/testing", "InjectSetupWrapper")
  @js.native
  class InjectSetupWrapper protected () extends StObject {
    def this(_moduleDef: js.Function0[TestModuleMetadata]) = this()
    
    var _addModule: js.Any = js.native
    
    var _moduleDef: js.Any = js.native
    
    def inject(tokens: js.Array[js.Any], fn: js.Function): js.Function0[js.Any] = js.native
  }
  
  @js.native
  trait TestBed extends StObject {
    
    def compileComponents(): js.Promise[js.Any] = js.native
    
    def configureCompiler(config: Providers): Unit = js.native
    
    def configureTestingModule(moduleDef: TestModuleMetadata): Unit = js.native
    
    def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
    
    def execute(tokens: js.Array[js.Any], fn: js.Function): js.Any = js.native
    def execute(tokens: js.Array[js.Any], fn: js.Function, context: js.Any): js.Any = js.native
    
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get(token: js.Any): js.Any = js.native
    def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
    def get[T](token: InjectionToken[T]): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): js.Any = js.native
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get[T](token: Type[T]): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): js.Any = js.native
    
    def initTestEnvironment(ngModule: js.Array[Type[js.Any]], platform: PlatformRef): Unit = js.native
    def initTestEnvironment(
      ngModule: js.Array[Type[js.Any]],
      platform: PlatformRef,
      aotSummaries: js.Function0[js.Array[js.Any]]
    ): Unit = js.native
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
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef): Unit = js.native
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef, aotSummaries: js.Function0[js.Array[js.Any]]): Unit = js.native
    
    def inject[T](token: AbstractType[T]): T | Null = js.native
    def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: AbstractType[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    def inject[T](token: InjectionToken[T]): T | Null = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    def inject[T](token: Type[T]): T | Null = js.native
    def inject[T](token: Type[T], notFoundValue: T): T = js.native
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: AbstractType[T]): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: InjectionToken[T]): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: Type[T]): T = js.native
    
    var ngModule: Type[js.Any] | js.Array[Type[js.Any]] = js.native
    
    def overrideComponent(component: Type[js.Any], `override`: MetadataOverride[Component]): Unit = js.native
    
    def overrideDirective(directive: Type[js.Any], `override`: MetadataOverride[Directive]): Unit = js.native
    
    def overrideModule(ngModule: Type[js.Any], `override`: MetadataOverride[NgModule]): Unit = js.native
    
    def overridePipe(pipe: Type[js.Any], `override`: MetadataOverride[Pipe]): Unit = js.native
    
    /**
      * Overwrites all providers for the given token with the given provider definition.
      */
    def overrideProvider(token: js.Any, provider: Deps): Unit = js.native
    def overrideProvider(token: js.Any, provider: UseFactory): Unit = js.native
    def overrideProvider(token: js.Any, provider: UseValue): Unit = js.native
    
    def overrideTemplateUsingTestingModule(component: Type[js.Any], template: String): Unit = js.native
    
    var platform: PlatformRef = js.native
    
    /**
      * Reset the providers for the test injector.
      */
    def resetTestEnvironment(): Unit = js.native
    
    def resetTestingModule(): Unit = js.native
  }
  @JSImport("@angular/core/testing/testing", "TestBed")
  @js.native
  val TestBed: TestBedStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/core/testing/testing", "TestBed")
  @js.native
  class TestBedCls protected ()
    extends StObject
       with typings.angularCore.testingTestingMod.TestBed {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("@angular/core/testing/testing", "TestComponentRenderer")
  @js.native
  class TestComponentRenderer () extends StObject {
    
    def insertRootElement(rootElementId: String): Unit = js.native
  }
  
  @scala.inline
  def async(fn: js.Function): js.Function1[/* done */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ js.Any, js.Any]]
  
  @JSImport("@angular/core/testing/testing", "__core_private_testing_placeholder__")
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
  def withModule(moduleDef: TestModuleMetadata): InjectSetupWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any]).asInstanceOf[InjectSetupWrapper]
  @scala.inline
  def withModule(moduleDef: TestModuleMetadata, fn: js.Function): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
  
  @JSImport("@angular/core/testing/testing", "\u0275MetadataOverrider")
  @js.native
  class ɵMetadataOverrider () extends StObject {
    
    var _references: js.Any = js.native
    
    /**
      * Creates a new instance for the given metadata class
      * based on an old instance and overrides.
      */
    def overrideMetadata[C /* <: T */, T](metadataClass: InstantiableC[T, C], oldMetadata: C, `override`: MetadataOverride[T]): C = js.native
  }
  
  @JSImport("@angular/core/testing/testing", "\u0275TestingCompiler")
  @js.native
  class ɵTestingCompiler () extends Compiler {
    
    /**
      * Gets the component factory for the given component.
      * This assumes that the component has been compiled before calling this call using
      * `compileModuleAndAllComponents*`.
      */
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    
    /**
      * Returns the component type that is stored in the given error.
      * This can be used for errors created by compileModule...
      */
    def getComponentFromError(error: Error): Type[js.Any] | Null = js.native
    
    def injector: Injector = js.native
    
    /**
      * Allows to pass the compile summary from AOT compilation to the JIT compiler,
      * so that it can use the code generated by AOT.
      */
    def loadAotSummaries(summaries: js.Function0[js.Array[js.Any]]): Unit = js.native
    
    def overrideComponent(component: Type[js.Any], overrides: MetadataOverride[Component]): Unit = js.native
    
    def overrideDirective(directive: Type[js.Any], overrides: MetadataOverride[Directive]): Unit = js.native
    
    def overrideModule(module: Type[js.Any], overrides: MetadataOverride[NgModule]): Unit = js.native
    
    def overridePipe(directive: Type[js.Any], overrides: MetadataOverride[Pipe]): Unit = js.native
  }
  
  @JSImport("@angular/core/testing/testing", "\u0275TestingCompilerFactory")
  @js.native
  abstract class ɵTestingCompilerFactory () extends StObject {
    
    def createTestingCompiler(): ɵTestingCompiler = js.native
    def createTestingCompiler(options: js.Array[CompilerOptions]): ɵTestingCompiler = js.native
  }
  
  @JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_a")
  @js.native
  class ɵangularPackagesCoreTestingTestingA ()
    extends StObject
       with typings.angularCore.testingTestingMod.TestBed {
    
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
  }
  /* static members */
  object ɵangularPackagesCoreTestingTestingA {
    
    @JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_a")
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
    def createComponent[T](component: Type[T]): ComponentFixture[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentFixture[T]]
    
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
    def initTestEnvironment(ngModule: js.Array[Type[js.Any]], platform: PlatformRef): ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[ɵangularPackagesCoreTestingTestingA]
    @scala.inline
    def initTestEnvironment(
      ngModule: js.Array[Type[js.Any]],
      platform: PlatformRef,
      aotSummaries: js.Function0[js.Array[js.Any]]
    ): ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[ɵangularPackagesCoreTestingTestingA]
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
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef): ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[ɵangularPackagesCoreTestingTestingA]
    @scala.inline
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef, aotSummaries: js.Function0[js.Array[js.Any]]): ɵangularPackagesCoreTestingTestingA = (^.asInstanceOf[js.Dynamic].applyDynamic("initTestEnvironment")(ngModule.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], aotSummaries.asInstanceOf[js.Any])).asInstanceOf[ɵangularPackagesCoreTestingTestingA]
    
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
  
  @JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_b")
  @js.native
  class ɵangularPackagesCoreTestingTestingB ()
    extends StObject
       with typings.angularCore.testingTestingMod.TestBed {
    
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
    
    var destroyActiveFixtures: js.Any = js.native
  }
  /* static members */
  object ɵangularPackagesCoreTestingTestingB {
    
    @JSImport("@angular/core/testing/testing", "\u0275angular_packages_core_testing_testing_b")
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
    def createComponent[T](component: Type[T]): ComponentFixture[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentFixture[T]]
    
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
  def ɵangularPackagesCoreTestingTestingC(): ɵangularPackagesCoreTestingTestingB = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_testing_testing_c")().asInstanceOf[ɵangularPackagesCoreTestingTestingB]
  
  trait MetadataOverride[T] extends StObject {
    
    var add: js.UndefOr[Partial[T]] = js.undefined
    
    var remove: js.UndefOr[Partial[T]] = js.undefined
    
    var set: js.UndefOr[Partial[T]] = js.undefined
  }
  object MetadataOverride {
    
    @scala.inline
    def apply[T](): MetadataOverride[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOverride[T]]
    }
    
    @scala.inline
    implicit class MetadataOverrideMutableBuilder[Self <: MetadataOverride[?], T] (val x: Self & MetadataOverride[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Partial[T]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setRemove(value: Partial[T]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSet(value: Partial[T]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  @js.native
  trait TestBedStatic
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, typings.angularCore.testingTestingMod.TestBed] {
    
    /**
      * Compile components with a `templateUrl` for the test's NgModule.
      * It is necessary to call this function
      * as fetching urls is asynchronous.
      */
    def compileComponents(): js.Promise[js.Any] = js.native
    
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
    
    def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
    
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get(token: js.Any): js.Any = js.native
    def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
    def get[T](token: InjectionToken[T]): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    def get[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): js.Any = js.native
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get[T](token: Type[T]): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
    def get[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): js.Any = js.native
    
    def initTestEnvironment(ngModule: js.Array[Type[js.Any]], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = js.native
    def initTestEnvironment(
      ngModule: js.Array[Type[js.Any]],
      platform: PlatformRef,
      aotSummaries: js.Function0[js.Array[js.Any]]
    ): typings.angularCore.testingTestingMod.TestBed = js.native
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef): typings.angularCore.testingTestingMod.TestBed = js.native
    def initTestEnvironment(ngModule: Type[js.Any], platform: PlatformRef, aotSummaries: js.Function0[js.Array[js.Any]]): typings.angularCore.testingTestingMod.TestBed = js.native
    
    def inject[T](token: AbstractType[T]): T | Null = js.native
    def inject[T](token: AbstractType[T], notFoundValue: T): T = js.native
    def inject[T](token: AbstractType[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: AbstractType[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: AbstractType[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    def inject[T](token: InjectionToken[T]): T | Null = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T): T = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: InjectionToken[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    def inject[T](token: Type[T]): T | Null = js.native
    def inject[T](token: Type[T], notFoundValue: T): T = js.native
    def inject[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: Type[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: Type[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: AbstractType[T]): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: InjectionToken[T]): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: Type[T]): T = js.native
    
    def overrideComponent(component: Type[js.Any], `override`: MetadataOverride[Component]): TestBedStatic = js.native
    
    def overrideDirective(directive: Type[js.Any], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
    
    def overrideModule(ngModule: Type[js.Any], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
    
    def overridePipe(pipe: Type[js.Any], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
    
    /**
      * Overwrites all providers for the given token with the given provider definition.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    def overrideProvider(token: js.Any, provider: Deps): TestBedStatic = js.native
    def overrideProvider(token: js.Any, provider: UseFactory): TestBedStatic = js.native
    def overrideProvider(token: js.Any, provider: UseValue): TestBedStatic = js.native
    
    def overrideTemplate(component: Type[js.Any], template: String): TestBedStatic = js.native
    
    /**
      * Overrides the template of the given component, compiling the template
      * in the context of the TestingModule.
      *
      * Note: This works for JIT and AOTed components as well.
      */
    def overrideTemplateUsingTestingModule(component: Type[js.Any], template: String): TestBedStatic = js.native
    
    /**
      * Reset the providers for the test injector.
      */
    def resetTestEnvironment(): Unit = js.native
    
    def resetTestingModule(): TestBedStatic = js.native
  }
  
  trait TestModuleMetadata extends StObject {
    
    var aotSummaries: js.UndefOr[js.Function0[js.Array[js.Any]]] = js.undefined
    
    var declarations: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var imports: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var providers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[js.Any]]] = js.undefined
  }
  object TestModuleMetadata {
    
    @scala.inline
    def apply(): TestModuleMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestModuleMetadata]
    }
    
    @scala.inline
    implicit class TestModuleMetadataMutableBuilder[Self <: TestModuleMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAotSummaries(value: () => js.Array[js.Any]): Self = StObject.set(x, "aotSummaries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAotSummariesUndefined: Self = StObject.set(x, "aotSummaries", js.undefined)
      
      @scala.inline
      def setDeclarations(value: js.Array[js.Any]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
      
      @scala.inline
      def setDeclarationsVarargs(value: js.Any*): Self = StObject.set(x, "declarations", js.Array(value :_*))
      
      @scala.inline
      def setImports(value: js.Array[js.Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      @scala.inline
      def setImportsVarargs(value: js.Any*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setProviders(value: js.Array[js.Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      @scala.inline
      def setProvidersVarargs(value: js.Any*): Self = StObject.set(x, "providers", js.Array(value :_*))
      
      @scala.inline
      def setSchemas(value: js.Array[SchemaMetadata | js.Array[js.Any]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: (SchemaMetadata | js.Array[js.Any])*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    }
  }
}
