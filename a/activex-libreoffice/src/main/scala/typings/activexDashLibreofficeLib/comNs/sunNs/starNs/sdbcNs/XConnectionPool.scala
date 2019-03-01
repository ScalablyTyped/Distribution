package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConnectionPool
  extends XDriverManager
     with XDriverAccess

object XConnectionPool {
  @scala.inline
  def apply(
    LoginTimeout: scala.Double,
    acquire: js.Function0[scala.Unit],
    getConnection: js.Function1[java.lang.String, XConnection],
    getConnectionWithInfo: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XConnection
    ],
    getDriverByURL: js.Function1[java.lang.String, XDriver],
    getLoginTimeout: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit]
  ): XConnectionPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LoginTimeout")(LoginTimeout)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getConnectionWithInfo")(getConnectionWithInfo)
    __obj.updateDynamic("getDriverByURL")(getDriverByURL)
    __obj.updateDynamic("getLoginTimeout")(getLoginTimeout)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setLoginTimeout")(setLoginTimeout)
    __obj.asInstanceOf[XConnectionPool]
  }
}

