package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolution extends js.Object {
  /**
    * The screen resolution's height, expressed in pixels.
    */
  var height: js.UndefOr[Integer] = js.undefined
  /**
    * The screen resolution's width, expressed in pixels.
    */
  var width: js.UndefOr[Integer] = js.undefined
}

object Resolution {
  @scala.inline
  def apply(height: Int | scala.Double = null, width: Int | scala.Double = null): Resolution = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
}

