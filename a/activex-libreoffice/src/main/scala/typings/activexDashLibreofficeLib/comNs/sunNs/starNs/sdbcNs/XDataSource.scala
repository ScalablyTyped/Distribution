package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing connections via a factory which is identified by its name. A DataSource object is typically registered by a naming service
  * provider.
  */
trait XDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  var LoginTimeout: scala.Double
  /**
    * attempts to establish a database connection.
    * @param user the user name
    * @param password the password
    * @returns the connection object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(user: java.lang.String, password: java.lang.String): XConnection
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def getLoginTimeout(): scala.Double
  /**
    * sets the maximum time in seconds that this data source will wait while attempting to connect to a database.
    *
    * A value of zero specifies that the timeout is the default system timeout if there is one; otherwise, it specifies that there is no timeout. When a
    * DataSource object is created the login timeout is initially zero.
    * @param seconds the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def setLoginTimeout(seconds: scala.Double): scala.Unit
}

object XDataSource {
  @scala.inline
  def apply(
    LoginTimeout: scala.Double,
    acquire: js.Function0[scala.Unit],
    getConnection: js.Function2[java.lang.String, java.lang.String, XConnection],
    getLoginTimeout: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit]
  ): XDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LoginTimeout")(LoginTimeout)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getLoginTimeout")(getLoginTimeout)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setLoginTimeout")(setLoginTimeout)
    __obj.asInstanceOf[XDataSource]
  }
}

