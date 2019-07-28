package typings.asyncDashBusboy.asyncDashBusboyMod

import typings.busboy.Anon_FieldNameSize
import typings.busboy.busboyNs.BusboyConfig
import typings.node.NodeJSNs.ReadableStream
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
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    limits: Anon_FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(onFile = js.Any.fromFunction5(onFile))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    __obj.asInstanceOf[Options]
  }
}

