package typings.aureliaPal

import typings.aureliaPal.anon.TypeofXMLHttpRequest
import typings.std.Attr
import typings.std.CSSStyleDeclaration
import typings.std.Comment
import typings.std.CustomEvent
import typings.std.CustomEventInit
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLTemplateElement
import typings.std.MutationObserver
import typings.std.Node
import typings.std.NodeList
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-pal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AggregateError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("AggregateError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def AggregateError(message: String, innerError: js.Error): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("AggregateError")(message.asInstanceOf[js.Any], innerError.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def AggregateError(message: String, innerError: js.Error, skipIfAlreadyAggregate: Boolean): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("AggregateError")(message.asInstanceOf[js.Any], innerError.asInstanceOf[js.Any], skipIfAlreadyAggregate.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def AggregateError(message: String, innerError: Unit, skipIfAlreadyAggregate: Boolean): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("AggregateError")(message.asInstanceOf[js.Any], innerError.asInstanceOf[js.Any], skipIfAlreadyAggregate.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  @JSImport("aurelia-pal", "DOM")
  @js.native
  val DOM_ : Dom = js.native
  
  @JSImport("aurelia-pal", "FEATURE")
  @js.native
  val FEATURE_ : Feature = js.native
  
  @JSImport("aurelia-pal", "PLATFORM")
  @js.native
  val PLATFORM_ : Platform = js.native
  
  inline def initializePAL(callback: js.Function3[/* platform */ Platform, /* feature */ Feature, /* dom */ Dom, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePAL")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("aurelia-pal", "isInitialized")
  @js.native
  def isInitialized: Any = js.native
  inline def isInitialized_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInitialized")(x.asInstanceOf[js.Any])
  
  inline def reset(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Any]
  
  @js.native
  trait Dom extends StObject {
    
    /**
      * The global DOM Element type.
      */
    var Element: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element */ Any = js.native
    
    /**
      * The global DOM NodeList type.
      */
    var NodeList: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NodeList */ Any = js.native
    
    /**
      * The global DOM SVGElement type.
      */
    var SVGElement: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SVGElement */ Any = js.native
    
    /**
      * The document's active/focused element.
      */
    var activeElement: Element = js.native
    
    /**
      * Add an event listener to the document.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function or listener object that receives a notification when an event of the specified type occurs.
      * @param capture If true, useCapture indicates that the user wishes to initiate capture.
      */
    def addEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
    
    /**
      * Adopts a node from an external document.
      * @param node The node to be adopted.
      * @return The adopted node able to be used in the document.
      */
    def adoptNode(node: Node): Node = js.native
    
    /**
      * Appends a node to the parent, if provided, or the document.body otherwise.
      * @param newNode The node to append.
      * @param parentNode The node to append to, otherwise the document.body.
      */
    def appendNode(newNode: Node): Unit = js.native
    def appendNode(newNode: Node, parentNode: Node): Unit = js.native
    
    /**
      * A key representing a DOM boundary.
      */
    var boundary: String = js.native
    
    /**
      * Creates the specified HTML attribute
      * @param name A string that specifies the name of attribute to be created.
      * @return The created attribute.
      */
    def createAttribute(name: String): Attr = js.native
    
    /**
      * Creates a new Comment node.
      * @param text A string to populate the new Comment node.
      * @return A Comment node.
      */
    def createComment(text: String): Comment = js.native
    
    /**
      * Creates a new CustomEvent.
      * @param eventType A string representing the event type.
      * @param options An options object specifying bubbles:boolean, cancelable:boolean and/or detail:Object information.
      * @return A CustomEvent.
      */
    def createCustomEvent(eventType: String): CustomEvent[Any] = js.native
    def createCustomEvent(eventType: String, options: CustomEventInit[Any]): CustomEvent[Any] = js.native
    
    /**
      * Creates a new DocumentFragment.
      * @return A DocumentFragment.
      */
    def createDocumentFragment(): DocumentFragment = js.native
    
    /**
      * Creates the specified HTML element or an HTMLUnknownElement if the given element name isn't a known one.
      * @param tagName A string that specifies the type of element to be created.
      * @return The created element.
      */
    // createElement<T extends keyof HTMLElementTagNameMap>(tagName: T): HTMLElementTagNameMap<T>;
    def createElement(tagName: String): HTMLElement = js.native
    
    /**
      * Creates a new MutationObserver.
      * @param callback A callback that will recieve the change records with the mutations.
      * @return A MutationObservere.
      */
    def createMutationObserver(callback: js.Function): MutationObserver = js.native
    
    /**
      * Creates a new HTMLTemplateElement.
      * @return An HTMLTemplateElement.
      */
    def createTemplateElement(): HTMLTemplateElement = js.native
    
    /**
      * Creates an HTMLTemplateElement using the markup provided.
      * @param markup A string containing the markup to turn into a template. Note: This string must contain the template element as well.
      * @return The instance of HTMLTemplateElement that was created from the provided markup.
      */
    def createTemplateFromMarkup(markup: String): HTMLTemplateElement = js.native
    
    /**
      * Creates a new Text node.
      * @param text A string to populate the new Text node.
      * @return A Text node.
      */
    def createTextNode(text: String): Text = js.native
    
    /**
      * Dispatches an event on the document.
      * @param evt The event to dispatch.
      */
    def dispatchEvent(evt: Event): Unit = js.native
    
    /**
      * Gives the values of all the CSS properties of an element after applying the active stylesheets and resolving any basic computation those values may contain.
      * @param element The Element for which to get the computed style.
      * @return The computed styles.
      */
    def getComputedStyle(element: Element): CSSStyleDeclaration = js.native
    
    /**
      * Locates an element in the document according to its id.
      * @param id The id to search the document for.
      * @return The found element.
      */
    def getElementById(id: String): Element = js.native
    
    /**
      * Injects styles into the destination element, or the document.head if no destination is provided.
      * @param styles The css text to injext.
      * @param destination The destination element to inject the css text into. If not specified it will default to the document.head.
      * @param prepend Indicates whether or not the styles should be prepended to the destination. By default they are appended.
      * @param id The existing style element's id to replace the contents for
      * @return The Style node that was created.
      */
    def injectStyles(styles: String): Node = js.native
    def injectStyles(styles: String, destination: Unit, prepend: Boolean): Node = js.native
    def injectStyles(styles: String, destination: Unit, prepend: Boolean, id: String): Node = js.native
    def injectStyles(styles: String, destination: Unit, prepend: Unit, id: String): Node = js.native
    def injectStyles(styles: String, destination: Element): Node = js.native
    def injectStyles(styles: String, destination: Element, prepend: Boolean): Node = js.native
    def injectStyles(styles: String, destination: Element, prepend: Boolean, id: String): Node = js.native
    def injectStyles(styles: String, destination: Element, prepend: Unit, id: String): Node = js.native
    
    /**
      * Gets the element that is the next sibling of the provided element.
      * @param element The element whose next sibling is being located.
      * @return The next sibling Element of the provided Element.
      */
    def nextElementSibling(element: Node): Element = js.native
    
    /**
      * Performs a query selector on the document and returns first matched element, depth first.
      * @param query The query to use in searching the document.
      * @return A list of all matched elements in the document.
      */
    // enable the following two lines if we switch to TypeScript
    // querySelector<K extends keyof HTMLElementTagNameMap>(selectors: K): HTMLElementTagNameMap[K] | null;
    // querySelector<K extends keyof SVGElementTagNameMap>(selectors: K): SVGElementTagNameMap[K] | null;
    def querySelector(selectors: String): Element = js.native
    
    /**
      * Performs a query selector on the document and returns all located matches.
      * @param query The query to use in searching the document.
      * @return A list of all matched elements in the document.
      */
    // enable the following two lines if we switch to TypeScript
    // querySelectorAll<K extends keyof HTMLElementTagNameMap>(selectors: K): NodeListOf<HTMLElementTagNameMap[K]>;
    // querySelectorAll<K extends keyof SVGElementTagNameMap>(selectors: K): NodeListOf<SVGElementTagNameMap[K]>;
    def querySelectorAll(selectors: String): NodeList = js.native
    
    /**
      * Remove an event listener from the document.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function or listener object to remove from the event.
      * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
      */
    def removeEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
    
    /**
      * Removes the specified node from the parent node.
      * @param node The node to remove.
      * @param parentNode The parent node from which the node will be removed.
      */
    def removeNode(node: Node): Unit = js.native
    def removeNode(node: Node, parentNode: Node): Unit = js.native
    
    /**
      * Replaces a node in the parent with a new node.
      * @param newNode The node to replace the old node with.
      * @param node The node that is being replaced.
      * @param parentNode The node that the current node is parented to.
      */
    def replaceNode(newNode: Node, node: Node): Unit = js.native
    def replaceNode(newNode: Node, node: Node, parentNode: Node): Unit = js.native
    
    /**
      * The document title.
      */
    var title: String = js.native
  }
  
  trait Feature extends StObject {
    
    /**
      * Does the runtime environment support native HTMLTemplateElement?
      */
    var htmlTemplateElement: Boolean
    
    /**
      * Does the runtime environment support native DOM mutation observers?
      */
    var mutationObserver: Boolean
    
    /**
      * Does the runtime environment support the css scoped attribute?
      */
    var scopedCSS: Boolean
    
    /**
      * Does the runtime environment support ShadowDOM?
      */
    var shadowDOM: Boolean
  }
  object Feature {
    
    inline def apply(htmlTemplateElement: Boolean, mutationObserver: Boolean, scopedCSS: Boolean, shadowDOM: Boolean): Feature = {
      val __obj = js.Dynamic.literal(htmlTemplateElement = htmlTemplateElement.asInstanceOf[js.Any], mutationObserver = mutationObserver.asInstanceOf[js.Any], scopedCSS = scopedCSS.asInstanceOf[js.Any], shadowDOM = shadowDOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      inline def setHtmlTemplateElement(value: Boolean): Self = StObject.set(x, "htmlTemplateElement", value.asInstanceOf[js.Any])
      
      inline def setMutationObserver(value: Boolean): Self = StObject.set(x, "mutationObserver", value.asInstanceOf[js.Any])
      
      inline def setScopedCSS(value: Boolean): Self = StObject.set(x, "scopedCSS", value.asInstanceOf[js.Any])
      
      inline def setShadowDOM(value: Boolean): Self = StObject.set(x, "shadowDOM", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleNameOptions extends StObject {
    
    /**
      * Add the module to a chunk by name
      */
    var chunk: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally declare which exports are used. This enables tree-shaking when only few out of many exports are used.
      */
    var exports: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ModuleNameOptions {
    
    inline def apply(): ModuleNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleNameOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleNameOptions] (val x: Self) extends AnyVal {
      
      inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    }
  }
  
  @js.native
  trait Performance extends StObject {
    
    /**
      * Removes the given mark from the browser's performance entry buffer.
      *
      * @param {string} [markName] A DOMString representing the name of the timestamp. If this argument is omitted, all performance entries with an entry type of "mark" will be removed.
      * @memberof IPerformance
      */
    def clearMarks(): Unit = js.native
    def clearMarks(markName: String): Unit = js.native
    
    /**
      * Removes the given measure from the browser's performance entry buffer.
      *
      * @param {string} [measureName] A DOMString representing the name of the timestamp. If this argument is omitted, all performance entries with an entry type of "measure" will be removed.
      * @memberof IPerformance
      */
    def clearMeasures(): Unit = js.native
    def clearMeasures(measureName: String): Unit = js.native
    
    /**
      * Returns a list of PerformanceEntry objects based on the given name and entry type.
      *
      * @param {string} name The name of the entry to retrieve
      * @param {string} [entryType] The type of entry to retrieve such as "mark". The valid entry types are listed in PerformanceEntry.entryType.
      * @returns {*}
      * @memberof IPerformance
      */
    def getEntriesByName(name: String): Any = js.native
    def getEntriesByName(name: String, entryType: String): Any = js.native
    
    /**
      * Returns a list of PerformanceEntry objects of the given entry type.
      *
      * @param {string} entryType The type of entry to retrieve such as "mark". The valid entry types are listed in PerformanceEntry.entryType.
      * @returns {*}
      * @memberof IPerformance
      */
    def getEntriesByType(entryType: String): Any = js.native
    
    /**
      * Creates a timestamp in the browser's performance entry buffer with the given name.
      *
      * @param {string} markName a DOMString representing the name of the mark
      * @memberof IPerformance
      */
    def mark(markName: String): Unit = js.native
    
    /**
      * Creates a named timestamp in the browser's performance entry buffer between two specified marks (known as the start mark and end mark, respectively).
      *
      * @param {string} measureName a DOMString representing the name of the measure.
      * @param {string} [startMarkName] A DOMString representing the name of the measure's starting mark. May also be the name of a PerformanceTiming property.
      * @param {string} [endMarkName] A DOMString representing the name of the measure's ending mark. May also be the name of a PerformanceTiming property.
      * @memberof IPerformance
      */
    def measure(measureName: String): Unit = js.native
    def measure(measureName: String, startMarkName: String): Unit = js.native
    def measure(measureName: String, startMarkName: String, endMarkName: String): Unit = js.native
    def measure(measureName: String, startMarkName: Unit, endMarkName: String): Unit = js.native
    
    /**
      * Gets a DOMHighResTimeStamp.
      * @return The timestamp, measured in milliseconds, accurate to one thousandth of a millisecond.
      */
    def now(): Double = js.native
  }
  
  @js.native
  trait Platform extends StObject {
    
    /**
      * Reference to the Loader Class (set after the loader has been first imported)
      */
    var Loader: Any = js.native
    
    /**
      * The runtime's XMLHttpRequest API.
      */
    var XMLHttpRequest: TypeofXMLHttpRequest = js.native
    
    /**
      * Add a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function that receives a notification when an event of the specified type occurs.
      * @param capture If true, useCapture indicates that the user wishes to initiate capture.
      */
    def addEventListener(eventName: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
    
    /**
      * Iterate all modules loaded by the script loader.
      * @param callback A callback that will receive each module id along with the module object. Return true to end enumeration.
      */
    def eachModule(callback: js.Function2[/* key */ String, /* value */ js.Object, Boolean]): Unit = js.native
    
    /**
      * The runtime environment's global.
      */
    var global: Any = js.native
    
    /**
      * The runtime's history API.
      */
    var history: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.history */ Any = js.native
    
    /**
      * The runtime's location API.
      */
    var location: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.location */ Any = js.native
    
    /**
      * Resolves a module name to a path resolvable by the loader. By default returns the first parameter.
      * It is recommended to use this for all dynamic imports as it enables static analysis
      * and optionally allows adding custom metadata used by the build step.
      *
      * References to this method should always literally call `PLATFORM.moduleName(...)`.
      * This enables the build step to statically optimize the code by replacing the reference with a string.
      *
      * @param moduleName Absolute or relative path to the module.
      * @param options Optional options used during the static analysis that inform how to process the module.
      */
    def moduleName(moduleName: String): String = js.native
    def moduleName(moduleName: String, chunk: String): String = js.native
    def moduleName(moduleName: String, options: ModuleNameOptions): String = js.native
    
    /**
      * A function wich does nothing.
      */
    var noop: js.Function = js.native
    
    /**
      * The runtime's performance API
      */
    var performance: Performance = js.native
    
    /**
      * Remove a global event listener.
      * @param eventName A string representing the event type to listen for.
      * @param callback The function to remove from the event.
      * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
      */
    def removeEventListener(eventName: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(eventName: String, callback: EventListenerOrEventListenerObject, capture: Boolean): Unit = js.native
    
    /**
      * Registers a function to call when the system is ready to update (repaint) the display.
      * @param callback The function to call.
      * @return A long integer value, the request id, that uniquely identifies the entry in the callback list.
      */
    def requestAnimationFrame(callback: js.Function1[/* animationFrameStart */ Double, Unit]): Double = js.native
  }
}
