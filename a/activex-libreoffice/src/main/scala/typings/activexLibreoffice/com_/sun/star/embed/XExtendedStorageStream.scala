package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XSeekable
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface allows access to an extended storage stream that might be transacted. */
trait XExtendedStorageStream
  extends StObject
     with XStream
     with XComponent
     with XSeekable
     with XEncryptionProtectedSource
     with XPropertySet
     with XTransactedObject
     with XTransactionBroadcaster
object XExtendedStorageStream {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addTransactionListener = js.Any.fromFunction1(addTransactionListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), commit = js.Any.fromFunction0(commit), dispose = js.Any.fromFunction0(dispose), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTransactionListener = js.Any.fromFunction1(removeTransactionListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revert = js.Any.fromFunction0(revert), seek = js.Any.fromFunction1(seek), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XExtendedStorageStream]
  }
}
