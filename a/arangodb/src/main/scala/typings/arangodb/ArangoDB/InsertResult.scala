package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertResult[T /* <: js.Object */] extends DocumentMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
}

object InsertResult {
  @scala.inline
  def apply[T](_id: String, _key: String, _rev: String, `new`: Document[T] = null): InsertResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    if (`new` != null) __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertResult[T]]
  }
}

