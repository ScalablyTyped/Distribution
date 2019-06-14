package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANALYZE_FOR_ENTRY_COMPONENTS: InjectionToken[js.Any] = js.native
  val APP_BOOTSTRAP_LISTENER: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], scala.Unit]]] = js.native
  val APP_ID: InjectionToken[java.lang.String] = js.native
  val APP_INITIALIZER: InjectionToken[js.Array[js.Function0[scala.Unit]]] = js.native
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
  val LOCALE_ID: InjectionToken[java.lang.String] = js.native
  val NO_ERRORS_SCHEMA: SchemaMetadata = js.native
  val NgModule: NgModuleDecorator = js.native
  val Optional: OptionalDecorator = js.native
  val Output: OutputDecorator = js.native
  val PACKAGE_ROOT_URL: InjectionToken[java.lang.String] = js.native
  val PLATFORM_ID: InjectionToken[js.Object] = js.native
  val PLATFORM_INITIALIZER: InjectionToken[js.Array[js.Function0[scala.Unit]]] = js.native
  val Pipe: PipeDecorator = js.native
  val Self: SelfDecorator = js.native
  val SkipSelf: SkipSelfDecorator = js.native
  val TRANSLATIONS: InjectionToken[java.lang.String] = js.native
  val TRANSLATIONS_FORMAT: InjectionToken[java.lang.String] = js.native
  val Type: stdLib.FunctionConstructor = js.native
  val VERSION: Version = js.native
  val ViewChild: ViewChildDecorator = js.native
  val ViewChildren: ViewChildrenDecorator = js.native
  val ɵALLOW_MULTIPLE_PLATFORMS: InjectionToken[scala.Boolean] = js.native
  val ɵAPP_ROOT: InjectionToken[scala.Boolean] = js.native
  val ɵEMPTY_ARRAY: js.Array[js.Any] = js.native
  val ɵNG_BASE_DEF: java.lang.String = js.native
  val ɵNG_COMPONENT_DEF: java.lang.String = js.native
  val ɵNG_DIRECTIVE_DEF: java.lang.String = js.native
  val ɵNG_ELEMENT_ID: java.lang.String = js.native
  val ɵNG_INJECTABLE_DEF: java.lang.String = js.native
  val ɵNG_INJECTOR_DEF: java.lang.String = js.native
  val ɵNG_MODULE_DEF: java.lang.String = js.native
  val ɵNG_PIPE_DEF: java.lang.String = js.native
  val ɵNO_CHANGE: atAngularCoreLib.atAngularCoreMod.ɵNO_CHANGE = js.native
  val ɵSWITCH_CHANGE_DETECTOR_REF_FACTORY__POST_R3__ : js.Function0[ChangeDetectorRef] = js.native
  val ɵSWITCH_COMPILE_COMPONENT__POST_R3__ : js.Function2[/* type */ Type[js.Any], /* metadata */ Component, scala.Unit] = js.native
  val ɵSWITCH_COMPILE_DIRECTIVE__POST_R3__ : js.Function2[/* type */ Type[js.Any], /* directive */ Directive, scala.Unit] = js.native
  val ɵSWITCH_COMPILE_INJECTABLE__POST_R3__ : js.Function2[/* type */ Type[js.Any], /* srcMeta */ js.UndefOr[Injectable], scala.Unit] = js.native
  val ɵSWITCH_COMPILE_NGMODULE__POST_R3__ : js.Function2[/* moduleType */ Type[js.Any], /* ngModule */ js.UndefOr[NgModule], scala.Unit] = js.native
  val ɵSWITCH_COMPILE_PIPE__POST_R3__ : js.Function2[/* type */ Type[js.Any], /* meta */ Pipe, scala.Unit] = js.native
  val ɵSWITCH_ELEMENT_REF_FACTORY__POST_R3__ : js.Function1[
    /* import warning: ImportType.apply Failed type conversion: typeof ElementRef */ /* ElementRefToken */ js.Any, 
    ElementRef[js.Any]
  ] = js.native
  val ɵSWITCH_IVY_ENABLED__POST_R3__ : atAngularCoreLib.atAngularCoreLibNumbers.`true` = js.native
  val ɵSWITCH_RENDERER2_FACTORY__POST_R3__ : js.Function0[Renderer2] = js.native
  val ɵSWITCH_VIEW_CONTAINER_REF_FACTORY__POST_R3__ : js.Function2[
    /* import warning: ImportType.apply Failed type conversion: typeof ViewContainerRef */ /* ViewContainerRefToken */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: typeof ElementRef */ /* ElementRefToken */ js.Any, 
    ViewContainerRef
  ] = js.native
  val ɵangular_packages_core_core_bb: InjectionToken[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]] = js.native
  val ɵangular_packages_core_core_r: js.Array[StaticProvider] = js.native
  val ɵangular_packages_core_core_t: scala.Boolean = js.native
  val ɵdefaultIterableDiffers: IterableDiffers = js.native
  val ɵdefaultKeyValueDiffers: KeyValueDiffers = js.native
  val ɵglobal: js.Any = js.native
  val ɵivyEnabled: atAngularCoreLib.atAngularCoreLibNumbers.`false` = js.native
  val ɵɵdefaultStyleSanitizer: StyleSanitizeFn = js.native
  def asNativeElements(debugEls: js.Array[DebugElement]): js.Any = js.native
  def assertPlatform(requiredToken: js.Any): PlatformRef = js.native
  def createPlatform(injector: Injector): PlatformRef = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: java.lang.String
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: java.lang.String,
    providers: js.Array[StaticProvider]
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(parentPlatformFactory: scala.Null, name: java.lang.String): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def createPlatformFactory(parentPlatformFactory: scala.Null, name: java.lang.String, providers: js.Array[StaticProvider]): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def destroyPlatform(): scala.Unit = js.native
  def enableProdMode(): scala.Unit = js.native
  def forwardRef(forwardRefFn: ForwardRefFn): Type[_] = js.native
  def getDebugNode(nativeNode: js.Any): DebugNode | scala.Null = js.native
  def getModuleFactory(id: java.lang.String): NgModuleFactory[_] = js.native
  def getPlatform(): PlatformRef | scala.Null = js.native
  def isDevMode(): scala.Boolean = js.native
  def platformCore(): PlatformRef = js.native
  def platformCore(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def resolveForwardRef[T](`type`: T): T = js.native
  def setTestabilityGetter(getter: GetTestability): scala.Unit = js.native
  def wtfCreateScope(signature: java.lang.String): WtfScopeFn = js.native
  def wtfCreateScope(signature: java.lang.String, flags: js.Any): WtfScopeFn = js.native
  def wtfEndTimeRange(range: js.Any): scala.Unit = js.native
  def wtfLeave[T](scope: js.Any): T = js.native
  def wtfLeave[T](scope: js.Any, returnValue: T): T = js.native
  def wtfStartTimeRange(rangeType: java.lang.String, action: java.lang.String): js.Any = js.native
  def ɵCompiler_compileModuleAndAllComponentsAsync__POST_R3__[T](moduleType: Type[T]): js.Promise[ModuleWithComponentFactories[T]] = js.native
  def ɵCompiler_compileModuleAndAllComponentsSync__POST_R3__[T](moduleType: Type[T]): ModuleWithComponentFactories[T] = js.native
  def ɵCompiler_compileModuleAsync__POST_R3__[T](moduleType: Type[T]): js.Promise[NgModuleFactory[T]] = js.native
  def ɵCompiler_compileModuleSync__POST_R3__[T](moduleType: Type[T]): NgModuleFactory[T] = js.native
  def ɵLifecycleHooksFeature(component: js.Any, `def`: ɵComponentDef[_]): scala.Unit = js.native
  def ɵ_sanitizeHtml(defaultDoc: js.Any, unsafeHtmlInput: java.lang.String): java.lang.String = js.native
  def ɵ_sanitizeStyle(value: java.lang.String): java.lang.String = js.native
  def ɵ_sanitizeUrl(url: java.lang.String): java.lang.String = js.native
  def ɵaddPlayer(ref: ComponentInstance | DirectiveInstance, player: ɵPlayer): scala.Unit = js.native
  def ɵaddPlayer(ref: stdLib.HTMLElement, player: ɵPlayer): scala.Unit = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[scala.Double | java.lang.String, ɵQueryValueType]],
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[scala.Double | java.lang.String, ɵQueryValueType]],
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: ElementHandleEventFn,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵand(
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: ViewDefinitionFactory
  ): NodeDef = js.native
  def ɵangular_packages_core_core_b[T](token: InjectionToken[T]): T | scala.Null = js.native
  def ɵangular_packages_core_core_b[T](token: InjectionToken[T], flags: InjectFlags): T | scala.Null = js.native
  def ɵangular_packages_core_core_b[T](token: Type[T]): T | scala.Null = js.native
  def ɵangular_packages_core_core_b[T](token: Type[T], flags: InjectFlags): T | scala.Null = js.native
  @JSName("ɵangular_packages_core_core_b")
  def ɵangular_packages_core_core_b_TT[T](token: InjectionToken[T]): T = js.native
  @JSName("ɵangular_packages_core_core_b")
  def ɵangular_packages_core_core_b_TT[T](token: Type[T]): T = js.native
  def ɵangular_packages_core_core_bc(tNode: TNode, attrNameToInject: java.lang.String): java.lang.String | scala.Null = js.native
  def ɵangular_packages_core_core_bd(): ɵangular_packages_core_core_bm = js.native
  def ɵangular_packages_core_core_be(): TNode = js.native
  def ɵangular_packages_core_core_bf[T](): T = js.native
  def ɵangular_packages_core_core_bf[T](level: scala.Double): T = js.native
  def ɵangular_packages_core_core_bh(tag: java.lang.String, prop: java.lang.String): js.Function1[/* unsafeResourceUrl */ js.Any, java.lang.String] = js.native
  def ɵangular_packages_core_core_bk(name: java.lang.String): js.Any = js.native
  def ɵangular_packages_core_core_bk(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def ɵangular_packages_core_core_bk(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: java.lang.String): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def ɵangular_packages_core_core_bl(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_bl(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def ɵangular_packages_core_core_bn(fn: js.Function0[scala.Unit]): java.lang.String = js.native
  def ɵangular_packages_core_core_bo[T](view: atAngularCoreLib.TData, index: scala.Double): T = js.native
  def ɵangular_packages_core_core_bo[T](view: ɵangular_packages_core_core_bm, index: scala.Double): T = js.native
  def ɵangular_packages_core_core_bp(viewOrComponent: ɵangular_packages_core_core_bm): RootContext = js.native
  def ɵangular_packages_core_core_bp(viewOrComponent: js.Object): RootContext = js.native
  def ɵangular_packages_core_core_bq[T](objWithPropertyToExtract: T): java.lang.String = js.native
  def ɵangular_packages_core_core_e(providers: js.Array[Provider]): js.Array[ResolvedReflectiveProvider] = js.native
  def ɵangular_packages_core_core_f(): java.lang.String = js.native
  def ɵangular_packages_core_core_g(
    ElementRefToken: org.scalablytyped.runtime.Instantiable1[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* nativeElement */ js.Any, 
      ElementRef[js.Object]
    ],
    tNode: TNode,
    view: ɵangular_packages_core_core_bm
  ): ElementRef[_] = js.native
  def ɵangular_packages_core_core_h[T](
    TemplateRefToken: org.scalablytyped.runtime.Instantiable0[TemplateRef[js.Object]],
    ElementRefToken: org.scalablytyped.runtime.Instantiable1[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* nativeElement */ js.Any, 
      ElementRef[js.Object]
    ],
    hostTNode: TNode,
    hostView: ɵangular_packages_core_core_bm
  ): TemplateRef[T] | scala.Null = js.native
  def ɵangular_packages_core_core_i(hostTNode: TNode, hostView: ɵangular_packages_core_core_bm, context: js.Any): ChangeDetectorRef = js.native
  def ɵangular_packages_core_core_j(id: java.lang.String): NgModuleFactory[_] = js.native
  def ɵangular_packages_core_core_o(): IterableDiffers = js.native
  def ɵangular_packages_core_core_p(): KeyValueDiffers = js.native
  def ɵangular_packages_core_core_q(): java.lang.String = js.native
  def ɵangular_packages_core_core_q(locale: java.lang.String): java.lang.String = js.native
  def ɵangular_packages_core_core_s(ngZone: NgZone): js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = js.native
  def ɵangular_packages_core_core_u(): scala.Boolean = js.native
  def ɵangular_packages_core_core_v(signature: java.lang.String): js.Any = js.native
  def ɵangular_packages_core_core_v(signature: java.lang.String, flags: js.Any): js.Any = js.native
  def ɵangular_packages_core_core_w[T](scope: Scope): T = js.native
  def ɵangular_packages_core_core_w[T](scope: Scope, returnValue: T): T = js.native
  @JSName("ɵangular_packages_core_core_w")
  def ɵangular_packages_core_core_w_TUnit[T](scope: Scope): scala.Unit = js.native
  def ɵangular_packages_core_core_x(rangeType: java.lang.String, action: java.lang.String): Range = js.native
  def ɵangular_packages_core_core_y(range: Range): scala.Unit = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef],
    outputs: js.Array[OutputDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef]
  ): NodeDef = js.native
  def ɵangular_packages_core_core_z(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    bindings: js.Array[BindingDef],
    outputs: js.Array[OutputDef]
  ): NodeDef = js.native
  def ɵbindPlayerFactory[T](factoryFn: ɵangular_packages_core_core_bi, value: T): ɵPlayerFactory = js.native
  def ɵbypassSanitizationTrustHtml(trustedHtml: java.lang.String): TrustedHtmlString = js.native
  def ɵbypassSanitizationTrustResourceUrl(trustedResourceUrl: java.lang.String): TrustedResourceUrlString = js.native
  def ɵbypassSanitizationTrustScript(trustedScript: java.lang.String): TrustedScriptString = js.native
  def ɵbypassSanitizationTrustStyle(trustedStyle: java.lang.String): TrustedStyleString = js.native
  def ɵbypassSanitizationTrustUrl(trustedUrl: java.lang.String): TrustedUrlString = js.native
  def ɵccf(
    selector: java.lang.String,
    componentType: Type[_],
    viewDefFactory: ViewDefinitionFactory,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): ComponentFactory[_] = js.native
  def ɵccf(
    selector: java.lang.String,
    componentType: Type[_],
    viewDefFactory: ViewDefinitionFactory,
    inputs: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): ComponentFactory[_] = js.native
  def ɵclearOverrides(): scala.Unit = js.native
  def ɵclearResolutionOfComponentResourcesQueue(): stdLib.Map[Type[_], Component] = js.native
  def ɵcmf(
    ngModuleType: Type[_],
    bootstrapComponents: js.Array[Type[_]],
    defFactory: NgModuleDefinitionFactory
  ): NgModuleFactory[_] = js.native
  def ɵcompileComponent(`type`: Type[_], metadata: Component): scala.Unit = js.native
  def ɵcompileDirective(`type`: Type[_], directive: Directive): scala.Unit = js.native
  def ɵcompileNgModule(moduleType: Type[_]): scala.Unit = js.native
  def ɵcompileNgModule(moduleType: Type[_], ngModule: NgModule): scala.Unit = js.native
  def ɵcompileNgModuleDefs(moduleType: ɵNgModuleType[_], ngModule: NgModule): scala.Unit = js.native
  def ɵcompileNgModuleFactory__POST_R3__[M](injector: Injector, options: CompilerOptions, moduleType: Type[M]): js.Promise[NgModuleFactory[M]] = js.native
  def ɵcompilePipe(`type`: Type[_], meta: Pipe): scala.Unit = js.native
  def ɵcreateInjector(defType: js.Any): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector, additionalProviders: js.Array[StaticProvider]): Injector = js.native
  def ɵcreateInjector(
    defType: js.Any,
    parent: Injector,
    additionalProviders: js.Array[StaticProvider],
    name: java.lang.String
  ): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: Injector, additionalProviders: scala.Null, name: java.lang.String): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: scala.Null, additionalProviders: js.Array[StaticProvider]): Injector = js.native
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[StaticProvider],
    name: java.lang.String
  ): Injector = js.native
  def ɵcreateInjector(defType: js.Any, parent: scala.Null, additionalProviders: scala.Null, name: java.lang.String): Injector = js.native
  def ɵcrt(values: atAngularCoreLib.Anon_Data): RendererType2 = js.native
  def ɵdetectChanges[T](component: T): scala.Unit = js.native
  def ɵdevModeEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[scala.Double | java.lang.String, ɵQueryValueType]],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[scala.Double | java.lang.String, ɵQueryValueType]],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): NodeDef = js.native
  def ɵdid(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): NodeDef = js.native
  def ɵeld(
    checkIndex: scala.Double,
    flags: ɵNodeFlags,
    matchedQueriesDsl: scala.Null | (js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]]),
    ngContentIndex: scala.Null | scala.Double,
    childCount: scala.Double,
    namespaceAndName: java.lang.String | scala.Null,
    fixedAttrs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    bindings: js.UndefOr[
      scala.Null | (js.Array[
        js.Tuple3[ɵBindingFlags, java.lang.String, java.lang.String | SecurityContext | scala.Null]
      ])
    ],
    outputs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    handleEvent: js.UndefOr[scala.Null | ElementHandleEventFn],
    componentView: js.UndefOr[scala.Null | ViewDefinitionFactory],
    componentRendererType: js.UndefOr[RendererType2 | scala.Null]
  ): NodeDef = js.native
  def ɵflushModuleScopingQueueAsMuchAsPossible(): scala.Unit = js.native
  def ɵgetComponentViewDefinitionFactory(componentFactory: ComponentFactory[_]): ViewDefinitionFactory = js.native
  def ɵgetDebugNode__POST_R3__(): scala.Null = js.native
  def ɵgetDebugNode__POST_R3__(nativeNode: stdLib.Element): DebugElement__POST_R3__ = js.native
  def ɵgetDebugNode__POST_R3__(nativeNode: stdLib.Node): DebugNode__POST_R3__ = js.native
  def ɵgetDirectives(target: js.Object): js.Array[js.Object] = js.native
  def ɵgetHostElement[T](directive: T): stdLib.Element = js.native
  def ɵgetInjectableDef[T](`type`: js.Any): ɵɵInjectableDef[T] | scala.Null = js.native
  def ɵgetLContext(target: js.Any): ɵLContext | scala.Null = js.native
  def ɵgetModuleFactory__POST_R3__(id: java.lang.String): NgModuleFactory[_] = js.native
  def ɵgetPlayers(ref: ComponentInstance | DirectiveInstance): js.Array[ɵPlayer] = js.native
  def ɵgetPlayers(ref: stdLib.HTMLElement): js.Array[ɵPlayer] = js.native
  def ɵi18nConfigureLocalize(): scala.Unit = js.native
  def ɵi18nConfigureLocalize(options: I18nLocalizeOptions): scala.Unit = js.native
  def ɵinitServicesIfNeeded(): scala.Unit = js.native
  def ɵinlineInterpolate(
    valueCount: scala.Double,
    c0: java.lang.String,
    a1: js.Any,
    c1: java.lang.String,
    a2: js.UndefOr[js.Any],
    c2: js.UndefOr[java.lang.String],
    a3: js.UndefOr[js.Any],
    c3: js.UndefOr[java.lang.String],
    a4: js.UndefOr[js.Any],
    c4: js.UndefOr[java.lang.String],
    a5: js.UndefOr[js.Any],
    c5: js.UndefOr[java.lang.String],
    a6: js.UndefOr[js.Any],
    c6: js.UndefOr[java.lang.String],
    a7: js.UndefOr[js.Any],
    c7: js.UndefOr[java.lang.String],
    a8: js.UndefOr[js.Any],
    c8: js.UndefOr[java.lang.String],
    a9: js.UndefOr[js.Any],
    c9: js.UndefOr[java.lang.String]
  ): java.lang.String = js.native
  def ɵinterpolate(valueCount: scala.Double, constAndInterp: js.Array[java.lang.String]): java.lang.String = js.native
  def ɵisBoundToModule__POST_R3__[C](cf: ComponentFactory[C]): scala.Boolean = js.native
  def ɵisDefaultChangeDetectionStrategy(changeDetectionStrategy: ChangeDetectionStrategy): scala.Boolean = js.native
  def ɵisListLikeIterable(obj: js.Any): scala.Boolean = js.native
  def ɵisObservable(obj: js.Any): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = js.native
  def ɵisObservable(obj: rxjsLib.rxjsMod.Observable[_]): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = js.native
  def ɵisPromise(obj: js.Any): /* is std.Promise<any> */ scala.Boolean = js.native
  def ɵlooseIdentical(a: js.Any, b: js.Any): scala.Boolean = js.native
  def ɵmakeDecorator[T](name: java.lang.String): atAngularCoreLib.Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): atAngularCoreLib.Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): atAngularCoreLib.Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], scala.Unit]
  ): atAngularCoreLib.Anon_ArgsCls = js.native
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ Type[T], /* repeated */ js.Any, scala.Unit]
  ): atAngularCoreLib.Anon_ArgsCls = js.native
  def ɵmarkDirty[T](component: T): scala.Unit = js.native
  def ɵmod(providers: js.Array[NgModuleProviderDef]): NgModuleDefinition = js.native
  def ɵmpd(flags: ɵNodeFlags, token: js.Any, value: js.Any, deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): NgModuleProviderDef = js.native
  def ɵncd(ngContentIndex: scala.Double, index: scala.Double): NodeDef = js.native
  def ɵncd(ngContentIndex: scala.Null, index: scala.Double): NodeDef = js.native
  def ɵnov(view: ViewData, index: scala.Double): js.Any = js.native
  def ɵoverrideComponentView(comp: Type[_], componentFactory: ComponentFactory[_]): scala.Unit = js.native
  def ɵoverrideProvider(`override`: ProviderOverride): scala.Unit = js.native
  def ɵpad(checkIndex: scala.Double, argCount: scala.Double): NodeDef = js.native
  def ɵpatchComponentDefWithScope[C](componentDef: ɵComponentDef[C], transitiveScopes: ɵNgModuleTransitiveScopes): scala.Unit = js.native
  def ɵpid(flags: ɵNodeFlags, ctor: js.Any, deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): NodeDef = js.native
  def ɵpod(checkIndex: scala.Double, propToIndex: org.scalablytyped.runtime.StringDictionary[scala.Double]): NodeDef = js.native
  def ɵppd(checkIndex: scala.Double, argCount: scala.Double): NodeDef = js.native
  def ɵprd(
    flags: ɵNodeFlags,
    matchedQueries: js.Array[js.Tuple2[java.lang.String | scala.Double, ɵQueryValueType]],
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵprd(
    flags: ɵNodeFlags,
    matchedQueries: scala.Null,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  ): NodeDef = js.native
  def ɵpublishDefaultGlobalUtils(): scala.Unit = js.native
  def ɵpublishGlobalUtil(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def ɵqud(
    flags: ɵNodeFlags,
    id: scala.Double,
    bindings: org.scalablytyped.runtime.StringDictionary[ɵQueryBindingType]
  ): NodeDef = js.native
  def ɵregisterModuleFactory(id: java.lang.String, factory: NgModuleFactory[_]): scala.Unit = js.native
  def ɵregisterNgModuleType(id: java.lang.String, ngModuleType: ɵNgModuleType[_]): scala.Unit = js.native
  def ɵrenderComponent[T](componentType: Type[T]): T = js.native
  def ɵrenderComponent[T](componentType: Type[T], opts: CreateComponentOptions): T = js.native
  def ɵrenderComponent[T](componentType: ɵComponentType[T]): T = js.native
  def ɵrenderComponent[T](componentType: ɵComponentType[T], opts: CreateComponentOptions): T = js.native
  def ɵresetCompiledComponents(): scala.Unit = js.native
  def ɵresolveComponentResources(
    resourceResolver: js.Function1[
      /* url */ java.lang.String, 
      js.Promise[java.lang.String | atAngularCoreLib.Anon_Text]
    ]
  ): js.Promise[scala.Unit] = js.native
  def ɵsetClassMetadata(`type`: Type[_]): scala.Unit = js.native
  def ɵsetClassMetadata(`type`: Type[_], decorators: js.Array[_]): scala.Unit = js.native
  def ɵsetClassMetadata(`type`: Type[_], decorators: js.Array[_], ctorParameters: js.Function0[js.Array[_]]): scala.Unit = js.native
  def ɵsetClassMetadata(
    `type`: Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵsetClassMetadata(
    `type`: Type[_],
    decorators: js.Array[_],
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵsetClassMetadata(`type`: Type[_], decorators: scala.Null, ctorParameters: js.Function0[js.Array[_]]): scala.Unit = js.native
  def ɵsetClassMetadata(
    `type`: Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵsetClassMetadata(
    `type`: Type[_],
    decorators: scala.Null,
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵsetCurrentInjector(): js.UndefOr[Injector | scala.Null] = js.native
  def ɵsetCurrentInjector(injector: Injector): js.UndefOr[Injector | scala.Null] = js.native
  def ɵstore[T](index: scala.Double, value: T): scala.Unit = js.native
  def ɵstringify(token: js.Any): java.lang.String = js.native
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Double, staticText: js.Array[java.lang.String]): NodeDef = js.native
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Null, staticText: js.Array[java.lang.String]): NodeDef = js.native
  def ɵtransitiveScopesFor[T](moduleType: Type[T]): ɵNgModuleTransitiveScopes = js.native
  def ɵtransitiveScopesFor[T](moduleType: Type[T], processNgModuleFn: js.Function1[/* ngModule */ ɵNgModuleType[_], scala.Unit]): ɵNgModuleTransitiveScopes = js.native
  def ɵunv(view: ViewData, nodeIdx: scala.Double, bindingIdx: scala.Double, value: js.Any): js.Any = js.native
  def ɵvid(flags: ɵViewFlags, nodes: js.Array[NodeDef]): ɵViewDefinition = js.native
  def ɵvid(flags: ɵViewFlags, nodes: js.Array[NodeDef], updateDirectives: ViewUpdateFn): ɵViewDefinition = js.native
  def ɵvid(
    flags: ɵViewFlags,
    nodes: js.Array[NodeDef],
    updateDirectives: ViewUpdateFn,
    updateRenderer: ViewUpdateFn
  ): ɵViewDefinition = js.native
  def ɵvid(
    flags: ɵViewFlags,
    nodes: js.Array[NodeDef],
    updateDirectives: scala.Null,
    updateRenderer: ViewUpdateFn
  ): ɵViewDefinition = js.native
  def ɵwhenRendered(component: js.Any): js.Promise[scala.Null] = js.native
  def ɵɵInheritDefinitionFeature(definition: ɵComponentDef[_]): scala.Unit = js.native
  def ɵɵInheritDefinitionFeature(definition: ɵDirectiveDef[_]): scala.Unit = js.native
  def ɵɵNgOnChangesFeature[T](): DirectiveDefFeature = js.native
  def ɵɵProvidersFeature[T](providers: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], scala.Unit] = js.native
  def ɵɵProvidersFeature[T](providers: js.Array[Provider], viewProviders: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], scala.Unit] = js.native
  def ɵɵallocHostVars(count: scala.Double): scala.Unit = js.native
  def ɵɵbind[T](value: T): T | ɵNO_CHANGE = js.native
  def ɵɵcomponentHostSyntheticListener[T](eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticListener[T](
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticListener[T](
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: GlobalTargetResolver
  ): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](index: scala.Double, propName: java.lang.String, value: T): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](index: scala.Double, propName: java.lang.String, value: T, sanitizer: SanitizerFn): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](index: scala.Double, propName: java.lang.String, value: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](index: scala.Double, propName: java.lang.String, value: ɵNO_CHANGE, sanitizer: SanitizerFn): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: ɵNO_CHANGE,
    sanitizer: SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵcomponentHostSyntheticProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: ɵNO_CHANGE,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵcontainer(index: scala.Double): scala.Unit = js.native
  def ɵɵcontainerRefreshEnd(): scala.Unit = js.native
  def ɵɵcontainerRefreshStart(index: scala.Double): scala.Unit = js.native
  def ɵɵcontentQuery[T](directiveIndex: scala.Double, predicate: Type[_], descend: scala.Boolean, read: js.Any): QueryList[T] = js.native
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): QueryList[T] = js.native
  def ɵɵdefineBase[T](baseDefinition: atAngularCoreLib.Anon_ContentQueries[T]): ɵɵBaseDef[T] = js.native
  def ɵɵdefineComponent[T](componentDefinition: atAngularCoreLib.Anon_ChangeDetection[T]): scala.Nothing = js.native
  def ɵɵdefineDirective[T](directiveDefinition: atAngularCoreLib.Anon_ContentQueriesExportAs[T]): scala.Nothing = js.native
  def ɵɵdefineInjectable[T](opts: atAngularCoreLib.Anon_Any[T]): scala.Nothing = js.native
  def ɵɵdefineInjector(options: atAngularCoreLib.Anon_FactoryImports): scala.Nothing = js.native
  def ɵɵdefineNgModule[T](`def`: atAngularCoreLib.Anon_Bootstrap[T]): scala.Nothing = js.native
  def ɵɵdefinePipe[T](pipeDef: atAngularCoreLib.Anon_FactoryName[T]): scala.Nothing = js.native
  def ɵɵdirectiveInject[T](token: InjectionToken[T]): T = js.native
  def ɵɵdirectiveInject[T](token: InjectionToken[T], flags: InjectFlags): T = js.native
  def ɵɵdirectiveInject[T](token: Type[T]): T = js.native
  def ɵɵdirectiveInject[T](token: Type[T], flags: InjectFlags): T = js.native
  def ɵɵdisableBindings(): scala.Unit = js.native
  def ɵɵelement(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def ɵɵelement(index: scala.Double, name: java.lang.String, attrs: atAngularCoreLib.TAttributes): scala.Unit = js.native
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵelementAttribute(index: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def ɵɵelementAttribute(index: scala.Double, name: java.lang.String, value: js.Any, sanitizer: SanitizerFn): scala.Unit = js.native
  def ɵɵelementAttribute(
    index: scala.Double,
    name: java.lang.String,
    value: js.Any,
    sanitizer: SanitizerFn,
    namespace: java.lang.String
  ): scala.Unit = js.native
  def ɵɵelementAttribute(
    index: scala.Double,
    name: java.lang.String,
    value: js.Any,
    sanitizer: scala.Null,
    namespace: java.lang.String
  ): scala.Unit = js.native
  def ɵɵelementClassProp(index: scala.Double, classIndex: scala.Double, value: ɵPlayerFactory): scala.Unit = js.native
  def ɵɵelementClassProp(index: scala.Double, classIndex: scala.Double, value: ɵPlayerFactory, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def ɵɵelementClassProp(index: scala.Double, classIndex: scala.Double, value: scala.Boolean, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementContainerEnd(): scala.Unit = js.native
  def ɵɵelementContainerStart(index: scala.Double): scala.Unit = js.native
  def ɵɵelementContainerStart(index: scala.Double, attrs: atAngularCoreLib.TAttributes): scala.Unit = js.native
  def ɵɵelementContainerStart(index: scala.Double, attrs: atAngularCoreLib.TAttributes, localRefs: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementContainerStart(index: scala.Double, attrs: scala.Null, localRefs: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementEnd(): scala.Unit = js.native
  def ɵɵelementHostAttrs(attrs: atAngularCoreLib.TAttributes): scala.Unit = js.native
  def ɵɵelementHostClassProp(classIndex: scala.Double, value: ɵPlayerFactory): scala.Unit = js.native
  def ɵɵelementHostClassProp(classIndex: scala.Double, value: ɵPlayerFactory, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostClassProp(classIndex: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostClassProp(classIndex: scala.Double, value: scala.Boolean, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: ɵPlayerFactory): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: ɵPlayerFactory, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStyleProp(
    styleIndex: scala.Double,
    value: ɵPlayerFactory,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: ɵPlayerFactory, suffix: scala.Null, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: java.lang.String, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStyleProp(
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementHostStyleProp(
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: scala.Null,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStyleProp(
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: scala.Double, suffix: scala.Null, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: scala.Null, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStyleProp(
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementHostStyleProp(styleIndex: scala.Double, value: scala.Null, suffix: scala.Null, forceOverride: scala.Boolean): scala.Unit = js.native
  def ɵɵelementHostStyling(): scala.Unit = js.native
  def ɵɵelementHostStyling(classBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementHostStyling(classBindingNames: js.Array[java.lang.String], styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementHostStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementHostStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: scala.Null,
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementHostStyling(classBindingNames: scala.Null, styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementHostStyling(
    classBindingNames: scala.Null,
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementHostStyling(classBindingNames: scala.Null, styleBindingNames: scala.Null, styleSanitizer: StyleSanitizeFn): scala.Unit = js.native
  def ɵɵelementHostStylingApply(): scala.Unit = js.native
  def ɵɵelementHostStylingMap(): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: ɵNO_CHANGE, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: ɵNO_CHANGE, styles: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: java.lang.String): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: java.lang.String, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: java.lang.String, styles: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: org.scalablytyped.runtime.StringDictionary[js.Any], styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementHostStylingMap(
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: scala.Null, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementHostStylingMap(classes: scala.Null, styles: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def ɵɵelementProperty[T](index: scala.Double, propName: java.lang.String, value: T): scala.Unit = js.native
  def ɵɵelementProperty[T](index: scala.Double, propName: java.lang.String, value: T, sanitizer: SanitizerFn): scala.Unit = js.native
  def ɵɵelementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: T,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementProperty[T](index: scala.Double, propName: java.lang.String, value: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementProperty[T](index: scala.Double, propName: java.lang.String, value: ɵNO_CHANGE, sanitizer: SanitizerFn): scala.Unit = js.native
  def ɵɵelementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: ɵNO_CHANGE,
    sanitizer: SanitizerFn,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementProperty[T](
    index: scala.Double,
    propName: java.lang.String,
    value: ɵNO_CHANGE,
    sanitizer: scala.Null,
    nativeOnly: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStart(index: scala.Double, name: java.lang.String): scala.Unit = js.native
  def ɵɵelementStart(index: scala.Double, name: java.lang.String, attrs: atAngularCoreLib.TAttributes): scala.Unit = js.native
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: ɵPlayerFactory): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: ɵPlayerFactory, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: ɵPlayerFactory,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: ɵPlayerFactory,
    suffix: scala.Null,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: java.lang.String, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: java.lang.String,
    suffix: scala.Null,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Double, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Double,
    suffix: scala.Null,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(index: scala.Double, styleIndex: scala.Double, value: scala.Null, suffix: java.lang.String): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: java.lang.String,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyleProp(
    index: scala.Double,
    styleIndex: scala.Double,
    value: scala.Null,
    suffix: scala.Null,
    forceOverride: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵelementStyling(): scala.Unit = js.native
  def ɵɵelementStyling(classBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementStyling(classBindingNames: js.Array[java.lang.String], styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementStyling(
    classBindingNames: js.Array[java.lang.String],
    styleBindingNames: scala.Null,
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementStyling(classBindingNames: scala.Null, styleBindingNames: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵelementStyling(
    classBindingNames: scala.Null,
    styleBindingNames: js.Array[java.lang.String],
    styleSanitizer: StyleSanitizeFn
  ): scala.Unit = js.native
  def ɵɵelementStyling(classBindingNames: scala.Null, styleBindingNames: scala.Null, styleSanitizer: StyleSanitizeFn): scala.Unit = js.native
  def ɵɵelementStylingApply(index: scala.Double): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: ɵNO_CHANGE, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementStylingMap(
    index: scala.Double,
    classes: ɵNO_CHANGE,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: java.lang.String): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: java.lang.String, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementStylingMap(
    index: scala.Double,
    classes: java.lang.String,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def ɵɵelementStylingMap(
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: ɵNO_CHANGE
  ): scala.Unit = js.native
  def ɵɵelementStylingMap(
    index: scala.Double,
    classes: org.scalablytyped.runtime.StringDictionary[js.Any],
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵɵelementStylingMap(index: scala.Double, classes: scala.Null, styles: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵelementStylingMap(
    index: scala.Double,
    classes: scala.Null,
    styles: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def ɵɵembeddedViewEnd(): scala.Unit = js.native
  def ɵɵembeddedViewStart(viewBlockId: scala.Double, consts: scala.Double, vars: scala.Double): ɵRenderFlags = js.native
  def ɵɵenableBindings(): scala.Unit = js.native
  def ɵɵgetCurrentView(): OpaqueViewState = js.native
  def ɵɵgetFactoryOf[T](`type`: Type[_]): (js.Function1[/* type */ Type[T] | scala.Null, T]) | scala.Null = js.native
  def ɵɵgetInheritedFactory[T](`type`: Type[_]): js.Function1[/* type */ Type[T], T] = js.native
  def ɵɵi18n(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def ɵɵi18n(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
  def ɵɵi18nApply(index: scala.Double): scala.Unit = js.native
  def ɵɵi18nAttributes(index: scala.Double, values: js.Array[java.lang.String]): scala.Unit = js.native
  def ɵɵi18nEnd(): scala.Unit = js.native
  def ɵɵi18nExp[T](expression: T): scala.Unit = js.native
  def ɵɵi18nExp[T](expression: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵi18nLocalize(input: java.lang.String): java.lang.String = js.native
  def ɵɵi18nLocalize(
    input: java.lang.String,
    placeholders: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): java.lang.String = js.native
  def ɵɵi18nPostprocess(message: java.lang.String): java.lang.String = js.native
  def ɵɵi18nPostprocess(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = js.native
  def ɵɵi18nStart(index: scala.Double, message: java.lang.String): scala.Unit = js.native
  def ɵɵi18nStart(index: scala.Double, message: java.lang.String, subTemplateIndex: scala.Double): scala.Unit = js.native
  def ɵɵinject[T](token: InjectionToken[T]): T | scala.Null = js.native
  def ɵɵinject[T](token: InjectionToken[T], flags: InjectFlags): T | scala.Null = js.native
  def ɵɵinject[T](token: Type[T]): T | scala.Null = js.native
  def ɵɵinject[T](token: Type[T], flags: InjectFlags): T | scala.Null = js.native
  def ɵɵinjectAttribute(attrNameToInject: java.lang.String): java.lang.String | scala.Null = js.native
  @JSName("ɵɵinject")
  def ɵɵinject_TT[T](token: InjectionToken[T]): T = js.native
  @JSName("ɵɵinject")
  def ɵɵinject_TT[T](token: Type[T]): T = js.native
  def ɵɵinterpolation1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolation8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵinterpolationV(values: js.Array[_]): java.lang.String | ɵNO_CHANGE = js.native
  def ɵɵlistener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: GlobalTargetResolver
  ): scala.Unit = js.native
  def ɵɵload[T](index: scala.Double): T = js.native
  def ɵɵloadContentQuery[T](): QueryList[T] = js.native
  def ɵɵloadViewQuery[T](): T = js.native
  def ɵɵnamespaceHTML(): scala.Unit = js.native
  def ɵɵnamespaceMathML(): scala.Unit = js.native
  def ɵɵnamespaceSVG(): scala.Unit = js.native
  def ɵɵnextContext[T](): T = js.native
  def ɵɵnextContext[T](level: scala.Double): T = js.native
  def ɵɵpipe(index: scala.Double, pipeName: java.lang.String): js.Any = js.native
  def ɵɵpipeBind1(index: scala.Double, slotOffset: scala.Double, v1: js.Any): js.Any = js.native
  def ɵɵpipeBind2(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any): js.Any = js.native
  def ɵɵpipeBind3(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any): js.Any = js.native
  def ɵɵpipeBind4(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any, v4: js.Any): js.Any = js.native
  def ɵɵpipeBindV(index: scala.Double, slotOffset: scala.Double, values: js.Array[_]): js.Any = js.native
  def ɵɵprojection(nodeIndex: scala.Double): scala.Unit = js.native
  def ɵɵprojection(nodeIndex: scala.Double, selectorIndex: scala.Double): scala.Unit = js.native
  def ɵɵprojection(nodeIndex: scala.Double, selectorIndex: scala.Double, attrs: atAngularCoreLib.TAttributes): scala.Unit = js.native
  def ɵɵprojectionDef(): scala.Unit = js.native
  def ɵɵprojectionDef(projectionSlots: atAngularCoreLib.ProjectionSlots): scala.Unit = js.native
  def ɵɵproperty[T](propName: java.lang.String, value: T): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: java.lang.String, value: T, sanitizer: SanitizerFn): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: java.lang.String, value: T, sanitizer: SanitizerFn, nativeOnly: scala.Boolean): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵproperty[T](propName: java.lang.String, value: T, sanitizer: scala.Null, nativeOnly: scala.Boolean): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any, sanitizer: SanitizerFn): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate1(propName: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate1(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: SanitizerFn
  ): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolateV(propName: java.lang.String, values: js.Array[_]): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpropertyInterpolateV(propName: java.lang.String, values: js.Array[_], sanitizer: SanitizerFn): atAngularCoreLib.TsickleIssue1009 = js.native
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T]): T = js.native
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T], thisArg: js.Any): T = js.native
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any): js.Any = js.native
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any, thisArg: js.Any): js.Any = js.native
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵpureFunction6(
    slotOffset: scala.Double,
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
    slotOffset: scala.Double,
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
    slotOffset: scala.Double,
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
    slotOffset: scala.Double,
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
    slotOffset: scala.Double,
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
    slotOffset: scala.Double,
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
  def ɵɵpureFunctionV(slotOffset: scala.Double, pureFn: js.Function1[/* repeated */ js.Any, _], exps: js.Array[_]): js.Any = js.native
  def ɵɵpureFunctionV(
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = js.native
  def ɵɵqueryRefresh(queryList: QueryList[_]): scala.Boolean = js.native
  def ɵɵreference[T](index: scala.Double): T = js.native
  def ɵɵresolveBody(element: RElement with atAngularCoreLib.Anon_OwnerDocument): atAngularCoreLib.Anon_NameTarget = js.native
  def ɵɵresolveDocument(element: RElement with atAngularCoreLib.Anon_OwnerDocument): atAngularCoreLib.Anon_NameTargetDocument = js.native
  def ɵɵresolveWindow(element: RElement with atAngularCoreLib.Anon_OwnerDocument): atAngularCoreLib.Anon_NameTargetNull = js.native
  def ɵɵrestoreView(viewToRestore: OpaqueViewState): scala.Unit = js.native
  def ɵɵsanitizeHtml(unsafeHtml: js.Any): java.lang.String = js.native
  def ɵɵsanitizeResourceUrl(unsafeResourceUrl: js.Any): java.lang.String = js.native
  def ɵɵsanitizeScript(unsafeScript: js.Any): java.lang.String = js.native
  def ɵɵsanitizeStyle(unsafeStyle: js.Any): java.lang.String = js.native
  def ɵɵsanitizeUrl(unsafeUrl: js.Any): java.lang.String = js.native
  def ɵɵsanitizeUrlOrResourceUrl(unsafeUrl: js.Any, tag: java.lang.String, prop: java.lang.String): js.Any = js.native
  def ɵɵselect(index: scala.Double): scala.Unit = js.native
  def ɵɵsetComponentScope(`type`: ɵComponentType[_], directives: js.Array[Type[_]], pipes: js.Array[Type[_]]): scala.Unit = js.native
  def ɵɵsetNgModuleScope(`type`: js.Any, scope: atAngularCoreLib.Anon_Declarations): scala.Unit = js.native
  def ɵɵstaticContentQuery[T](directiveIndex: scala.Double, predicate: Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = js.native
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = js.native
  def ɵɵstaticViewQuery[T](predicate: Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = js.native
  def ɵɵstaticViewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): scala.Unit = js.native
  def ɵɵtemplate(index: scala.Double, templateFn: ComponentTemplate[_], consts: scala.Double, vars: scala.Double): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: ComponentTemplate[_],
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(index: scala.Double, templateFn: scala.Null, consts: scala.Double, vars: scala.Double): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: java.lang.String,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: atAngularCoreLib.TAttributes,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: js.Array[java.lang.String],
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: scala.Null,
    consts: scala.Double,
    vars: scala.Double,
    tagName: scala.Null,
    attrs: scala.Null,
    localRefs: scala.Null,
    localRefExtractor: LocalRefExtractor
  ): scala.Unit = js.native
  def ɵɵtemplateRefExtractor(tNode: TNode, currentView: ɵangular_packages_core_core_bm): TemplateRef[js.Object] | scala.Null = js.native
  def ɵɵtext(index: scala.Double): scala.Unit = js.native
  def ɵɵtext(index: scala.Double, value: js.Any): scala.Unit = js.native
  def ɵɵtextBinding[T](index: scala.Double, value: T): scala.Unit = js.native
  def ɵɵtextBinding[T](index: scala.Double, value: ɵNO_CHANGE): scala.Unit = js.native
  def ɵɵviewQuery[T](predicate: Type[_], descend: scala.Boolean, read: js.Any): QueryList[T] = js.native
  def ɵɵviewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): QueryList[T] = js.native
}

