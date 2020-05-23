package typings.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  var clear: String
  var emptyText: String
  var viewMore: String
}

object Dictkey {
  @scala.inline
  def apply(
    clear: String,
    emptyText: String,
    viewMore: String,
    StringDictionary: /* name */ StringDictionary[String] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], viewMore = viewMore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

