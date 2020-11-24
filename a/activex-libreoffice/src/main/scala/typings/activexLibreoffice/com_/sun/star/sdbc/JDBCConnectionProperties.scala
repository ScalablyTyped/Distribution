package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait JDBCConnectionProperties extends ConnectionProperties {
  
  /** specifies the statement which should be executed when asking an "INSERT" statement for the {@link XGeneratedResultSet} (future concept) interface. */
  var AutoRetrievingStatement: String = js.native
  
  /**
    * specifies if retrieving of auto generated values should be enabled or not. If `TRUE` than the statement will support the {@link XGeneratedResultSet}
    * (future concept) interface, otherwise not.
    */
  var IsAutoRetrievingEnabled: Boolean = js.native
  
  /**
    * which JDBC driver class should be loaded to create the connection.
    * @see com.sun.star.sdbc.JDBCConnectionProperties.JavaDriverClassPath
    */
  var JavaDriverClass: String = js.native
  
  /**
    * an optional class path to locate the {@link com.sun.star.sdbc.JDBCConnectionProperties.JavaDriverClass}
    *
    * The class path is a list of zero or more internal (see the {@link com.sun.star.uri.ExternalUriReferenceTranslator} service) URI references, where any
    * space characters ( `U+0020` ) are ignored (and, in particular, separate adjacent URI references). Any " vnd.sun.star.expand " URL references in the
    * list are expanded using the {@link com.sun.star.util.theMacroExpander} singleton.
    * @since OOo 2.3
    */
  var JavaDriverClassPath: String = js.native
  
  /** specifies a set of properties to pass to `java.lang.System.setProperty` before loading the system's JDBC driver. */
  var SystemProperties: SafeArray[NamedValue] = js.native
  
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
  var TypeInfoSettings: SafeArray[_] = js.native
}
object JDBCConnectionProperties {
  
  @scala.inline
  def apply(
    AutoRetrievingStatement: String,
    IsAutoRetrievingEnabled: Boolean,
    JavaDriverClass: String,
    JavaDriverClassPath: String,
    SystemProperties: SafeArray[NamedValue],
    TypeInfoSettings: SafeArray[_],
    password: String,
    user: String
  ): JDBCConnectionProperties = {
    val __obj = js.Dynamic.literal(AutoRetrievingStatement = AutoRetrievingStatement.asInstanceOf[js.Any], IsAutoRetrievingEnabled = IsAutoRetrievingEnabled.asInstanceOf[js.Any], JavaDriverClass = JavaDriverClass.asInstanceOf[js.Any], JavaDriverClassPath = JavaDriverClassPath.asInstanceOf[js.Any], SystemProperties = SystemProperties.asInstanceOf[js.Any], TypeInfoSettings = TypeInfoSettings.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[JDBCConnectionProperties]
  }
  
  @scala.inline
  implicit class JDBCConnectionPropertiesOps[Self <: JDBCConnectionProperties] (val x: Self) extends AnyVal {
    
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
    def setIsAutoRetrievingEnabled(value: Boolean): Self = this.set("IsAutoRetrievingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaDriverClass(value: String): Self = this.set("JavaDriverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaDriverClassPath(value: String): Self = this.set("JavaDriverClassPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemProperties(value: SafeArray[NamedValue]): Self = this.set("SystemProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfoSettings(value: SafeArray[_]): Self = this.set("TypeInfoSettings", value.asInstanceOf[js.Any])
  }
}
