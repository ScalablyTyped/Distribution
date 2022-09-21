package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Binding
import typings.aureliaDependencyInjection.mod.Container
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "View")
@js.native
open class View_ protected () extends StObject {
  /**
  	* Creates a View instance.
  	* @param container The container from which the view was created.
  	* @param viewFactory The factory that created this view.
  	* @param fragment The DOM fragement representing the view.
  	* @param controllers The controllers inside this view.
  	* @param bindings The bindings inside this view.
  	* @param children The children view nodes of this view.
  	*/
  def this(
    container: Container,
    viewFactory: ViewFactory,
    fragment: DocumentFragment,
    controllers: js.Array[Controller],
    bindings: js.Array[Binding],
    children: js.Array[ViewNode],
    slots: js.Object
  ) = this()
  
  /**
  	* Adds a binding instance to this view.
  	* @param binding The binding instance.
  	*/
  def addBinding(binding: js.Object): Unit = js.native
  
  /**
  	* Appends this view's to the specified DOM node.
  	* @param parent The parent element to append this view's nodes to.
  	*/
  def appendNodesTo(parent: Element): Unit = js.native
  
  /**
  	* Triggers the attach for the view and its children.
  	*/
  def attached(): Unit = js.native
  
  /**
  	* Binds the view and it's children.
  	* @param bindingContext The binding context to bind to.
  	* @param overrideContext A secondary binding context that can override the standard context.
  	*/
  def bind(bindingContext: js.Object): Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object): Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object, _systemUpdate: Boolean): Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: Unit, _systemUpdate: Boolean): Unit = js.native
  
  /**
  	* The primary binding context that this view is data-bound to.
  	*/
  var bindingContext: js.Object = js.native
  
  /**
  	* The Dependency Injection Container that was used to create this View instance.
  	*/
  var container: Container = js.native
  
  /**
  	* The Controller instance that owns this View.
  	*/
  var controller: Controller = js.native
  
  /**
  	* Triggers the created callback for this view and its children.
  	*/
  def created(): Unit = js.native
  
  /**
  	* Triggers the detach for the view and its children.
  	*/
  def detached(): Unit = js.native
  
  /**
  	* Contains the DOM Nodes which represent this View. If the view was created via the "enhance" API, this will be an Element, otherwise it will be a DocumentFragment. If not created via "enhance" then the fragment will only contain nodes when the View is detached from the DOM.
  	*/
  var fragment: DocumentFragment | Element = js.native
  
  /**
  	* Inserts this view's nodes before the specified DOM node.
  	* @param refNode The node to insert this view's nodes before.
  	*/
  def insertNodesBefore(refNode: Node): Unit = js.native
  
  /**
  	* The override context which contains properties capable of overriding those found on the binding context.
  	*/
  var overrideContext: js.Object = js.native
  
  /**
  	* Removes this view's nodes from the DOM.
  	*/
  def removeNodes(): Unit = js.native
  
  /**
  	* Returns this view to the appropriate view cache.
  	*/
  def returnToCache(): Unit = js.native
  
  /**
  	* Unbinds the view and its children.
  	*/
  def unbind(): Unit = js.native
  
  /**
  	* The ViewFactory that built this View instance.
  	*/
  var viewFactory: ViewFactory = js.native
}
