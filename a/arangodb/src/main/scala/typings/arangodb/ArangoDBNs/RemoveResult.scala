package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResult[T /* <: js.Object */] extends DocumentMetadata {
  var old: js.UndefOr[Document[T]] = js.undefined
}

object RemoveResult {
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String, old: Document[T] = null): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _rev = _rev)
    if (old != null) __obj.updateDynamic("old")(old)
    __obj.asInstanceOf[RemoveResult[T]]
  }
}

