package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingConstructorOptions extends js.Object {
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  var top: js.UndefOr[Double] = js.undefined
}

object PaddingConstructorOptions {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): PaddingConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingConstructorOptions]
  }
}

