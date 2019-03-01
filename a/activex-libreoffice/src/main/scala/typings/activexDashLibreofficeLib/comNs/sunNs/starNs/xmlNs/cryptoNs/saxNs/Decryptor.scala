package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link Decryptor} */
trait Decryptor
  extends XReferenceResolvedListener
     with XBlockerMonitor
     with XDecryptionResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object Decryptor {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addDecryptionResultListener: js.Function1[XDecryptionResultListener, scala.Unit],
    endMission: js.Function0[scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    referenceResolved: js.Function1[scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    removeDecryptionResultListener: js.Function1[XDecryptionResultListener, scala.Unit],
    setBlockerId: js.Function1[scala.Double, scala.Unit],
    setKeyId: js.Function1[scala.Double, scala.Unit]
  ): Decryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDecryptionResultListener")(addDecryptionResultListener)
    __obj.updateDynamic("endMission")(endMission)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("referenceResolved")(referenceResolved)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDecryptionResultListener")(removeDecryptionResultListener)
    __obj.updateDynamic("setBlockerId")(setBlockerId)
    __obj.updateDynamic("setKeyId")(setKeyId)
    __obj.asInstanceOf[Decryptor]
  }
}

