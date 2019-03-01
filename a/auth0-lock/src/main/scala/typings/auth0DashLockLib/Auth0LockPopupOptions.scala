package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockPopupOptions extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object Auth0LockPopupOptions {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Auth0LockPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Auth0LockPopupOptions]
  }
}

