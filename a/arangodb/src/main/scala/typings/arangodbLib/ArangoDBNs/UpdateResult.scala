package typings
package arangodbLib.ArangoDBNs

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
    _id: java.lang.String,
    _key: java.lang.String,
    _oldRev: java.lang.String,
    _rev: java.lang.String,
    `new`: Document[T] = null,
    old: Document[T] = null
  ): UpdateResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _oldRev = _oldRev, _rev = _rev)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    if (old != null) __obj.updateDynamic("old")(old)
    __obj.asInstanceOf[UpdateResult[T]]
  }
}

