package typings.angularDashFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute
  extends /* key */ StringDictionary[js.Any] {
  var attribute: js.UndefOr[js.Any] = js.undefined
  var bound: js.UndefOr[js.Any] = js.undefined
  var expression: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_Attribute {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    attribute: js.Any = null,
    bound: js.Any = null,
    expression: js.Any = null,
    value: js.Any = null
  ): Anon_Attribute = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (bound != null) __obj.updateDynamic("bound")(bound)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

