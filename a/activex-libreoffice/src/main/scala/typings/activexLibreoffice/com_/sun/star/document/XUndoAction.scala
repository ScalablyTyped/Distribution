package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single (undoable) action on a document
  * @since OOo 3.4
  */
@js.native
trait XUndoAction extends js.Object {
  /** is the human-readable, localized description of the action. */
  var Title: String = js.native
  /**
    * repeats the action represented by the instance, after it had previously been reverted.
    * @throws UndoFailedException if repeating the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def redo(): Unit = js.native
  /**
    * reverts the action represented by the instance
    * @throws UndoFailedException if reverting the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def undo(): Unit = js.native
}

object XUndoAction {
  @scala.inline
  def apply(Title: String, redo: () => Unit, undo: () => Unit): XUndoAction = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[XUndoAction]
  }
  @scala.inline
  implicit class XUndoActionOps[Self <: XUndoAction] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    @scala.inline
    def setUndo(value: () => Unit): Self = this.set("undo", js.Any.fromFunction0(value))
  }
  
}

