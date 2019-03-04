package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the basic interface for managing a set of SDBC drivers.
  *
  * When the method {@link com.sun.star.sdbc.XDriverManager.getConnection()} is called, the {@link DriverManager} will attempt to locate a suitable
  * driver.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XConnection
  */
trait XDriverManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the maximum time in seconds that a driver can wait when attempting to login to a database.
    * @returns the driver login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  var LoginTimeout: scala.Double
  /**
    * attempts to establish a connection to the given database URL. The {@link DriverManager} attempts to select an appropriate driver from the set of
    * registered JDBC/SDBC drivers.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(url: java.lang.String): XConnection
  /**
    * attempts to establish a connection to the given database URL. The {@link DriverManager} attempts to select an appropriate driver from the set of
    * registered JDBC/SDBC drivers.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @param info a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included
    * @returns the {@link Connection} object
    * @see com.sun.star.sdbc.ConnectionProperties
    * @throws SQLException if a database access error occurs.
    */
  def getConnectionWithInfo(
    url: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XConnection
  /**
    * gets the maximum time in seconds that a driver can wait when attempting to login to a database.
    * @returns the driver login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def getLoginTimeout(): scala.Double
  /**
    * sets the maximum time in seconds that a driver will wait while attempting to connect to a database.
    * @param seconds the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def setLoginTimeout(seconds: scala.Double): scala.Unit
}

object XDriverManager {
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
    getLoginTimeout: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit]
  ): XDriverManager = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = acquire, getConnection = getConnection, getConnectionWithInfo = getConnectionWithInfo, getLoginTimeout = getLoginTimeout, queryInterface = queryInterface, release = release, setLoginTimeout = setLoginTimeout)
  
    __obj.asInstanceOf[XDriverManager]
  }
}

