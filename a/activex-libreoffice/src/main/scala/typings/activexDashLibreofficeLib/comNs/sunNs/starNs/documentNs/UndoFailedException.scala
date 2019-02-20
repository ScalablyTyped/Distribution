package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * thrown when reverting to re-applying an undoable action fails.
  * @see XUndoAction.undo
  * @see XUndoManager.undo
  * @since OOo 3.4
  */
trait UndoFailedException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** describes the reason why the operation failed. Usually, this member will carry an exception. */
  var Reason: js.Any
}

