package typings.activeDashWin.activeDashWinMod

import typings.activeDashWin.Anon_Height
import typings.activeDashWin.activeDashWinStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsResult
  extends BaseResult
     with Result {
  var platform: windows
}

object WindowsResult {
  @scala.inline
  def apply(
    bounds: Anon_Height,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: windows,
    title: String
  ): WindowsResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowsResult]
  }
}

