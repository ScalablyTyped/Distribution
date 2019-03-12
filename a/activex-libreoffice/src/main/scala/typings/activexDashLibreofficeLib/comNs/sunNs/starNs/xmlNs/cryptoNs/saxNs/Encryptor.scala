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
    acquire: () => scala.Unit,
    addEncryptionResultListener: XEncryptionResultListener => scala.Unit,
    endMission: () => scala.Boolean,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    referenceResolved: scala.Double => scala.Unit,
    release: () => scala.Unit,
    removeEncryptionResultListener: XEncryptionResultListener => scala.Unit,
    setBlockerId: scala.Double => scala.Unit,
    setKeyId: scala.Double => scala.Unit,
    setReferenceCount: scala.Double => scala.Unit,
    setReferenceId: scala.Double => scala.Unit
  ): Encryptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEncryptionResultListener = js.Any.fromFunction1(addEncryptionResultListener), endMission = js.Any.fromFunction0(endMission), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeEncryptionResultListener = js.Any.fromFunction1(removeEncryptionResultListener), setBlockerId = js.Any.fromFunction1(setBlockerId), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId))
  
    __obj.asInstanceOf[Encryptor]
  }
}

