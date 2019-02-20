package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a new index for a database table.
  * @see com.sun.star.sdbcx.Index
  */
trait IndexDescriptor
  extends Descriptor
     with XColumnsSupplier {
  /** is the name of the index catalog, may be empty. */
  var Catalog: java.lang.String
  /** indicates that the index is clustered. */
  var IsClustered: scala.Boolean
  /** indicates that the index allow only unique values. */
  var IsUnique: scala.Boolean
}

