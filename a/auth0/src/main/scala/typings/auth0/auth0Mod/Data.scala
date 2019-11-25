package typings.auth0.auth0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data
  extends /* propName */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(StringDictionary: /* propName */ StringDictionary[js.Any] = null, name: String = null): Data = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

