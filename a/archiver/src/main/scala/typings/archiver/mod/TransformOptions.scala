package typings.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectmode: js.UndefOr[Boolean] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  var writeableObjectMode: js.UndefOr[Boolean] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    objectmode: js.UndefOr[Boolean] = js.undefined,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    writeableObjectMode: js.UndefOr[Boolean] = js.undefined
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectmode)) __obj.updateDynamic("objectmode")(objectmode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeableObjectMode)) __obj.updateDynamic("writeableObjectMode")(writeableObjectMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

