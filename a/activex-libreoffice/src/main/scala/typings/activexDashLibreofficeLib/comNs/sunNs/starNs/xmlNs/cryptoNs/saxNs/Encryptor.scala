package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link Encryptor} */
trait Encryptor
  extends XReferenceResolvedListener
     with XReferenceCollector
     with XBlockerMonitor
     with XEncryptionResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object Encryptor {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEncryptionResultListener: js.Function1[XEncryptionResultListener, scala.Unit],
    endMission: js.Function0[scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    referenceResolved: js.Function1[scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    removeEncryptionResultListener: js.Function1[XEncryptionResultListener, scala.Unit],
    setBlockerId: js.Function1[scala.Double, scala.Unit],
    setKeyId: js.Function1[scala.Double, scala.Unit],
    setReferenceCount: js.Function1[scala.Double, scala.Unit],
    setReferenceId: js.Function1[scala.Double, scala.Unit]
  ): Encryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEncryptionResultListener")(addEncryptionResultListener)
    __obj.updateDynamic("endMission")(endMission)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("referenceResolved")(referenceResolved)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEncryptionResultListener")(removeEncryptionResultListener)
    __obj.updateDynamic("setBlockerId")(setBlockerId)
    __obj.updateDynamic("setKeyId")(setKeyId)
    __obj.updateDynamic("setReferenceCount")(setReferenceCount)
    __obj.updateDynamic("setReferenceId")(setReferenceId)
    __obj.asInstanceOf[Encryptor]
  }
}

