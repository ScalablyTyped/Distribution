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
    Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
    Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
    X: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height)
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width)
    if (!js.isUndefined(X)) __obj.updateDynamic("X")(X)
    if (!js.isUndefined(Y)) __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Rectangle]
  }
}

