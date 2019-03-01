package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyRename
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Whether to rename files, adds corresponding extname
    */
  var rename: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_KeyRename {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rename: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_KeyRename = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename)
    __obj.asInstanceOf[Anon_KeyRename]
  }
}

