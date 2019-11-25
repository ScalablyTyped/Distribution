package typings.activeDashWin.activeDashWinMod

import typings.activeDashWin.Anon_Height
import typings.activeDashWin.activeDashWinStrings.macos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSResult
  extends BaseResult
     with Result {
  @JSName("owner")
  var owner_MacOSResult: MacOSOwner
  var platform: macos
}

object MacOSResult {
  @scala.inline
  def apply(
    bounds: Anon_Height,
    id: Double,
    memoryUsage: Double,
    owner: MacOSOwner,
    platform: macos,
    title: String
  ): MacOSResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MacOSResult]
  }
}

