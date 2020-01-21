package typings.antDesignPro

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends /* key */ StringDictionary[String] {
  var clear: String
  var emptyText: String
  var viewMore: String
}

object AnonClear {
  @scala.inline
  def apply(
    clear: String,
    emptyText: String,
    viewMore: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], viewMore = viewMore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonClear]
  }
}

