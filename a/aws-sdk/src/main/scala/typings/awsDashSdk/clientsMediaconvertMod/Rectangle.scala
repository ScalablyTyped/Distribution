package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  /**
    * Height of rectangle in pixels. Specify only even numbers.
    */
  var Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined
  /**
    * Width of rectangle in pixels. Specify only even numbers.
    */
  var Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined
  /**
    * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
    */
  var X: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
    */
  var Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined
}

object Rectangle {
  @scala.inline
  def apply(
    Height: Int | Double = null,
    Width: Int | Double = null,
    X: Int | Double = null,
    Y: Int | Double = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    if (X != null) __obj.updateDynamic("X")(X.asInstanceOf[js.Any])
    if (Y != null) __obj.updateDynamic("Y")(Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

