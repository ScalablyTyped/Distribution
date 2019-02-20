package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a new view for a database.
  * @see com.sun.star.sdbcx.View
  */
trait ViewDescriptor extends Descriptor {
  /** is the name of the views catalog, may be empty. */
  var CatalogName: java.lang.String
  /**
    * indicates if a check option should be used for the view.
    * @see com.sun.star.sdbcx.CheckOption
    */
  var CheckOption: scala.Double
  /** is the command for creating the view. After appending a view to its container, the command may be empty. This is typically a SQL Select-Statement. */
  var Command: java.lang.String
  /** is the name of the views schema, may be empty. */
  var SchemaName: java.lang.String
}

