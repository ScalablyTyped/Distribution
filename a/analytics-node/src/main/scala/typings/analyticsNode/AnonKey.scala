package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  var library: AnonName
}

object AnonKey {
  @scala.inline
  def apply(library: AnonName, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonKey = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

