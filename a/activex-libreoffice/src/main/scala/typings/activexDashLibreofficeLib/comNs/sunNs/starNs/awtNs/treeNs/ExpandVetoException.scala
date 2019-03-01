package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception used to stop an expand/collapse from happening.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait ExpandVetoException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The event that the exception was created for. */
  var Event: TreeExpansionEvent
}

object ExpandVetoException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Event: TreeExpansionEvent,
    Message: java.lang.String
  ): ExpandVetoException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Event")(Event)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ExpandVetoException]
  }
}

