package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single (undoable) action on a document
  * @since OOo 3.4
  */
trait XUndoAction extends js.Object {
  /** is the human-readable, localized description of the action. */
  var Title: String
  /**
    * repeats the action represented by the instance, after it had previously been reverted.
    * @throws UndoFailedException if repeating the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def redo(): Unit
  /**
    * reverts the action represented by the instance
    * @throws UndoFailedException if reverting the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def undo(): Unit
}

object XUndoAction {
  @scala.inline
  def apply(Title: String, redo: () => Unit, undo: () => Unit): XUndoAction = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[XUndoAction]
  }
}

