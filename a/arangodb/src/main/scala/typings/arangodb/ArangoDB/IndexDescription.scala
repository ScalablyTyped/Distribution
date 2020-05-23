package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDescription[T] extends js.Object {
  var deduplicate: js.UndefOr[Boolean] = js.undefined
  var expireAfter: js.UndefOr[Double] = js.undefined
  var fields: js.Array[/* keyof T */ String]
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var sparse: js.UndefOr[Boolean] = js.undefined
  var `type`: IndexType
  var unique: js.UndefOr[Boolean] = js.undefined
}

object IndexDescription {
  @scala.inline
  def apply[T](
    fields: js.Array[/* keyof T */ String],
    `type`: IndexType,
    deduplicate: js.UndefOr[Boolean] = js.undefined,
    expireAfter: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): IndexDescription[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deduplicate)) __obj.updateDynamic("deduplicate")(deduplicate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expireAfter)) __obj.updateDynamic("expireAfter")(expireAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDescription[T]]
  }
}

