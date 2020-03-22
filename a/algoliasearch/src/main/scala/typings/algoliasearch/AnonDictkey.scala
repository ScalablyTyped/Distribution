package typings.algoliasearch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[String] {
  var default: String
}

object AnonDictkey {
  @scala.inline
  def apply(default: String, StringDictionary: /* key */ StringDictionary[String] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

