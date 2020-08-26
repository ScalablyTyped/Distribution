package typings.activexLibreoffice.com_.sun.star.sdbc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a ODBC connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.ConnectionProperties
  */
@js.native
trait ODBCConnectionProperties extends ConnectionProperties {
  /** specifies the statement which should be executed when asking an "INSERT" statement for the {@link XGeneratedResultSet} (future concept) interface. */
  var AutoRetrievingStatement: String = js.native
  /**
    * specifies the encoding to use to translate the backend data
    *
    * See the [IANA character set list]{@link url="http://www.iana.org/assignments/character-sets"} for a list of valid values.
    */
  var CharSet: String = js.native
  /**
    * specifies if retrieving of auto generated values should be enabled or not. If `TRUE` than the statement will support the {@link XGeneratedResultSet}
    * (future concept) interface, otherwise not.
    */
  var IsAutoRetrievingEnabled: Boolean = js.native
  /** should the parameter "?" in prepared statement be substituted with an distinct name */
  var ParameterNameSubstitution: Boolean = js.native
  /** Silent - should the connection be silent. No user interaction while creating the connection. */
  var Silent: Boolean = js.native
  /** the Timeout after which time a timeout should happen */
  var Timeout: Double = js.native
  /** should the driver should support a catalog. */
  var UseCatalog: Boolean = js.native
}

object ODBCConnectionProperties {
  @scala.inline
  def apply(
    AutoRetrievingStatement: String,
    CharSet: String,
    IsAutoRetrievingEnabled: Boolean,
    ParameterNameSubstitution: Boolean,
    Silent: Boolean,
    Timeout: Double,
    UseCatalog: Boolean,
    password: String,
    user: String
  ): ODBCConnectionProperties = {
    val __obj = js.Dynamic.literal(AutoRetrievingStatement = AutoRetrievingStatement.asInstanceOf[js.Any], CharSet = CharSet.asInstanceOf[js.Any], IsAutoRetrievingEnabled = IsAutoRetrievingEnabled.asInstanceOf[js.Any], ParameterNameSubstitution = ParameterNameSubstitution.asInstanceOf[js.Any], Silent = Silent.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], UseCatalog = UseCatalog.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODBCConnectionProperties]
  }
  @scala.inline
  implicit class ODBCConnectionPropertiesOps[Self <: ODBCConnectionProperties] (val x: Self) extends AnyVal {
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
    def setAutoRetrievingStatement(value: String): Self = this.set("AutoRetrievingStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharSet(value: String): Self = this.set("CharSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutoRetrievingEnabled(value: Boolean): Self = this.set("IsAutoRetrievingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterNameSubstitution(value: Boolean): Self = this.set("ParameterNameSubstitution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("Silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCatalog(value: Boolean): Self = this.set("UseCatalog", value.asInstanceOf[js.Any])
  }
  
}

