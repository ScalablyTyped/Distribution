package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsResult
  extends BaseResult
     with Result {
  var platform: activeDashWinLib.activeDashWinLibStrings.windows
}

object WindowsResult {
  @scala.inline
  def apply(
    bounds: activeDashWinLib.Anon_Height,
    id: scala.Double,
    memoryUsage: scala.Double,
    owner: BaseOwner,
    platform: activeDashWinLib.activeDashWinLibStrings.windows,
    title: java.lang.String
  ): WindowsResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, memoryUsage = memoryUsage, owner = owner, platform = platform, title = title)
  
    __obj.asInstanceOf[WindowsResult]
  }
}

