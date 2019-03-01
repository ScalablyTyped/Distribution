package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore.
  * @deprecated Deprecated
  */
trait XDatabaseEnvironment
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDriverManager {
  def createDatabaseAccess(URL: java.lang.String, title: java.lang.String): XDatabaseAccess
  def getDatabaseAccess(URL: java.lang.String): XDatabaseAccess
}

object XDatabaseEnvironment {
  @scala.inline
  def apply(
    LoginTimeout: scala.Double,
    acquire: js.Function0[scala.Unit],
    createDatabaseAccess: js.Function2[java.lang.String, java.lang.String, XDatabaseAccess],
    getConnection: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection],
    getConnectionWithInfo: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getDatabaseAccess: js.Function1[java.lang.String, XDatabaseAccess],
    getLoginTimeout: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit]
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LoginTimeout")(LoginTimeout)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createDatabaseAccess")(createDatabaseAccess)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getConnectionWithInfo")(getConnectionWithInfo)
    __obj.updateDynamic("getDatabaseAccess")(getDatabaseAccess)
    __obj.updateDynamic("getLoginTimeout")(getLoginTimeout)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setLoginTimeout")(setLoginTimeout)
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
}

