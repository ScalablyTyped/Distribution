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

object XDatabaseMetaData2 {
  @scala.inline
  def apply(
    ConnectionInfo: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    XDatabaseMetaData: XDatabaseMetaData = null,
    getConnectionInfo: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): XDatabaseMetaData2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConnectionInfo")(ConnectionInfo)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XDatabaseMetaData)
    __obj.updateDynamic("getConnectionInfo")(getConnectionInfo)
    __obj.asInstanceOf[XDatabaseMetaData2]
  }
}

