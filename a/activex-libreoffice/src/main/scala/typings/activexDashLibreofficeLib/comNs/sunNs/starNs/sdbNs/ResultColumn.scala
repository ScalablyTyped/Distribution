package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a column of a result set. */
trait ResultColumn
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Column
     with ColumnSettings {
  /** gets a column's table's catalog name. */
  var CatalogName: java.lang.String
  /** indicates the column's normal max width in chars. */
  var DisplaySize: scala.Double
  /** indicates that a column is case sensitive. */
  var IsCaseSensitive: scala.Boolean
  /** indicates whether a write on the column will definitely succeed. */
  var IsDefinitelyWritable: scala.Boolean
  /** indicates whether a column is definitely, not writable. */
  var IsReadOnly: scala.Boolean
  /** indicates whether the column can be used in a Where clause. */
  var IsSearchable: scala.Boolean
  /** indicates whether values in the column are signed numbers. */
  var IsSigned: scala.Boolean
  /** indicates whether it is possible for a write on the column to succeed. */
  var IsWritable: scala.Boolean
  /** gets the suggested column title for use in printouts and displays. */
  var Label: java.lang.String
  /** gets a column's schema name. */
  var SchemaName: java.lang.String
  /**
    * returns the fully-qualified name of the service whose instances are manufactured if the method {@link com.sun.star.sdbc.XRow.getObject} )= is called
    * to retrieve a value from the column.
    */
  var ServiceName: java.lang.String
  /** gets a column's table name. */
  var TableName: java.lang.String
}

