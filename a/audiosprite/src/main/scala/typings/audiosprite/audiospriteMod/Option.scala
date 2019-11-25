package typings.audiosprite.audiospriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var autoplay: js.UndefOr[String | Null] = js.undefined
  var bitrate: js.UndefOr[Double] = js.undefined
  var channels: js.UndefOr[Channels] = js.undefined
  var export: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[ExportType] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var loop: js.UndefOr[js.Array[String]] = js.undefined
  var minlength: js.UndefOr[Double] = js.undefined
  var output: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rawparts: js.UndefOr[String] = js.undefined
  var samplerate: js.UndefOr[Double] = js.undefined
  var silence: js.UndefOr[Double] = js.undefined
  var vbr: js.UndefOr[VBR] = js.undefined
  var `vbr:vorbis`: js.UndefOr[VBR_Vorbis] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    autoplay: String = null,
    bitrate: Int | Double = null,
    channels: Channels = null,
    export: String = null,
    format: ExportType = null,
    gap: Int | Double = null,
    log: LogLevel = null,
    logger: Logger = null,
    loop: js.Array[String] = null,
    minlength: Int | Double = null,
    output: String = null,
    path: String = null,
    rawparts: String = null,
    samplerate: Int | Double = null,
    silence: Int | Double = null,
    vbr: VBR = null,
    `vbr:vorbis`: VBR_Vorbis = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rawparts != null) __obj.updateDynamic("rawparts")(rawparts.asInstanceOf[js.Any])
    if (samplerate != null) __obj.updateDynamic("samplerate")(samplerate.asInstanceOf[js.Any])
    if (silence != null) __obj.updateDynamic("silence")(silence.asInstanceOf[js.Any])
    if (vbr != null) __obj.updateDynamic("vbr")(vbr.asInstanceOf[js.Any])
    if (`vbr:vorbis` != null) __obj.updateDynamic("vbr:vorbis")(`vbr:vorbis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

