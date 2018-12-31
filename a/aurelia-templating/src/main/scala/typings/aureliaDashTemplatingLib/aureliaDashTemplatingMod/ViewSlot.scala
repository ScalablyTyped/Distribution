package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ViewSlot")
@js.native
class ViewSlot protected () extends js.Object {
  /**
    * Creates an instance of ViewSlot.
    * @param anchor The DOM node which will server as the anchor or container for insertion.
    * @param anchorIsContainer Indicates whether the node is a container.
    * @param animator The animator that will controll enter/leave transitions for this slot.
    */
  def this(anchor: stdLib.Node, anchorIsContainer: scala.Boolean) = this()
  def this(anchor: stdLib.Node, anchorIsContainer: scala.Boolean, animator: Animator) = this()
  /**
    * Adds a view to the slot.
    * @param view The view to add.
    * @return May return a promise if the view addition triggered an animation.
    */
  def add(view: View): scala.Unit | js.Promise[_] = js.native
  /**
    *   Runs the animator against the first animatable element found within the view's fragment
    *   @param  view       The view to use when searching for the element.
    *   @param  direction  The animation direction enter|leave.
    *   @returns An animation complete Promise or undefined if no animation was run.
    */
  def animateView(view: View): scala.Unit | js.Promise[_] = js.native
  def animateView(view: View, direction: java.lang.String): scala.Unit | js.Promise[_] = js.native
  /**
    * Triggers the attach for the slot and its children.
    */
  def attached(): scala.Unit = js.native
  /**
    * Binds the slot and it's children.
    * @param bindingContext The binding context to bind to.
    * @param overrideContext A secondary binding context that can override the standard context.
    */
  def bind(bindingContext: js.Object, overrideContext: js.Object): scala.Unit = js.native
  /**
    * Triggers the detach for the slot and its children.
    */
  def detached(): scala.Unit = js.native
  /**
    * Inserts a view into the slot.
    * @param index The index to insert the view at.
    * @param view The view to insert.
    * @return May return a promise if the view insertion triggered an animation.
    */
  def insert(index: scala.Double, view: View): scala.Unit | js.Promise[_] = js.native
  /**
    * Moves a view across the slot.
    * @param sourceIndex The index the view is currently at.
    * @param targetIndex The index to insert the view at.
    */
  def move(): js.Any = js.native
  def move(sourceIndex: js.Any): js.Any = js.native
  def move(sourceIndex: js.Any, targetIndex: js.Any): js.Any = js.native
  def projectTo(slots: js.Object): scala.Unit = js.native
  /**
    * Removes a view from the slot.
    * @param view The view to remove.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def remove(view: View): View | js.Promise[View] = js.native
  def remove(view: View, returnToCache: scala.Boolean): View | js.Promise[View] = js.native
  def remove(view: View, returnToCache: scala.Boolean, skipAnimation: scala.Boolean): View | js.Promise[View] = js.native
  /**
    * Removes all views from the slot.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removals triggered an animation.
    */
  def removeAll(): scala.Unit | js.Promise[_] = js.native
  def removeAll(returnToCache: scala.Boolean): scala.Unit | js.Promise[_] = js.native
  def removeAll(returnToCache: scala.Boolean, skipAnimation: scala.Boolean): scala.Unit | js.Promise[_] = js.native
  /**
    * Removes a view an a specified index from the slot.
    * @param index The index to remove the view at.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def removeAt(index: scala.Double): View | js.Promise[View] = js.native
  def removeAt(index: scala.Double, returnToCache: scala.Boolean): View | js.Promise[View] = js.native
  def removeAt(index: scala.Double, returnToCache: scala.Boolean, skipAnimation: scala.Boolean): View | js.Promise[View] = js.native
  /**
    * Removes many views from the slot.
    * @param viewsToRemove The array of views to remove.
    * @param returnToCache Should the views be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def removeMany(viewsToRemove: js.Array[View]): scala.Unit | js.Promise[scala.Unit] = js.native
  def removeMany(viewsToRemove: js.Array[View], returnToCache: scala.Boolean): scala.Unit | js.Promise[scala.Unit] = js.native
  def removeMany(viewsToRemove: js.Array[View], returnToCache: scala.Boolean, skipAnimation: scala.Boolean): scala.Unit | js.Promise[scala.Unit] = js.native
  /**
    * Takes the child nodes of an existing element that has been converted into a ViewSlot
    * and makes those nodes into a View within the slot.
    */
  def transformChildNodesIntoView(): scala.Unit = js.native
  /**
    * Unbinds the slot and its children.
    */
  def unbind(): scala.Unit = js.native
}

