package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception used to stop an expand/collapse from happening.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait ExpandVetoException extends Exception {
  /** The event that the exception was created for. */
  var Event: TreeExpansionEvent
}

object ExpandVetoException {
  @scala.inline
  def apply(Context: XInterface, Event: TreeExpansionEvent, Message: String): ExpandVetoException = {
    val __obj = js.Dynamic.literal(Context = Context, Event = Event, Message = Message)
  
    __obj.asInstanceOf[ExpandVetoException]
  }
}

