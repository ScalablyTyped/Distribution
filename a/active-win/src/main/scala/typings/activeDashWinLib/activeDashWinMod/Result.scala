package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var bounds: js.UndefOr[activeDashWinLib.Anon_Height] = js.undefined
  var id: scala.Double
  var memoryUsage: js.UndefOr[scala.Double] = js.undefined
  var owner: activeDashWinLib.Anon_BundleId
  var title: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    id: scala.Double,
    owner: activeDashWinLib.Anon_BundleId,
    title: java.lang.String,
    bounds: activeDashWinLib.Anon_Height = null,
    memoryUsage: scala.Int | scala.Double = null
  ): Result = {
    val __obj = js.Dynamic.literal(id = id, owner = owner, title = title)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

