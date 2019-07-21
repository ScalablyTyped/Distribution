package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSResult
  extends BaseResult
     with Result {
  @JSName("owner")
  var owner_MacOSResult: MacOSOwner
  var platform: activeDashWinLib.activeDashWinLibStrings.macos
}

object MacOSResult {
  @scala.inline
  def apply(
    bounds: activeDashWinLib.Anon_Height,
    id: scala.Double,
    memoryUsage: scala.Double,
    owner: MacOSOwner,
    platform: activeDashWinLib.activeDashWinLibStrings.macos,
    title: java.lang.String
  ): MacOSResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, memoryUsage = memoryUsage, owner = owner, platform = platform, title = title)
  
    __obj.asInstanceOf[MacOSResult]
  }
}

