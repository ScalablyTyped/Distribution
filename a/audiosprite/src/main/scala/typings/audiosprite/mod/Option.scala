package typings.audiosprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var autoplay: js.UndefOr[String | Null] = js.native
  var bitrate: js.UndefOr[Double] = js.native
  var channels: js.UndefOr[Channels] = js.native
  var export: js.UndefOr[String] = js.native
  var format: js.UndefOr[ExportType] = js.native
  var gap: js.UndefOr[Double] = js.native
  var log: js.UndefOr[LogLevel] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var loop: js.UndefOr[js.Array[String]] = js.native
  var minlength: js.UndefOr[Double] = js.native
  var output: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var rawparts: js.UndefOr[String] = js.native
  var samplerate: js.UndefOr[Double] = js.native
  var silence: js.UndefOr[Double] = js.native
  var vbr: js.UndefOr[VBR] = js.native
  @JSName("vbr:vorbis")
  var vbrColonvorbis: js.UndefOr[VBRVorbis] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoplay(value: String): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setAutoplayNull: Self = this.set("autoplay", null)
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setChannels(value: Channels): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setExport(value: String): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    @scala.inline
    def setFormat(value: ExportType): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setLog(value: LogLevel): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLoopVarargs(value: String*): Self = this.set("loop", js.Array(value :_*))
    @scala.inline
    def setLoop(value: js.Array[String]): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMinlength(value: Double): Self = this.set("minlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRawparts(value: String): Self = this.set("rawparts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawparts: Self = this.set("rawparts", js.undefined)
    @scala.inline
    def setSamplerate(value: Double): Self = this.set("samplerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplerate: Self = this.set("samplerate", js.undefined)
    @scala.inline
    def setSilence(value: Double): Self = this.set("silence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilence: Self = this.set("silence", js.undefined)
    @scala.inline
    def setVbr(value: VBR): Self = this.set("vbr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbr: Self = this.set("vbr", js.undefined)
    @scala.inline
    def setVbrColonvorbis(value: VBRVorbis): Self = this.set("vbr:vorbis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbrColonvorbis: Self = this.set("vbr:vorbis", js.undefined)
  }
  
}

