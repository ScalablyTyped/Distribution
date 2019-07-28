package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XSeekable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to an extended storage stream that might be transacted. */
trait XExtendedStorageStream
  extends XStream
     with XComponent
     with XSeekable
     with XEncryptionProtectedSource
     with XPropertySet
     with XTransactedObject
     with XTransactionBroadcaster

object XExtendedStorageStream {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Length: Double,
    OutputStream: XOutputStream,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addTransactionListener: XTransactionListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    commit: () => Unit,
    dispose: () => Unit,
    getInputStream: () => XInputStream,
    getLength: () => Double,
    getOutputStream: () => XOutputStream,
    getPosition: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTransactionListener: XTransactionListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    revert: () => Unit,
    seek: Double => Unit,
    setEncryptionPassword: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XExtendedStorageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Length = Length, OutputStream = OutputStream, Position = Position, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addTransactionListener = js.Any.fromFunction1(addTransactionListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), commit = js.Any.fromFunction0(commit), dispose = js.Any.fromFunction0(dispose), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revert = js.Any.fromFunction0(revert), seek = js.Any.fromFunction1(seek), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XExtendedStorageStream]
  }
}

