package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.JDBCConnectionProperties
  * @see com.sun.star.sdbc.ODBCConnectionProperties
  * @see com.sun.star.sdbc.FILEConnectionProperties
  * @see com.sun.star.sdbc.DBASEConnectionProperties
  * @see com.sun.star.sdbc.FLATConnectionProperties
  */
trait ConnectionProperties extends js.Object {
  /** the password */
  var password: java.lang.String
  /** the username */
  var user: java.lang.String
}

object ConnectionProperties {
  @scala.inline
  def apply(password: java.lang.String, user: java.lang.String): ConnectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionProperties]
  }
}

