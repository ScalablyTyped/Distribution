package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureCreator
  extends XReferenceResolvedListener
     with XReferenceCollector
     with XSignatureCreationResultBroadcaster
     with XBlockerMonitor
     with XKeyCollector
     with XMissionTaker
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XUriBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object SignatureCreator {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSignatureCreationResultListener: js.Function1[XSignatureCreationResultListener, scala.Unit],
    endMission: js.Function0[scala.Boolean],
    getUriBinding: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    referenceResolved: js.Function1[scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    removeSignatureCreationResultListener: js.Function1[XSignatureCreationResultListener, scala.Unit],
    setBlockerId: js.Function1[scala.Double, scala.Unit],
    setKeyId: js.Function1[scala.Double, scala.Unit],
    setReferenceCount: js.Function1[scala.Double, scala.Unit],
    setReferenceId: js.Function1[scala.Double, scala.Unit],
    setUriBinding: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ]
  ): SignatureCreator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSignatureCreationResultListener")(addSignatureCreationResultListener)
    __obj.updateDynamic("endMission")(endMission)
    __obj.updateDynamic("getUriBinding")(getUriBinding)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("referenceResolved")(referenceResolved)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSignatureCreationResultListener")(removeSignatureCreationResultListener)
    __obj.updateDynamic("setBlockerId")(setBlockerId)
    __obj.updateDynamic("setKeyId")(setKeyId)
    __obj.updateDynamic("setReferenceCount")(setReferenceCount)
    __obj.updateDynamic("setReferenceId")(setReferenceId)
    __obj.updateDynamic("setUriBinding")(setUriBinding)
    __obj.asInstanceOf[SignatureCreator]
  }
}

