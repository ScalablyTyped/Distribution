package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of text field that displays the name of a database.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait DatabaseName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField {
  /** specifies the database name. */
  var DataBaseName: java.lang.String
  /**
    * indicates a connection {@link URL} , which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: java.lang.String
  /**
    * indicates the {@link URL} of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: java.lang.String
  /**
    * determines the interpretation of the property DataTableName.
    * @see com.sun.star.sdb.CommandType
    */
  var DataCommandType: scala.Double
  /** contains the name of the database table, query or a statement depending on the DataCommandType property. */
  var DataTableName: java.lang.String
}

