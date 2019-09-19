package typings.appleDashMapkitDashJs.mapkitNs

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
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): PaddingConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingConstructorOptions]
  }
}

