package typings.activeDashWin.activeDashWinMod

import typings.activeDashWin.Anon_Height
import typings.activeDashWin.activeDashWinStrings.linux
import typings.activeDashWin.activeDashWinStrings.macos
import typings.activeDashWin.activeDashWinStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activeDashWin.activeDashWinMod.MacOSResult
  - typings.activeDashWin.activeDashWinMod.LinuxResult
  - typings.activeDashWin.activeDashWinMod.WindowsResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def MacOSResult(
    bounds: Anon_Height,
    id: Double,
    memoryUsage: Double,
    owner: MacOSOwner,
    platform: macos,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def LinuxResult(
    bounds: Anon_Height,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: linux,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def WindowsResult(
    bounds: Anon_Height,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: windows,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

