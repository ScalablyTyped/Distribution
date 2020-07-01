package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T /* <: js.Object */] extends js.Object {
  var code: Double
  var deduplicate: Boolean
  var expireAfter: js.UndefOr[Double] = js.undefined
  var fields: js.Array[/* keyof T */ String]
  var id: String
  var isNewlyCreated: Boolean
  var name: String
  var selectivityEstimate: Double
  var sparse: Boolean
  var `type`: IndexType
  var unique: Boolean
}

object Index {
  @scala.inline
  def apply[/* <: js.Object */ T](
    code: Double,
    deduplicate: Boolean,
    fields: js.Array[/* keyof T */ String],
    id: String,
    isNewlyCreated: Boolean,
    name: String,
    selectivityEstimate: Double,
    sparse: Boolean,
    `type`: IndexType,
    unique: Boolean,
    expireAfter: js.UndefOr[Double] = js.undefined
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deduplicate = deduplicate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNewlyCreated = isNewlyCreated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectivityEstimate = selectivityEstimate.asInstanceOf[js.Any], sparse = sparse.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(expireAfter)) __obj.updateDynamic("expireAfter")(expireAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
}

