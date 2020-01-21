package typings.activeWin.mod

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
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MacOSOwner]
  }
}

