package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a table of a database. A table is described by its name and one or more columns and the keys for semantic rules.
  *
  * In addition, it may contain keys, and to define semantic rules for the table. ** Note: ** Indexes can only be appended when the table is already
  * appended at the database.
  * @see com.sun.star.sdbcx.Table
  */
trait TableDescriptor
  extends Descriptor
     with XColumnsSupplier
     with XKeysSupplier {
  /** is the name of the table catalog. */
  var CatalogName: java.lang.String
  /** supplies a comment on the table, Could be empty if not supported by the driver. */
  var Description: java.lang.String
  /** is the name of the table schema. */
  var SchemaName: java.lang.String
}

