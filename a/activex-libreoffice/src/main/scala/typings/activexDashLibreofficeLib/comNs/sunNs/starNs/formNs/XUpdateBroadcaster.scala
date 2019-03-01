package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the broadcaster interface for sending "approveUpdate" and "updated" events.
  *
  * The component supporting this interface must do approval calls ( {@link XUpdateListener.approveUpdate()} ) immediately before the data is updated, and
  * notification calls ( {@link XUpdateListener.updated()} ) immediately afterwards.
  * @see XUpdateListener
  */
trait XUpdateBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): scala.Unit
}

object XUpdateBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addUpdateListener: js.Function1[XUpdateListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeUpdateListener: js.Function1[XUpdateListener, scala.Unit]
  ): XUpdateBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addUpdateListener")(addUpdateListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeUpdateListener")(removeUpdateListener)
    __obj.asInstanceOf[XUpdateBroadcaster]
  }
}

