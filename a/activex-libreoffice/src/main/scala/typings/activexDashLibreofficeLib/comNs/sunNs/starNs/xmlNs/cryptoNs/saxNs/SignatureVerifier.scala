package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link SignatureVerifier} */
trait SignatureVerifier
  extends XReferenceResolvedListener
     with XReferenceCollector
     with XSignatureVerifyResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.XUriBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object SignatureVerifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSignatureVerifyResultListener: js.Function1[XSignatureVerifyResultListener, scala.Unit],
    endMission: js.Function0[scala.Boolean],
    getUriBinding: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    referenceResolved: js.Function1[scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    removeSignatureVerifyResultListener: js.Function1[XSignatureVerifyResultListener, scala.Unit],
    setKeyId: js.Function1[scala.Double, scala.Unit],
    setReferenceCount: js.Function1[scala.Double, scala.Unit],
    setReferenceId: js.Function1[scala.Double, scala.Unit],
    setUriBinding: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ]
  ): SignatureVerifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSignatureVerifyResultListener")(addSignatureVerifyResultListener)
    __obj.updateDynamic("endMission")(endMission)
    __obj.updateDynamic("getUriBinding")(getUriBinding)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("referenceResolved")(referenceResolved)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSignatureVerifyResultListener")(removeSignatureVerifyResultListener)
    __obj.updateDynamic("setKeyId")(setKeyId)
    __obj.updateDynamic("setReferenceCount")(setReferenceCount)
    __obj.updateDynamic("setReferenceId")(setReferenceId)
    __obj.updateDynamic("setUriBinding")(setUriBinding)
    __obj.asInstanceOf[SignatureVerifier]
  }
}

