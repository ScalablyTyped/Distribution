package typings.activexLibreoffice.com_.sun.star.sdbc

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
@js.native
trait ConnectionProperties extends js.Object {
  /** the password */
  var password: String = js.native
  /** the username */
  var user: String = js.native
}

object ConnectionProperties {
  @scala.inline
  def apply(password: String, user: String): ConnectionProperties = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProperties]
  }
  @scala.inline
  implicit class ConnectionPropertiesOps[Self <: ConnectionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

