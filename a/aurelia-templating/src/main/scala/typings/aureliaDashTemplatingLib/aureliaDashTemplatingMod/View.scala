package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "View")
@js.native
class View protected () extends js.Object {
  /**
    * Creates a View instance.
    * @param container The container from which the view was created.
    * @param viewFactory The factory that created this view.
    * @param fragment The DOM fragement representing the view.
    * @param controllers The controllers inside this view.
    * @param bindings The bindings inside this view.
    * @param children The children of this view.
    */
  def this(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, viewFactory: ViewFactory, fragment: stdLib.DocumentFragment, controllers: js.Array[Controller], bindings: js.Array[aureliaDashBindingLib.aureliaDashBindingMod.Binding], children: js.Array[ViewNode], slots: js.Object) = this()
  /**
    * The primary binding context that this view is data-bound to.
    */
  var bindingContext: js.Object = js.native
  /**
    * The Dependency Injection Container that was used to create this View instance.
    */
  var container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container = js.native
  /**
    * The Controller instance that owns this View.
    */
  var controller: Controller = js.native
  /**
    * Contains the DOM Nodes which represent this View. If the view was created via the "enhance" API, this will be an Element, otherwise it will be a DocumentFragment. If not created via "enhance" then the fragment will only contain nodes when the View is detached from the DOM.
    */
  var fragment: stdLib.DocumentFragment | stdLib.Element = js.native
  /**
    * The override context which contains properties capable of overriding those found on the binding context.
    */
  var overrideContext: js.Object = js.native
  /**
    * The ViewFactory that built this View instance.
    */
  var viewFactory: ViewFactory = js.native
  /**
    * Adds a binding instance to this view.
    * @param binding The binding instance.
    */
  def addBinding(binding: js.Object): scala.Unit = js.native
  /**
    * Appends this view's to the specified DOM node.
    * @param parent The parent element to append this view's nodes to.
    */
  def appendNodesTo(parent: stdLib.Element): scala.Unit = js.native
  /**
    * Triggers the attach for the view and its children.
    */
  def attached(): scala.Unit = js.native
  /**
    * Binds the view and it's children.
    * @param bindingContext The binding context to bind to.
    * @param overrideContext A secondary binding context that can override the standard context.
    */
  def bind(bindingContext: js.Object): scala.Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object): scala.Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object, _systemUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * Triggers the created callback for this view and its children.
    */
  def created(): scala.Unit = js.native
  /**
    * Triggers the detach for the view and its children.
    */
  def detached(): scala.Unit = js.native
  /**
    * Inserts this view's nodes before the specified DOM node.
    * @param refNode The node to insert this view's nodes before.
    */
  def insertNodesBefore(refNode: stdLib.Node): scala.Unit = js.native
  /**
    * Removes this view's nodes from the DOM.
    */
  def removeNodes(): scala.Unit = js.native
  /**
    * Returns this view to the appropriate view cache.
    */
  def returnToCache(): scala.Unit = js.native
  /**
    * Unbinds the view and its children.
    */
  def unbind(): scala.Unit = js.native
}

