package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var objectmode: js.UndefOr[scala.Boolean] = js.undefined
  var readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
  var writeableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectmode: js.UndefOr[scala.Boolean] = js.undefined,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    writeableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectmode)) __obj.updateDynamic("objectmode")(objectmode)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (!js.isUndefined(writeableObjectMode)) __obj.updateDynamic("writeableObjectMode")(writeableObjectMode)
    __obj.asInstanceOf[TransformOptions]
  }
}

