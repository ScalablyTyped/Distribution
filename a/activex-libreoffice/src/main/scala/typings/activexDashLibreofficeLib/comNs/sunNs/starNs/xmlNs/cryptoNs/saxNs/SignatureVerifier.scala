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
    acquire: () => scala.Unit,
    addSignatureVerifyResultListener: XSignatureVerifyResultListener => scala.Unit,
    endMission: () => scala.Boolean,
    getUriBinding: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    referenceResolved: scala.Double => scala.Unit,
    release: () => scala.Unit,
    removeSignatureVerifyResultListener: XSignatureVerifyResultListener => scala.Unit,
    setKeyId: scala.Double => scala.Unit,
    setReferenceCount: scala.Double => scala.Unit,
    setReferenceId: scala.Double => scala.Unit,
    setUriBinding: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit
  ): SignatureVerifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureVerifyResultListener = js.Any.fromFunction1(addSignatureVerifyResultListener), endMission = js.Any.fromFunction0(endMission), getUriBinding = js.Any.fromFunction1(getUriBinding), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeSignatureVerifyResultListener = js.Any.fromFunction1(removeSignatureVerifyResultListener), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[SignatureVerifier]
  }
}

