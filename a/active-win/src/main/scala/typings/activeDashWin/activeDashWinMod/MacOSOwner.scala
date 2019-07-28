package typings.activeDashWin.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSOwner extends BaseOwner {
  /**
  		Bundle identifier.
  		*/
  var bundleId: Double
}

object MacOSOwner {
  @scala.inline
  def apply(bundleId: Double, name: String, path: String, processId: Double): MacOSOwner = {
    val __obj = js.Dynamic.literal(bundleId = bundleId, name = name, path = path, processId = processId)
  
    __obj.asInstanceOf[MacOSOwner]
  }
}

