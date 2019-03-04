package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to an {@link XUndoManager} .
  * @since OOo 3.4
  */
trait XUndoManagerSupplier extends js.Object {
  /** returns the Undo manager associated with the component. */
  val UndoManager: XUndoManager
  /** returns the Undo manager associated with the component. */
  def getUndoManager(): XUndoManager
}

object XUndoManagerSupplier {
  @scala.inline
  def apply(UndoManager: XUndoManager, getUndoManager: js.Function0[XUndoManager]): XUndoManagerSupplier = {
    val __obj = js.Dynamic.literal(UndoManager = UndoManager, getUndoManager = getUndoManager)
  
    __obj.asInstanceOf[XUndoManagerSupplier]
  }
}

