package typings.aureliaTemplating.mod

import typings.std.Node
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
  def this(anchor: Node, anchorIsContainer: Boolean) = this()
  def this(anchor: Node, anchorIsContainer: Boolean, animator: Animator) = this()
  /**
    * Adds a view to the slot.
    * @param view The view to add.
    * @return May return a promise if the view addition triggered an animation.
    */
  def add(view: View_): Unit | js.Promise[_] = js.native
  /**
    *   Runs the animator against the first animatable element found within the view's fragment
    *   @param  view       The view to use when searching for the element.
    *   @param  direction  The animation direction enter|leave.
    *   @returns An animation complete Promise or undefined if no animation was run.
    */
  def animateView(view: View_): Unit | js.Promise[_] = js.native
  def animateView(view: View_, direction: String): Unit | js.Promise[_] = js.native
  /**
    * Triggers the attach for the slot and its children.
    */
  def attached(): Unit = js.native
  /**
    * Binds the slot and it's children.
    * @param bindingContext The binding context to bind to.
    * @param overrideContext A secondary binding context that can override the standard context.
    */
  def bind(bindingContext: js.Object, overrideContext: js.Object): Unit = js.native
  /**
    * Triggers the detach for the slot and its children.
    */
  def detached(): Unit = js.native
  /**
    * Inserts a view into the slot.
    * @param index The index to insert the view at.
    * @param view The view to insert.
    * @return May return a promise if the view insertion triggered an animation.
    */
  def insert(index: Double, view: View_): Unit | js.Promise[_] = js.native
  /**
    * Moves a view across the slot.
    * @param sourceIndex The index the view is currently at.
    * @param targetIndex The index to insert the view at.
    */
  def move(): js.Any = js.native
  def move(sourceIndex: js.UndefOr[scala.Nothing], targetIndex: js.Any): js.Any = js.native
  def move(sourceIndex: js.Any): js.Any = js.native
  def move(sourceIndex: js.Any, targetIndex: js.Any): js.Any = js.native
  def projectTo(slots: js.Object): Unit = js.native
  /**
    * Removes a view from the slot.
    * @param view The view to remove.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def remove(view: View_): View_ | js.Promise[View_] = js.native
  def remove(view: View_, returnToCache: js.UndefOr[scala.Nothing], skipAnimation: Boolean): View_ | js.Promise[View_] = js.native
  def remove(view: View_, returnToCache: Boolean): View_ | js.Promise[View_] = js.native
  def remove(view: View_, returnToCache: Boolean, skipAnimation: Boolean): View_ | js.Promise[View_] = js.native
  /**
    * Removes all views from the slot.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removals triggered an animation.
    */
  def removeAll(): Unit | js.Promise[_] = js.native
  def removeAll(returnToCache: js.UndefOr[scala.Nothing], skipAnimation: Boolean): Unit | js.Promise[_] = js.native
  def removeAll(returnToCache: Boolean): Unit | js.Promise[_] = js.native
  def removeAll(returnToCache: Boolean, skipAnimation: Boolean): Unit | js.Promise[_] = js.native
  /**
    * Removes a view an a specified index from the slot.
    * @param index The index to remove the view at.
    * @param returnToCache Should the view be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def removeAt(index: Double): View_ | js.Promise[View_] = js.native
  def removeAt(index: Double, returnToCache: js.UndefOr[scala.Nothing], skipAnimation: Boolean): View_ | js.Promise[View_] = js.native
  def removeAt(index: Double, returnToCache: Boolean): View_ | js.Promise[View_] = js.native
  def removeAt(index: Double, returnToCache: Boolean, skipAnimation: Boolean): View_ | js.Promise[View_] = js.native
  /**
    * Removes many views from the slot.
    * @param viewsToRemove The array of views to remove.
    * @param returnToCache Should the views be returned to the view cache?
    * @param skipAnimation Should the removal animation be skipped?
    * @return May return a promise if the view removal triggered an animation.
    */
  def removeMany(viewsToRemove: js.Array[View_]): Unit | js.Promise[Unit] = js.native
  def removeMany(viewsToRemove: js.Array[View_], returnToCache: js.UndefOr[scala.Nothing], skipAnimation: Boolean): Unit | js.Promise[Unit] = js.native
  def removeMany(viewsToRemove: js.Array[View_], returnToCache: Boolean): Unit | js.Promise[Unit] = js.native
  def removeMany(viewsToRemove: js.Array[View_], returnToCache: Boolean, skipAnimation: Boolean): Unit | js.Promise[Unit] = js.native
  /**
    * Takes the child nodes of an existing element that has been converted into a ViewSlot
    * and makes those nodes into a View within the slot.
    */
  def transformChildNodesIntoView(): Unit = js.native
  /**
    * Unbinds the slot and its children.
    */
  def unbind(): Unit = js.native
}

