package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.fieldmasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link Database} field master.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait Database
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextFieldMaster {
  /** contains the CommandType this can be the name of a data base table, a data query or a statement. (0 = table, 1 = query, 2 = statement) */
  var CommandType: scala.Double
  /** specifies the database name. */
  var DataBaseName: java.lang.String
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: java.lang.String
  /**
    * indicates the URL of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: java.lang.String
  /** contains the name of the data base table. */
  var DataColumnName: java.lang.String
  /** contains the command string. Depending on the CommandType property this can be the name of a data base table, a data query or a statement. */
  var DataTableName: java.lang.String
}

