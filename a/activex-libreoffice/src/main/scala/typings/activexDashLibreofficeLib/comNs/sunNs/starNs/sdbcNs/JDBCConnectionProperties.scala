package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a JDBC connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.ConnectionProperties
  */
trait JDBCConnectionProperties extends ConnectionProperties {
  /** specifies the statement which should be executed when asking an "INSERT" statement for the {@link XGeneratedResultSet} (future concept) interface. */
  var AutoRetrievingStatement: java.lang.String
  /**
    * specifies if retrieving of auto generated values should be enabled or not. If `TRUE` than the statement will support the {@link XGeneratedResultSet}
    * (future concept) interface, otherwise not.
    */
  var IsAutoRetrievingEnabled: scala.Boolean
  /**
    * which JDBC driver class should be loaded to create the connection.
    * @see com.sun.star.sdbc.JDBCConnectionProperties.JavaDriverClassPath
    */
  var JavaDriverClass: java.lang.String
  /**
    * an optional class path to locate the {@link com.sun.star.sdbc.JDBCConnectionProperties.JavaDriverClass}
    *
    * The class path is a list of zero or more internal (see the {@link com.sun.star.uri.ExternalUriReferenceTranslator} service) URI references, where any
    * space characters ( `U+0020` ) are ignored (and, in particular, separate adjacent URI references). Any " vnd.sun.star.expand " URL references in the
    * list are expanded using the {@link com.sun.star.util.theMacroExpander} singleton.
    * @since OOo 2.3
    */
  var JavaDriverClassPath: java.lang.String
  /** specifies a set of properties to pass to `java.lang.System.setProperty` before loading the system's JDBC driver. */
  var SystemProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /**
    * specifies how the type info returned by {@link com.sun.star.sdbc.XDatabaseMetaData.getTypeInfo()} will be modified.
    *
    * The sequence contains an even amount of string values. Each pair describes what should be searched for and what should be replaced if found. ;  The
    * syntax is:
    *
    * COLUMN(2) = -5COLUMN(6) = PRECISION
    *
    * COLUMN(X) defines the column which will be compared and the column which will be replaced. In the example above column 2 will be compared with the
    * value -5. If this is true than column 6 will now return the value PRECISION.
    */
  var TypeInfoSettings: activexDashInteropLib.SafeArray[_]
}

object JDBCConnectionProperties {
  @scala.inline
  def apply(
    AutoRetrievingStatement: java.lang.String,
    IsAutoRetrievingEnabled: scala.Boolean,
    JavaDriverClass: java.lang.String,
    JavaDriverClassPath: java.lang.String,
    SystemProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    TypeInfoSettings: activexDashInteropLib.SafeArray[_],
    password: java.lang.String,
    user: java.lang.String
  ): JDBCConnectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoRetrievingStatement")(AutoRetrievingStatement)
    __obj.updateDynamic("IsAutoRetrievingEnabled")(IsAutoRetrievingEnabled)
    __obj.updateDynamic("JavaDriverClass")(JavaDriverClass)
    __obj.updateDynamic("JavaDriverClassPath")(JavaDriverClassPath)
    __obj.updateDynamic("SystemProperties")(SystemProperties)
    __obj.updateDynamic("TypeInfoSettings")(TypeInfoSettings)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JDBCConnectionProperties]
  }
}

