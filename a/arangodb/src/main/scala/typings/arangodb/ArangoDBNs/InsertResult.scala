package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertResult[T /* <: js.Object */] extends DocumentMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
}

object InsertResult {
  @scala.inline
  def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String, `new`: Document[T] = null): InsertResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _rev = _rev)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[InsertResult[T]]
  }
}

