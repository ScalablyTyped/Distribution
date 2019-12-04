package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Angular [view](guide/glossary#view),
  * specifically the [host view](guide/glossary#view-tree) that is defined by a component.
  * Also serves as the base class
  * that adds destroy methods for [embedded views](guide/glossary#view-tree).
  *
  * @see `EmbeddedViewRef`
  *
  * @publicApi
  */
trait ViewRef extends ChangeDetectorRef {
  /**
    * Reports whether this view has been destroyed.
    * @returns True after the `destroy()` method has been called, false otherwise.
    */
  val destroyed: Boolean
  /**
    * Destroys this view and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for views.
    * @param callback A handler function that cleans up developer-defined data
    * associated with a view. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): js.Any
}

object ViewRef {
  @scala.inline
  def apply(
    checkNoChanges: () => Unit,
    destroy: () => Unit,
    destroyed: Boolean,
    detach: () => Unit,
    detectChanges: () => Unit,
    markForCheck: () => Unit,
    onDestroy: js.Function => js.Any,
    reattach: () => Unit
  ): ViewRef = {
    val __obj = js.Dynamic.literal(checkNoChanges = js.Any.fromFunction0(checkNoChanges), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), detectChanges = js.Any.fromFunction0(detectChanges), markForCheck = js.Any.fromFunction0(markForCheck), onDestroy = js.Any.fromFunction1(onDestroy), reattach = js.Any.fromFunction0(reattach))
  
    __obj.asInstanceOf[ViewRef]
  }
}

