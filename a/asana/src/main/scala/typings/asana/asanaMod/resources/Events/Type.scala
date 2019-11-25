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
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

