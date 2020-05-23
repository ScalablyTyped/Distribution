package typings.algoliasearch.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  var default: String
}

object Dictkey {
  @scala.inline
  def apply(default: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictkey = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

