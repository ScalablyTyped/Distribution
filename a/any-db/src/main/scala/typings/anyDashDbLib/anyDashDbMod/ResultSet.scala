package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  /**
    * Not supported by all drivers.
    */
  var affectedRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Not supported by all drivers.
    */
  var changedRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Not supported by all drivers.
    */
  var fieldCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Result field descriptions
    */
  var fields: js.Array[Field]
  /**
    * Not supported by all drivers.
    */
  var lastInsertId: js.UndefOr[js.Any] = js.undefined
  /**
    * Affected rows. Note e.g. for INSERT queries the rows property is not filled even
    * though rowCount is non-zero.
    */
  var rowCount: scala.Double
  /**
    * Result rows
    */
  var rows: js.Array[_]
}

