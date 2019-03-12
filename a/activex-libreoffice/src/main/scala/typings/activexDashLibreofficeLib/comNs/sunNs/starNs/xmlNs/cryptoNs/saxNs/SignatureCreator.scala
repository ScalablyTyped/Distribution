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
    acquire: () => scala.Unit,
    addSignatureCreationResultListener: XSignatureCreationResultListener => scala.Unit,
    endMission: () => scala.Boolean,
    getUriBinding: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    referenceResolved: scala.Double => scala.Unit,
    release: () => scala.Unit,
    removeSignatureCreationResultListener: XSignatureCreationResultListener => scala.Unit,
    setBlockerId: scala.Double => scala.Unit,
    setKeyId: scala.Double => scala.Unit,
    setReferenceCount: scala.Double => scala.Unit,
    setReferenceId: scala.Double => scala.Unit,
    setUriBinding: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit
  ): SignatureCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureCreationResultListener = js.Any.fromFunction1(addSignatureCreationResultListener), endMission = js.Any.fromFunction0(endMission), getUriBinding = js.Any.fromFunction1(getUriBinding), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeSignatureCreationResultListener = js.Any.fromFunction1(removeSignatureCreationResultListener), setBlockerId = js.Any.fromFunction1(setBlockerId), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId), setUriBinding = js.Any.fromFunction2(setUriBinding))
  
    __obj.asInstanceOf[SignatureCreator]
  }
}

