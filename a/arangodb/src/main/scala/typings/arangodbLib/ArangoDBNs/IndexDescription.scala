package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDescription[T] extends js.Object {
  var deduplicate: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.Array[java.lang.String]
  var sparse: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: IndexType
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object IndexDescription {
  @scala.inline
  def apply[T](
    fields: js.Array[java.lang.String],
    `type`: IndexType,
    deduplicate: js.UndefOr[scala.Boolean] = js.undefined,
    sparse: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(deduplicate)) __obj.updateDynamic("deduplicate")(deduplicate)
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[IndexDescription[T]]
  }
}

