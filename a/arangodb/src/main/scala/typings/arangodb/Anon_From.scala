package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From
  extends /* key */ StringDictionary[js.Any] {
  var _from: js.UndefOr[String] = js.undefined
  var _to: js.UndefOr[String] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _from: String = null,
    _to: String = null
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_from != null) __obj.updateDynamic("_from")(_from)
    if (_to != null) __obj.updateDynamic("_to")(_to)
    __obj.asInstanceOf[Anon_From]
  }
}

