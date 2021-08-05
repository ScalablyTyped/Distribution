package typings.angularPlatformBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.mod.ɵDomAdapter
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.DebugNode
import typings.angularCore.mod.ErrorHandler
import typings.angularCore.mod.GetTestability
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.NgProbeToken
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Predicate
import typings.angularCore.mod.Provider
import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.Sanitizer
import typings.angularCore.mod.SecurityContext
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Testability
import typings.angularCore.mod.TestabilityRegistry
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularCore.mod.ɵConsole
import typings.angularPlatformBrowser.anon.AppId
import typings.angularPlatformBrowser.anon.CssProps
import typings.angularPlatformBrowser.anon.DomEventName
import typings.std.Document
import typings.std.HTMLElement
import typings.std.HTMLMetaElement
import typings.std.KeyboardEvent
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "BrowserModule")
  @js.native
  class BrowserModule () extends StObject {
    def this(parentModule: BrowserModule) = this()
  }
  /* static members */
  object BrowserModule {
    
    @JSImport("@angular/platform-browser", "BrowserModule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configures a browser-based app to transition from a server-rendered app, if
      * one is present on the page.
      *
      * @param params An object containing an identifier for the app to transition.
      * The ID must match between the client and server versions of the app.
      * @returns The reconfigured `BrowserModule` to import into the app's root `AppModule`.
      */
    inline def withServerTransition(params: AppId): ModuleWithProviders[BrowserModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withServerTransition")(params.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[BrowserModule]]
  }
  
  @JSImport("@angular/platform-browser", "BrowserTransferStateModule")
  @js.native
  class BrowserTransferStateModule () extends StObject
  
  @JSImport("@angular/platform-browser", "By")
  @js.native
  class By () extends StObject
  /* static members */
  object By {
    
    @JSImport("@angular/platform-browser", "By")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Match all nodes.
      *
      * @usageNotes
      * ### Example
      *
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_all'}
      */
    inline def all(): Predicate[DebugNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[Predicate[DebugNode]]
    
    /**
      * Match elements by the given CSS selector.
      *
      * @usageNotes
      * ### Example
      *
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
      */
    inline def css(selector: String): Predicate[DebugElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[Predicate[DebugElement]]
    
    /**
      * Match nodes that have the given directive present.
      *
      * @usageNotes
      * ### Example
      *
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
      */
    inline def directive(`type`: Type[js.Any]): Predicate[DebugNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("directive")(`type`.asInstanceOf[js.Any]).asInstanceOf[Predicate[DebugNode]]
  }
  
  @JSImport("@angular/platform-browser", "DomSanitizer")
  @js.native
  abstract class DomSanitizer () extends Sanitizer {
    
    /**
      * Bypass security and trust the given value to be safe HTML. Only use this when the bound HTML
      * is unsafe (e.g. contains `<script>` tags) and the code should be executed. The sanitizer will
      * leave safe HTML intact, so in most situations this method should not be used.
      *
      * **WARNING:** calling this method with untrusted user data exposes your application to XSS
      * security risks!
      */
    def bypassSecurityTrustHtml(value: String): SafeHtml = js.native
    
    /**
      * Bypass security and trust the given value to be a safe resource URL, i.e. a location that may
      * be used to load executable code from, like `<script src>`, or `<iframe src>`.
      *
      * **WARNING:** calling this method with untrusted user data exposes your application to XSS
      * security risks!
      */
    def bypassSecurityTrustResourceUrl(value: String): SafeResourceUrl = js.native
    
    /**
      * Bypass security and trust the given value to be safe JavaScript.
      *
      * **WARNING:** calling this method with untrusted user data exposes your application to XSS
      * security risks!
      */
    def bypassSecurityTrustScript(value: String): SafeScript = js.native
    
    /**
      * Bypass security and trust the given value to be safe style value (CSS).
      *
      * **WARNING:** calling this method with untrusted user data exposes your application to XSS
      * security risks!
      */
    def bypassSecurityTrustStyle(value: String): SafeStyle = js.native
    
    /**
      * Bypass security and trust the given value to be a safe style URL, i.e. a value that can be used
      * in hyperlinks or `<img src>`.
      *
      * **WARNING:** calling this method with untrusted user data exposes your application to XSS
      * security risks!
      */
    def bypassSecurityTrustUrl(value: String): SafeUrl = js.native
    
    def sanitize(context: SecurityContext, value: SafeValue): String | Null = js.native
  }
  
  @JSImport("@angular/platform-browser", "EVENT_MANAGER_PLUGINS")
  @js.native
  val EVENT_MANAGER_PLUGINS: InjectionToken[js.Array[ɵangularPackagesPlatformBrowserPlatformBrowserG]] = js.native
  
  @JSImport("@angular/platform-browser", "EventManager")
  @js.native
  class EventManager protected () extends StObject {
    /**
      * Initializes an instance of the event-manager service.
      */
    def this(plugins: js.Array[ɵangularPackagesPlatformBrowserPlatformBrowserG], _zone: NgZone) = this()
    
    /* private */ var _eventNameToPlugin: js.Any = js.native
    
    /* private */ var _plugins: js.Any = js.native
    
    /* private */ var _zone: js.Any = js.native
    
    /**
      * Registers a handler for a specific element and event.
      *
      * @param element The HTML element to receive event notifications.
      * @param eventName The name of the event to listen for.
      * @param handler A function to call when the notification occurs. Receives the
      * event object as an argument.
      * @returns  A callback function that can be used to remove the handler.
      */
    def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
    
    /**
      * Registers a global handler for an event in a target view.
      *
      * @param target A target for global event notifications. One of "window", "document", or "body".
      * @param eventName The name of the event to listen for.
      * @param handler A function to call when the notification occurs. Receives the
      * event object as an argument.
      * @returns A callback function that can be used to remove the handler.
      */
    def addGlobalEventListener(target: String, eventName: String, handler: js.Function): js.Function = js.native
    
    /**
      * Retrieves the compilation zone in which event listeners are registered.
      */
    def getZone(): NgZone = js.native
  }
  
  @JSImport("@angular/platform-browser", "HAMMER_GESTURE_CONFIG")
  @js.native
  val HAMMER_GESTURE_CONFIG: InjectionToken[HammerGestureConfig] = js.native
  
  @JSImport("@angular/platform-browser", "HAMMER_LOADER")
  @js.native
  val HAMMER_LOADER: InjectionToken[HammerLoader] = js.native
  
  @JSImport("@angular/platform-browser", "HammerGestureConfig")
  @js.native
  class HammerGestureConfig () extends StObject {
    
    /**
      * Creates a [HammerJS Manager](http://hammerjs.github.io/api/#hammer.manager)
      * and attaches it to a given HTML element.
      * @param element The element that will recognize gestures.
      * @returns A HammerJS event-manager object.
      */
    def buildHammer(element: HTMLElement): HammerInstance = js.native
    
    /**
      * A set of supported event names for gestures to be used in Angular.
      * Angular supports all built-in recognizers, as listed in
      * [HammerJS documentation](http://hammerjs.github.io/).
      */
    var events: js.Array[String] = js.native
    
    /**
      * Properties whose default values can be overridden for a given event.
      * Different sets of properties apply to different events.
      * For information about which properties are supported for which events,
      * and their allowed and default values, see
      * [HammerJS documentation](http://hammerjs.github.io/).
      */
    var options: js.UndefOr[CssProps] = js.native
    
    /**
      * Maps gesture event names to a set of configuration options
      * that specify overrides to the default values for specific properties.
      *
      * The key is a supported event name to be configured,
      * and the options object contains a set of properties, with override values
      * to be applied to the named recognizer event.
      * For example, to disable recognition of the rotate event, specify
      *  `{"rotate": {"enable": false}}`.
      *
      * Properties that are not present take the HammerJS default values.
      * For information about which properties are supported for which events,
      * and their allowed and default values, see
      * [HammerJS documentation](http://hammerjs.github.io/).
      *
      */
    var overrides: StringDictionary[js.Object] = js.native
  }
  
  @JSImport("@angular/platform-browser", "HammerModule")
  @js.native
  class HammerModule () extends StObject
  
  @JSImport("@angular/platform-browser", "Meta")
  @js.native
  class Meta protected () extends StObject {
    def this(_doc: js.Any) = this()
    
    /* private */ var _containsAttributes: js.Any = js.native
    
    /* private */ var _doc: js.Any = js.native
    
    /* private */ var _dom: js.Any = js.native
    
    /* private */ var _getOrCreateElement: js.Any = js.native
    
    /* private */ var _parseSelector: js.Any = js.native
    
    /* private */ var _setMetaElementAttributes: js.Any = js.native
    
    /**
      * Retrieves or creates a specific `<meta>` tag element in the current HTML document.
      * In searching for an existing tag, Angular attempts to match the `name` or `property` attribute
      * values in the provided tag definition, and verifies that all other attribute values are equal.
      * If an existing element is found, it is returned and is not modified in any way.
      * @param tag The definition of a `<meta>` element to match or create.
      * @param forceCreation True to create a new element without checking whether one already exists.
      * @returns The existing element with the same attributes and values if found,
      * the new element if no match is found, or `null` if the tag parameter is not defined.
      */
    def addTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
    def addTag(tag: MetaDefinition, forceCreation: Boolean): HTMLMetaElement | Null = js.native
    
    /**
      * Retrieves or creates a set of `<meta>` tag elements in the current HTML document.
      * In searching for an existing tag, Angular attempts to match the `name` or `property` attribute
      * values in the provided tag definition, and verifies that all other attribute values are equal.
      * @param tags An array of tag definitions to match or create.
      * @param forceCreation True to create new elements without checking whether they already exist.
      * @returns The matching elements if found, or the new elements.
      */
    def addTags(tags: js.Array[MetaDefinition]): js.Array[HTMLMetaElement] = js.native
    def addTags(tags: js.Array[MetaDefinition], forceCreation: Boolean): js.Array[HTMLMetaElement] = js.native
    
    /**
      * Retrieves a `<meta>` tag element in the current HTML document.
      * @param attrSelector The tag attribute and value to match against, in the format
      * `"tag_attribute='value string'"`.
      * @returns The matching element, if any.
      */
    def getTag(attrSelector: String): HTMLMetaElement | Null = js.native
    
    /**
      * Retrieves a set of `<meta>` tag elements in the current HTML document.
      * @param attrSelector The tag attribute and value to match against, in the format
      * `"tag_attribute='value string'"`.
      * @returns The matching elements, if any.
      */
    def getTags(attrSelector: String): js.Array[HTMLMetaElement] = js.native
    
    /**
      * Removes an existing `<meta>` tag element from the current HTML document.
      * @param attrSelector A tag attribute and value to match against, to identify
      * an existing tag. A string in the format `"tag_attribute=`value string`"`.
      */
    def removeTag(attrSelector: String): Unit = js.native
    
    /**
      * Removes an existing `<meta>` tag element from the current HTML document.
      * @param meta The tag definition to match against to identify an existing tag.
      */
    def removeTagElement(meta: HTMLMetaElement): Unit = js.native
    
    /**
      * Modifies an existing `<meta>` tag element in the current HTML document.
      * @param tag The tag description with which to replace the existing tag content.
      * @param selector A tag attribute and value to match against, to identify
      * an existing tag. A string in the format `"tag_attribute=`value string`"`.
      * If not supplied, matches a tag with the same `name` or `property` attribute value as the
      * replacement tag.
      * @return The modified element.
      */
    def updateTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
    def updateTag(tag: MetaDefinition, selector: String): HTMLMetaElement | Null = js.native
  }
  
  @JSImport("@angular/platform-browser", "Title")
  @js.native
  class Title protected () extends StObject {
    def this(_doc: js.Any) = this()
    
    /* private */ var _doc: js.Any = js.native
    
    /**
      * Get the title of the current HTML document.
      */
    def getTitle(): String = js.native
    
    /**
      * Set the title of the current HTML document.
      * @param newTitle
      */
    def setTitle(newTitle: String): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser", "TransferState")
  @js.native
  class TransferState () extends StObject {
    
    /**
      * Get the value corresponding to a key. Return `defaultValue` if key is not found.
      */
    def get[T](key: StateKey[T], defaultValue: T): T = js.native
    
    /**
      * Test whether a key exists in the store.
      */
    def hasKey[T](key: StateKey[T]): Boolean = js.native
    
    /**
      * Register a callback to provide the value for a key when `toJson` is called.
      */
    def onSerialize[T](key: StateKey[T], callback: js.Function0[T]): Unit = js.native
    
    /* private */ var onSerializeCallbacks: js.Any = js.native
    
    /**
      * Remove a key from the store.
      */
    def remove[T](key: StateKey[T]): Unit = js.native
    
    /**
      * Set the value corresponding to a key.
      */
    def set[T](key: StateKey[T], value: T): Unit = js.native
    
    /* private */ var store: js.Any = js.native
    
    /**
      * Serialize the current state of the store to JSON.
      */
    def toJson(): String = js.native
  }
  
  @JSImport("@angular/platform-browser", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  inline def disableDebugTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDebugTools")().asInstanceOf[Unit]
  
  inline def enableDebugTools[T](ref: ComponentRef[T]): ComponentRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebugTools")(ref.asInstanceOf[js.Any]).asInstanceOf[ComponentRef[T]]
  
  inline def makeStateKey[T](key: String): StateKey[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStateKey")(key.asInstanceOf[js.Any]).asInstanceOf[StateKey[T]]
  
  inline def platformBrowser(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")().asInstanceOf[PlatformRef]
  inline def platformBrowser(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  @JSImport("@angular/platform-browser", "\u0275BROWSER_SANITIZATION_PROVIDERS")
  @js.native
  val ɵBROWSERSANITIZATIONPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275BROWSER_SANITIZATION_PROVIDERS__POST_R3__")
  @js.native
  val ɵBROWSERSANITIZATIONPROVIDERSPOSTR3: js.Array[scala.Nothing] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
  @js.native
  class ɵBrowserDomAdapter () extends ɵangularPackagesPlatformBrowserPlatformBrowserO {
    
    def createElement(tagName: String): HTMLElement = js.native
    def createElement(tagName: String, doc: Document): HTMLElement = js.native
    
    def dispatchEvent(el: Node, evt: js.Any): Unit = js.native
    
    def getProperty(el: Node, name: String): js.Any = js.native
    
    def getValue(el: js.Any): String = js.native
    
    def isElementNode(node: Node): Boolean = js.native
    
    def log(error: String): Unit = js.native
    
    def logGroup(error: String): Unit = js.native
    
    def onAndCancel(el: Node, evt: js.Any, listener: js.Any): js.Function = js.native
    
    def remove(node: Node): Node = js.native
  }
  /* static members */
  object ɵBrowserDomAdapter {
    
    @JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeCurrent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCurrent")().asInstanceOf[Unit]
  }
  
  @JSImport("@angular/platform-browser", "\u0275BrowserGetTestability")
  @js.native
  class ɵBrowserGetTestability ()
    extends StObject
       with GetTestability {
    
    /* CompleteClass */
    override def addToWindow(registry: TestabilityRegistry): Unit = js.native
    
    /* CompleteClass */
    override def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null = js.native
  }
  /* static members */
  object ɵBrowserGetTestability {
    
    @JSImport("@angular/platform-browser", "\u0275BrowserGetTestability")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  }
  
  @JSImport("@angular/platform-browser", "\u0275DomEventsPlugin")
  @js.native
  class ɵDomEventsPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
    def this(doc: js.Any) = this()
    
    def removeEventListener(target: js.Any, eventName: String, callback: js.Function): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275DomRendererFactory2")
  @js.native
  class ɵDomRendererFactory2 protected () extends RendererFactory2 {
    def this(eventManager: EventManager, sharedStylesHost: ɵDomSharedStylesHost, appId: String) = this()
    
    /* private */ var appId: js.Any = js.native
    
    @JSName("begin")
    def begin_MɵDomRendererFactory2(): Unit = js.native
    
    /* private */ var defaultRenderer: js.Any = js.native
    
    @JSName("end")
    def end_MɵDomRendererFactory2(): Unit = js.native
    
    /* private */ var eventManager: js.Any = js.native
    
    /* private */ var rendererByCompId: js.Any = js.native
    
    /* private */ var sharedStylesHost: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275DomSanitizerImpl")
  @js.native
  class ɵDomSanitizerImpl protected () extends DomSanitizer {
    def this(_doc: js.Any) = this()
    
    /* private */ var _doc: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost")
  @js.native
  class ɵDomSharedStylesHost protected ()
    extends ɵSharedStylesHost
       with OnDestroy {
    def this(_doc: js.Any) = this()
    
    /* private */ var _addStylesToHost: js.Any = js.native
    
    /* private */ var _doc: js.Any = js.native
    
    /* private */ var _hostNodes: js.Any = js.native
    
    /* private */ var _styleNodes: js.Any = js.native
    
    def addHost(hostNode: Node): Unit = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    def removeHost(hostNode: Node): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275ELEMENT_PROBE_PROVIDERS")
  @js.native
  val ɵELEMENTPROBEPROVIDERS: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275ELEMENT_PROBE_PROVIDERS__POST_R3__")
  @js.native
  val ɵELEMENTPROBEPROVIDERSPOSTR3: js.Array[scala.Nothing] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275HAMMER_PROVIDERS__POST_R3__")
  @js.native
  val ɵHAMMERPROVIDERSPOSTR3: js.Array[scala.Nothing] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin")
  @js.native
  class ɵHammerGesturesPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
    def this(doc: js.Any, _config: HammerGestureConfig, console: ɵConsole) = this()
    def this(doc: js.Any, _config: HammerGestureConfig, console: ɵConsole, loader: HammerLoader) = this()
    
    /* private */ var _config: js.Any = js.native
    
    /* private */ var console: js.Any = js.native
    
    def isCustomEvent(eventName: String): Boolean = js.native
    
    /* private */ var loader: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275INTERNAL_BROWSER_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALBROWSERPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
  @js.native
  class ɵKeyEventsPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
    /**
      * Initializes an instance of the browser plug-in.
      * @param doc The document in which key events will be detected.
      */
    def this(doc: js.Any) = this()
  }
  /* static members */
  object ɵKeyEventsPlugin {
    
    @JSImport("@angular/platform-browser", "\u0275KeyEventsPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configures a handler callback for a key event.
      * @param fullKey The event name that combines all simultaneous keystrokes.
      * @param handler The function that responds to the key event.
      * @param zone The zone in which the event occurred.
      * @returns A callback function.
      */
    inline def eventCallback(fullKey: js.Any, handler: js.Function, zone: NgZone): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("eventCallback")(fullKey.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def getEventFullKey(event: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventFullKey")(event.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseEventName(eventName: String): DomEventName | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEventName")(eventName.asInstanceOf[js.Any]).asInstanceOf[DomEventName | Null]
  }
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost")
  @js.native
  class ɵSharedStylesHost () extends StObject {
    
    def addStyles(styles: js.Array[String]): Unit = js.native
    
    def getAllStyles(): js.Array[String] = js.native
    
    def onStylesAdded(additions: Set[String]): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275TRANSITION_ID")
  @js.native
  val ɵTRANSITIONID: InjectionToken[js.Any] = js.native
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserA(): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_a")().asInstanceOf[ErrorHandler]
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserB(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_b")().asInstanceOf[js.Any]
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_c")
  @js.native
  val ɵangularPackagesPlatformBrowserPlatformBrowserC: js.Array[StaticProvider] = js.native
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserD(): Meta = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_d")().asInstanceOf[Meta]
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserE(): Title = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_e")().asInstanceOf[Title]
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserF(doc: Document, appId: String): TransferState = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_f")(doc.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[TransferState]
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_g")
  @js.native
  abstract class ɵangularPackagesPlatformBrowserPlatformBrowserG protected () extends StObject {
    def this(_doc: js.Any) = this()
    
    /* private */ var _doc: js.Any = js.native
    
    def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
    
    def addGlobalEventListener(element: String, eventName: String, handler: js.Function): js.Function = js.native
    
    var manager: EventManager = js.native
    
    def supports(eventName: String): Boolean = js.native
  }
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_h")
  @js.native
  val ɵangularPackagesPlatformBrowserPlatformBrowserH: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_i")
  @js.native
  val ɵangularPackagesPlatformBrowserPlatformBrowserI: js.Array[Provider] = js.native
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserJ(injector: Injector): ɵDomSanitizerImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_j")(injector.asInstanceOf[js.Any]).asInstanceOf[ɵDomSanitizerImpl]
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserK(transitionId: String, document: js.Any, injector: Injector): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_k")(transitionId.asInstanceOf[js.Any], document.asInstanceOf[js.Any], injector.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_l")
  @js.native
  val ɵangularPackagesPlatformBrowserPlatformBrowserL: js.Array[StaticProvider] = js.native
  
  inline def ɵangularPackagesPlatformBrowserPlatformBrowserM(coreTokens: js.Array[NgProbeToken]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_platform_browser_m")(coreTokens.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_n")
  @js.native
  val ɵangularPackagesPlatformBrowserPlatformBrowserN: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_o")
  @js.native
  abstract class ɵangularPackagesPlatformBrowserPlatformBrowserO () extends ɵDomAdapter
  
  inline def ɵescapeHtml(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275escapeHtml")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ɵflattenStyles(compId: String, styles: js.Array[js.Any | js.Array[js.Any]], target: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flattenStyles")(compId.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def ɵgetDOM(): ɵDomAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[ɵDomAdapter]
  
  inline def ɵinitDomAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275initDomAdapter")().asInstanceOf[Unit]
  
  inline def ɵshimContentAttribute(componentShortId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275shimContentAttribute")(componentShortId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ɵshimHostAttribute(componentShortId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275shimHostAttribute")(componentShortId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait HammerInstance extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    def off(eventName: String): Unit = js.native
    def off(eventName: String, callback: js.Function): Unit = js.native
    
    def on(eventName: String): Unit = js.native
    def on(eventName: String, callback: js.Function): Unit = js.native
  }
  
  type HammerLoader = js.Function0[js.Promise[Unit]]
  
  trait MetaDefinition
    extends StObject
       with /* prop */ StringDictionary[String] {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var httpEquiv: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemprop: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object MetaDefinition {
    
    inline def apply(): MetaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetaDefinition]
    }
    
    extension [Self <: MetaDefinition](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemprop(value: String): Self = StObject.set(x, "itemprop", value.asInstanceOf[js.Any])
      
      inline def setItempropUndefined: Self = StObject.set(x, "itemprop", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type SafeHtml = SafeValue
  
  type SafeResourceUrl = SafeValue
  
  type SafeScript = SafeValue
  
  type SafeStyle = SafeValue
  
  type SafeUrl = SafeValue
  
  trait SafeValue extends StObject
  
  @js.native
  trait StateKey[T]
    extends StObject
       with typings.std.String
}
