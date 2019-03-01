package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to an extended storage stream that might be transacted. */
trait XExtendedStorageStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XSeekable
     with XEncryptionProtectedSource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XTransactedObject
     with XTransactionBroadcaster

object XExtendedStorageStream {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    Length: scala.Double,
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    Position: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addTransactionListener: js.Function1[XTransactionListener, scala.Unit],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    commit: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    getInputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getLength: js.Function0[scala.Double],
    getOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    getPosition: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeTransactionListener: js.Function1[XTransactionListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    revert: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XExtendedStorageStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("Length")(Length)
    __obj.updateDynamic("OutputStream")(OutputStream)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addTransactionListener")(addTransactionListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getOutputStream")(getOutputStream)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEncryption")(removeEncryption)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeTransactionListener")(removeTransactionListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("revert")(revert)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("setEncryptionPassword")(setEncryptionPassword)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XExtendedStorageStream]
  }
}

