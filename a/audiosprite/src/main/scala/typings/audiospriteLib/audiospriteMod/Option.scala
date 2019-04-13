package typings
package audiospriteLib.audiospriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var autoplay: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  var channels: js.UndefOr[Channels] = js.undefined
  var export: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[ExportType] = js.undefined
  var gap: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var loop: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var minlength: js.UndefOr[scala.Double] = js.undefined
  var output: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var rawparts: js.UndefOr[java.lang.String] = js.undefined
  var samplerate: js.UndefOr[scala.Double] = js.undefined
  var silence: js.UndefOr[scala.Double] = js.undefined
  var vbr: js.UndefOr[VBR] = js.undefined
  var `vbr:vorbis`: js.UndefOr[VBR_Vorbis] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    autoplay: java.lang.String = null,
    bitrate: scala.Int | scala.Double = null,
    channels: Channels = null,
    export: java.lang.String = null,
    format: ExportType = null,
    gap: scala.Int | scala.Double = null,
    log: LogLevel = null,
    logger: Logger = null,
    loop: js.Array[java.lang.String] = null,
    minlength: scala.Int | scala.Double = null,
    output: java.lang.String = null,
    path: java.lang.String = null,
    rawparts: java.lang.String = null,
    samplerate: scala.Int | scala.Double = null,
    silence: scala.Int | scala.Double = null,
    vbr: VBR = null,
    `vbr:vorbis`: VBR_Vorbis = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (export != null) __obj.updateDynamic("export")(export)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (loop != null) __obj.updateDynamic("loop")(loop)
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (path != null) __obj.updateDynamic("path")(path)
    if (rawparts != null) __obj.updateDynamic("rawparts")(rawparts)
    if (samplerate != null) __obj.updateDynamic("samplerate")(samplerate.asInstanceOf[js.Any])
    if (silence != null) __obj.updateDynamic("silence")(silence.asInstanceOf[js.Any])
    if (vbr != null) __obj.updateDynamic("vbr")(vbr)
    if (`vbr:vorbis` != null) __obj.updateDynamic("vbr:vorbis")(`vbr:vorbis`)
    __obj.asInstanceOf[Option]
  }
}

