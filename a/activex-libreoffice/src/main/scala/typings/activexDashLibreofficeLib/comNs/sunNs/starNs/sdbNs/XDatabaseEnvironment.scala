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
    acquire: () => scala.Unit,
    createDatabaseAccess: (java.lang.String, java.lang.String) => XDatabaseAccess,
    getConnection: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getConnectionWithInfo: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getDatabaseAccess: java.lang.String => XDatabaseAccess,
    getLoginTimeout: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), createDatabaseAccess = js.Any.fromFunction2(createDatabaseAccess), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDatabaseAccess = js.Any.fromFunction1(getDatabaseAccess), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
  
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
}

