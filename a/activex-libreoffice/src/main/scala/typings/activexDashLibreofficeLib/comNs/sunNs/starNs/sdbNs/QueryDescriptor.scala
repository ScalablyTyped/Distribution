package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stored definition of a SQL "Select statement".
  *
  * It can be used, if there is a need to execute SQL statement more than once or if you want to format the query result fields different from the
  * underlying table definitions.
  */
trait QueryDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Descriptor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
     with DataSettings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier {
  /** is the command of the query, this is typically a select statement. */
  var Command: java.lang.String
  /** should we use escape processing for the query. */
  var EscapeProcessing: scala.Boolean
  /** is the name of the update table catalog. */
  var UpdateCatalogName: java.lang.String
  /** is the name of the update table schema. */
  var UpdateSchemaName: java.lang.String
  /** is the name of the table which should be updated. This is usually used for queries which relate on more than one table. */
  var UpdateTableName: java.lang.String
}

