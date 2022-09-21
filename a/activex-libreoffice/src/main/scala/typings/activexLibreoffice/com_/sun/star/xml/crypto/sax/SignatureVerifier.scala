package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.xml.crypto.XUriBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link SignatureVerifier} */
trait SignatureVerifier
  extends StObject
     with XReferenceResolvedListener
     with XReferenceCollector
     with XSignatureVerifyResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with XUriBinding
     with XInitialization
object SignatureVerifier {
  
  inline def apply(
    acquire: () => Unit,
    addSignatureVerifyResultListener: XSignatureVerifyResultListener => Unit,
    endMission: () => Boolean,
    getUriBinding: String => XInputStream,
    initialize: SeqEquiv[Any] => Unit,
    queryInterface: `type` => Any,
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
