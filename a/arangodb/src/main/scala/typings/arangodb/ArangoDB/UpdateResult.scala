package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
  var old: js.UndefOr[Document[T]] = js.undefined
}

object UpdateResult {
  @scala.inline
  def apply[/* <: js.Object */ T](
    _id: String,
    _key: String,
    _oldRev: String,
    _rev: String,
    `new`: Document[T] = null,
    old: Document[T] = null
  ): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    if (`new` != null) __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    if (old != null) __obj.updateDynamic("old")(old.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[T]]
  }
}

