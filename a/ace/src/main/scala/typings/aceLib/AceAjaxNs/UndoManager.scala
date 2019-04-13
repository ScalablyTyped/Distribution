package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends js.Object {
  /**
    * Provides a means for implementing your own undo manager. `options` has one property, `args`, an [[Array `Array`]], with two elements:
    * - `args[0]` is an array of deltas
    * - `args[1]` is the document to associate with
    * @param options Contains additional properties
    **/
  def execute(options: js.Any): scala.Unit = js.native
  /**
    * Returns `true` if there are redo operations left to perform.
    **/
  def hasRedo(): scala.Boolean = js.native
  /**
    * Returns `true` if there are undo operations left to perform.
    **/
  def hasUndo(): scala.Boolean = js.native
  /**
    * Returns `true` if the dirty counter is 0
    **/
  def isClean(): scala.Boolean = js.native
  /**
    * Sets dirty counter to 0
    **/
  def markClean(): scala.Unit = js.native
  /**
    * [Perform a redo operation on the document, reimplementing the last change.]{: #UndoManager.redo}
    * @param dontSelect {:dontSelect}
    **/
  def redo(dontSelect: scala.Boolean): scala.Unit = js.native
  /**
    * Destroys the stack of undo and redo redo operations.
    **/
  def reset(): scala.Unit = js.native
  /**
    * [Perform an undo operation on the document, reverting the last change.]{: #UndoManager.undo}
    * @param dontSelect {:dontSelect}
    **/
  def undo(): Range = js.native
  def undo(dontSelect: scala.Boolean): Range = js.native
}

@JSGlobal("AceAjax.UndoManager")
@js.native
/**
  * Resets the current undo state and creates a new `UndoManager`.
  **/
class UndoManagerCls () extends UndoManager

@JSGlobal("AceAjax.UndoManager")
@js.native
object UndoManager
  extends /**
  * Resets the current undo state and creates a new `UndoManager`.
  **/
org.scalablytyped.runtime.Instantiable0[UndoManager]

