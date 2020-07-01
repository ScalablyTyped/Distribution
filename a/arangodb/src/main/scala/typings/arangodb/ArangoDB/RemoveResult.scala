package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResult[T /* <: js.Object */] extends DocumentMetadata {
  var old: js.UndefOr[Document[T]] = js.undefined
}

object RemoveResult {
  @scala.inline
  def apply[/* <: js.Object */ T](_id: String, _key: String, _rev: String, old: Document[T] = null): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    if (old != null) __obj.updateDynamic("old")(old.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResult[T]]
  }
}

