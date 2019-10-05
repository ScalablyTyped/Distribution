package typings.args.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: String
  var init: js.UndefOr[OptionInitFunction] = js.undefined
  var name: String | (js.Tuple2[String, String])
}

object Option {
  @scala.inline
  def apply(
    description: String,
    name: String | (js.Tuple2[String, String]),
    defaultValue: js.Any = null,
    init: /* value */ js.Any => js.Any = null
  ): Option = {
    val __obj = js.Dynamic.literal(description = description, name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[Option]
  }
}

