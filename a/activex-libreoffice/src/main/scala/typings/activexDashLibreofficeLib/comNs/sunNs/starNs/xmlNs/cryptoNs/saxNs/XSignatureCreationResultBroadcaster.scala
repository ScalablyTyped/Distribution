package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Creation Result Broadcaster.
  *
  * This interface is used to manipulate signature creation result listener.
  */
trait XSignatureCreationResultBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new signature creation result listener.
    *
    * When the signature is created, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureCreationResultListener(listener: XSignatureCreationResultListener): scala.Unit
  /**
    * Removes a signature creation result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureCreationResultListener(listener: XSignatureCreationResultListener): scala.Unit
}

object XSignatureCreationResultBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSignatureCreationResultListener: js.Function1[XSignatureCreationResultListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSignatureCreationResultListener: js.Function1[XSignatureCreationResultListener, scala.Unit]
  ): XSignatureCreationResultBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSignatureCreationResultListener")(addSignatureCreationResultListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSignatureCreationResultListener")(removeSignatureCreationResultListener)
    __obj.asInstanceOf[XSignatureCreationResultBroadcaster]
  }
}

