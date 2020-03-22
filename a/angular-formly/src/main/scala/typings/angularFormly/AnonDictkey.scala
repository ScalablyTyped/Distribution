package typings.angularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var attribute: js.UndefOr[js.Any] = js.undefined
  var bound: js.UndefOr[js.Any] = js.undefined
  var expression: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    attribute: js.Any = null,
    bound: js.Any = null,
    expression: js.Any = null,
    value: js.Any = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (bound != null) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

