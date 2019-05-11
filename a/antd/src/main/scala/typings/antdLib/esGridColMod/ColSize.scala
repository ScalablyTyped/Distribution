package typings
package antdLib.esGridColMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColSize extends js.Object {
  var offset: js.UndefOr[ColSpanType] = js.undefined
  var order: js.UndefOr[ColSpanType] = js.undefined
  var pull: js.UndefOr[ColSpanType] = js.undefined
  var push: js.UndefOr[ColSpanType] = js.undefined
  var span: js.UndefOr[ColSpanType] = js.undefined
}

object ColSize {
  @scala.inline
  def apply(
    offset: ColSpanType = null,
    order: ColSpanType = null,
    pull: ColSpanType = null,
    push: ColSpanType = null,
    span: ColSpanType = null
  ): ColSize = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColSize]
  }
}

