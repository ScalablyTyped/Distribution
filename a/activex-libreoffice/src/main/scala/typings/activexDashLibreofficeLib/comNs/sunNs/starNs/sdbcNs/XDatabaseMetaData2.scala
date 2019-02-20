package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link XDatabaseMetaData} interface to allow retrieval of additional information. */
trait XDatabaseMetaData2 extends XDatabaseMetaData {
  /**
    * complements {@link XDatabaseMetaData.getURL} by returning the settings which, upon construction of the connection, have been used besides the
    * connection URL.
    * @see XDriver.connect
    */
  val ConnectionInfo: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * complements {@link XDatabaseMetaData.getURL} by returning the settings which, upon construction of the connection, have been used besides the
    * connection URL.
    * @see XDriver.connect
    */
  def getConnectionInfo(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
}

