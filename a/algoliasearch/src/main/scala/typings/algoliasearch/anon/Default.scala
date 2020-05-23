package typings.algoliasearch.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default
  extends /* key */ StringDictionary[js.Array[String]] {
  var default: js.Array[String]
}

object Default {
  @scala.inline
  def apply(default: js.Array[String], StringDictionary: /* key */ StringDictionary[js.Array[String]] = null): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Default]
  }
}

