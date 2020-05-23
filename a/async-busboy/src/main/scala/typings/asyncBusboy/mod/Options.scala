package typings.asyncBusboy.mod

import typings.busboy.anon.FieldNameSize
import typings.busboy.busboy.BusboyConfig
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends BusboyConfig {
  def onFile(fieldname: String, file: ReadableStream, filename: String, encoding: String, mimetype: String): Unit
}

object Options {
  @scala.inline
  def apply(
    onFile: (String, ReadableStream, String, String, String) => Unit,
    defCharset: String = null,
    fileHwm: js.UndefOr[Double] = js.undefined,
    headers: js.Any = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    limits: FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(onFile = js.Any.fromFunction5(onFile))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(fileHwm)) __obj.updateDynamic("fileHwm")(fileHwm.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

