package typings.activeWin.mod

import typings.activeWin.activeWinStrings.macos
import typings.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSResult
  extends BaseResult
     with Result {
  @JSName("owner")
  var owner_MacOSResult: MacOSOwner
  var platform: macos
  /**
  		URL of the active browser tab if the active window is Safari, Chrome, Edge, or Brave.
  		*/
  var url: js.UndefOr[String] = js.undefined
}

object MacOSResult {
  @scala.inline
  def apply(
    bounds: Height,
    id: Double,
    memoryUsage: Double,
    owner: MacOSOwner,
    platform: macos,
    title: String,
    url: String = null
  ): MacOSResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSResult]
  }
}

