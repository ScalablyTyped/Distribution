package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.XUriBinding
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
     with XUriBinding
     with XInitialization

object SignatureVerifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSignatureVerifyResultListener: XSignatureVerifyResultListener => Unit,
    endMission: () => Boolean,
    getUriBinding: String => XInputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    referenceResolved: Double => Unit,
    release: () => Unit,
    removeSignatureVerifyResultListener: XSignatureVerifyResultListener => Unit,
    setKeyId: Double => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit,
    setUriBinding: (String, XInputStream) => Unit
  ): SignatureVerifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureVerifyResultListener = js.Any.fromFunction1(addSignatureVerifyResultListener), endMission = js.Any.fromFunction0(endMission), getUriBinding = js.Any.fromFunction1(getUriBinding), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeSignatureVerifyResultListener = js.Any.fromFunction1(removeSignatureVerifyResultListener), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[SignatureVerifier]
  }
}

