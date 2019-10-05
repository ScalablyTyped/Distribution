package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T /* <: js.Object */] extends js.Object {
  var code: Double
  var deduplicate: Boolean
  var fields: js.Array[String]
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
  def apply[T /* <: js.Object */](
    code: Double,
    deduplicate: Boolean,
    fields: js.Array[String],
    id: String,
    isNewlyCreated: Boolean,
    name: String,
    selectivityEstimate: Double,
    sparse: Boolean,
    `type`: IndexType,
    unique: Boolean
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code, deduplicate = deduplicate, fields = fields, id = id, isNewlyCreated = isNewlyCreated, name = name, selectivityEstimate = selectivityEstimate, sparse = sparse, unique = unique)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Index[T]]
  }
}

