package typings.audiosprite.mod

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
  @JSName("vbr:vorbis")
  var vbrColonvorbis: js.UndefOr[VBRVorbis] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Null | String] = js.undefined,
    bitrate: js.UndefOr[Double] = js.undefined,
    channels: Channels = null,
    export: String = null,
    format: js.UndefOr[Null | ExportType] = js.undefined,
    gap: js.UndefOr[Double] = js.undefined,
    log: LogLevel = null,
    logger: Logger = null,
    loop: js.Array[String] = null,
    minlength: js.UndefOr[Double] = js.undefined,
    output: String = null,
    path: String = null,
    rawparts: String = null,
    samplerate: js.UndefOr[Double] = js.undefined,
    silence: js.UndefOr[Double] = js.undefined,
    vbr: VBR = null,
    vbrColonvorbis: VBRVorbis = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(minlength)) __obj.updateDynamic("minlength")(minlength.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rawparts != null) __obj.updateDynamic("rawparts")(rawparts.asInstanceOf[js.Any])
    if (!js.isUndefined(samplerate)) __obj.updateDynamic("samplerate")(samplerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silence)) __obj.updateDynamic("silence")(silence.get.asInstanceOf[js.Any])
    if (vbr != null) __obj.updateDynamic("vbr")(vbr.asInstanceOf[js.Any])
    if (vbrColonvorbis != null) __obj.updateDynamic("vbr:vorbis")(vbrColonvorbis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

