package typings
package authmosphereLib.libSrcTypesMockOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptions extends js.Object {
  var times: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

object MockOptions {
  @scala.inline
  def apply(url: java.lang.String, times: scala.Int | scala.Double = null): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptions]
  }
}

