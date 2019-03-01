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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_key")(_key)
    __obj.updateDynamic("_oldRev")(_oldRev)
    __obj.updateDynamic("_rev")(_rev)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    if (old != null) __obj.updateDynamic("old")(old)
    __obj.asInstanceOf[UpdateResult[T]]
  }
}

