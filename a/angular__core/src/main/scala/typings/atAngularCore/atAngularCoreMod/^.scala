package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.Anon_Any
import typings.atAngularCore.Anon_ArgsCls
import typings.atAngularCore.Anon_Bootstrap
import typings.atAngularCore.Anon_ChangeDetection
import typings.atAngularCore.Anon_ContentQueries
import typings.atAngularCore.Anon_ContentQueriesExportAs
import typings.atAngularCore.Anon_Data
import typings.atAngularCore.Anon_Declarations
import typings.atAngularCore.Anon_FactoryImports
import typings.atAngularCore.Anon_FactoryName
import typings.atAngularCore.Anon_NameTarget
import typings.atAngularCore.Anon_NameTargetDocument
import typings.atAngularCore.Anon_NameTargetNull
import typings.atAngularCore.Anon_OwnerDocument
import typings.atAngularCore.Anon_Text
import typings.atAngularCore.ProjectionSlots
import typings.atAngularCore.TAttributes
import typings.atAngularCore.TData
import typings.atAngularCore.TsickleIssue1009
import typings.atAngularCore.atAngularCoreNumbers.`false`
import typings.atAngularCore.atAngularCoreNumbers.`true`
import typings.atAngularCore.atAngularCoreStrings.`en-US`
import typings.rxjs.rxjsMod.Observable
import typings.std.Element
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANALYZE_FOR_ENTRY_COMPONENTS: InjectionToken[js.Any] = js.native
  val APP_BOOTSTRAP_LISTENER: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]] = js.native
  val APP_ID: InjectionToken[String] = js.native
  val APP_INITIALIZER: InjectionToken[js.Array[js.Function0[Unit]]] = js.native
  val Attribute: AttributeDecorator = js.native
  val COMPILER_OPTIONS: InjectionToken[js.Array[CompilerOptions]] = js.native
  val CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = js.native
  val Component: ComponentDecorator = js.native
  val ContentChild: ContentChildDecorator = js.native
  val ContentChildren: ContentChildrenDecorator = js.native
  val Directive: DirectiveDecorator = js.native
  val Host: HostDecorator = js.native
  val HostBinding: HostBindingDecorator = js.native
  val HostListener: HostListenerDecorator = js.native
  val INJECTOR: InjectionToken[Injector] = js.native
  val Inject: InjectDecorator = js.native
  val Injectable: InjectableDecorator = js.native
  val Input: InputDecorator = js.native
  val LOCALE_ID: InjectionToken[String] = js.native
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  val NgModule: NgModuleDecorator = js.native
  val Optional: OptionalDecorator = js.native
  val Output: OutputDecorator = js.native
  val PACKAGE_ROOT_URL: InjectionToken[String] = js.native
  val PLATFORM_ID: InjectionToken[js.Object] = js.native
  val PLATFORM_INITIALIZER: InjectionToken[js.Array[js.Function0[Unit]]] = js.native
  val Pipe: PipeDecorator = js.native
  val Self: SelfDecorator = js.native
  val SkipSelf: SkipSelfDecorator = js.native
  val TRANSLATIONS: InjectionToken[String] = js.native
  val TRANSLATIONS_FORMAT: InjectionToken[String] = js.native
  val Type: FunctionConstructor = js.native
  val VERSION: Version = js.native
  val ViewChild: ViewChildDecorator = js.native
  val ViewChildren: ViewChildrenDecorator = js.native
  val ɵALLOW_MULTIPLE_PLATFORMS: InjectionToken[Boolean] = js.native
  val ɵAPP_ROOT: InjectionToken[Boolean] = js.native
  val ɵDEFAULT_LOCALE_ID: `en-US` = js.native
  val ɵEMPTY_ARRAY: js.Array[js.Any] = js.native
  val ɵNG_BASE_DEF: String = js.native
  val ɵNG_COMPONENT_DEF: String = js.native
  val ɵNG_DIRECTIVE_DEF: String = js.native
  val ɵNG_ELEMENT_ID: String = js.native
  val ɵNG_INJECTABLE_DEF: String = js.native
  val ɵNG_INJECTOR_DEF: String = js.native
  val ɵNG_MODULE_DEF: String = js.native
  val ɵNG_PIPE_DEF: String = js.native
  val ɵNO_CHANGE: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  val ɵSWITCH_CHANGE_DETECTOR_REF_FACTORY__POST_R3__ : js.Function0[ChangeDetectorRef] = js.native
  val ɵSWITCH_COMPILE_COMPONENT__POST_R3__ : js.Function2[
    /* type */ typings.atAngularCore.atAngularCoreMod.Type[js.Any], 
    /* metadata */ typings.atAngularCore.atAngularCoreMod.Component, 
    Unit
  ] = js.native
  val ɵSWITCH_COMPILE_DIRECTIVE__POST_R3__ : js.Function2[
    /* type */ typings.atAngularCore.atAngularCoreMod.Type[js.Any], 
    /* directive */ typings.atAngularCore.atAngularCoreMod.Directive, 
    Unit
  ] = js.native
  val ɵSWITCH_COMPILE_INJECTABLE__POST_R3__ : js.Function2[
    /* type */ typings.atAngularCore.atAngularCoreMod.Type[js.Any], 
    /* srcMeta */ js.UndefOr[typings.atAngularCore.atAngularCoreMod.Injectable], 
    Unit
  ] = js.native
  val ɵSWITCH_COMPILE_NGMODULE__POST_R3__ : js.Function2[
    /* moduleType */ typings.atAngularCore.atAngularCoreMod.Type[js.Any], 
    /* ngModule */ js.UndefOr[typings.atAngularCore.atAngularCoreMod.NgModule], 
    Unit
  ] = js.native
  val ɵSWITCH_COMPILE_PIPE__POST_R3__ : js.Function2[
    /* type */ typings.atAngularCore.atAngularCoreMod.Type[js.Any], 
    /* meta */ typings.atAngularCore.atAngularCoreMod.Pipe, 
    Unit
  ] = js.native
  val ɵSWITCH_ELEMENT_REF_FACTORY__POST_R3__ : js.Function1[
    /* import warning: ImportType.apply Failed type conversion: typeof ElementRef */ /* ElementRefToken */ js.Any, 
    ElementRef[js.Any]
  ] = js.native
  val ɵSWITCH_IVY_ENABLED__POST_R3__ : `true` = js.native
  val ɵSWITCH_RENDERER2_FACTORY__POST_R3__ : js.Function0[Renderer2] = js.native
  val ɵSWITCH_VIEW_CONTAINER_REF_FACTORY__POST_R3__ : js.Function2[
    /* import warning: ImportType.apply Failed type conversion: typeof ViewContainerRef */ /* ViewContainerRefToken */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: typeof ElementRef */ /* ElementRefToken */ js.Any, 
    ViewContainerRef
  ] = js.native
  val ɵangular_packages_core_core_bb: InjectionToken[js.Function1[/* fn */ js.Function0[Unit], Unit]] = js.native
  val ɵangular_packages_core_core_r: js.Array[StaticProvider] = js.native
  val ɵangular_packages_core_core_t: Boolean = js.native
  val ɵdefaultIterableDiffers: IterableDiffers = js.native
  val ɵdefaultKeyValueDiffers: KeyValueDiffers = js.native
  val ɵglobal: js.Any = js.native
  val ɵivyEnabled: `false` = js.native
  val ɵɵdefaultStyleSanitizer: StyleSanitizeFn = js.native
  def asNativeElements(debugEls: js.Array[DebugElement]): js.Any = js.native
  def assertPlatform(requiredToken: js.Any): PlatformRef = js.native
  def createPlatform(injector: Injector): PlatformRef = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: String
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: String,
    providers: js.Array[StaticProvider]
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(parentPlatformFactory: Null, name: String): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(parentPlatformFactory: Null, name: String, providers: js.Array[StaticProvider]): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def destroyPlatform(): Unit = js.native
  def enableProdMode(): Unit = js.native
  def forwardRef(forwardRefFn: ForwardRefFn): typings.atAngularCore.atAngularCoreMod.Type[_] = js.native
  def getDebugNode(nativeNode: js.Any): DebugNode | Null = js.native
  def getModuleFactory(id: String): NgModuleFactory[_] = js.native
  def getPlatform(): PlatformRef | Null = js.native
  def isDevMode(): Boolean = js.native
  def platformCore(): PlatformRef = js.native
  def platformCore(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def resolveForwardRef[T](`type`: T): T = js.native
  def setTestabilityGetter(getter: GetTestability): Unit = js.native
  def wtfCreateScope(signature: String): WtfScopeFn = js.native
  def wtfCreateScope(signature: String, flags: js.Any): WtfScopeFn = js.native
  def wtfEndTimeRange(range: js.Any): Unit = js.native
  def wtfLeave[T](scope: js.Any): T = js.native
  def wtfLeave[T](scope: js.Any, returnValue: T): T = js.native
  def wtfStartTimeRange(rangeType: String, action: String): js.Any = js.native
  def ɵCompiler_compileModuleAndAllComponentsAsync__POST_R3__[T](moduleType: typings.atAngularCore.atAngularCoreMod.Type[T]): js.Promise[ModuleWithComponentFactories[T]] = js.native
  def ɵCompiler_compileModuleAndAllComponentsSync__POST_R3__[T](moduleType: typings.atAngularCore.atAngularCoreMod.Type[T]): ModuleWithComponentFactories[T] = js.native
  def ɵCompiler_compileModuleAsync__POST_R3__[T](moduleType: typings.atAngularCore.atAngularCoreMod.Type[T]): js.Promise[NgModuleFactory[T]] = js.native
  def ɵCompiler_compileModuleSync__POST_R3__[T](moduleType: typings.atAngularCore.atAngularCoreMod.Type[T]): NgModuleFactory[T] = js.native
  def ɵINJECTOR_IMPL__POST_R3__(providers: js.Array[StaticProvider], parent: js.UndefOr[scala.Nothing], name: String): Injector = js.native
  def ɵINJECTOR_IMPL__POST_R3__(providers: js.Array[StaticProvider], parent: Injector, name: String): Injector = js.native
  def ɵLifecycleHooksFeature(component: js.Any, `def`: ɵComponentDef[_]): Unit = js.native
  def ɵ_sanitizeHtml(defaultDoc: js.Any, unsafeHtmlInput: String): String = js.native
  def ɵ_sanitizeStyle(value: String): String = js.native
  def ɵ_sanitizeUrl(url: String): String = js.native
  def ɵaddPlayer(ref: ComponentInstance | DirectiveInstance, player: ɵPlayer): Unit = js.native
  def ɵaddPlayer(ref: HTMLElement, player: ɵPlayer): Unit = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[Double | String, ɵQueryValueType]],
    ngContentIndex: Double,
    childCount: Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[Double | String, ɵQueryValueType]],
    ngContentIndex: Null,
    childCount: Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(flags: ɵNodeFlags, matchedQueriesDsl: Null, ngContentIndex: Double, childCount: Double): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Double,
    childCount: Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(flags: ɵNodeFlags, matchedQueriesDsl: Null, ngContentIndex: Null, childCount: Double): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    ngContentIndex: Null,
    childCount: Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵangular_packages_core_core_a[T](token: InjectionToken[T]): T | Null = js.native
  def ɵangular_packages_core_core_a[T](token: InjectionToken[T], flags: InjectFlags): T | Null = js.native
  def ɵangular_packages_core_core_a[T](token: typings.atAngularCore.atAngularCoreMod.Type[T]): T | Null = js.native
  def ɵangular_packages_core_core_a[T](token: typings.atAngularCore.atAngularCoreMod.Type[T], flags: InjectFlags): T | Null = js.native
  @JSName("ɵangular_packages_core_core_a")
  def ɵangular_packages_core_core_a_T_T[T](token: InjectionToken[T]): T = js.native
  @JSName("ɵangular_packages_core_core_a")
  def ɵangular_packages_core_core_a_T_T[T](token: typings.atAngularCore.atAngularCoreMod.Type[T]): T = js.native
  def ɵangular_packages_core_core_bc(tNode: TNode, attrNameToInject: String): String | Null = js.native
  def ɵangular_packages_core_core_bd(): ɵangular_packages_core_core_bm = js.native
  def ɵangular_packages_core_core_be(): TNode = js.native
  def ɵangular_packages_core_core_bf[T](): T = js.native
  def ɵangular_packages_core_core_bf[T](level: Double): T = js.native
  def ɵangular_packages_core_core_bh(tag: String, prop: String): js.Function1[/* unsafeResourceUrl */ js.Any, String] = js.native
  def ɵangular_packages_core_core_bk(name: String): js.Any = js.native
  def ɵangular_packages_core_core_bk(name: String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def ɵangular_packages_core_core_bk(name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: String): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_bl(
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ String, /* repeated */ js.Any, Unit]
  ): js.Any = js.native
  def ɵangular_packages_core_core_bn(fn: js.Function0[Unit]): String = js.native
  def ɵangular_packages_core_core_bo[T](view: TData, index: Double): T = js.native
  def ɵangular_packages_core_core_bo[T](view: ɵangular_packages_core_core_bm, index: Double): T = js.native
  def ɵangular_packages_core_core_bp(viewOrComponent: js.Object): RootContext = js.native
  def ɵangular_packages_core_core_bp(viewOrComponent: ɵangular_packages_core_core_bm): RootContext = js.native
  def ɵangular_packages_core_core_bq[T](objWithPropertyToExtract: T): String = js.native
  def ɵangular_packages_core_core_e(providers: js.Array[Provider]): js.Array[ResolvedReflectiveProvider] = js.native
  def ɵangular_packages_core_core_f(): String = js.native
  def ɵangular_packages_core_core_g(
    ElementRefToken: Instantiable1[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* nativeElement */ js.Any, 
      ElementRef[js.Object]
    ],
    tNode: TNode,
    view: ɵangular_packages_core_core_bm
  ): ElementRef[_] = js.native
  def ɵangular_packages_core_core_h[T](
    TemplateRefToken: Instantiable0[TemplateRef[js.Object]],
    ElementRefToken: Instantiable1[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* nativeElement */ js.Any, 
      ElementRef[js.Object]
    ],
    hostTNode: TNode,
    hostView: ɵangular_packages_core_core_bm
  ): TemplateRef[T] | Null = js.native
  def ɵangular_packages_core_core_i(hostTNode: TNode, hostView: ɵangular_packages_core_core_bm, context: js.Any): ChangeDetectorRef = js.native
  def ɵangular_packages_core_core_j(id: String): NgModuleFactory[_] = js.native
  def ɵangular_packages_core_core_o(): IterableDiffers = js.native
  def ɵangular_packages_core_core_p(): KeyValueDiffers = js.native
  def ɵangular_packages_core_core_q(): String = js.native
  def ɵangular_packages_core_core_q(locale: String): String = js.native
  def ɵangular_packages_core_core_s(ngZone: NgZone): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
  def ɵangular_packages_core_core_u(): Boolean = js.native
  def ɵangular_packages_core_core_v(signature: String): js.Any = js.native
  def ɵangular_packages_core_core_v(signature: String, flags: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_w[T](scope: Scope): T = js.native
  def ɵangular_packages_core_core_w[T](scope: Scope, returnValue: T): T = js.native
  @JSName("ɵangular_packages_core_core_w")
  def ɵangular_packages_core_core_w_T_Unit[T](scope: Scope): Unit = js.native
  def ɵangular_packages_core_core_x(rangeType: String, action: String): Range = js.native
  def ɵangular_packages_core_core_y(range: Range): Unit = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef],
    outputs: js.Array[OutputDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null,
    childCount: Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef],
    outputs: js.Array[OutputDef]
  ): NodeDef = js.native
  def ɵbindPlayerFactory[T](factoryFn: ɵangular_packages_core_core_bi, value: T): ɵPlayerFactory = js.native
  def ɵbypassSanitizationTrustHtml(trustedHtml: String): TrustedHtmlString = js.native
  def ɵbypassSanitizationTrustResourceUrl(trustedResourceUrl: String): TrustedResourceUrlString = js.native
  def ɵbypassSanitizationTrustScript(trustedScript: String): TrustedScriptString = js.native
  def ɵbypassSanitizationTrustStyle(trustedStyle: String): TrustedStyleString = js.native
  def ɵbypassSanitizationTrustUrl(trustedUrl: String): TrustedUrlString = js.native
  def ɵccf(
    selector: String,
    componentType: typings.atAngularCore.atAngularCoreMod.Type[_],
    viewDefFactory: ViewDefinitionFactory,
    inputs: StringDictionary[String],
    outputs: StringDictionary[String],
    ngContentSelectors: js.Array[String]
  ): ComponentFactory[_] = js.native
  def ɵccf(
    selector: String,
    componentType: typings.atAngularCore.atAngularCoreMod.Type[_],
    viewDefFactory: ViewDefinitionFactory,
    inputs: Null,
    outputs: StringDictionary[String],
    ngContentSelectors: js.Array[String]
  ): ComponentFactory[_] = js.native
  def ɵclearOverrides(): Unit = js.native
  def ɵclearResolutionOfComponentResourcesQueue(): Map[
    typings.atAngularCore.atAngularCoreMod.Type[_], 
    typings.atAngularCore.atAngularCoreMod.Component
  ] = js.native
  def ɵcmf(
    ngModuleType: typings.atAngularCore.atAngularCoreMod.Type[_],
    bootstrapComponents: js.Array[typings.atAngularCore.atAngularCoreMod.Type[_]],
    defFactory: NgModuleDefinitionFactory
  ): NgModuleFactory[_] = js.native
  def ɵcompileComponent(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    metadata: typings.atAngularCore.atAngularCoreMod.Component
  ): Unit = js.native
  def ɵcompileDirective(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    directive: typings.atAngularCore.atAngularCoreMod.Directive
  ): Unit = js.native
  def ɵcompileNgModule(moduleType: typings.atAngularCore.atAngularCoreMod.Type[_]): Unit = js.native
  def ɵcompileNgModule(
    moduleType: typings.atAngularCore.atAngularCoreMod.Type[_],
    ngModule: typings.atAngularCore.atAngularCoreMod.NgModule
  ): Unit = js.native
  def ɵcompileNgModuleDefs(moduleType: ɵNgModuleType[_], ngModule: typings.atAngularCore.atAngularCoreMod.NgModule): Unit = js.native
  def ɵcompileNgModuleDefs(
    moduleType: ɵNgModuleType[_],
    ngModule: typings.atAngularCore.atAngularCoreMod.NgModule,
    allowDuplicateDeclarationsInRoot: Boolean
  ): Unit = js.native
  def ɵcompileNgModuleFactory__POST_R3__[M](
    injector: Injector,
    options: CompilerOptions,
    moduleType: typings.atAngularCore.atAngularCoreMod.Type[M]
  ): js.Promise[NgModuleFactory[M]] = js.native
  def ɵcompilePipe(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    meta: typings.atAngularCore.atAngularCoreMod.Pipe
  ): Unit = js.native
  def ɵcreateInjector(defType: js.Any): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Null, additionalProviders: js.Array[StaticProvider]): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Null, additionalProviders: js.Array[StaticProvider], name: String): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Null, additionalProviders: Null, name: String): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector, additionalProviders: js.Array[StaticProvider]): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector, additionalProviders: js.Array[StaticProvider], name: String): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector, additionalProviders: Null, name: String): Injector = js.native
  def ɵcrt(values: Anon_Data): RendererType2 = js.native
  def ɵdetectChanges[T](component: T): Unit = js.native
  def ɵdevModeEqual(a: js.Any, b: js.Any): Boolean = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[Double | String, ɵQueryValueType]],
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[Double | String, ɵQueryValueType]],
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])],
    props: StringDictionary[js.Tuple2[Double, String]]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: StringDictionary[js.Tuple2[Double, String]],
    outputs: StringDictionary[String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: Null,
    outputs: StringDictionary[String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: Null,
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: Null,
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])],
    props: StringDictionary[js.Tuple2[Double, String]]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: Null,
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: StringDictionary[js.Tuple2[Double, String]],
    outputs: StringDictionary[String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueries: Null,
    childCount: Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: Null,
    outputs: StringDictionary[String]
  ): NodeDef = js.native
  def ɵeld(
    checkIndex: Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: Null | (js.Array[js.Tuple2[String | Double, ɵQueryValueType]]),
    ngContentIndex: Null | Double,
    childCount: Double,
    namespaceAndName: String | Null,
    fixedAttrs: js.UndefOr[Null | (js.Array[js.Tuple2[String, String]])],
    bindings: js.UndefOr[
      Null | (js.Array[js.Tuple3[ɵBindingFlags, String, String | SecurityContext | Null]])
    ],
    outputs: js.UndefOr[Null | (js.Array[js.Tuple2[String, String]])],
    handleEvent: js.UndefOr[Null | ElementHandleEventFn],
    componentView: js.UndefOr[Null | ViewDefinitionFactory],
    componentRendererType: js.UndefOr[RendererType2 | Null]
  ): NodeDef = js.native
  def ɵfindLocaleData(locale: String): js.Any = js.native
  def ɵflushModuleScopingQueueAsMuchAsPossible(): Unit = js.native
  def ɵgetComponentViewDefinitionFactory(componentFactory: ComponentFactory[_]): ViewDefinitionFactory = js.native
  def ɵgetDebugNode__POST_R3__(): Null = js.native
  def ɵgetDebugNode__POST_R3__(nativeNode: Element): DebugElement__POST_R3__ = js.native
  def ɵgetDebugNode__POST_R3__(nativeNode: Node): DebugNode__POST_R3__ = js.native
  def ɵgetDirectives(target: js.Object): js.Array[js.Object] = js.native
  def ɵgetHostElement[T](directive: T): Element = js.native
  def ɵgetInjectableDef[T](`type`: js.Any): ɵɵInjectableDef[T] | Null = js.native
  def ɵgetLContext(target: js.Any): ɵLContext | Null = js.native
  def ɵgetLocalePluralCase(locale: String): js.Function1[/* value */ Double, Double] = js.native
  def ɵgetModuleFactory__POST_R3__(id: String): NgModuleFactory[_] = js.native
  def ɵgetPlayers(ref: ComponentInstance | DirectiveInstance): js.Array[ɵPlayer] = js.native
  def ɵgetPlayers(ref: HTMLElement): js.Array[ɵPlayer] = js.native
  def ɵi18nConfigureLocalize(): Unit = js.native
  def ɵi18nConfigureLocalize(options: I18nLocalizeOptions): Unit = js.native
  def ɵinitServicesIfNeeded(): Unit = js.native
  def ɵinlineInterpolate(
    valueCount: Double,
    c0: String,
    a1: js.Any,
    c1: String,
    a2: js.UndefOr[js.Any],
    c2: js.UndefOr[String],
    a3: js.UndefOr[js.Any],
    c3: js.UndefOr[String],
    a4: js.UndefOr[js.Any],
    c4: js.UndefOr[String],
    a5: js.UndefOr[js.Any],
    c5: js.UndefOr[String],
    a6: js.UndefOr[js.Any],
    c6: js.UndefOr[String],
    a7: js.UndefOr[js.Any],
    c7: js.UndefOr[String],
    a8: js.UndefOr[js.Any],
    c8: js.UndefOr[String],
    a9: js.UndefOr[js.Any],
    c9: js.UndefOr[String]
  ): String = js.native
  def ɵinterpolate(valueCount: Double, constAndInterp: js.Array[String]): String = js.native
  def ɵisBoundToModule__POST_R3__[C](cf: ComponentFactory[C]): Boolean = js.native
  def ɵisDefaultChangeDetectionStrategy(changeDetectionStrategy: ChangeDetectionStrategy): Boolean = js.native
  def ɵisListLikeIterable(obj: js.Any): Boolean = js.native
  def ɵisObservable(obj: js.Any): /* is rxjs.rxjs.Observable<any> */ Boolean = js.native
  def ɵisObservable(obj: Observable[_]): /* is rxjs.rxjs.Observable<any> */ Boolean = js.native
  def ɵisPromise(obj: js.Any): /* is std.Promise<any> */ Boolean = js.native
  def ɵlooseIdentical(a: js.Any, b: js.Any): Boolean = js.native
  def ɵmakeDecorator[T](name: String): Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](name: String, props: js.Function1[/* repeated */ js.Any, _]): Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.atAngularCore.atAngularCoreMod.Type[T], Unit]
  ): Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typings.atAngularCore.atAngularCoreMod.Type[T], Unit],
    typeFn: js.Function2[
      /* type */ typings.atAngularCore.atAngularCoreMod.Type[T], 
      /* repeated */ js.Any, 
      Unit
    ]
  ): Anon_ArgsCls = js.native
  def ɵmarkDirty[T](component: T): Unit = js.native
  def ɵmod(providers: js.Array[NgModuleProviderDef]): NgModuleDefinition = js.native
  def ɵmpd(flags: ɵNodeFlags, token: js.Any, value: js.Any, deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): NgModuleProviderDef = js.native
  def ɵncd(ngContentIndex: Double, index: Double): NodeDef = js.native
  def ɵncd(ngContentIndex: Null, index: Double): NodeDef = js.native
  def ɵnov(view: ViewData, index: Double): js.Any = js.native
  def ɵoverrideComponentView(comp: typings.atAngularCore.atAngularCoreMod.Type[_], componentFactory: ComponentFactory[_]): Unit = js.native
  def ɵoverrideProvider(`override`: ProviderOverride): Unit = js.native
  def ɵpad(checkIndex: Double, argCount: Double): NodeDef = js.native
  def ɵpatchComponentDefWithScope[C](componentDef: ɵComponentDef[C], transitiveScopes: ɵNgModuleTransitiveScopes): Unit = js.native
  def ɵpid(flags: ɵNodeFlags, ctor: js.Any, deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): NodeDef = js.native
  def ɵpod(checkIndex: Double, propToIndex: StringDictionary[Double]): NodeDef = js.native
  def ɵppd(checkIndex: Double, argCount: Double): NodeDef = js.native
  def ɵprd(
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[String | Double, ɵQueryValueType]],
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵprd(
    flags: ɵNodeFlags,
    matchedQueries: Null,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵpublishDefaultGlobalUtils(): Unit = js.native
  def ɵpublishGlobalUtil(name: String, fn: js.Function): Unit = js.native
  def ɵqud(flags: ɵNodeFlags, id: Double, bindings: StringDictionary[ɵQueryBindingType]): NodeDef = js.native
  def ɵregisterModuleFactory(id: String, factory: NgModuleFactory[_]): Unit = js.native
  def ɵregisterNgModuleType(ngModuleType: ɵNgModuleType[_]): Unit = js.native
  def ɵrenderComponent[T](componentType: typings.atAngularCore.atAngularCoreMod.Type[T]): T = js.native
  def ɵrenderComponent[T](componentType: typings.atAngularCore.atAngularCoreMod.Type[T], opts: CreateComponentOptions): T = js.native
  def ɵrenderComponent[T](componentType: ɵComponentType[T]): T = js.native
  def ɵrenderComponent[T](componentType: ɵComponentType[T], opts: CreateComponentOptions): T = js.native
  def ɵresetCompiledComponents(): Unit = js.native
  def ɵresolveComponentResources(resourceResolver: js.Function1[/* url */ String, js.Promise[String | Anon_Text]]): js.Promise[Unit] = js.native
  def ɵsetClassMetadata(`type`: typings.atAngularCore.atAngularCoreMod.Type[_]): Unit = js.native
  def ɵsetClassMetadata(`type`: typings.atAngularCore.atAngularCoreMod.Type[_], decorators: js.Array[_]): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]]
  ): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: StringDictionary[js.Any]
  ): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: js.Array[_],
    ctorParameters: Null,
    propDecorators: StringDictionary[js.Any]
  ): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: Null,
    ctorParameters: js.Function0[js.Array[_]]
  ): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: StringDictionary[js.Any]
  ): Unit = js.native
  def ɵsetClassMetadata(
    `type`: typings.atAngularCore.atAngularCoreMod.Type[_],
    decorators: Null,
    ctorParameters: Null,
    propDecorators: StringDictionary[js.Any]
  ): Unit = js.native
  def ɵsetCurrentInjector(): js.UndefOr[Injector | Null] = js.native
  def ɵsetCurrentInjector(injector: Injector): js.UndefOr[Injector | Null] = js.native
  def ɵsetLocaleId(localeId: String): Unit = js.native
  def ɵstore[T](index: Double, value: T): Unit = js.native
  def ɵstringify(token: js.Any): String = js.native
  def ɵted(checkIndex: Double, ngContentIndex: Double, staticText: js.Array[String]): NodeDef = js.native
  def ɵted(checkIndex: Double, ngContentIndex: Null, staticText: js.Array[String]): NodeDef = js.native
  def ɵtransitiveScopesFor[T](moduleType: typings.atAngularCore.atAngularCoreMod.Type[T]): ɵNgModuleTransitiveScopes = js.native
  def ɵtransitiveScopesFor[T](
    moduleType: typings.atAngularCore.atAngularCoreMod.Type[T],
    processNgModuleFn: js.Function1[/* ngModule */ ɵNgModuleType[_], Unit]
  ): ɵNgModuleTransitiveScopes = js.native
  def ɵunv(view: ViewData, nodeIdx: Double, bindingIdx: Double, value: js.Any): js.Any = js.native
  def ɵvid(flags: ɵViewFlags, nodes: js.Array[NodeDef]): ɵViewDefinition = js.native
  def ɵvid(flags: ɵViewFlags, nodes: js.Array[NodeDef], updateDirectives: Null, updateRenderer: ViewUpdateFn): ɵViewDefinition = js.native
  def ɵvid(flags: ɵViewFlags, nodes: js.Array[NodeDef], updateDirectives: ViewUpdateFn): ɵViewDefinition = js.native
  def ɵvid(
    flags: ɵViewFlags,
    nodes: js.Array[NodeDef],
    updateDirectives: ViewUpdateFn,
    updateRenderer: ViewUpdateFn
  ): ɵViewDefinition = js.native
  def ɵwhenRendered(component: js.Any): js.Promise[Null] = js.native
  def ɵɵInheritDefinitionFeature(definition: ɵComponentDef[_]): Unit = js.native
  def ɵɵInheritDefinitionFeature(definition: ɵDirectiveDef[_]): Unit = js.native
  def ɵɵNgOnChangesFeature[T](): DirectiveDefFeature = js.native
  def ɵɵProvidersFeature[T](providers: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], Unit] = js.native
  def ɵɵProvidersFeature[T](providers: js.Array[Provider], viewProviders: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], Unit] = js.native
  def ɵɵallocHostVars(count: Double): Unit = js.native
  def ɵɵattribute(name: String, value: js.Any): TsickleIssue1009 = js.native
  def ɵɵattribute(name: String, value: js.Any, sanitizer: Null, namespace: String): TsickleIssue1009 = js.native
  def ɵɵattribute(name: String, value: js.Any, sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵattribute(name: String, value: js.Any, sanitizer: SanitizerFn, namespace: String): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate1(attrName: String, prefix: String, v0: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate1(attrName: String, prefix: String, v0: js.Any, suffix: String, sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate1(
    attrName: String,
    prefix: String,
    v0: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate2(attrName: String, prefix: String, v0: js.Any, i0: String, v1: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate2(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate2(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate3(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate3(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate3(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate4(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate4(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate4(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate5(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate5(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate5(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate6(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate6(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate6(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate7(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate7(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate7(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate8(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate8(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolate8(
    attrName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String,
    sanitizer: SanitizerFn,
    namespace: String
  ): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolateV(attrName: String, values: js.Array[_]): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolateV(attrName: String, values: js.Array[_], sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵattributeInterpolateV(attrName: String, values: js.Array[_], sanitizer: SanitizerFn, namespace: String): TsickleIssue1009 = js.native
  def ɵɵclassMap(): Unit = js.native
  def ɵɵclassMap(classes: String): Unit = js.native
  def ɵɵclassMap(classes: StringDictionary[js.Any]): Unit = js.native
  def ɵɵclassMap(classes: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE): Unit = js.native
  def ɵɵclassProp(classIndex: Double, value: Boolean): Unit = js.native
  def ɵɵclassProp(classIndex: Double, value: Boolean, forceOverride: Boolean): Unit = js.native
  def ɵɵclassProp(classIndex: Double, value: ɵPlayerFactory): Unit = js.native
  def ɵɵclassProp(classIndex: Double, value: ɵPlayerFactory, forceOverride: Boolean): Unit = js.native
  def ɵɵcomponentHostSyntheticListener[T](eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): Unit = js.native
  def ɵɵcomponentHostSyntheticListener[T](eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _], useCapture: Boolean): Unit = js.native
  def ɵɵcomponentHostSyntheticListener[T](
    eventName: String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: Boolean,
    eventTargetResolver: GlobalTargetResolver
  ): Unit = js.native
  def ɵɵcontainer(index: Double): Unit = js.native
  def ɵɵcontainerRefreshEnd(): Unit = js.native
  def ɵɵcontainerRefreshStart(index: Double): Unit = js.native
  def ɵɵcontentQuery[T](directiveIndex: Double, predicate: js.Array[String], descend: Boolean, read: js.Any): QueryList[T] = js.native
  def ɵɵcontentQuery[T](
    directiveIndex: Double,
    predicate: typings.atAngularCore.atAngularCoreMod.Type[_],
    descend: Boolean,
    read: js.Any
  ): QueryList[T] = js.native
  def ɵɵdefineBase[T](baseDefinition: Anon_ContentQueries[T]): ɵɵBaseDef[T] = js.native
  def ɵɵdefineComponent[T](componentDefinition: Anon_ChangeDetection[T]): scala.Nothing = js.native
  def ɵɵdefineDirective[T](directiveDefinition: Anon_ContentQueriesExportAs[T]): scala.Nothing = js.native
  def ɵɵdefineInjectable[T](opts: Anon_Any[T]): scala.Nothing = js.native
  def ɵɵdefineInjector(options: Anon_FactoryImports): scala.Nothing = js.native
  def ɵɵdefineNgModule[T](`def`: Anon_Bootstrap[T]): scala.Nothing = js.native
  def ɵɵdefinePipe[T](pipeDef: Anon_FactoryName[T]): scala.Nothing = js.native
  def ɵɵdirectiveInject[T](token: InjectionToken[T]): T = js.native
  def ɵɵdirectiveInject[T](token: InjectionToken[T], flags: InjectFlags): T = js.native
  def ɵɵdirectiveInject[T](token: typings.atAngularCore.atAngularCoreMod.Type[T]): T = js.native
  def ɵɵdirectiveInject[T](token: typings.atAngularCore.atAngularCoreMod.Type[T], flags: InjectFlags): T = js.native
  def ɵɵdisableBindings(): Unit = js.native
  def ɵɵelement(index: Double, name: String): Unit = js.native
  def ɵɵelement(index: Double, name: String, attrs: Null, localRefs: js.Array[String]): Unit = js.native
  def ɵɵelement(index: Double, name: String, attrs: TAttributes): Unit = js.native
  def ɵɵelement(index: Double, name: String, attrs: TAttributes, localRefs: js.Array[String]): Unit = js.native
  def ɵɵelementContainerEnd(): Unit = js.native
  def ɵɵelementContainerStart(index: Double): Unit = js.native
  def ɵɵelementContainerStart(index: Double, attrs: Null, localRefs: js.Array[String]): Unit = js.native
  def ɵɵelementContainerStart(index: Double, attrs: TAttributes): Unit = js.native
  def ɵɵelementContainerStart(index: Double, attrs: TAttributes, localRefs: js.Array[String]): Unit = js.native
  def ɵɵelementEnd(): Unit = js.native
  def ɵɵelementHostAttrs(attrs: TAttributes): Unit = js.native
  def ɵɵelementStart(index: Double, name: String): Unit = js.native
  def ɵɵelementStart(index: Double, name: String, attrs: Null, localRefs: js.Array[String]): Unit = js.native
  def ɵɵelementStart(index: Double, name: String, attrs: TAttributes): Unit = js.native
  def ɵɵelementStart(index: Double, name: String, attrs: TAttributes, localRefs: js.Array[String]): Unit = js.native
  def ɵɵembeddedViewEnd(): Unit = js.native
  def ɵɵembeddedViewStart(viewBlockId: Double, consts: Double, vars: Double): ɵRenderFlags = js.native
  def ɵɵenableBindings(): Unit = js.native
  def ɵɵgetCurrentView(): OpaqueViewState = js.native
  def ɵɵgetFactoryOf[T](`type`: typings.atAngularCore.atAngularCoreMod.Type[_]): FactoryFn[T] | Null = js.native
  def ɵɵgetInheritedFactory[T](`type`: typings.atAngularCore.atAngularCoreMod.Type[_]): js.Function1[/* type */ typings.atAngularCore.atAngularCoreMod.Type[T], T] = js.native
  def ɵɵi18n(index: Double, message: String): Unit = js.native
  def ɵɵi18n(index: Double, message: String, subTemplateIndex: Double): Unit = js.native
  def ɵɵi18nApply(index: Double): Unit = js.native
  def ɵɵi18nAttributes(index: Double, values: js.Array[String]): Unit = js.native
  def ɵɵi18nEnd(): Unit = js.native
  def ɵɵi18nExp[T](value: T): TsickleIssue1009 = js.native
  def ɵɵi18nLocalize(input: String): String = js.native
  def ɵɵi18nLocalize(input: String, placeholders: StringDictionary[String]): String = js.native
  def ɵɵi18nPostprocess(message: String): String = js.native
  def ɵɵi18nPostprocess(message: String, replacements: StringDictionary[String | js.Array[String]]): String = js.native
  def ɵɵi18nStart(index: Double, message: String): Unit = js.native
  def ɵɵi18nStart(index: Double, message: String, subTemplateIndex: Double): Unit = js.native
  def ɵɵinject[T](token: InjectionToken[T]): T | Null = js.native
  def ɵɵinject[T](token: InjectionToken[T], flags: InjectFlags): T | Null = js.native
  def ɵɵinject[T](token: typings.atAngularCore.atAngularCoreMod.Type[T]): T | Null = js.native
  def ɵɵinject[T](token: typings.atAngularCore.atAngularCoreMod.Type[T], flags: InjectFlags): T | Null = js.native
  def ɵɵinjectAttribute(attrNameToInject: String): String | Null = js.native
  @JSName("ɵɵinject")
  def ɵɵinject_T_T[T](token: InjectionToken[T]): T = js.native
  @JSName("ɵɵinject")
  def ɵɵinject_T_T[T](token: typings.atAngularCore.atAngularCoreMod.Type[T]): T = js.native
  def ɵɵinterpolation1(prefix: String, v0: js.Any, suffix: String): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation2(prefix: String, v0: js.Any, i0: String, v1: js.Any, suffix: String): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation3(prefix: String, v0: js.Any, i0: String, v1: js.Any, i1: String, v2: js.Any, suffix: String): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation4(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String
  ): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation5(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String
  ): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation6(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String
  ): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation7(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String
  ): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolation8(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String
  ): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵinterpolationV(values: js.Array[_]): String | typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE = js.native
  def ɵɵlistener(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): Unit = js.native
  def ɵɵlistener(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _], useCapture: Boolean): Unit = js.native
  def ɵɵlistener(
    eventName: String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: Boolean,
    eventTargetResolver: GlobalTargetResolver
  ): Unit = js.native
  def ɵɵload[T](index: Double): T = js.native
  def ɵɵloadContentQuery[T](): QueryList[T] = js.native
  def ɵɵloadViewQuery[T](): T = js.native
  def ɵɵnamespaceHTML(): Unit = js.native
  def ɵɵnamespaceMathML(): Unit = js.native
  def ɵɵnamespaceSVG(): Unit = js.native
  def ɵɵnextContext[T](): T = js.native
  def ɵɵnextContext[T](level: Double): T = js.native
  def ɵɵpipe(index: Double, pipeName: String): js.Any = js.native
  def ɵɵpipeBind1(index: Double, slotOffset: Double, v1: js.Any): js.Any = js.native
  def ɵɵpipeBind2(index: Double, slotOffset: Double, v1: js.Any, v2: js.Any): js.Any = js.native
  def ɵɵpipeBind3(index: Double, slotOffset: Double, v1: js.Any, v2: js.Any, v3: js.Any): js.Any = js.native
  def ɵɵpipeBind4(index: Double, slotOffset: Double, v1: js.Any, v2: js.Any, v3: js.Any, v4: js.Any): js.Any = js.native
  def ɵɵpipeBindV(index: Double, slotOffset: Double, values: js.Array[_]): js.Any = js.native
  def ɵɵprojection(nodeIndex: Double): Unit = js.native
  def ɵɵprojection(nodeIndex: Double, selectorIndex: Double): Unit = js.native
  def ɵɵprojection(nodeIndex: Double, selectorIndex: Double, attrs: TAttributes): Unit = js.native
  def ɵɵprojectionDef(): Unit = js.native
  def ɵɵprojectionDef(projectionSlots: ProjectionSlots): Unit = js.native
  def ɵɵproperty[T](propName: String, value: T): TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: String, value: T, sanitizer: Null, nativeOnly: Boolean): TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: String, value: T, sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: String, value: T, sanitizer: SanitizerFn, nativeOnly: Boolean): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate(propName: String, v0: js.Any): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate(propName: String, v0: js.Any, sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate1(propName: String, prefix: String, v0: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate1(propName: String, prefix: String, v0: js.Any, suffix: String, sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate2(propName: String, prefix: String, v0: js.Any, i0: String, v1: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate2(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate3(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate3(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate4(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate4(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate5(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate5(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate6(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate6(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate7(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate7(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate8(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate8(
    propName: String,
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String,
    sanitizer: SanitizerFn
  ): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolateV(propName: String, values: js.Array[_]): TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolateV(propName: String, values: js.Array[_], sanitizer: SanitizerFn): TsickleIssue1009 = js.native
  def ɵɵpureFunction0[T](slotOffset: Double, pureFn: js.Function0[T]): T = js.native
  def ɵɵpureFunction0[T](slotOffset: Double, pureFn: js.Function0[T], thisArg: js.Any): T = js.native
  def ɵɵpureFunction1(slotOffset: Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any): js.Any = js.native
  def ɵɵpureFunction1(slotOffset: Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any, thisArg: js.Any): js.Any = js.native
  def ɵɵpureFunction2(
    slotOffset: Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction2(
    slotOffset: Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction3(
    slotOffset: Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction3(
    slotOffset: Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction4(
    slotOffset: Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction4(
    slotOffset: Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction5(
    slotOffset: Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction5(
    slotOffset: Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction6(
    slotOffset: Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction6(
    slotOffset: Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction7(
    slotOffset: Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction7(
    slotOffset: Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction8(
    slotOffset: Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction8(
    slotOffset: Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunctionV(slotOffset: Double, pureFn: js.Function1[/* repeated */ js.Any, _], exps: js.Array[_]): js.Any = js.native
  def ɵɵpureFunctionV(
    slotOffset: Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵqueryRefresh(queryList: QueryList[_]): Boolean = js.native
  def ɵɵreference[T](index: Double): T = js.native
  def ɵɵresolveBody(element: RElement with Anon_OwnerDocument): Anon_NameTarget = js.native
  def ɵɵresolveDocument(element: RElement with Anon_OwnerDocument): Anon_NameTargetDocument = js.native
  def ɵɵresolveWindow(element: RElement with Anon_OwnerDocument): Anon_NameTargetNull = js.native
  def ɵɵrestoreView(viewToRestore: OpaqueViewState): Unit = js.native
  def ɵɵsanitizeHtml(unsafeHtml: js.Any): String = js.native
  def ɵɵsanitizeResourceUrl(unsafeResourceUrl: js.Any): String = js.native
  def ɵɵsanitizeScript(unsafeScript: js.Any): String = js.native
  def ɵɵsanitizeStyle(unsafeStyle: js.Any): String = js.native
  def ɵɵsanitizeUrl(unsafeUrl: js.Any): String = js.native
  def ɵɵsanitizeUrlOrResourceUrl(unsafeUrl: js.Any, tag: String, prop: String): js.Any = js.native
  def ɵɵselect(index: Double): Unit = js.native
  def ɵɵsetComponentScope(
    `type`: ɵComponentType[_],
    directives: js.Array[typings.atAngularCore.atAngularCoreMod.Type[_]],
    pipes: js.Array[typings.atAngularCore.atAngularCoreMod.Type[_]]
  ): Unit = js.native
  def ɵɵsetNgModuleScope(`type`: js.Any, scope: Anon_Declarations): Unit = js.native
  def ɵɵstaticContentQuery[T](directiveIndex: Double, predicate: js.Array[String], descend: Boolean, read: js.Any): Unit = js.native
  def ɵɵstaticContentQuery[T](
    directiveIndex: Double,
    predicate: typings.atAngularCore.atAngularCoreMod.Type[_],
    descend: Boolean,
    read: js.Any
  ): Unit = js.native
  def ɵɵstaticViewQuery[T](predicate: js.Array[String], descend: Boolean, read: js.Any): Unit = js.native
  def ɵɵstaticViewQuery[T](predicate: typings.atAngularCore.atAngularCoreMod.Type[_], descend: Boolean, read: js.Any): Unit = js.native
  def ɵɵstyleMap(): Unit = js.native
  def ɵɵstyleMap(styles: StringDictionary[js.Any]): Unit = js.native
  def ɵɵstyleMap(styles: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: String): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: String, suffix: String): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: String, suffix: String, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: String, suffix: Null, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Double): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Double, suffix: String): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Double, suffix: String, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Double, suffix: Null, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Null, suffix: String): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Null, suffix: String, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: Null, suffix: Null, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: ɵPlayerFactory): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: ɵPlayerFactory, suffix: String): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: ɵPlayerFactory, suffix: String, forceOverride: Boolean): Unit = js.native
  def ɵɵstyleProp(styleIndex: Double, value: ɵPlayerFactory, suffix: Null, forceOverride: Boolean): Unit = js.native
  def ɵɵstyling(): Unit = js.native
  def ɵɵstyling(classBindingNames: js.Array[String]): Unit = js.native
  def ɵɵstyling(classBindingNames: js.Array[String], styleBindingNames: js.Array[String]): Unit = js.native
  def ɵɵstyling(
    classBindingNames: js.Array[String],
    styleBindingNames: js.Array[String],
    styleSanitizer: StyleSanitizeFn
  ): Unit = js.native
  def ɵɵstyling(classBindingNames: js.Array[String], styleBindingNames: Null, styleSanitizer: StyleSanitizeFn): Unit = js.native
  def ɵɵstyling(classBindingNames: Null, styleBindingNames: js.Array[String]): Unit = js.native
  def ɵɵstyling(classBindingNames: Null, styleBindingNames: js.Array[String], styleSanitizer: StyleSanitizeFn): Unit = js.native
  def ɵɵstyling(classBindingNames: Null, styleBindingNames: Null, styleSanitizer: StyleSanitizeFn): Unit = js.native
  def ɵɵstylingApply(): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: Null, consts: Double, vars: Double): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: Null, consts: Double, vars: Double, tagName: String): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: Null, consts: Double, vars: Double, tagName: String, attrs: TAttributes): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: Null, consts: Double, vars: Double, tagName: Null, attrs: TAttributes): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: Null,
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: ComponentTemplate[_], consts: Double, vars: Double): Unit = js.native
  def ɵɵtemplate(index: Double, templateFn: ComponentTemplate[_], consts: Double, vars: Double, tagName: String): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: Null,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: String,
    attrs: TAttributes,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: Null,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: js.Array[String]
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: js.Array[String],
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplate(
    index: Double,
    templateFn: ComponentTemplate[_],
    consts: Double,
    vars: Double,
    tagName: Null,
    attrs: TAttributes,
    localRefs: Null,
    localRefExtractor: LocalRefExtractor
  ): Unit = js.native
  def ɵɵtemplateRefExtractor(tNode: TNode, currentView: ɵangular_packages_core_core_bm): TemplateRef[js.Object] | Null = js.native
  def ɵɵtext(index: Double): Unit = js.native
  def ɵɵtext(index: Double, value: js.Any): Unit = js.native
  def ɵɵtextBinding[T](value: T): Unit = js.native
  def ɵɵtextBinding[T](value: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE): Unit = js.native
  def ɵɵtextInterpolate(v0: js.Any): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate1(prefix: String, v0: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate2(prefix: String, v0: js.Any, i0: String, v1: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate3(prefix: String, v0: js.Any, i0: String, v1: js.Any, i1: String, v2: js.Any, suffix: String): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate4(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate5(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate6(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate7(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵtextInterpolate8(
    prefix: String,
    v0: js.Any,
    i0: String,
    v1: js.Any,
    i1: String,
    v2: js.Any,
    i2: String,
    v3: js.Any,
    i3: String,
    v4: js.Any,
    i4: String,
    v5: js.Any,
    i5: String,
    v6: js.Any,
    i6: String,
    v7: js.Any,
    suffix: String
  ): TsickleIssue1009 = js.native
  def ɵɵtextInterpolateV(values: js.Array[_]): TsickleIssue1009 = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: T): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: T, sanitizer: Null, nativeOnly: Boolean): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: T, sanitizer: SanitizerFn): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: T, sanitizer: SanitizerFn, nativeOnly: Boolean): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](
    propName: String,
    value: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE,
    sanitizer: Null,
    nativeOnly: Boolean
  ): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](propName: String, value: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE, sanitizer: SanitizerFn): Unit = js.native
  def ɵɵupdateSyntheticHostBinding[T](
    propName: String,
    value: typings.atAngularCore.atAngularCoreMod.ɵNO_CHANGE,
    sanitizer: SanitizerFn,
    nativeOnly: Boolean
  ): Unit = js.native
  def ɵɵviewQuery[T](predicate: js.Array[String], descend: Boolean, read: js.Any): QueryList[T] = js.native
  def ɵɵviewQuery[T](predicate: typings.atAngularCore.atAngularCoreMod.Type[_], descend: Boolean, read: js.Any): QueryList[T] = js.native
}

