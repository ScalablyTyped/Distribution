package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null
  ): Data = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Data]
  }
}

