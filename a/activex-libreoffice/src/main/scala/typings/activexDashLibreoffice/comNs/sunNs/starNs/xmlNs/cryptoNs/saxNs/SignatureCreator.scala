package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.XUriBinding
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
     with XUriBinding
     with XInitialization

object SignatureCreator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSignatureCreationResultListener: XSignatureCreationResultListener => Unit,
    endMission: () => Boolean,
    getUriBinding: String => XInputStream,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    referenceResolved: Double => Unit,
    release: () => Unit,
    removeSignatureCreationResultListener: XSignatureCreationResultListener => Unit,
    setBlockerId: Double => Unit,
    setKeyId: Double => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit,
    setUriBinding: (String, XInputStream) => Unit
  ): SignatureCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureCreationResultListener = js.Any.fromFunction1(addSignatureCreationResultListener), endMission = js.Any.fromFunction0(endMission), getUriBinding = js.Any.fromFunction1(getUriBinding), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeSignatureCreationResultListener = js.Any.fromFunction1(removeSignatureCreationResultListener), setBlockerId = js.Any.fromFunction1(setBlockerId), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[SignatureCreator]
  }
}

