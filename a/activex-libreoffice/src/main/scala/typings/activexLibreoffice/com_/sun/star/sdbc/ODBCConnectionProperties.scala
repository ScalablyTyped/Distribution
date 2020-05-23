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
trait ODBCConnectionProperties extends ConnectionProperties {
  /** specifies the statement which should be executed when asking an "INSERT" statement for the {@link XGeneratedResultSet} (future concept) interface. */
  var AutoRetrievingStatement: String
  /**
    * specifies the encoding to use to translate the backend data
    *
    * See the [IANA character set list]{@link url="http://www.iana.org/assignments/character-sets"} for a list of valid values.
    */
  var CharSet: String
  /**
    * specifies if retrieving of auto generated values should be enabled or not. If `TRUE` than the statement will support the {@link XGeneratedResultSet}
    * (future concept) interface, otherwise not.
    */
  var IsAutoRetrievingEnabled: Boolean
  /** should the parameter "?" in prepared statement be substituted with an distinct name */
  var ParameterNameSubstitution: Boolean
  /** Silent - should the connection be silent. No user interaction while creating the connection. */
  var Silent: Boolean
  /** the Timeout after which time a timeout should happen */
  var Timeout: Double
  /** should the driver should support a catalog. */
  var UseCatalog: Boolean
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
}

