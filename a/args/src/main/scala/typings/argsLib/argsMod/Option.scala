package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: java.lang.String
  var init: js.UndefOr[argsLib.OptionInitFunction] = js.undefined
  var name: java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
}

object Option {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String | (js.Tuple2[java.lang.String, java.lang.String]),
    defaultValue: js.Any = null,
    init: argsLib.OptionInitFunction = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (init != null) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[Option]
  }
}

