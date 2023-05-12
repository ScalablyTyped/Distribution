package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreBooleans.`false`
import typings.angularCore.angularCoreStrings.Asterisk
import typings.angularCore.angularCoreStrings.BrowserAnimations
import typings.angularCore.angularCoreStrings.HTML
import typings.angularCore.angularCoreStrings.NoopAnimations
import typings.angularCore.angularCoreStrings.ResourceURL
import typings.angularCore.angularCoreStrings.Script
import typings.angularCore.angularCoreStrings.Style
import typings.angularCore.angularCoreStrings.URL
import typings.angularCore.anon.AppProviders
import typings.angularCore.anon.Bootstrap
import typings.angularCore.anon.CtorParameters
import typings.angularCore.anon.Declarations
import typings.angularCore.anon.ElementInjector
import typings.angularCore.anon.Factory
import typings.angularCore.anon.Fn0
import typings.angularCore.anon.FnCall
import typings.angularCore.anon.FnCallPropNameValueSanitizer
import typings.angularCore.anon.FnCallValue
import typings.angularCore.anon.Imports
import typings.angularCore.anon.InjectOptionsoptionalfals
import typings.angularCore.anon.MutableɵComponentDefanyke
import typings.angularCore.anon.MutableɵDirectiveDefanyke
import typings.angularCore.anon.Pure
import typings.angularCore.anon.RElementownerDocumentDocu
import typings.angularCore.anon.Required
import typings.angularCore.anon.SIGNAL
import typings.angularCore.anon.Text
import typings.angularCore.mod.^
import typings.rxjs.distTypesInternalTypesMod.Subscribable
import typings.rxjs.mod.Observable_
import typings.std.Document
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Node
import typings.std.Set
import typings.std.TemplateStringsArray
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIMATION_MODULE_TYPE").asInstanceOf[InjectionToken[NoopAnimations | BrowserAnimations]]

inline def APP_BOOTSTRAP_LISTENER: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[Any], Unit]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("APP_BOOTSTRAP_LISTENER").asInstanceOf[InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[Any], Unit]]]]

inline def APP_ID: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("APP_ID").asInstanceOf[InjectionToken[String]]

inline def APP_INITIALIZER: InjectionToken[js.Array[js.Function0[Observable_[Any] | js.Promise[Any] | Unit]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("APP_INITIALIZER").asInstanceOf[InjectionToken[js.Array[js.Function0[Observable_[Any] | js.Promise[Any] | Unit]]]]

inline def COMPILER_OPTIONS: InjectionToken[js.Array[CompilerOptions]] = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPILER_OPTIONS").asInstanceOf[InjectionToken[js.Array[CompilerOptions]]]

inline def CSP_NONCE: InjectionToken[String | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("CSP_NONCE").asInstanceOf[InjectionToken[String | Null]]

inline def CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = ^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[SchemaMetadata]

inline def ContentChild: ContentChildDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("ContentChild").asInstanceOf[ContentChildDecorator]
type ContentChild = Query

inline def ContentChildren: ContentChildrenDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("ContentChildren").asInstanceOf[ContentChildrenDecorator]
type ContentChildren = Query

inline def DEFAULT_CURRENCY_CODE: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_CURRENCY_CODE").asInstanceOf[InjectionToken[String]]

inline def ENVIRONMENT_INITIALIZER: InjectionToken[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ENVIRONMENT_INITIALIZER").asInstanceOf[InjectionToken[js.Function0[Unit]]]

inline def INJECTOR_ : InjectionToken[Injector] = ^.asInstanceOf[js.Dynamic].selectDynamic("INJECTOR").asInstanceOf[InjectionToken[Injector]]

inline def LOCALE_ID: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("LOCALE_ID").asInstanceOf[InjectionToken[String]]

inline def NO_ERRORS_SCHEMA: SchemaMetadata = ^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[SchemaMetadata]

inline def PACKAGE_ROOT_URL: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("PACKAGE_ROOT_URL").asInstanceOf[InjectionToken[String]]

inline def PLATFORM_ID: InjectionToken[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_ID").asInstanceOf[InjectionToken[js.Object]]

inline def PLATFORM_INITIALIZER: InjectionToken[js.Array[js.Function0[Unit]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_INITIALIZER").asInstanceOf[InjectionToken[js.Array[js.Function0[Unit]]]]

inline def TRANSLATIONS: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS").asInstanceOf[InjectionToken[String]]

inline def TRANSLATIONS_FORMAT: InjectionToken[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS_FORMAT").asInstanceOf[InjectionToken[String]]

inline def VERSION_ : Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def ViewChild: ViewChildDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("ViewChild").asInstanceOf[ViewChildDecorator]
type ViewChild = Query

inline def ViewChildren: ViewChildrenDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("ViewChildren").asInstanceOf[ViewChildrenDecorator]
type ViewChildren = Query

inline def asNativeElements(debugEls: js.Array[DebugElement]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asNativeElements")(debugEls.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def assertInInjectionContext(debugFn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInInjectionContext")(debugFn.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def assertPlatform(requiredToken: Any): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPlatform")(requiredToken.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]

inline def computed[T](computation: js.Function0[T]): Signal_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(computation.asInstanceOf[js.Any]).asInstanceOf[Signal_[T]]
inline def computed[T](computation: js.Function0[T], options: CreateComputedOptions[T]): Signal_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computed")(computation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Signal_[T]]

inline def createComponent[C](component: Type[C], options: ElementInjector): ComponentRef[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentRef[C]]

inline def createEnvironmentInjector(providers: js.Array[EnvironmentProviders | Provider], parent: EnvironmentInjector): EnvironmentInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvironmentInjector")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[EnvironmentInjector]
inline def createEnvironmentInjector(
  providers: js.Array[Provider | EnvironmentProviders],
  parent: EnvironmentInjector,
  debugName: String
): EnvironmentInjector = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvironmentInjector")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], debugName.asInstanceOf[js.Any])).asInstanceOf[EnvironmentInjector]

inline def createNgModule[T](ngModule: Type[T]): NgModuleRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNgModule")(ngModule.asInstanceOf[js.Any]).asInstanceOf[NgModuleRef[T]]
inline def createNgModule[T](ngModule: Type[T], parentInjector: Injector): NgModuleRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNgModule")(ngModule.asInstanceOf[js.Any], parentInjector.asInstanceOf[js.Any])).asInstanceOf[NgModuleRef[T]]

inline def createNgModuleRef[T](ngModule: Type[T]): NgModuleRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNgModuleRef")(ngModule.asInstanceOf[js.Any]).asInstanceOf[NgModuleRef[T]]
inline def createNgModuleRef[T](ngModule: Type[T], parentInjector: Injector): NgModuleRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNgModuleRef")(ngModule.asInstanceOf[js.Any], parentInjector.asInstanceOf[js.Any])).asInstanceOf[NgModuleRef[T]]

inline def createPlatform(injector: Injector): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlatform")(injector.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]

inline def createPlatformFactory(
  parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
  name: String
): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef]]
inline def createPlatformFactory(
  parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
  name: String,
  providers: js.Array[StaticProvider]
): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef]]
inline def createPlatformFactory(parentPlatformFactory: Null, name: String): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef]]
inline def createPlatformFactory(parentPlatformFactory: Null, name: String, providers: js.Array[StaticProvider]): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef]]

inline def defineInjectable[T](opts: Factory[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def destroyPlatform(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyPlatform")().asInstanceOf[Unit]

inline def effect(effectFn: js.Function1[/* onCleanup */ EffectCleanupRegisterFn, Unit]): EffectRef = ^.asInstanceOf[js.Dynamic].applyDynamic("effect")(effectFn.asInstanceOf[js.Any]).asInstanceOf[EffectRef]
inline def effect(
  effectFn: js.Function1[/* onCleanup */ EffectCleanupRegisterFn, Unit],
  options: CreateEffectOptions
): EffectRef = (^.asInstanceOf[js.Dynamic].applyDynamic("effect")(effectFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EffectRef]

inline def enableProdMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableProdMode")().asInstanceOf[Unit]

inline def forwardRef(forwardRefFn: ForwardRefFn): Type[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(forwardRefFn.asInstanceOf[js.Any]).asInstanceOf[Type[Any]]

/**
  * @publicApi
  */
inline def getDebugNode(nativeNode: Any): DebugNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugNode")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[DebugNode | Null]

inline def getModuleFactory(id: String): NgModuleFactory[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFactory")(id.asInstanceOf[js.Any]).asInstanceOf[NgModuleFactory[Any]]

inline def getNgModuleById[T](id: String): Type[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNgModuleById")(id.asInstanceOf[js.Any]).asInstanceOf[Type[T]]

inline def getPlatform(): PlatformRef | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[PlatformRef | Null]

inline def importProvidersFrom(sources: ImportProvidersSource*): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("importProvidersFrom")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EnvironmentProviders]

inline def inject[T](token: ProviderToken[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
inline def inject[T](token: ProviderToken[T], flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]
inline def inject[T](token: ProviderToken[T], options: InjectOptionsoptionalfals): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
inline def inject[T](token: ProviderToken[T], options: InjectOptions): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]

inline def inject_T_T[T](token: ProviderToken[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]

inline def isDevMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevMode")().asInstanceOf[Boolean]

inline def isSignal(value: js.Function): /* is @angular/core.@angular/core.Signal<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignal")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core.Signal<unknown> */ Boolean]

inline def isStandalone(`type`: Type[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandalone")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def makeEnvironmentProviders(providers: js.Array[Provider | EnvironmentProviders]): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("makeEnvironmentProviders")(providers.asInstanceOf[js.Any]).asInstanceOf[EnvironmentProviders]

inline def makeStateKey[T](key: String): StateKey[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStateKey")(key.asInstanceOf[js.Any]).asInstanceOf[StateKey[T]]

inline def mergeApplicationConfig(configs: ApplicationConfig*): ApplicationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeApplicationConfig")(configs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ApplicationConfig]

inline def platformCore(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")().asInstanceOf[PlatformRef]
inline def platformCore(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]

inline def provideZoneChangeDetection(): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideZoneChangeDetection")().asInstanceOf[EnvironmentProviders]
inline def provideZoneChangeDetection(options: NgZoneOptions): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideZoneChangeDetection")(options.asInstanceOf[js.Any]).asInstanceOf[EnvironmentProviders]

inline def reflectComponentType[C](component: Type[C]): ComponentMirror[C] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectComponentType")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentMirror[C] | Null]

inline def resolveForwardRef[T](`type`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]

inline def runInInjectionContext[ReturnT](injector: Injector, fn: js.Function0[ReturnT]): ReturnT = (^.asInstanceOf[js.Dynamic].applyDynamic("runInInjectionContext")(injector.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[ReturnT]

inline def setTestabilityGetter(getter: GetTestability): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTestabilityGetter")(getter.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def signal[T](initialValue: T): WritableSignal[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("signal")(initialValue.asInstanceOf[js.Any]).asInstanceOf[WritableSignal[T]]
inline def signal[T](initialValue: T, options: CreateSignalOptions[T]): WritableSignal[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("signal")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableSignal[T]]

inline def untracked[T](nonReactiveReadsFn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(nonReactiveReadsFn.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵALLOWMULTIPLEPLATFORMS: InjectionToken[Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ALLOW_MULTIPLE_PLATFORMS").asInstanceOf[InjectionToken[Boolean]]

inline def ɵDEFAULTLOCALEID: /* "en-US" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275DEFAULT_LOCALE_ID").asInstanceOf[/* "en-US" */ String]

inline def ɵENABLEDSSRFEATURES: InjectionToken[Set[String]] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ENABLED_SSR_FEATURES").asInstanceOf[InjectionToken[Set[String]]]

inline def ɵINJECTORSCOPE: InjectionToken[InjectorScope | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275INJECTOR_SCOPE").asInstanceOf[InjectionToken[InjectorScope | Null]]

inline def ɵISHYDRATIONDOMREUSEENABLED: InjectionToken[Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275IS_HYDRATION_DOM_REUSE_ENABLED").asInstanceOf[InjectionToken[Boolean]]

inline def ɵLifecycleHooksFeature(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275LifecycleHooksFeature")().asInstanceOf[Unit]

inline def ɵNGCOMPDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_COMP_DEF").asInstanceOf[String]

inline def ɵNGDIRDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_DIR_DEF").asInstanceOf[String]

inline def ɵNGELEMENTID: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_ELEMENT_ID").asInstanceOf[String]

inline def ɵNGINJDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_INJ_DEF").asInstanceOf[String]

inline def ɵNGMODDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_MOD_DEF").asInstanceOf[String]

inline def ɵNGPIPEDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PIPE_DEF").asInstanceOf[String]

inline def ɵNGPROVDEF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PROV_DEF").asInstanceOf[String]

inline def ɵSanitizeHtml(defaultDoc: Any, unsafeHtmlInput: String): TrustedHTML | String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeHtml")(defaultDoc.asInstanceOf[js.Any], unsafeHtmlInput.asInstanceOf[js.Any])).asInstanceOf[TrustedHTML | String]

inline def ɵSanitizeUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵTESTABILITY: InjectionToken[Testability] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275TESTABILITY").asInstanceOf[InjectionToken[Testability]]

inline def ɵTESTABILITYGETTER: InjectionToken[GetTestability] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275TESTABILITY_GETTER").asInstanceOf[InjectionToken[GetTestability]]

inline def ɵXSSSECURITYURL: /* "https://g.co/ng/security#xss" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275XSS_SECURITY_URL").asInstanceOf[/* "https://g.co/ng/security#xss" */ String]

inline def ɵallowSanitizationBypassAndThrow(value: Any, `type`: ɵBypassType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ɵallowSanitizationBypassAndThrow_HTML(value: Any, `type`: HTML): /* is @angular/core.@angular/core.ɵSafeHtml */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeHtml */ Boolean]

inline def ɵallowSanitizationBypassAndThrow_ResourceURL(value: Any, `type`: ResourceURL): /* is @angular/core.@angular/core.ɵSafeResourceUrl */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeResourceUrl */ Boolean]

inline def ɵallowSanitizationBypassAndThrow_Script(value: Any, `type`: Script): /* is @angular/core.@angular/core.ɵSafeScript */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeScript */ Boolean]

inline def ɵallowSanitizationBypassAndThrow_Style(value: Any, `type`: Style): /* is @angular/core.@angular/core.ɵSafeStyle */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeStyle */ Boolean]

inline def ɵallowSanitizationBypassAndThrow_URL(value: Any, `type`: URL): /* is @angular/core.@angular/core.ɵSafeUrl */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeUrl */ Boolean]

inline def ɵannotateForHydration(appRef: ApplicationRef, doc: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275annotateForHydration")(appRef.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵbypassSanitizationTrustHtml(trustedHtml: String): ɵSafeHtml = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustHtml")(trustedHtml.asInstanceOf[js.Any]).asInstanceOf[ɵSafeHtml]

inline def ɵbypassSanitizationTrustResourceUrl(trustedResourceUrl: String): ɵSafeResourceUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustResourceUrl")(trustedResourceUrl.asInstanceOf[js.Any]).asInstanceOf[ɵSafeResourceUrl]

inline def ɵbypassSanitizationTrustScript(trustedScript: String): ɵSafeScript = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustScript")(trustedScript.asInstanceOf[js.Any]).asInstanceOf[ɵSafeScript]

inline def ɵbypassSanitizationTrustStyle(trustedStyle: String): ɵSafeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustStyle")(trustedStyle.asInstanceOf[js.Any]).asInstanceOf[ɵSafeStyle]

inline def ɵbypassSanitizationTrustUrl(trustedUrl: String): ɵSafeUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustUrl")(trustedUrl.asInstanceOf[js.Any]).asInstanceOf[ɵSafeUrl]

inline def ɵclearResolutionOfComponentResourcesQueue(): Map[Type[Any], Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275clearResolutionOfComponentResourcesQueue")().asInstanceOf[Map[Type[Any], Component]]

inline def ɵcoerceToBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275coerceToBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ɵcompileComponent(`type`: Type[Any], metadata: Component): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileComponent")(`type`.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵcompileDirective(`type`: Type[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵcompileDirective(`type`: Type[Any], directive: Directive): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵcompileNgModule(moduleType: Type[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵcompileNgModule(moduleType: Type[Any], ngModule: NgModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵcompileNgModuleDefs(moduleType: ɵNgModuleType[Any], ngModule: NgModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵcompileNgModuleDefs(moduleType: ɵNgModuleType[Any], ngModule: NgModule, allowDuplicateDeclarationsInRoot: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any], allowDuplicateDeclarationsInRoot.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵcompileNgModuleFactory[M](injector: Injector, options: CompilerOptions, moduleType: Type[M]): js.Promise[NgModuleFactory[M]] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleFactory")(injector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], moduleType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NgModuleFactory[M]]]

inline def ɵcompilePipe(`type`: Type[Any], meta: Pipe): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compilePipe")(`type`.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵconvertToBitFlags(): js.UndefOr[InjectFlags] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275convertToBitFlags")().asInstanceOf[js.UndefOr[InjectFlags]]
inline def ɵconvertToBitFlags(flags: InjectFlags): js.UndefOr[InjectFlags] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275convertToBitFlags")(flags.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[InjectFlags]]
inline def ɵconvertToBitFlags(flags: InjectOptions): js.UndefOr[InjectFlags] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275convertToBitFlags")(flags.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[InjectFlags]]

inline def ɵcreateInjector(defType: Any): Injector = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any]).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Null, additionalProviders: js.Array[StaticProvider]): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Null, additionalProviders: js.Array[StaticProvider], name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Null, additionalProviders: Null, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Null, additionalProviders: Unit, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Unit, additionalProviders: js.Array[StaticProvider]): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Unit, additionalProviders: js.Array[StaticProvider], name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Unit, additionalProviders: Null, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Unit, additionalProviders: Unit, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Injector): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Injector, additionalProviders: js.Array[StaticProvider]): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Injector, additionalProviders: js.Array[StaticProvider], name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Injector, additionalProviders: Null, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]
inline def ɵcreateInjector(defType: Any, parent: Injector, additionalProviders: Unit, name: String): Injector = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Injector]

inline def ɵdefaultIterableDiffers: IterableDiffers = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultIterableDiffers").asInstanceOf[IterableDiffers]

inline def ɵdefaultKeyValueDiffers: KeyValueDiffers = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultKeyValueDiffers").asInstanceOf[KeyValueDiffers]

inline def ɵdetectChanges(component: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275detectChanges")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵdevModeEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275devModeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ɵescapeTransferStateContent(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275escapeTransferStateContent")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵfindLocaleData(locale: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275findLocaleData")(locale.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵflushModuleScopingQueueAsMuchAsPossible(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flushModuleScopingQueueAsMuchAsPossible")().asInstanceOf[Unit]

inline def ɵformatRuntimeError[T /* <: Double */](code: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275formatRuntimeError")(code.asInstanceOf[js.Any]).asInstanceOf[String]
inline def ɵformatRuntimeError[T /* <: Double */](code: T, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275formatRuntimeError")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]

inline def ɵformatRuntimeError_false[T /* <: Double */](code: T, message: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275formatRuntimeError")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * @publicApi
  */
inline def ɵgetDebugNode(nativeNode: Any): DebugNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[DebugNode | Null]

inline def ɵgetDirectives(node: Node): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDirectives")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]

inline def ɵgetHostElement(componentOrDirective: js.Object): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getHostElement")(componentOrDirective.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def ɵgetInjectableDef[T](`type`: Any): ɵɵInjectableDeclaration[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getInjectableDef")(`type`.asInstanceOf[js.Any]).asInstanceOf[ɵɵInjectableDeclaration[T] | Null]

inline def ɵgetLContext(target: Any): ɵLContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLContext")(target.asInstanceOf[js.Any]).asInstanceOf[ɵLContext | Null]

inline def ɵgetLocaleCurrencyCode(locale: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def ɵgetLocalePluralCase(locale: String): js.Function1[/* value */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, Double]]

inline def ɵgetSanitizationBypassType(value: Any): ɵBypassType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getSanitizationBypassType")(value.asInstanceOf[js.Any]).asInstanceOf[ɵBypassType | Null]

inline def ɵgetUnknownElementStrictMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getUnknownElementStrictMode")().asInstanceOf[Boolean]

inline def ɵgetUnknownPropertyStrictMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getUnknownPropertyStrictMode")().asInstanceOf[Boolean]

inline def ɵglobal: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275global").asInstanceOf[Any]

inline def ɵinjectChangeDetectorRef(flags: InjectFlags): ChangeDetectorRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275injectChangeDetectorRef")(flags.asInstanceOf[js.Any]).asInstanceOf[ChangeDetectorRef]

inline def ɵinternalCreateApplication(config: AppProviders): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275internalCreateApplication")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationRef]]

inline def ɵisBoundToModule[C](cf: ComponentFactory[C]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isBoundToModule")(cf.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ɵisEnvironmentProviders(value: EnvironmentProviders): /* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isEnvironmentProviders")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean]
inline def ɵisEnvironmentProviders(value: Provider): /* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isEnvironmentProviders")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean]
inline def ɵisEnvironmentProviders(value: ɵInternalEnvironmentProviders): /* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isEnvironmentProviders")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core.ɵInternalEnvironmentProviders */ Boolean]

inline def ɵisInjectable(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isInjectable")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ɵisNgModule[T](value: Type[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isNgModule")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ɵisPromise[T](obj: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]

inline def ɵisSubscribable[T](obj: Any): /* is rxjs.rxjs/dist/types/internal/types.Subscribable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isSubscribable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/types.Subscribable<T> */ Boolean]
inline def ɵisSubscribable[T](obj: Subscribable[T]): /* is rxjs.rxjs/dist/types/internal/types.Subscribable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isSubscribable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/types.Subscribable<T> */ Boolean]

inline def ɵnoSideEffects[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275noSideEffects")(fn.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵpatchComponentDefWithScope[C](componentDef: ɵComponentDef[C], transitiveScopes: ɵNgModuleTransitiveScopes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275patchComponentDefWithScope")(componentDef.asInstanceOf[js.Any], transitiveScopes.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵpublishDefaultGlobalUtils(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishDefaultGlobalUtils")().asInstanceOf[Unit]

inline def ɵpublishGlobalUtil(name: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishGlobalUtil")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵregisterLocaleData(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵregisterLocaleData(data: Any, localeId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵregisterLocaleData(data: Any, localeId: String, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵregisterLocaleData(data: Any, localeId: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵregisterLocaleData(data: Any, localeId: Any, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵregisterLocaleData(data: Any, localeId: Unit, extraData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵresetCompiledComponents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetCompiledComponents")().asInstanceOf[Unit]

inline def ɵresetJitOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetJitOptions")().asInstanceOf[Unit]

inline def ɵresolveComponentResources(resourceResolver: js.Function1[/* url */ String, js.Promise[String | Text]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resolveComponentResources")(resourceResolver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def ɵsetAllowDuplicateNgModuleIdsForTest(allowDuplicates: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setAllowDuplicateNgModuleIdsForTest")(allowDuplicates.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵsetAlternateWeakRefImpl(impl: WeakRefCtor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setAlternateWeakRefImpl")(impl.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵsetClassMetadata(`type`: Type[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵsetClassMetadata(`type`: Type[Any], decorators: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(`type`: Type[Any], decorators: js.Array[Any], ctorParameters: js.Function0[js.Array[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(
  `type`: Type[Any],
  decorators: js.Array[Any],
  ctorParameters: js.Function0[js.Array[Any]],
  propDecorators: StringDictionary[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(
  `type`: Type[Any],
  decorators: js.Array[Any],
  ctorParameters: Null,
  propDecorators: StringDictionary[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(`type`: Type[Any], decorators: Null, ctorParameters: js.Function0[js.Array[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(
  `type`: Type[Any],
  decorators: Null,
  ctorParameters: js.Function0[js.Array[Any]],
  propDecorators: StringDictionary[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵsetClassMetadata(`type`: Type[Any], decorators: Null, ctorParameters: Null, propDecorators: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵsetCurrentInjector(): js.UndefOr[Injector | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")().asInstanceOf[js.UndefOr[Injector | Null]]
inline def ɵsetCurrentInjector(injector: Injector): js.UndefOr[Injector | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")(injector.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Injector | Null]]

inline def ɵsetDocument(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")().asInstanceOf[Unit]
inline def ɵsetDocument(document: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵsetLocaleId(localeId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setLocaleId")(localeId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵsetUnknownElementStrictMode(shouldThrow: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setUnknownElementStrictMode")(shouldThrow.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵsetUnknownPropertyStrictMode(shouldThrow: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setUnknownPropertyStrictMode")(shouldThrow.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵstore[T](tView: TView, lView: LView[Any], index: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275store")(tView.asInstanceOf[js.Any], lView.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵstringify(token: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275stringify")(token.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵtransitiveScopesFor[T](`type`: Type[T]): ɵNgModuleTransitiveScopes = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275transitiveScopesFor")(`type`.asInstanceOf[js.Any]).asInstanceOf[ɵNgModuleTransitiveScopes]

inline def ɵunescapeTransferStateContent(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unescapeTransferStateContent")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵunregisterLocaleData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unregisterLocaleData")().asInstanceOf[Unit]

inline def ɵunwrapSafeValue(value: ɵSafeValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
inline def ɵunwrapSafeValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵwithDomHydration(): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275withDomHydration")().asInstanceOf[EnvironmentProviders]

inline def ɵɵCopyDefinitionFeature(definition: ɵComponentDef[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵCopyDefinitionFeature(definition: ɵDirectiveDef[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵHostDirectivesFeature(rawHostDirectives: js.Array[HostDirectiveConfig]): js.Function1[/* definition */ ɵDirectiveDef[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275HostDirectivesFeature")(rawHostDirectives.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* definition */ ɵDirectiveDef[Any], Unit]]
inline def ɵɵHostDirectivesFeature(rawHostDirectives: js.Function0[js.Array[HostDirectiveConfig]]): js.Function1[/* definition */ ɵDirectiveDef[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275HostDirectivesFeature")(rawHostDirectives.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* definition */ ɵDirectiveDef[Any], Unit]]

inline def ɵɵInheritDefinitionFeature(definition: ɵComponentDef[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵInheritDefinitionFeature(definition: ɵDirectiveDef[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵNgOnChangesFeature[T](): DirectiveDefFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275NgOnChangesFeature")().asInstanceOf[DirectiveDefFeature]

inline def ɵɵProvidersFeature[T](providers: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* definition */ ɵDirectiveDef[T], Unit]]
inline def ɵɵProvidersFeature[T](providers: js.Array[Provider], viewProviders: js.Array[Provider]): js.Function1[/* definition */ ɵDirectiveDef[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any], viewProviders.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* definition */ ɵDirectiveDef[T], Unit]]

inline def ɵɵStandaloneFeature(definition: ɵComponentDef[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275StandaloneFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵadvance(delta: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275advance")(delta.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵattribute(name: String, value: Any): js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any]]
inline def ɵɵattribute(name: String, value: Any, sanitizer: Null, namespace: String): js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any]]
inline def ɵɵattribute(name: String, value: Any, sanitizer: Unit, namespace: String): js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any]]
inline def ɵɵattribute(name: String, value: Any, sanitizer: SanitizerFn): js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any]]
inline def ɵɵattribute(name: String, value: Any, sanitizer: SanitizerFn, namespace: String): js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* name */ String, 
/* value */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn | Null], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any]]

inline def ɵɵattributeInterpolate1(attrName: String, prefix: String, v0: Any, suffix: String): js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any]]
inline def ɵɵattributeInterpolate1(attrName: String, prefix: String, v0: Any, suffix: String, sanitizer: Unit, namespace: String): js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any]]
inline def ɵɵattributeInterpolate1(attrName: String, prefix: String, v0: Any, suffix: String, sanitizer: SanitizerFn): js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any]]
inline def ɵɵattributeInterpolate1(
  attrName: String,
  prefix: String,
  v0: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any]]

inline def ɵɵattributeInterpolate2(attrName: String, prefix: String, v0: Any, i0: String, v1: Any, suffix: String): js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any]]
inline def ɵɵattributeInterpolate2(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any]]
inline def ɵɵattributeInterpolate2(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any]]
inline def ɵɵattributeInterpolate2(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any]]

inline def ɵɵattributeInterpolate3(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String
): js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any]]
inline def ɵɵattributeInterpolate3(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any]]
inline def ɵɵattributeInterpolate3(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any]]
inline def ɵɵattributeInterpolate3(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any]]

inline def ɵɵattributeInterpolate4(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any]]
inline def ɵɵattributeInterpolate4(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any]]
inline def ɵɵattributeInterpolate4(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any]]
inline def ɵɵattributeInterpolate4(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any]]

inline def ɵɵattributeInterpolate5(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any]]
inline def ɵɵattributeInterpolate5(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any]]
inline def ɵɵattributeInterpolate5(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any]]
inline def ɵɵattributeInterpolate5(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any]]

inline def ɵɵattributeInterpolate6(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any]]
inline def ɵɵattributeInterpolate6(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any]]
inline def ɵɵattributeInterpolate6(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any]]
inline def ɵɵattributeInterpolate6(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any]]

inline def ɵɵattributeInterpolate7(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any]]
inline def ɵɵattributeInterpolate7(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any]]
inline def ɵɵattributeInterpolate7(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any]]
inline def ɵɵattributeInterpolate7(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any]]

inline def ɵɵattributeInterpolate8(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any]]
inline def ɵɵattributeInterpolate8(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String,
  sanitizer: Unit,
  namespace: String
): js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any]]
inline def ɵɵattributeInterpolate8(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any]]
inline def ɵɵattributeInterpolate8(
  attrName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String,
  sanitizer: SanitizerFn,
  namespace: String
): js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
/* attrName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any]]

inline def ɵɵattributeInterpolateV(attrName: String, values: js.Array[Any]): js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any]]
inline def ɵɵattributeInterpolateV(attrName: String, values: js.Array[Any], sanitizer: Unit, namespace: String): js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any]]
inline def ɵɵattributeInterpolateV(attrName: String, values: js.Array[Any], sanitizer: SanitizerFn): js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any]]
inline def ɵɵattributeInterpolateV(attrName: String, values: js.Array[Any], sanitizer: SanitizerFn, namespace: String): js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* attrName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* namespace */ js.UndefOr[String], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any]]

inline def ɵɵclassMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")().asInstanceOf[Unit]
inline def ɵɵclassMap(classes: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵclassMap(classes: StringDictionary[js.UndefOr[Boolean | Null]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate1(prefix: String, v0: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate2(prefix: String, v0: Any, i0: String, v1: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate3(prefix: String, v0: Any, i0: String, v1: Any, i1: String, v2: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate4(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate5(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate6(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate7(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolate8(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵclassMapInterpolateV(values: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵclassProp(className: String): js.Function2[
/* className */ String, 
/* value */ js.UndefOr[Boolean | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
/* className */ String, 
/* value */ js.UndefOr[Boolean | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any]]
inline def ɵɵclassProp(className: String, value: Boolean): js.Function2[
/* className */ String, 
/* value */ js.UndefOr[Boolean | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
/* className */ String, 
/* value */ js.UndefOr[Boolean | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any]]

inline def ɵɵcontentQuery[T](directiveIndex: Double, predicate: js.Array[String], flags: QueryFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵcontentQuery[T](directiveIndex: Double, predicate: js.Array[String], flags: QueryFlags, read: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵcontentQuery[T](directiveIndex: Double, predicate: ProviderToken[Any], flags: QueryFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵcontentQuery[T](directiveIndex: Double, predicate: ProviderToken[Any], flags: QueryFlags, read: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵdefineComponent[T](componentDefinition: ComponentDefinition[T]): MutableɵComponentDefanyke = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineComponent")(componentDefinition.asInstanceOf[js.Any]).asInstanceOf[MutableɵComponentDefanyke]

inline def ɵɵdefineDirective[T](directiveDefinition: DirectiveDefinition[T]): MutableɵDirectiveDefanyke = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineDirective")(directiveDefinition.asInstanceOf[js.Any]).asInstanceOf[MutableɵDirectiveDefanyke]

inline def ɵɵdefineInjectable[T](opts: Factory[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵdefineInjector(options: Imports): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjector")(options.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵdefineNgModule[T](`def`: Bootstrap[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineNgModule")(`def`.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵdefinePipe[T](pipeDef: Pure[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275definePipe")(pipeDef.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵdirectiveInject[T](token: ProviderToken[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
inline def ɵɵdirectiveInject[T](token: ProviderToken[T], flags: InjectFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]

inline def ɵɵdisableBindings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275disableBindings")().asInstanceOf[Unit]

inline def ɵɵelement(index: Double, name: String): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any]]
inline def ɵɵelement(index: Double, name: String, attrsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any]]
inline def ɵɵelement(index: Double, name: String, attrsIndex: Double, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any]]
inline def ɵɵelement(index: Double, name: String, attrsIndex: Null, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any]]
inline def ɵɵelement(index: Double, name: String, attrsIndex: Unit, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelement */ js.Any]]

inline def ɵɵelementContainer(index: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any]]
inline def ɵɵelementContainer(index: Double, attrsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any]]
inline def ɵɵelementContainer(index: Double, attrsIndex: Double, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any]]
inline def ɵɵelementContainer(index: Double, attrsIndex: Null, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any]]
inline def ɵɵelementContainer(index: Double, attrsIndex: Unit, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainer */ js.Any]]

inline def ɵɵelementContainerEnd(): js.Function0[
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerEnd */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerEnd")().asInstanceOf[js.Function0[
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerEnd */ js.Any]]

inline def ɵɵelementContainerStart(index: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any]]
inline def ɵɵelementContainerStart(index: Double, attrsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any]]
inline def ɵɵelementContainerStart(index: Double, attrsIndex: Double, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any]]
inline def ɵɵelementContainerStart(index: Double, attrsIndex: Null, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any]]
inline def ɵɵelementContainerStart(index: Double, attrsIndex: Unit, localRefsIndex: Double): js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* index */ Double, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementContainerStart */ js.Any]]

inline def ɵɵelementEnd(): js.Function0[
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementEnd */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementEnd")().asInstanceOf[js.Function0[
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementEnd */ js.Any]]

inline def ɵɵelementStart(index: Double, name: String): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any]]
inline def ɵɵelementStart(index: Double, name: String, attrsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any]]
inline def ɵɵelementStart(index: Double, name: String, attrsIndex: Double, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any]]
inline def ɵɵelementStart(index: Double, name: String, attrsIndex: Null, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any]]
inline def ɵɵelementStart(index: Double, name: String, attrsIndex: Unit, localRefsIndex: Double): js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* index */ Double, 
/* name */ String, 
/* attrsIndex */ js.UndefOr[Double | Null], 
/* localRefsIndex */ js.UndefOr[Double], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵelementStart */ js.Any]]

inline def ɵɵenableBindings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275enableBindings")().asInstanceOf[Unit]

inline def ɵɵgetCurrentView(): OpaqueViewState = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getCurrentView")().asInstanceOf[OpaqueViewState]

inline def ɵɵgetInheritedFactory[T](`type`: Type[Any]): js.Function1[/* type */ Type[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getInheritedFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* type */ Type[T], T]]

inline def ɵɵhostProperty[T](propName: String, value: T): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FnCall]
inline def ɵɵhostProperty[T](propName: String, value: T, sanitizer: SanitizerFn): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[FnCall]

inline def ɵɵi18n(index: Double, messageIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵi18n(index: Double, messageIndex: Double, subTemplateIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵi18nApply(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nApply")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵi18nAttributes(index: Double, attrsIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nAttributes")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵi18nEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nEnd")().asInstanceOf[Unit]

inline def ɵɵi18nExp[T](value: T): FnCallValue = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nExp")(value.asInstanceOf[js.Any]).asInstanceOf[FnCallValue]

inline def ɵɵi18nPostprocess(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any]).asInstanceOf[String]
inline def ɵɵi18nPostprocess(message: String, replacements: StringDictionary[String | js.Array[String]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]

inline def ɵɵi18nStart(index: Double, messageIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵi18nStart(index: Double, messageIndex: Double, subTemplateIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵinject[T](token: ProviderToken[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | Null]
inline def ɵɵinject[T](token: ProviderToken[T], flags: InjectFlags): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | Null]

inline def ɵɵinjectAttribute(attrNameToInject: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectAttribute")(attrNameToInject.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def ɵɵinject_T_T[T](token: ProviderToken[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵɵinvalidFactory(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactory")().asInstanceOf[scala.Nothing]

inline def ɵɵinvalidFactoryDep(index: Double): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactoryDep")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

inline def ɵɵlistener(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[Any], Any]): js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any]]
inline def ɵɵlistener(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[Any], Any], useCapture: Boolean): js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any]]
inline def ɵɵlistener(
  eventName: String,
  listenerFn: js.Function1[/* e */ js.UndefOr[Any], Any],
  useCapture: Boolean,
  eventTargetResolver: GlobalTargetResolver
): js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any]]
inline def ɵɵlistener(
  eventName: String,
  listenerFn: js.Function1[/* e */ js.UndefOr[Any], Any],
  useCapture: Unit,
  eventTargetResolver: GlobalTargetResolver
): js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* useCapture */ js.UndefOr[Boolean], 
/* eventTargetResolver */ js.UndefOr[GlobalTargetResolver], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any]]

inline def ɵɵloadQuery[T](): QueryList[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275loadQuery")().asInstanceOf[QueryList[T]]

inline def ɵɵnamespaceHTML(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceHTML")().asInstanceOf[Unit]

inline def ɵɵnamespaceMathML(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceMathML")().asInstanceOf[Unit]

inline def ɵɵnamespaceSVG(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceSVG")().asInstanceOf[Unit]

inline def ɵɵnextContext[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")().asInstanceOf[T]
inline def ɵɵnextContext[T](level: Double): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")(level.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵɵngDeclareClassMetadata(decl: CtorParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareClassMetadata")(decl.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵngDeclareComponent(decl: R3DeclareComponentFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareComponent")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclareDirective(decl: R3DeclareDirectiveFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareDirective")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclareFactory(decl: R3DeclareFactoryFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareFactory")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclareInjectable(decl: R3DeclareInjectableFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareInjectable")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclareInjector(decl: R3DeclareInjectorFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareInjector")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclareNgModule(decl: R3DeclareNgModuleFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclareNgModule")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵngDeclarePipe(decl: R3DeclarePipeFacade): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ngDeclarePipe")(decl.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ɵɵpipe(index: Double, pipeName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipe")(index.asInstanceOf[js.Any], pipeName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpipeBind1(index: Double, slotOffset: Double, v1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind1")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpipeBind2(index: Double, slotOffset: Double, v1: Any, v2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind2")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpipeBind3(index: Double, slotOffset: Double, v1: Any, v2: Any, v3: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind3")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpipeBind4(index: Double, slotOffset: Double, v1: Any, v2: Any, v3: Any, v4: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind4")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpipeBindV(index: Double, slotOffset: Double, values: Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBindV")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵprojection(nodeIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵprojection(nodeIndex: Double, selectorIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵprojection(nodeIndex: Double, selectorIndex: Double, attrs: TAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵprojection(nodeIndex: Double, selectorIndex: Unit, attrs: TAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵprojectionDef(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")().asInstanceOf[Unit]
inline def ɵɵprojectionDef(projectionSlots: ProjectionSlots): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")(projectionSlots.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵproperty[T](propName: String, value: T): FnCallPropNameValueSanitizer = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FnCallPropNameValueSanitizer]
inline def ɵɵproperty[T](propName: String, value: T, sanitizer: SanitizerFn): FnCallPropNameValueSanitizer = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[FnCallPropNameValueSanitizer]

inline def ɵɵpropertyInterpolate(propName: String, v0: Any): js.Function3[
/* propName */ String, 
/* v0 */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* propName */ String, 
/* v0 */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any]]
inline def ɵɵpropertyInterpolate(propName: String, v0: Any, sanitizer: SanitizerFn): js.Function3[
/* propName */ String, 
/* v0 */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* propName */ String, 
/* v0 */ Any, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any]]

inline def ɵɵpropertyInterpolate1(propName: String, prefix: String, v0: Any, suffix: String): js.Function5[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any]]
inline def ɵɵpropertyInterpolate1(propName: String, prefix: String, v0: Any, suffix: String, sanitizer: SanitizerFn): js.Function5[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any]]

inline def ɵɵpropertyInterpolate2(propName: String, prefix: String, v0: Any, i0: String, v1: Any, suffix: String): js.Function7[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any]]
inline def ɵɵpropertyInterpolate2(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function7[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any]]

inline def ɵɵpropertyInterpolate3(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String
): js.Function9[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any]]
inline def ɵɵpropertyInterpolate3(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function9[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any]]

inline def ɵɵpropertyInterpolate4(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): js.Function11[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any]]
inline def ɵɵpropertyInterpolate4(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function11[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any]]

inline def ɵɵpropertyInterpolate5(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): js.Function13[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any]]
inline def ɵɵpropertyInterpolate5(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function13[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any]]

inline def ɵɵpropertyInterpolate6(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): js.Function15[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any]]
inline def ɵɵpropertyInterpolate6(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function15[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any]]

inline def ɵɵpropertyInterpolate7(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): js.Function17[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any]]
inline def ɵɵpropertyInterpolate7(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function17[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any]]

inline def ɵɵpropertyInterpolate8(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): js.Function19[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any]]
inline def ɵɵpropertyInterpolate8(
  propName: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String,
  sanitizer: SanitizerFn
): js.Function19[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
/* propName */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any]]

inline def ɵɵpropertyInterpolateV(propName: String, values: js.Array[Any]): js.Function3[
/* propName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* propName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any]]
inline def ɵɵpropertyInterpolateV(propName: String, values: js.Array[Any], sanitizer: SanitizerFn): js.Function3[
/* propName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* propName */ String, 
/* values */ js.Array[Any], 
/* sanitizer */ js.UndefOr[SanitizerFn], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any]]

inline def ɵɵpureFunction0[T](slotOffset: Double, pureFn: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any])).asInstanceOf[T]
inline def ɵɵpureFunction0[T](slotOffset: Double, pureFn: js.Function0[T], thisArg: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]

inline def ɵɵpureFunction1(slotOffset: Double, pureFn: js.Function1[/* v */ Any, Any], exp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction1(slotOffset: Double, pureFn: js.Function1[/* v */ Any, Any], exp: Any, thisArg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction2(slotOffset: Double, pureFn: js.Function2[/* v1 */ Any, /* v2 */ Any, Any], exp1: Any, exp2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction2(
  slotOffset: Double,
  pureFn: js.Function2[/* v1 */ Any, /* v2 */ Any, Any],
  exp1: Any,
  exp2: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction3(
  slotOffset: Double,
  pureFn: js.Function3[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction3(
  slotOffset: Double,
  pureFn: js.Function3[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction4(
  slotOffset: Double,
  pureFn: js.Function4[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction4(
  slotOffset: Double,
  pureFn: js.Function4[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction5(
  slotOffset: Double,
  pureFn: js.Function5[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, /* v5 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction5(
  slotOffset: Double,
  pureFn: js.Function5[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, /* v5 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction6(
  slotOffset: Double,
  pureFn: js.Function6[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, /* v5 */ Any, /* v6 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction6(
  slotOffset: Double,
  pureFn: js.Function6[/* v1 */ Any, /* v2 */ Any, /* v3 */ Any, /* v4 */ Any, /* v5 */ Any, /* v6 */ Any, Any],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction7(
  slotOffset: Double,
  pureFn: js.Function7[
  /* v1 */ Any, 
  /* v2 */ Any, 
  /* v3 */ Any, 
  /* v4 */ Any, 
  /* v5 */ Any, 
  /* v6 */ Any, 
  /* v7 */ Any, 
  Any
],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any,
  exp7: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction7(
  slotOffset: Double,
  pureFn: js.Function7[
  /* v1 */ Any, 
  /* v2 */ Any, 
  /* v3 */ Any, 
  /* v4 */ Any, 
  /* v5 */ Any, 
  /* v6 */ Any, 
  /* v7 */ Any, 
  Any
],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any,
  exp7: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunction8(
  slotOffset: Double,
  pureFn: js.Function8[
  /* v1 */ Any, 
  /* v2 */ Any, 
  /* v3 */ Any, 
  /* v4 */ Any, 
  /* v5 */ Any, 
  /* v6 */ Any, 
  /* v7 */ Any, 
  /* v8 */ Any, 
  Any
],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any,
  exp7: Any,
  exp8: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunction8(
  slotOffset: Double,
  pureFn: js.Function8[
  /* v1 */ Any, 
  /* v2 */ Any, 
  /* v3 */ Any, 
  /* v4 */ Any, 
  /* v5 */ Any, 
  /* v6 */ Any, 
  /* v7 */ Any, 
  /* v8 */ Any, 
  Any
],
  exp1: Any,
  exp2: Any,
  exp3: Any,
  exp4: Any,
  exp5: Any,
  exp6: Any,
  exp7: Any,
  exp8: Any,
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵpureFunctionV(slotOffset: Double, pureFn: js.Function1[/* repeated */ Any, Any], exps: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def ɵɵpureFunctionV(
  slotOffset: Double,
  pureFn: js.Function1[/* repeated */ Any, Any],
  exps: js.Array[Any],
  thisArg: Any
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵqueryRefresh(queryList: QueryList[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275queryRefresh")(queryList.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def ɵɵreference[T](index: Double): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275reference")(index.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵɵregisterNgModuleType(ngModuleType: ɵNgModuleType[Any], id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275registerNgModuleType")(ngModuleType.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵresetView[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resetView")().asInstanceOf[js.UndefOr[T]]
inline def ɵɵresetView[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resetView")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]

inline def ɵɵresolveBody(element: RElementownerDocumentDocu): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveBody")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]

inline def ɵɵresolveDocument(element: RElementownerDocumentDocu): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveDocument")(element.asInstanceOf[js.Any]).asInstanceOf[Document]

inline def ɵɵresolveWindow(element: RElementownerDocumentDocu): (Window & (/* globalThis */ Any)) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveWindow")(element.asInstanceOf[js.Any]).asInstanceOf[(Window & (/* globalThis */ Any)) | Null]

inline def ɵɵrestoreView[T](viewToRestore: OpaqueViewState): T = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275restoreView")(viewToRestore.asInstanceOf[js.Any]).asInstanceOf[T]

inline def ɵɵsanitizeHtml(unsafeHtml: Any): TrustedHTML | String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeHtml")(unsafeHtml.asInstanceOf[js.Any]).asInstanceOf[TrustedHTML | String]

inline def ɵɵsanitizeResourceUrl(unsafeResourceUrl: Any): TrustedScriptURL | String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeResourceUrl")(unsafeResourceUrl.asInstanceOf[js.Any]).asInstanceOf[TrustedScriptURL | String]

inline def ɵɵsanitizeScript(unsafeScript: Any): TrustedScript | String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeScript")(unsafeScript.asInstanceOf[js.Any]).asInstanceOf[TrustedScript | String]

inline def ɵɵsanitizeStyle(unsafeStyle: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeStyle")(unsafeStyle.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵɵsanitizeUrl(unsafeUrl: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrl")(unsafeUrl.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵɵsanitizeUrlOrResourceUrl(unsafeUrl: Any, tag: String, prop: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrlOrResourceUrl")(unsafeUrl.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵsetComponentScope(`type`: ɵComponentType[Any], directives: js.Array[Type[Any]], pipes: js.Array[Type[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵsetComponentScope(
  `type`: ɵComponentType[Any],
  directives: js.Array[Type[Any]],
  pipes: js.Function0[js.Array[Type[Any]]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵsetComponentScope(
  `type`: ɵComponentType[Any],
  directives: js.Function0[js.Array[Type[Any]]],
  pipes: js.Array[Type[Any]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵsetComponentScope(
  `type`: ɵComponentType[Any],
  directives: js.Function0[js.Array[Type[Any]]],
  pipes: js.Function0[js.Array[Type[Any]]]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵsetNgModuleScope(`type`: Any, scope: Declarations): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setNgModuleScope")(`type`.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵstyleMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")().asInstanceOf[Unit]
inline def ɵɵstyleMap(styles: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵstyleMap(styles: StringDictionary[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate1(prefix: String, v0: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate2(prefix: String, v0: Any, i0: String, v1: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate3(prefix: String, v0: Any, i0: String, v1: Any, i1: String, v2: Any, suffix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate4(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate5(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate6(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate7(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolate8(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵstyleMapInterpolateV(values: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ɵɵstyleProp(prop: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: String, suffix: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: Double): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: Double, suffix: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: Null, suffix: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: Unit, suffix: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: ɵSafeValue): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]
inline def ɵɵstyleProp(prop: String, value: ɵSafeValue, suffix: String): js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* value */ js.UndefOr[String | Double | ɵSafeValue | Null], 
/* suffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any]]

inline def ɵɵstylePropInterpolate1(prop: String, prefix: String, v0: Any, suffix: String): js.Function5[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any]]
inline def ɵɵstylePropInterpolate1(prop: String, prefix: String, v0: Any, suffix: String, valueSuffix: String): js.Function5[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any]]

inline def ɵɵstylePropInterpolate2(prop: String, prefix: String, v0: Any, i0: String, v1: Any, suffix: String): js.Function7[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any]]
inline def ɵɵstylePropInterpolate2(prop: String, prefix: String, v0: Any, i0: String, v1: Any, suffix: String, valueSuffix: String): js.Function7[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any]]

inline def ɵɵstylePropInterpolate3(prop: String, prefix: String, v0: Any, i0: String, v1: Any, i1: String, v2: Any, suffix: String): js.Function9[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any]]
inline def ɵɵstylePropInterpolate3(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  suffix: String,
  valueSuffix: String
): js.Function9[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any]]

inline def ɵɵstylePropInterpolate4(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): js.Function11[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any]]
inline def ɵɵstylePropInterpolate4(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String,
  valueSuffix: String
): js.Function11[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any]]

inline def ɵɵstylePropInterpolate5(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): js.Function13[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any]]
inline def ɵɵstylePropInterpolate5(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String,
  valueSuffix: String
): js.Function13[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any]]

inline def ɵɵstylePropInterpolate6(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): js.Function15[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any]]
inline def ɵɵstylePropInterpolate6(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String,
  valueSuffix: String
): js.Function15[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any]]

inline def ɵɵstylePropInterpolate7(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): js.Function17[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any]]
inline def ɵɵstylePropInterpolate7(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String,
  valueSuffix: String
): js.Function17[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any]]

inline def ɵɵstylePropInterpolate8(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): js.Function19[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any]]
inline def ɵɵstylePropInterpolate8(
  prop: String,
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String,
  valueSuffix: String
): js.Function19[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
/* prop */ String, 
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any]]

inline def ɵɵstylePropInterpolateV(prop: String, values: js.Array[Any]): js.Function3[
/* prop */ String, 
/* values */ js.Array[Any], 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* values */ js.Array[Any], 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any]]
inline def ɵɵstylePropInterpolateV(prop: String, values: js.Array[Any], valueSuffix: String): js.Function3[
/* prop */ String, 
/* values */ js.Array[Any], 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prop */ String, 
/* values */ js.Array[Any], 
/* valueSuffix */ js.UndefOr[String | Null], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any]]

inline def ɵɵsyntheticHostListener(eventName: String, listenerFn: js.Function1[/* e */ js.UndefOr[Any], Any]): js.Function2[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
/* eventName */ String, 
/* listenerFn */ js.Function1[/* e */ js.UndefOr[Any], Any], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any]]

inline def ɵɵsyntheticHostProperty[T](propName: String, value: T): Fn0 = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Fn0]
inline def ɵɵsyntheticHostProperty[T](propName: String, value: T, sanitizer: SanitizerFn): Fn0 = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[Fn0]
inline def ɵɵsyntheticHostProperty[T](propName: String, value: ɵNOCHANGE): Fn0 = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Fn0]
inline def ɵɵsyntheticHostProperty[T](propName: String, value: ɵNOCHANGE, sanitizer: SanitizerFn): Fn0 = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[Fn0]

inline def ɵɵtemplate(
  index: Double,
  templateFn: ComponentTemplate[Any] | Null,
  decls: Double,
  vars: Double,
  tagName: js.UndefOr[String | Null],
  attrsIndex: js.UndefOr[Double | Null],
  localRefsIndex: js.UndefOr[Double | Null],
  localRefExtractor: js.UndefOr[LocalRefExtractor]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275template")(index.asInstanceOf[js.Any], templateFn.asInstanceOf[js.Any], decls.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any], localRefExtractor.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵtemplateRefExtractor(tNode: TNode, lView: LView[Any]): TemplateRef[Any] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275templateRefExtractor")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[TemplateRef[Any] | Null]

inline def ɵɵtext(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def ɵɵtext(index: Double, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ɵɵtextInterpolate(v0: Any): js.Function1[
/* v0 */ Any, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate")(v0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* v0 */ Any, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any]]

inline def ɵɵtextInterpolate1(prefix: String, v0: Any, suffix: String): js.Function3[
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* prefix */ String, 
/* v0 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any]]

inline def ɵɵtextInterpolate2(prefix: String, v0: Any, i0: String, v1: Any, suffix: String): js.Function5[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any]]

inline def ɵɵtextInterpolate3(prefix: String, v0: Any, i0: String, v1: Any, i1: String, v2: Any, suffix: String): js.Function7[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any]]

inline def ɵɵtextInterpolate4(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  suffix: String
): js.Function9[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any]]

inline def ɵɵtextInterpolate5(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  suffix: String
): js.Function11[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any]]

inline def ɵɵtextInterpolate6(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  suffix: String
): js.Function13[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any]]

inline def ɵɵtextInterpolate7(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  suffix: String
): js.Function15[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any]]

inline def ɵɵtextInterpolate8(
  prefix: String,
  v0: Any,
  i0: String,
  v1: Any,
  i1: String,
  v2: Any,
  i2: String,
  v3: Any,
  i3: String,
  v4: Any,
  i4: String,
  v5: Any,
  i5: String,
  v6: Any,
  i6: String,
  v7: Any,
  suffix: String
): js.Function17[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
/* prefix */ String, 
/* v0 */ Any, 
/* i0 */ String, 
/* v1 */ Any, 
/* i1 */ String, 
/* v2 */ Any, 
/* i2 */ String, 
/* v3 */ Any, 
/* i3 */ String, 
/* v4 */ Any, 
/* i4 */ String, 
/* v5 */ Any, 
/* i5 */ String, 
/* v6 */ Any, 
/* i6 */ String, 
/* v7 */ Any, 
/* suffix */ String, 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any]]

inline def ɵɵtextInterpolateV(values: js.Array[Any]): js.Function1[
/* values */ js.Array[Any], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* values */ js.Array[Any], 
/* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any]]

inline def ɵɵtrustConstantHtml(html: TemplateStringsArray): TrustedHTML | String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantHtml")(html.asInstanceOf[js.Any]).asInstanceOf[TrustedHTML | String]

inline def ɵɵtrustConstantResourceUrl(url: TemplateStringsArray): TrustedScriptURL | String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantResourceUrl")(url.asInstanceOf[js.Any]).asInstanceOf[TrustedScriptURL | String]

inline def ɵɵvalidateIframeAttribute(attrValue: Any, tagName: String, attrName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275validateIframeAttribute")(attrValue.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ɵɵviewQuery[T](predicate: js.Array[String], flags: QueryFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵviewQuery[T](predicate: js.Array[String], flags: QueryFlags, read: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵviewQuery[T](predicate: ProviderToken[Any], flags: QueryFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ɵɵviewQuery[T](predicate: ProviderToken[Any], flags: QueryFlags, read: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AbstractType[T] = js.Function

type ChangeDetectionStrategy2 = Double

type ChangeDetectorRefInterface = ChangeDetectorRef

/**
  * Definition of what a template rendering function should look like for a component.
  */
type ComponentTemplate[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]

/**
  * Definition of what a content queries function should look like.
  */
type ContentQueriesFunction[T] = js.Function3[/* rf */ ɵRenderFlags, /* ctx */ T, /* directiveIndex */ Double, Unit]

/**
  * Expresses a single CSS Selector.
  *
  * Beginning of array
  * - First index: element name
  * - Subsequent odd indices: attr keys
  * - Subsequent even indices: attr values
  *
  * After SelectorFlags.CLASS flag
  * - Class name values
  *
  * SelectorFlags.NOT flag
  * - Changes the mode to NOT
  * - Can be combined with other flags to set the element / attr / class mode
  *
  * e.g. SelectorFlags.NOT | SelectorFlags.ELEMENT
  *
  * Example:
  * Original: `div.foo.bar[attr1=val1][attr2]`
  * Parsed: ['div', 'attr1', 'val1', 'attr2', '', SelectorFlags.CLASS, 'foo', 'bar']
  *
  * Original: 'div[attr1]:not(.foo[attr2])
  * Parsed: [
  *  'div', 'attr1', '',
  *  SelectorFlags.NOT | SelectorFlags.ATTRIBUTE 'attr2', '', SelectorFlags.CLASS, 'foo'
  * ]
  *
  * See more examples in node_selector_matcher_spec.ts
  */
type CssSelector = js.Array[String | SelectorFlags]

/**
  * An object literal of this type is used to represent the metadata of a constructor dependency.
  * The type itself is never referred to from generated code.
  *
  * @publicApi
  */
type CtorDependency = typings.angularCore.anon.Attribute | Null

type DependencyTypeList = js.Array[ɵDirectiveType[Any] | ɵComponentType[Any] | PipeType[Any] | Type[Any]]

/**
  * Array of destroy hooks that should be executed for a view and their directive indices.
  *
  * The array is set up as a series of number/function or number/(number|function)[]:
  * - Even indices represent the context with which hooks should be called.
  * - Odd indices are the hook functions themselves. If a value at an odd index is an array,
  *   it represents the destroy hooks of a `multi` provider where:
  *     - Even indices represent the index of the provider for which we've registered a destroy hook,
  *       inside of the `multi` provider array.
  *     - Odd indices are the destroy hook functions.
  * For example:
  * LView: `[0, 1, 2, AService, 4, [BService, CService, DService]]`
  * destroyHooks: `[3, AService.ngOnDestroy, 5, [0, BService.ngOnDestroy, 2, DService.ngOnDestroy]]`
  *
  * In the example above `AService` is a type provider with an `ngOnDestroy`, whereas `BService`,
  * `CService` and `DService` are part of a `multi` provider where only `BService` and `DService`
  * have an `ngOnDestroy` hook.
  */
type DestroyHookData = js.Array[HookEntry | HookData]

type DirectiveDefList = js.Array[ɵDirectiveDef[Any] | ɵComponentDef[Any]]

/**
  * Type used for directiveDefs on component definition.
  *
  * The function is necessary to be able to support forward declarations.
  */
type DirectiveDefListOrFactory = js.Function0[DirectiveDefList] | DirectiveDefList

type EffectCleanupFn = js.Function0[Unit]

/**
  * A callback passed to the effect function that makes it possible to register cleanup logic.
  */
type EffectCleanupRegisterFn = js.Function1[/* cleanupFn */ EffectCleanupFn, Unit]

type ForwardRefFn = js.Function0[Any]

type GlobalTargetResolver = js.Function1[/* element */ Any, EventTarget]

/**
  * Array of hooks that should be executed for a view and their directive indices.
  *
  * For each node of the view, the following data is stored:
  * 1) Node index (optional)
  * 2) A series of number/function pairs where:
  *  - even indices are directive indices
  *  - odd indices are hook functions
  *
  * Special cases:
  *  - a negative directive index flags an init hook (ngOnInit, ngAfterContentInit, ngAfterViewInit)
  */
type HookData = js.Array[HookEntry]

/**
  * Information necessary to call a hook. E.g. the callback that
  * needs to invoked and the index at which to find its context.
  */
type HookEntry = Double | HookFn

/** Single hook callback function. */
type HookFn = js.Function0[Unit]

type HostBindingsFunction[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]

/**
  * Mapping between the public aliases of directive bindings and the underlying inputs/outputs that
  * they represent. Also serves as an allowlist of the inputs/outputs from the host directive that
  * the author has decided to expose.
  */
type HostDirectiveBindingMap = StringDictionary[String]

/** Values that can be used to define a host directive through the `HostDirectivesFeature`. */
type HostDirectiveConfig = Type[Any] | typings.angularCore.anon.Directive

/**
  * Mapping between a directive that was used as a host directive
  * and the configuration that was used to define it as such.
  */
type HostDirectiveDefs = Map[ɵDirectiveDef[Any], HostDirectiveDef[Any]]

/** 
NOTE: Rewritten from type alias:
{{{
type ImportProvidersSource = @angular/core.@angular/core.Type<unknown> | @angular/core.@angular/core.ModuleWithProviders<unknown> | std.Array<@angular/core.@angular/core.ImportProvidersSource>
}}}
to avoid circular code involving: 
- @angular/core.@angular/core.ImportProvidersSource
*/
type ImportProvidersSource = Type[Any] | ModuleWithProviders[Any] | js.Array[Any]

type ImportedNgModuleProviders = EnvironmentProviders

/**
  * This array contains information about input properties that
  * need to be set once from attribute data. It's ordered by
  * directive index (relative to element) so it's simple to
  * look up a specific directive's initial input data.
  *
  * Within each sub-array:
  *
  * i+0: attribute name
  * i+1: minified/internal input name
  * i+2: initial value
  *
  * If a directive on a node does not have any input properties
  * that should be set from attributes, its index is set to null
  * to avoid a sparse array.
  *
  * e.g. [null, ['role-min', 'minified-input', 'button']]
  */
type InitialInputData = js.Array[InitialInputs | Null]

/**
  * Used by InitialInputData to store input properties
  * that should be set once from attributes.
  *
  * i+0: attribute name
  * i+1: minified/internal input name
  * i+2: initial value
  *
  * e.g. ['role-min', 'minified-input', 'button']
  */
type InitialInputs = js.Array[String]

/**
  * See `TNode.insertBeforeIndex`
  */
type InsertBeforeIndex = Null | Double | js.Array[Double]

/**
  * Type for a function that extracts a value for a local refs.
  * Example:
  * - `<div #nativeDivEl>` - `nativeDivEl` should point to the native `<div>` element;
  * - `<ng-template #tplRef>` - `tplRef` should point to the `TemplateRef` instance;
  */
type LocalRefExtractor = js.Function2[/* tNode */ TNodeWithLocalRefs, /* currentView */ LView[Any], Any]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Mutable[T /* <: StringDictionary[Any] */, K /* <: String */] = T

type NgIterable[T] = js.Array[T] | js.Iterable[T]

type OpaqueValue = Any

type PipeDefList = js.Array[ɵPipeDef[Any]]

/**
  * Type used for PipeDefs on component definition.
  *
  * The function is necessary to be able to support forward declarations.
  */
type PipeDefListOrFactory = js.Function0[PipeDefList] | PipeDefList

type Predicate[T] = js.Function1[/* value */ T, Boolean]

/**
  * Describes a function that is used to process provider lists (such as provider
  * overrides).
  */
type ProcessProvidersFunction = js.Function1[/* providers */ js.Array[Provider], js.Array[Provider]]

/**
  * List of slots for a projection. A slot can be either based on a parsed CSS selector
  * which will be used to determine nodes which are projected into that slot.
  *
  * When set to "*", the slot is reserved and can be used for multi-slot projection
  * using {@link ViewContainerRef#createComponent}. The last slot that specifies the
  * wildcard selector will retrieve all projectable nodes which do not match any selector.
  */
type ProjectionSlots = js.Array[ɵCssSelectorList | Asterisk]

/**
  * Store the runtime input or output names for all the directives.
  *
  * i+0: directive instance index
  * i+1: privateName
  *
  * e.g. [0, 'change-minified']
  */
type PropertyAliasValue = js.Array[Double | String]

/**
  * This mapping is necessary so we can set input properties and output listeners
  * properly at runtime when property names are minified or aliased.
  *
  * Key: unminified / public input or output name
  * Value: array containing minified / internal name and related directive index
  *
  * The value must be an array to support inputs and outputs with the same name
  * on the same node.
  */
type PropertyAliases = StringDictionary[PropertyAliasValue]

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.TypeProvider
  - typings.angularCore.mod.ValueProvider
  - typings.angularCore.mod.ClassProvider
  - typings.angularCore.mod.ConstructorProvider
  - typings.angularCore.mod.ExistingProvider
  - typings.angularCore.mod.FactoryProvider
  - js.Array[scala.Any]
*/
type Provider = _Provider | js.Array[Any] | TypeProvider

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.Type[T]
  - typings.angularCore.mod.AbstractType[T]
  - typings.angularCore.mod.InjectionToken[T]
*/
type ProviderToken[T] = _ProviderToken[T] | AbstractType[T]

/**
  * Function used to sanitize the value before writing it into the renderer.
  */
type SanitizerFn = js.Function3[
/* value */ Any, 
/* tagName */ js.UndefOr[String], 
/* propName */ js.UndefOr[String], 
String | TrustedHTML | TrustedScript | TrustedScriptURL]

/**
  * Represents element containers within this view, stored as key-value pairs
  * where key is an index of a container in an LView (also used in the
  * `elementContainerStart` instruction), the value is the number of root nodes
  * in this container. This information is needed to locate an anchor comment
  * node that goes after all container nodes.
  */
type SerializedElementContainers = NumberDictionary[Double]

type Signal_[T] = js.Function0[T] & SIGNAL

type SimpleChanges = StringDictionary[SimpleChange]

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.ValueProvider
  - typings.angularCore.mod.ExistingProvider
  - typings.angularCore.mod.StaticClassProvider
  - typings.angularCore.mod.ConstructorProvider
  - typings.angularCore.mod.FactoryProvider
  - js.Array[scala.Any]
*/
type StaticProvider = _StaticProvider | js.Array[Any]

/**
  * A combination of:
  * - Attribute names and values.
  * - Special markers acting as flags to alter attributes processing.
  * - Parsed ngProjectAs selectors.
  */
type TAttributes = js.Array[String | ɵAttributeMarker | CssSelector]

/**
  * Constants that are associated with a view. Includes:
  * - Attribute arrays.
  * - Local definition arrays.
  * - Translated messages (i18n).
  */
type TConstants = js.Array[TAttributes | String]

/**
  * Factory function that returns an array of consts. Consts can be represented as a function in
  * case any additional statements are required to define consts in the list. An example is i18n
  * where additional i18n calls are generated, which should be executed when consts are requested
  * for the first time.
  */
type TConstantsFactory = js.Function0[TConstants]

/**
  * TConstants type that describes how the `consts` field is generated on ComponentDef: it can be
  * either an array or a factory function that returns that array.
  */
type TConstantsOrFactory = TConstants | TConstantsFactory

/**
  * Static data that corresponds to the instance-specific data array on an LView.
  *
  * Each node's static data is stored in tData at the same index that it's stored
  * in the data array.  Any nodes that do not have static data store a null value in
  * tData to avoid a sparse array.
  *
  * Each pipe's definition is stored here at the same index as its pipe instance in
  * the data array.
  *
  * Each host property's name is stored here at the same index as its value in the
  * data array.
  *
  * Each property binding name is stored here at the same index as its value in
  * the data array. If the binding is an interpolation, the static string values
  * are stored parallel to the dynamic values. Example:
  *
  * id="prefix {{ v0 }} a {{ v1 }} b {{ v2 }} suffix"
  *
  * LView       |   TView.data
  *------------------------
  *  v0 value   |   'a'
  *  v1 value   |   'b'
  *  v2 value   |   id � prefix � suffix
  *
  * Injector bloom filters are also stored here.
  */
type TData = js.Array[
TNode | ɵPipeDef[Any] | ɵDirectiveDef[Any] | ɵComponentDef[Any] | Double | TStylingRange | TStylingKey | ProviderToken[Any] | TI18n | I18nUpdateOpCodes | TIcu | Null | String]

/**
  * Value stored in the `TData` which is needed to re-concatenate the styling.
  *
  * See: `TStylingKeyPrimitive` and `TStylingStatic`
  */
type TStylingKey = TStylingKeyPrimitive | TStylingStatic

/**
  * The primitive portion (`TStylingStatic` removed) of the value stored in the `TData` which is
  * needed to re-concatenate the styling.
  *
  * - `string`: Stores the property name. Used with `ɵɵstyleProp`/`ɵɵclassProp` instruction.
  * - `null`: Represents map, so there is no name. Used with `ɵɵstyleMap`/`ɵɵclassMap`.
  * - `false`: Represents an ignore case. This happens when `ɵɵstyleProp`/`ɵɵclassProp` instruction
  *   is combined with directive which shadows its input `@Input('class')`. That way the binding
  *   should not participate in the styling resolution.
  */
type TStylingKeyPrimitive = String | Null | `false`

/**
  * Store the static values for the styling binding.
  *
  * The `TStylingStatic` is just `KeyValueArray` where key `""` (stored at location 0) contains the
  * `TStylingKey` (stored at location 1). In other words this wraps the `TStylingKey` such that the
  * `""` contains the wrapped value.
  *
  * When instructions are resolving styling they may need to look forward or backwards in the linked
  * list to resolve the value. For this reason we have to make sure that he linked list also contains
  * the static values. However the list only has space for one item per styling instruction. For this
  * reason we store the static values here as part of the `TStylingKey`. This means that the
  * resolution function when looking for a value needs to first look at the binding value, and than
  * at `TStylingKey` (if it exists).
  *
  * Imagine we have:
  *
  * ```
  * <div class="TEMPLATE" my-dir>
  *
  * @Directive({
  *   host: {
  *     class: 'DIR',
  *     '[class.dynamic]': 'exp' // ɵɵclassProp('dynamic', ctx.exp);
  *   }
  * })
  * ```
  *
  * In the above case the linked list will contain one item:
  *
  * ```
  *   // assume binding location: 10 for `ɵɵclassProp('dynamic', ctx.exp);`
  *   tData[10] = <TStylingStatic>[
  *     '': 'dynamic', // This is the wrapped value of `TStylingKey`
  *     'DIR': true,   // This is the default static value of directive binding.
  *   ];
  *   tData[10 + 1] = 0; // We don't have prev/next.
  *
  *   lView[10] = undefined;     // assume `ctx.exp` is `undefined`
  *   lView[10 + 1] = undefined; // Just normalized `lView[10]`
  * ```
  *
  * So when the function is resolving styling value, it first needs to look into the linked list
  * (there is none) and than into the static `TStylingStatic` too see if there is a default value for
  * `dynamic` (there is not). Therefore it is safe to remove it.
  *
  * If setting `true` case:
  * ```
  *   lView[10] = true;     // assume `ctx.exp` is `true`
  *   lView[10 + 1] = true; // Just normalized `lView[10]`
  * ```
  * So when the function is resolving styling value, it first needs to look into the linked list
  * (there is none) and than into `TNode.residualClass` (TNode.residualStyle) which contains
  * ```
  *   tNode.residualClass = [
  *     'TEMPLATE': true,
  *   ];
  * ```
  *
  * This means that it is safe to add class.
  */
type TStylingStatic = KeyValueArray[Any]

type TrackByFunction[T] = js.Function2[/* index */ Double, /* item */ T, Any]

type Type2 = js.Function

type TypeOrFactory[T] = T | js.Function0[T]

type TypeProvider = Type[Any]

type ValueEqualityFn[T] = js.Function2[/* a */ T, /* b */ T, Boolean]

/**
  * Definition of what a view queries function should look like.
  */
type ViewQueriesFunction[T] = js.Function2[/* rf */ ɵRenderFlags, /* ctx */ T, Unit]

type ɵCssSelectorList = js.Array[CssSelector]

type ɵProfiler = js.Function3[
/* event */ ɵProfilerEvent, 
/* instance */ js.Object | Null, 
/* hookOrListener */ js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Any]], 
Unit]

type ɵSafeHtml = ɵSafeValue

type ɵSafeResourceUrl = ɵSafeValue

type ɵSafeScript = ɵSafeValue

type ɵSafeStyle = ɵSafeValue

type ɵSafeUrl = ɵSafeValue

type ɵɵComponentDeclaration[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String | Required] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */, NgContentSelectors /* <: js.Array[String] */, IsStandalone /* <: Boolean */, HostDirectives] = Any

type ɵɵDirectiveDeclaration[T, Selector /* <: String */, ExportAs /* <: js.Array[String] */, InputMap /* <: StringDictionary[String | Required] */, OutputMap /* <: StringDictionary[String] */, QueryFields /* <: js.Array[String] */, NgContentSelectors /* <: scala.Nothing */, IsStandalone /* <: Boolean */, HostDirectives] = Any

type ɵɵFactoryDeclaration[T, CtorDependencies /* <: js.Array[CtorDependency] */] = Any

type ɵɵInjectorDeclaration[T] = Any

type ɵɵNgModuleDeclaration[T, Declarations, Imports, Exports] = Any

type ɵɵPipeDeclaration[T, Name /* <: String */, IsStandalone /* <: Boolean */] = Any
