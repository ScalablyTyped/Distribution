package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the listener interface for receiving notifications about data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the description of the service
  * broadcasting the change.
  * @see XChangeBroadcaster
  */
trait XChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when the data of a component has been changed.
    * @param rEvent A descriptor specifying the source of the event.
    */
  def changed(rEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

