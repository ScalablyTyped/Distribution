package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertResult[T /* <: js.Object */] extends DocumentMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
}

object InsertResult {
  @scala.inline
  def apply[T /* <: js.Object */](_id: java.lang.String, _key: java.lang.String, _rev: java.lang.String, `new`: Document[T] = null): InsertResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_key")(_key)
    __obj.updateDynamic("_rev")(_rev)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[InsertResult[T]]
  }
}

