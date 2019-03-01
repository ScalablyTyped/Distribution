package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedSource2 extends XEncryptionProtectedSource {
  /**
    * determine if an encryption data is set for this object.
    * @returns true if some encryption data was set, false otherwise
    */
  def hasEncryptionData(): scala.Boolean
  /**
    * sets an encryption data for the object.
    * @param aEncryptionData the new encryption data
    * @throws com::sun::star::io::IOException in case the data could not be set
    */
  def setEncryptionData(
    aEncryptionData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
}

object XEncryptionProtectedSource2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    hasEncryptionData: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    setEncryptionData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit]
  ): XEncryptionProtectedSource2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("hasEncryptionData")(hasEncryptionData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEncryption")(removeEncryption)
    __obj.updateDynamic("setEncryptionData")(setEncryptionData)
    __obj.updateDynamic("setEncryptionPassword")(setEncryptionPassword)
    __obj.asInstanceOf[XEncryptionProtectedSource2]
  }
}

