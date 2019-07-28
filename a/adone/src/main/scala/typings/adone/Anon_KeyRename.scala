package typings.adone

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyRename
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Whether to rename files, adds corresponding extname
    */
  var rename: js.UndefOr[Boolean] = js.undefined
}

object Anon_KeyRename {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    rename: js.UndefOr[Boolean] = js.undefined
  ): Anon_KeyRename = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename)
    __obj.asInstanceOf[Anon_KeyRename]
  }
}

