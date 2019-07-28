package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing connections via a factory which is identified by its name. A DataSource object is typically registered by a naming service
  * provider.
  */
trait XDataSource extends XInterface {
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  var LoginTimeout: Double
  /**
    * attempts to establish a database connection.
    * @param user the user name
    * @param password the password
    * @returns the connection object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(user: String, password: String): XConnection
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def getLoginTimeout(): Double
  /**
    * sets the maximum time in seconds that this data source will wait while attempting to connect to a database.
    *
    * A value of zero specifies that the timeout is the default system timeout if there is one; otherwise, it specifies that there is no timeout. When a
    * DataSource object is created the login timeout is initially zero.
    * @param seconds the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def setLoginTimeout(seconds: Double): Unit
}

object XDataSource {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    getConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDataSource = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction2(getConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
  
    __obj.asInstanceOf[XDataSource]
  }
}

