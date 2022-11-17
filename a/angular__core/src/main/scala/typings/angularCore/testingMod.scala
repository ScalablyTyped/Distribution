package typings.angularCore

import org.scalablytyped.runtime.Instantiable1
import typings.angularCore.anon.Deps
import typings.angularCore.anon.InjectOptionsoptionalfals
import typings.angularCore.anon.Instantiable
import typings.angularCore.anon.ProcessNewMacroTasksSynchronously
import typings.angularCore.anon.Providers
import typings.angularCore.anon.UseFactory
import typings.angularCore.anon.UseValue
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.Component
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.Directive
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.InjectFlags
import typings.angularCore.mod.InjectOptions
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.ProviderToken
import typings.angularCore.mod.SchemaMetadata
import typings.angularCore.mod.Type
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/core/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core/testing", "ComponentFixture")
  @js.native
  open class ComponentFixture[T] protected () extends StObject {
    def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
    def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
    
    /* private */ var _autoDetect: Any = js.native
    
    /* private */ var _getRenderer: Any = js.native
    
    /* private */ var _isDestroyed: Any = js.native
    
    /* private */ var _isStable: Any = js.native
    
    /* private */ var _onErrorSubscription: Any = js.native
    
    /* private */ var _onMicrotaskEmptySubscription: Any = js.native
    
    /* private */ var _onStableSubscription: Any = js.native
    
    /* private */ var _onUnstableSubscription: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _renderer: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
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
    var elementRef: ElementRef[Any] = js.native
    
    /**
      * Return whether the fixture is currently stable or has async tasks that have not been completed
      * yet.
      */
    def isStable(): Boolean = js.native
    
    /**
      * The native element at the root of the component.
      */
    var nativeElement: Any = js.native
    
    var ngZone: NgZone | Null = js.native
    
    /**
      * Get a promise that resolves when the ui state is stable following animations.
      */
    def whenRenderingDone(): js.Promise[Any] = js.native
    
    /**
      * Get a promise that resolves when the fixture is stable.
      *
      * This can be used to resume testing after events have triggered asynchronous activity or
      * asynchronous change detection.
      */
    def whenStable(): js.Promise[Any] = js.native
  }
  
  @JSImport("@angular/core/testing", "ComponentFixtureAutoDetect")
  @js.native
  val ComponentFixtureAutoDetect: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing", "ComponentFixtureNoNgZone")
  @js.native
  val ComponentFixtureNoNgZone: InjectionToken[js.Array[Boolean]] = js.native
  
  @JSImport("@angular/core/testing", "InjectSetupWrapper")
  @js.native
  open class InjectSetupWrapper protected () extends StObject {
    def this(_moduleDef: js.Function0[TestModuleMetadata]) = this()
    
    /* private */ var _addModule: Any = js.native
    
    /* private */ var _moduleDef: Any = js.native
    
    def inject(tokens: js.Array[Any], fn: js.Function): js.Function0[Any] = js.native
  }
  
  @js.native
  trait TestBed extends StObject {
    
    def compileComponents(): js.Promise[Any] = js.native
    
    def configureCompiler(config: Providers): Unit = js.native
    
    def configureTestingModule(moduleDef: TestModuleMetadata): typings.angularCore.testingMod.TestBed = js.native
    
    def createComponent[T](component: Type[T]): ComponentFixture[T] = js.native
    
    def execute(tokens: js.Array[Any], fn: js.Function): Any = js.native
    def execute(tokens: js.Array[Any], fn: js.Function, context: Any): Any = js.native
    
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get(token: Any): Any = js.native
    def get(token: Any, notFoundValue: Any): Any = js.native
    /** @deprecated from v9.0.0 use TestBed.inject */
    def get[T](token: ProviderToken[T]): Any = js.native
    def get[T](token: ProviderToken[T], notFoundValue: T): Any = js.native
    def get[T](token: ProviderToken[T], notFoundValue: T, flags: InjectFlags): Any = js.native
    def get[T](token: ProviderToken[T], notFoundValue: Unit, flags: InjectFlags): Any = js.native
    
    def initTestEnvironment(ngModule: js.Array[Type[Any]], platform: PlatformRef): Unit = js.native
    def initTestEnvironment(ngModule: js.Array[Type[Any]], platform: PlatformRef, options: TestEnvironmentOptions): Unit = js.native
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
    def initTestEnvironment(ngModule: Type[Any], platform: PlatformRef): Unit = js.native
    def initTestEnvironment(ngModule: Type[Any], platform: PlatformRef, options: TestEnvironmentOptions): Unit = js.native
    
    /** @deprecated use object-based flags (`InjectOptions`) instead. */
    def inject[T](token: ProviderToken[T]): T | Null = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: T): T = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: T, options: InjectOptions): T = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: Null, flags: InjectFlags): T | Null = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: Null, options: InjectOptions): T | Null = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: Unit, flags: InjectFlags): T = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptionsoptionalfals): T = js.native
    def inject[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptions): T | Null = js.native
    @JSName("inject")
    def inject_T_T[T](token: ProviderToken[T]): T = js.native
    @JSName("inject")
    def inject_T_T[T](token: ProviderToken[T], notFoundValue: Unit, options: InjectOptions): T = js.native
    
    def ngModule: Type[Any] | js.Array[Type[Any]] = js.native
    
    def overrideComponent(component: Type[Any], `override`: MetadataOverride[Component]): typings.angularCore.testingMod.TestBed = js.native
    
    def overrideDirective(directive: Type[Any], `override`: MetadataOverride[Directive]): typings.angularCore.testingMod.TestBed = js.native
    
    def overrideModule(ngModule: Type[Any], `override`: MetadataOverride[NgModule]): typings.angularCore.testingMod.TestBed = js.native
    
    def overridePipe(pipe: Type[Any], `override`: MetadataOverride[Pipe]): typings.angularCore.testingMod.TestBed = js.native
    
    /**
      * Overwrites all providers for the given token with the given provider definition.
      */
    def overrideProvider(token: Any, provider: Deps): typings.angularCore.testingMod.TestBed = js.native
    def overrideProvider(token: Any, provider: UseFactory): typings.angularCore.testingMod.TestBed = js.native
    def overrideProvider(token: Any, provider: UseValue): typings.angularCore.testingMod.TestBed = js.native
    
    def overrideTemplate(component: Type[Any], template: String): typings.angularCore.testingMod.TestBed = js.native
    
    def overrideTemplateUsingTestingModule(component: Type[Any], template: String): typings.angularCore.testingMod.TestBed = js.native
    
    def platform: PlatformRef = js.native
    
    /**
      * Reset the providers for the test injector.
      */
    def resetTestEnvironment(): Unit = js.native
    
    def resetTestingModule(): typings.angularCore.testingMod.TestBed = js.native
  }
  @JSImport("@angular/core/testing", "TestBed")
  @js.native
  val TestBed: TestBedStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/core/testing", "TestBed")
  @js.native
  open class TestBedCls protected ()
    extends StObject
       with typings.angularCore.testingMod.TestBed {
    def this(args: Any*) = this()
  }
  
  @JSImport("@angular/core/testing", "TestComponentRenderer")
  @js.native
  open class TestComponentRenderer () extends StObject {
    
    def insertRootElement(rootElementId: String): Unit = js.native
    
    var removeAllRootElements: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  inline def async(fn: js.Function): js.Function1[/* done */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ Any, Any]]
  
  @JSImport("@angular/core/testing", "__core_private_testing_placeholder__")
  @js.native
  val corePrivateTestingPlaceholder: /* "" */ String = js.native
  
  inline def discardPeriodicTasks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("discardPeriodicTasks")().asInstanceOf[Unit]
  
  inline def fakeAsync(fn: js.Function): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fakeAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def flush(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Double]
  inline def flush(maxTurns: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(maxTurns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def flushMicrotasks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushMicrotasks")().asInstanceOf[Unit]
  
  inline def getTestBed(): typings.angularCore.testingMod.TestBed = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestBed")().asInstanceOf[typings.angularCore.testingMod.TestBed]
  
  inline def inject(tokens: js.Array[Any], fn: js.Function): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(tokens.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
  
  inline def resetFakeAsyncZone(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFakeAsyncZone")().asInstanceOf[Unit]
  
  inline def tick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[Unit]
  inline def tick(millis: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def tick(millis: Double, tickOptions: ProcessNewMacroTasksSynchronously): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any], tickOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def tick(millis: Unit, tickOptions: ProcessNewMacroTasksSynchronously): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tick")(millis.asInstanceOf[js.Any], tickOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForAsync(fn: js.Function): js.Function1[/* done */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* done */ Any, Any]]
  
  inline def withModule(moduleDef: TestModuleMetadata): InjectSetupWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any]).asInstanceOf[InjectSetupWrapper]
  inline def withModule(moduleDef: TestModuleMetadata, fn: js.Function): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withModule")(moduleDef.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
  
  @JSImport("@angular/core/testing", "\u0275MetadataOverrider")
  @js.native
  open class ɵMetadataOverrider () extends StObject {
    
    /* private */ var _references: Any = js.native
    
    /**
      * Creates a new instance for the given metadata class
      * based on an old instance and overrides.
      */
    def overrideMetadata[C /* <: T */, T](metadataClass: Instantiable[T, C], oldMetadata: C, `override`: MetadataOverride[T]): C = js.native
  }
  
  trait MetadataOverride[T] extends StObject {
    
    var add: js.UndefOr[Partial[T]] = js.undefined
    
    var remove: js.UndefOr[Partial[T]] = js.undefined
    
    var set: js.UndefOr[Partial[T]] = js.undefined
  }
  object MetadataOverride {
    
    inline def apply[T](): MetadataOverride[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOverride[T]]
    }
    
    extension [Self <: MetadataOverride[?], T](x: Self & MetadataOverride[T]) {
      
      inline def setAdd(value: Partial[T]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setRemove(value: Partial[T]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSet(value: Partial[T]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  trait ModuleTeardownOptions extends StObject {
    
    /** Whether the test module should be destroyed after every test. Defaults to `true`. */
    var destroyAfterEach: Boolean
    
    /** Whether errors during test module destruction should be re-thrown. Defaults to `true`. */
    var rethrowErrors: js.UndefOr[Boolean] = js.undefined
  }
  object ModuleTeardownOptions {
    
    inline def apply(destroyAfterEach: Boolean): ModuleTeardownOptions = {
      val __obj = js.Dynamic.literal(destroyAfterEach = destroyAfterEach.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleTeardownOptions]
    }
    
    extension [Self <: ModuleTeardownOptions](x: Self) {
      
      inline def setDestroyAfterEach(value: Boolean): Self = StObject.set(x, "destroyAfterEach", value.asInstanceOf[js.Any])
      
      inline def setRethrowErrors(value: Boolean): Self = StObject.set(x, "rethrowErrors", value.asInstanceOf[js.Any])
      
      inline def setRethrowErrorsUndefined: Self = StObject.set(x, "rethrowErrors", js.undefined)
    }
  }
  
  @js.native
  trait TestBedStatic
    extends StObject
       with typings.angularCore.testingMod.TestBed
       with Instantiable1[/* args (repeated) */ Any, typings.angularCore.testingMod.TestBed]
  
  trait TestEnvironmentOptions extends StObject {
    
    /**
      * Whether errors should be thrown when unknown elements are present in component's template.
      * Defaults to `false`, where the error is simply logged.
      * If set to `true`, the error is thrown.
      * @see https://angular.io/errors/NG8001 for the description of the error and how to fix it
      */
    var errorOnUnknownElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether errors should be thrown when unknown properties are present in component's template.
      * Defaults to `false`, where the error is simply logged.
      * If set to `true`, the error is thrown.
      * @see https://angular.io/errors/NG8002 for the description of the error and how to fix it
      */
    var errorOnUnknownProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures the test module teardown behavior in `TestBed`.
      */
    var teardown: js.UndefOr[ModuleTeardownOptions] = js.undefined
  }
  object TestEnvironmentOptions {
    
    inline def apply(): TestEnvironmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestEnvironmentOptions]
    }
    
    extension [Self <: TestEnvironmentOptions](x: Self) {
      
      inline def setErrorOnUnknownElements(value: Boolean): Self = StObject.set(x, "errorOnUnknownElements", value.asInstanceOf[js.Any])
      
      inline def setErrorOnUnknownElementsUndefined: Self = StObject.set(x, "errorOnUnknownElements", js.undefined)
      
      inline def setErrorOnUnknownProperties(value: Boolean): Self = StObject.set(x, "errorOnUnknownProperties", value.asInstanceOf[js.Any])
      
      inline def setErrorOnUnknownPropertiesUndefined: Self = StObject.set(x, "errorOnUnknownProperties", js.undefined)
      
      inline def setTeardown(value: ModuleTeardownOptions): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
  
  trait TestModuleMetadata extends StObject {
    
    var declarations: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Whether NG0304 runtime errors should be thrown when unknown elements are present in component's
      * template. Defaults to `false`, where the error is simply logged. If set to `true`, the error is
      * thrown.
      * @see https://angular.io/errors/NG8001 for the description of the problem and how to fix it
      */
    var errorOnUnknownElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether errors should be thrown when unknown properties are present in component's template.
      * Defaults to `false`, where the error is simply logged.
      * If set to `true`, the error is thrown.
      * @see https://angular.io/errors/NG8002 for the description of the error and how to fix it
      */
    var errorOnUnknownProperties: js.UndefOr[Boolean] = js.undefined
    
    var imports: js.UndefOr[js.Array[Any]] = js.undefined
    
    var providers: js.UndefOr[js.Array[Any]] = js.undefined
    
    var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[Any]]] = js.undefined
    
    var teardown: js.UndefOr[ModuleTeardownOptions] = js.undefined
  }
  object TestModuleMetadata {
    
    inline def apply(): TestModuleMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestModuleMetadata]
    }
    
    extension [Self <: TestModuleMetadata](x: Self) {
      
      inline def setDeclarations(value: js.Array[Any]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
      
      inline def setDeclarationsVarargs(value: Any*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setErrorOnUnknownElements(value: Boolean): Self = StObject.set(x, "errorOnUnknownElements", value.asInstanceOf[js.Any])
      
      inline def setErrorOnUnknownElementsUndefined: Self = StObject.set(x, "errorOnUnknownElements", js.undefined)
      
      inline def setErrorOnUnknownProperties(value: Boolean): Self = StObject.set(x, "errorOnUnknownProperties", value.asInstanceOf[js.Any])
      
      inline def setErrorOnUnknownPropertiesUndefined: Self = StObject.set(x, "errorOnUnknownProperties", js.undefined)
      
      inline def setImports(value: js.Array[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setImportsVarargs(value: Any*): Self = StObject.set(x, "imports", js.Array(value*))
      
      inline def setProviders(value: js.Array[Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setProvidersVarargs(value: Any*): Self = StObject.set(x, "providers", js.Array(value*))
      
      inline def setSchemas(value: js.Array[SchemaMetadata | js.Array[Any]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: (SchemaMetadata | js.Array[Any])*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setTeardown(value: ModuleTeardownOptions): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    }
  }
}
