package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify a table in a database. A table is described by its name and one or more columns.
  *
  * In addition, it may contain indexes to improve the performance in the retrieval of the table's data and keys, and to define semantic rules for the
  * table.
  *
  * ** Note: ** All properties and columns of a table could by modified before it is appended to a database. In that case, the service is in fact a
  * descriptor. On existing tables, a user might alter columns, add or delete columns, indexes, and keys depending on the capabilities of the database and
  * on the user's privileges.
  * @see com.sun.star.sdbc.XDatabaseMetaData
  * @see com.sun.star.sdbcx.Privilege
  */
trait Table
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with XIndexesSupplier
     with XKeysSupplier
     with XRename
     with XAlterTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name of the table catalog. */
  var CatalogName: java.lang.String
  /** supplies a comment on the table. Could be empty, if not supported by the driver. */
  var Description: java.lang.String
  /** is the name of the table. */
  var Name: java.lang.String
  /** is the name of the table schema. */
  var SchemaName: java.lang.String
  /** indicates the type of the table like (TABLE, VIEW, SYSTEM TABLE). Could be empty, if not supported by the driver. */
  var Type: java.lang.String
}

