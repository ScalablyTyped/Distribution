package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDescription[T] extends js.Object {
  var deduplicate: js.UndefOr[Boolean] = js.undefined
  var expireAfter: js.UndefOr[Double] = js.undefined
  var fields: js.Array[String]
  var sparse: js.UndefOr[Boolean] = js.undefined
  var `type`: IndexType
  var unique: js.UndefOr[Boolean] = js.undefined
}

object IndexDescription {
  @scala.inline
  def apply[T](
    fields: js.Array[String],
    `type`: IndexType,
    deduplicate: js.UndefOr[Boolean] = js.undefined,
    expireAfter: Int | Double = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deduplicate)) __obj.updateDynamic("deduplicate")(deduplicate.asInstanceOf[js.Any])
    if (expireAfter != null) __obj.updateDynamic("expireAfter")(expireAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
}

