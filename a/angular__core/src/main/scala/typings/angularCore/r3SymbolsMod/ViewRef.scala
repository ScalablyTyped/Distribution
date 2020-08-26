package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Angular [view](guide/glossary#view "Definition").
  *
  * @see {@link ChangeDetectorRef#usage-notes Change detection usage}
  *
  * @publicApi
  */
@js.native
trait ViewRef extends ChangeDetectorRef {
  /**
    * Destroys this view and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * Reports whether this view has been destroyed.
    * @returns True after the `destroy()` method has been called, false otherwise.
    */
  def destroyed: Boolean = js.native
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for views.
    * @param callback A handler function that cleans up developer-defined data
    * associated with a view. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): js.Any = js.native
}

object ViewRef {
  @scala.inline
  def apply(
    checkNoChanges: () => Unit,
    destroy: () => Unit,
    destroyed: () => Boolean,
    detach: () => Unit,
    detectChanges: () => Unit,
    markForCheck: () => Unit,
    onDestroy: js.Function => js.Any,
    reattach: () => Unit
  ): ViewRef = {
    val __obj = js.Dynamic.literal(checkNoChanges = js.Any.fromFunction0(checkNoChanges), destroy = js.Any.fromFunction0(destroy), destroyed = js.Any.fromFunction0(destroyed), detach = js.Any.fromFunction0(detach), detectChanges = js.Any.fromFunction0(detectChanges), markForCheck = js.Any.fromFunction0(markForCheck), onDestroy = js.Any.fromFunction1(onDestroy), reattach = js.Any.fromFunction0(reattach))
    __obj.asInstanceOf[ViewRef]
  }
  @scala.inline
  implicit class ViewRefOps[Self <: ViewRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroyed(value: () => Boolean): Self = this.set("destroyed", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDestroy(value: js.Function => js.Any): Self = this.set("onDestroy", js.Any.fromFunction1(value))
  }
  
}

