package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single (undoable) action on a document
  * @since OOo 3.4
  */
trait XUndoAction extends js.Object {
  /** is the human-readable, localized description of the action. */
  var Title: java.lang.String
  /**
    * repeats the action represented by the instance, after it had previously been reverted.
    * @throws UndoFailedException if repeating the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def redo(): scala.Unit
  /**
    * reverts the action represented by the instance
    * @throws UndoFailedException if reverting the action failed. In this case, the caller should assume that this is a permanent failure, and take appropriate
    */
  def undo(): scala.Unit
}

object XUndoAction {
  @scala.inline
  def apply(Title: java.lang.String, redo: () => scala.Unit, undo: () => scala.Unit): XUndoAction = {
    val __obj = js.Dynamic.literal(Title = Title, redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
  
    __obj.asInstanceOf[XUndoAction]
  }
}

