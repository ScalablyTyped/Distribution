package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to listen on objects which allow updating their data.
  *
  * In addition to just get notified when an data update happened, the listener has a chance to veto updates **before** they happen.
  * @see XUpdateBroadcaster
  */
trait XUpdateListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked to check the current data.
    *
    * For a given update process, if one of the XUpdateListeners vetoes the change, the update is canceled, and no further notification happens.
    * @param aEvent An event descriptor specifying the broadcaster of the change.
    * @returns `TRUE` when the update was approved, otherwise `FALSE` .
    */
  def approveUpdate(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  /**
    * is invoked when an object has finished processing the updates and the data has been successfully written.
    * @param aEvent A event descriptor specifying the broadcaster of the change.
    */
  def updated(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XUpdateListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveUpdate: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updated: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XUpdateListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("approveUpdate")(approveUpdate)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[XUpdateListener]
  }
}

