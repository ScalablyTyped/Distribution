package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

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
  var AutoRetrievingStatement: java.lang.String
  /**
    * specifies the encoding to use to translate the backend data
    *
    * See the [IANA character set list]{@link url="http://www.iana.org/assignments/character-sets"} for a list of valid values.
    */
  var CharSet: java.lang.String
  /**
    * specifies if retrieving of auto generated values should be enabled or not. If `TRUE` than the statement will support the {@link XGeneratedResultSet}
    * (future concept) interface, otherwise not.
    */
  var IsAutoRetrievingEnabled: scala.Boolean
  /** should the parameter "?" in prepared statement be substituted with an distinct name */
  var ParameterNameSubstitution: scala.Boolean
  /** Silent - should the connection be silent. No user interaction while creating the connection. */
  var Silent: scala.Boolean
  /** the Timeout after which time a timeout should happen */
  var Timeout: scala.Double
  /** should the driver should support a catalog. */
  var UseCatalog: scala.Boolean
}

object ODBCConnectionProperties {
  @scala.inline
  def apply(
    AutoRetrievingStatement: java.lang.String,
    CharSet: java.lang.String,
    IsAutoRetrievingEnabled: scala.Boolean,
    ParameterNameSubstitution: scala.Boolean,
    Silent: scala.Boolean,
    Timeout: scala.Double,
    UseCatalog: scala.Boolean,
    password: java.lang.String,
    user: java.lang.String
  ): ODBCConnectionProperties = {
    val __obj = js.Dynamic.literal(AutoRetrievingStatement = AutoRetrievingStatement, CharSet = CharSet, IsAutoRetrievingEnabled = IsAutoRetrievingEnabled, ParameterNameSubstitution = ParameterNameSubstitution, Silent = Silent, Timeout = Timeout, UseCatalog = UseCatalog, password = password, user = user)
  
    __obj.asInstanceOf[ODBCConnectionProperties]
  }
}

