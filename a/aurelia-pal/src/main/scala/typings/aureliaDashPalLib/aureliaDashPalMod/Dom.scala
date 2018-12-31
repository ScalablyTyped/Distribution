package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom extends js.Object {
  /**
    * The global DOM Element type.
    */
  var Element: aureliaDashPalLib.Anon_Element = js.native
  /**
    * The global DOM NodeList type.
    */
  var NodeList: aureliaDashPalLib.Anon_NodeList = js.native
  /**
    * The global DOM SVGElement type.
    */
  var SVGElement: aureliaDashPalLib.Anon_SVGElement = js.native
  /**
    * The document's active/focused element.
    */
  var activeElement: stdLib.Element = js.native
  /**
    * A key representing a DOM boundary.
    */
  var boundary: java.lang.String = js.native
  /**
    * The document title.
    */
  var title: java.lang.String = js.native
  /**
    * Add an event listener to the document.
    * @param eventName A string representing the event type to listen for.
    * @param callback The function or listener object that receives a notification when an event of the specified type occurs.
    * @param capture If true, useCapture indicates that the user wishes to initiate capture.
    */
  def addEventListener(
    eventName: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Adopts a node from an external document.
    * @param node The node to be adopted.
    * @return The adopted node able to be used in the document.
    */
  def adoptNode(node: stdLib.Node): stdLib.Node = js.native
  /**
    * Appends a node to the parent, if provided, or the document.body otherwise.
    * @param newNode The node to append.
    * @param parentNode The node to append to, otherwise the document.body.
    */
  def appendNode(newNode: stdLib.Node): scala.Unit = js.native
  def appendNode(newNode: stdLib.Node, parentNode: stdLib.Node): scala.Unit = js.native
  /**
    * Creates the specified HTML attribute
    * @param name A string that specifies the name of attribute to be created.
    * @return The created attribute.
    */
  def createAttribute(name: java.lang.String): stdLib.Attr = js.native
  /**
    * Creates a new Comment node.
    * @param text A string to populate the new Comment node.
    * @return A Comment node.
    */
  def createComment(text: java.lang.String): stdLib.Comment = js.native
  /**
    * Creates a new CustomEvent.
    * @param eventType A string representing the event type.
    * @param options An options object specifying bubbles:boolean, cancelable:boolean and/or detail:Object information.
    * @return A CustomEvent.
    */
  def createCustomEvent(eventType: java.lang.String): stdLib.CustomEvent[_] = js.native
  def createCustomEvent(eventType: java.lang.String, options: stdLib.CustomEventInit[_]): stdLib.CustomEvent[_] = js.native
  /**
    * Creates a new DocumentFragment.
    * @return A DocumentFragment.
    */
  def createDocumentFragment(): stdLib.DocumentFragment = js.native
  /**
    * Creates the specified HTML element or an HTMLUnknownElement if the given element name isn't a known one.
    * @param tagName A string that specifies the type of element to be created.
    * @return The created element.
    */
  // createElement<T extends keyof HTMLElementTagNameMap>(tagName: T): HTMLElementTagNameMap<T>;
  def createElement(tagName: java.lang.String): stdLib.HTMLElement = js.native
  /**
    * Creates a new MutationObserver.
    * @param callback A callback that will recieve the change records with the mutations.
    * @return A MutationObservere.
    */
  def createMutationObserver(callback: js.Function): stdLib.MutationObserver = js.native
  /**
    * Creates a new HTMLTemplateElement.
    * @return An HTMLTemplateElement.
    */
  def createTemplateElement(): stdLib.HTMLTemplateElement = js.native
  /**
    * Creates an HTMLTemplateElement using the markup provided.
    * @param markup A string containing the markup to turn into a template. Note: This string must contain the template element as well.
    * @return The instance of HTMLTemplateElement that was created from the provided markup.
    */
  def createTemplateFromMarkup(markup: java.lang.String): stdLib.HTMLTemplateElement = js.native
  /**
    * Creates a new Text node.
    * @param text A string to populate the new Text node.
    * @return A Text node.
    */
  def createTextNode(text: java.lang.String): stdLib.Text = js.native
  /**
    * Dispatches an event on the document.
    * @param evt The event to dispatch.
    */
  def dispatchEvent(evt: stdLib.Event): scala.Unit = js.native
  /**
    * Gives the values of all the CSS properties of an element after applying the active stylesheets and resolving any basic computation those values may contain.
    * @param element The Element for which to get the computed style.
    * @return The computed styles.
    */
  def getComputedStyle(element: stdLib.Element): stdLib.CSSStyleDeclaration = js.native
  /**
    * Locates an element in the document according to its id.
    * @param id The id to search the document for.
    * @return The found element.
    */
  def getElementById(id: java.lang.String): stdLib.Element = js.native
  /**
    * Injects styles into the destination element, or the document.head if no destination is provided.
    * @param styles The css text to injext.
    * @param destination The destination element to inject the css text into. If not specified it will default to the document.head.
    * @param prepend Indicates whether or not the styles should be prepended to the destination. By default they are appended.
    * @param id The existing style element's id to replace the contents for
    * @return The Style node that was created.
    */
  def injectStyles(styles: java.lang.String): stdLib.Node = js.native
  def injectStyles(styles: java.lang.String, destination: stdLib.Element): stdLib.Node = js.native
  def injectStyles(styles: java.lang.String, destination: stdLib.Element, prepend: scala.Boolean): stdLib.Node = js.native
  def injectStyles(
    styles: java.lang.String,
    destination: stdLib.Element,
    prepend: scala.Boolean,
    id: java.lang.String
  ): stdLib.Node = js.native
  /**
    * Gets the element that is the next sibling of the provided element.
    * @param element The element whose next sibling is being located.
    * @return The next sibling Element of the provided Element.
    */
  def nextElementSibling(element: stdLib.Node): stdLib.Element = js.native
  /**
    * Performs a query selector on the document and returns first matched element, depth first.
    * @param query The query to use in searching the document.
    * @return A list of all matched elements in the document.
    */
  // enable the following two lines if we switch to TypeScript
  // querySelector<K extends keyof HTMLElementTagNameMap>(selectors: K): HTMLElementTagNameMap[K] | null;
  // querySelector<K extends keyof SVGElementTagNameMap>(selectors: K): SVGElementTagNameMap[K] | null;
  def querySelector(selectors: java.lang.String): stdLib.Element = js.native
  /**
    * Performs a query selector on the document and returns all located matches.
    * @param query The query to use in searching the document.
    * @return A list of all matched elements in the document.
    */
  // enable the following two lines if we switch to TypeScript
  // querySelectorAll<K extends keyof HTMLElementTagNameMap>(selectors: K): NodeListOf<HTMLElementTagNameMap[K]>;
  // querySelectorAll<K extends keyof SVGElementTagNameMap>(selectors: K): NodeListOf<SVGElementTagNameMap[K]>;
  def querySelectorAll(selectors: java.lang.String): stdLib.NodeList = js.native
  /**
    * Remove an event listener from the document.
    * @param eventName A string representing the event type to listen for.
    * @param callback The function or listener object to remove from the event.
    * @param capture Specifies whether the listener to be removed was registered as a capturing listener or not.
    */
  def removeEventListener(
    eventName: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    capture: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Removes the specified node from the parent node.
    * @param node The node to remove.
    * @param parentNode The parent node from which the node will be removed.
    */
  def removeNode(node: stdLib.Node): scala.Unit = js.native
  def removeNode(node: stdLib.Node, parentNode: stdLib.Node): scala.Unit = js.native
  /**
    * Replaces a node in the parent with a new node.
    * @param newNode The node to replace the old node with.
    * @param node The node that is being replaced.
    * @param parentNode The node that the current node is parented to.
    */
  def replaceNode(newNode: stdLib.Node, node: stdLib.Node): scala.Unit = js.native
  def replaceNode(newNode: stdLib.Node, node: stdLib.Node, parentNode: stdLib.Node): scala.Unit = js.native
}

