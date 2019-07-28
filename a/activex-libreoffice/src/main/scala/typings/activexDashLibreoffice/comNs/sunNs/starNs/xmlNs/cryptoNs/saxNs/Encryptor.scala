package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
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
     with XInitialization

object Encryptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEncryptionResultListener: XEncryptionResultListener => Unit,
    endMission: () => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    referenceResolved: Double => Unit,
    release: () => Unit,
    removeEncryptionResultListener: XEncryptionResultListener => Unit,
    setBlockerId: Double => Unit,
    setKeyId: Double => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit
  ): Encryptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEncryptionResultListener = js.Any.fromFunction1(addEncryptionResultListener), endMission = js.Any.fromFunction0(endMission), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1(referenceResolved), release = js.Any.fromFunction0(release), removeEncryptionResultListener = js.Any.fromFunction1(removeEncryptionResultListener), setBlockerId = js.Any.fromFunction1(setBlockerId), setKeyId = js.Any.fromFunction1(setKeyId), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId))
  
    __obj.asInstanceOf[Encryptor]
  }
}

