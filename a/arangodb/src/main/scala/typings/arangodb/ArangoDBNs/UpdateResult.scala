package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
  var old: js.UndefOr[Document[T]] = js.undefined
}

object UpdateResult {
  @scala.inline
  def apply[T /* <: js.Object */](
    _id: String,
    _key: String,
    _oldRev: String,
    _rev: String,
    `new`: Document[T] = null,
    old: Document[T] = null
  ): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _oldRev = _oldRev, _rev = _rev)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    if (old != null) __obj.updateDynamic("old")(old)
    __obj.asInstanceOf[UpdateResult[T]]
  }
}

