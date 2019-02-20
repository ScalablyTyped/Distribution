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

