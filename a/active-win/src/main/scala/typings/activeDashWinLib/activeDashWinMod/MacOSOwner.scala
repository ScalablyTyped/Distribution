package typings
package activeDashWinLib.activeDashWinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSOwner extends BaseOwner {
  /**
  		Bundle identifier.
  		*/
  var bundleId: scala.Double
}

object MacOSOwner {
  @scala.inline
  def apply(bundleId: scala.Double, name: java.lang.String, path: java.lang.String, processId: scala.Double): MacOSOwner = {
    val __obj = js.Dynamic.literal(bundleId = bundleId, name = name, path = path, processId = processId)
  
    __obj.asInstanceOf[MacOSOwner]
  }
}

