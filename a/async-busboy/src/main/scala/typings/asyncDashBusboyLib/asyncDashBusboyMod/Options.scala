package typings
package asyncDashBusboyLib.asyncDashBusboyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends busboyLib.busboyNs.BusboyConfig {
  def onFile(
    fieldname: java.lang.String,
    file: nodeLib.NodeJSNs.ReadableStream,
    filename: java.lang.String,
    encoding: java.lang.String,
    mimetype: java.lang.String
  ): scala.Unit
}

object Options {
  @scala.inline
  def apply(
    onFile: js.Function5[
      java.lang.String, 
      nodeLib.NodeJSNs.ReadableStream, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    defCharset: java.lang.String = null,
    fileHwm: scala.Int | scala.Double = null,
    headers: js.Any = null,
    highWaterMark: scala.Int | scala.Double = null,
    limits: busboyLib.Anon_FieldNameSize = null,
    preservePath: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(onFile = onFile)
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    __obj.asInstanceOf[Options]
  }
}

