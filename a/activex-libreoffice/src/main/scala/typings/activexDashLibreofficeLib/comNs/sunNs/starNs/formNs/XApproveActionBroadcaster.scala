package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to probably veto actions to be performed on components.
  *
  * Usually, a component which supports the {@link XApproveActionBroadcaster} interface implements {@link com.sun.star.awt.XActionListener} as well.
  */
trait XApproveActionBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive the {@link XApproveActionListener.approveAction()} event.
    * @param aListener the listener to be added
    */
  def addApproveActionListener(aListener: XApproveActionListener): scala.Unit
  /**
    * removes the specified listener
    * @param aListener the listener to be removed
    */
  def removeApproveActionListener(aListener: XApproveActionListener): scala.Unit
}

object XApproveActionBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addApproveActionListener: js.Function1[XApproveActionListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeApproveActionListener: js.Function1[XApproveActionListener, scala.Unit]
  ): XApproveActionBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addApproveActionListener")(addApproveActionListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeApproveActionListener")(removeApproveActionListener)
    __obj.asInstanceOf[XApproveActionBroadcaster]
  }
}

