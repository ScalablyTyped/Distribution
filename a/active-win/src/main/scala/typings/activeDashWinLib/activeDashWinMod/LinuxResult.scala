package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResult
  extends BaseResult
     with Result {
  var platform: activeDashWinLib.activeDashWinLibStrings.linux
}

object LinuxResult {
  @scala.inline
  def apply(
    bounds: activeDashWinLib.Anon_Height,
    id: scala.Double,
    memoryUsage: scala.Double,
    owner: BaseOwner,
    platform: activeDashWinLib.activeDashWinLibStrings.linux,
    title: java.lang.String
  ): LinuxResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, memoryUsage = memoryUsage, owner = owner, platform = platform, title = title)
  
    __obj.asInstanceOf[LinuxResult]
  }
}

