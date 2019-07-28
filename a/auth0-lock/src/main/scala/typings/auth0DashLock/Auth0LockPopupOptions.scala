package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockPopupOptions extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object Auth0LockPopupOptions {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Auth0LockPopupOptions = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Auth0LockPopupOptions]
  }
}

