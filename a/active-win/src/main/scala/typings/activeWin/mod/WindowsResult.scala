package typings.activeWin.mod

import typings.activeWin.activeWinStrings.windows
import typings.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsResult
  extends BaseResult
     with Result {
  var platform: windows = js.native
}

object WindowsResult {
  @scala.inline
  def apply(
    bounds: Height,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: windows,
    title: String
  ): WindowsResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsResult]
  }
  @scala.inline
  implicit class WindowsResultOps[Self <: WindowsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlatform(value: windows): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

