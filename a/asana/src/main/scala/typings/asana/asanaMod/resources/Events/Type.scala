package typings.asana.asanaMod.resources.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var data: js.UndefOr[js.Array[EventDataEntity]] = js.undefined
  var errors: js.UndefOr[js.Array[EventError]] = js.undefined
  var sync: String
}

object Type {
  @scala.inline
  def apply(sync: String, data: js.Array[EventDataEntity] = null, errors: js.Array[EventError] = null): Type = {
    val __obj = js.Dynamic.literal(sync = sync)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Type]
  }
}

