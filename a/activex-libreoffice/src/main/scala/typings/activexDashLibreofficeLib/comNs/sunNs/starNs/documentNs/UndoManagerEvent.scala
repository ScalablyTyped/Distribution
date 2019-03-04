package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an event sent by an {@link XUndoManager} implementation when the Undo/Redo stacks of the manager are modified.
  * @see XUndoManager
  * @see XUndoManagerListener
  * @see XUndoAction
  * @since OOo 3.4
  */
trait UndoManagerEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * the title of the undo action which is described by the event
    * @see XUndoAction.Title
    */
  var UndoActionTitle: java.lang.String
  /**
    * denotes the number of Undo contexts which are open, and not yet closed, at the time the event is fired.
    * @see XUndoManager.enterUndoContext
    */
  var UndoContextDepth: scala.Double
}

object UndoManagerEvent {
  @scala.inline
  def apply(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    UndoActionTitle: java.lang.String,
    UndoContextDepth: scala.Double
  ): UndoManagerEvent = {
    val __obj = js.Dynamic.literal(Source = Source, UndoActionTitle = UndoActionTitle, UndoContextDepth = UndoContextDepth)
  
    __obj.asInstanceOf[UndoManagerEvent]
  }
}

