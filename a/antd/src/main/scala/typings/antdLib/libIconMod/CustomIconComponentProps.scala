package typings
package antdLib.libIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIconComponentProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fill: java.lang.String
  var height: java.lang.String | scala.Double
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: java.lang.String | scala.Double
}

object CustomIconComponentProps {
  @scala.inline
  def apply(
    fill: java.lang.String,
    height: java.lang.String | scala.Double,
    width: java.lang.String | scala.Double,
    className: java.lang.String = null,
    rotate: scala.Int | scala.Double = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    viewBox: java.lang.String = null
  ): CustomIconComponentProps = {
    val __obj = js.Dynamic.literal(fill = fill, height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (style != null) __obj.updateDynamic("style")(style)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[CustomIconComponentProps]
  }
}

