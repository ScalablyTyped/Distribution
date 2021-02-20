package typings.audiosprite

import org.scalablytyped.runtime.StringDictionary
import typings.audiosprite.anon.End
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("audiosprite", JSImport.Namespace)
  @js.native
  def apply(files: js.Array[String], callback: js.Function2[/* error */ Error, /* obj */ Result, Unit]): Unit = js.native
  @JSImport("audiosprite", JSImport.Namespace)
  @js.native
  def apply(
    files: js.Array[String],
    option: Option,
    callback: js.Function2[/* error */ Error, /* obj */ Result, Unit]
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteNumbers.`1`
    - typings.audiosprite.audiospriteNumbers.`2`
  */
  trait Channels extends StObject
  object Channels {
    
    @scala.inline
    def `1`: typings.audiosprite.audiospriteNumbers.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteNumbers.`1`]
    
    @scala.inline
    def `2`: typings.audiosprite.audiospriteNumbers.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteNumbers.`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteStrings.jukebox
    - typings.audiosprite.audiospriteStrings.howler
    - typings.audiosprite.audiospriteStrings.createjs
    - scala.Null
  */
  type ExportType = _ExportType | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteStrings.debug
    - typings.audiosprite.audiospriteStrings.info
    - typings.audiosprite.audiospriteStrings.notice
    - typings.audiosprite.audiospriteStrings.warning
    - typings.audiosprite.audiospriteStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typings.audiosprite.audiospriteStrings.debug = "debug".asInstanceOf[typings.audiosprite.audiospriteStrings.debug]
    
    @scala.inline
    def error: typings.audiosprite.audiospriteStrings.error = "error".asInstanceOf[typings.audiosprite.audiospriteStrings.error]
    
    @scala.inline
    def info: typings.audiosprite.audiospriteStrings.info = "info".asInstanceOf[typings.audiosprite.audiospriteStrings.info]
    
    @scala.inline
    def notice: typings.audiosprite.audiospriteStrings.notice = "notice".asInstanceOf[typings.audiosprite.audiospriteStrings.notice]
    
    @scala.inline
    def warning: typings.audiosprite.audiospriteStrings.warning = "warning".asInstanceOf[typings.audiosprite.audiospriteStrings.warning]
  }
  
  @js.native
  trait Logger extends StObject {
    
    var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  @js.native
  trait Option extends StObject {
    
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
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayNull: Self = StObject.set(x, "autoplay", null)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setExport(value: String): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      @scala.inline
      def setFormat(value: ExportType): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatNull: Self = StObject.set(x, "format", null)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setLog(value: LogLevel): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLoop(value: js.Array[String]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLoopVarargs(value: String*): Self = StObject.set(x, "loop", js.Array(value :_*))
      
      @scala.inline
      def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRawparts(value: String): Self = StObject.set(x, "rawparts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawpartsUndefined: Self = StObject.set(x, "rawparts", js.undefined)
      
      @scala.inline
      def setSamplerate(value: Double): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplerateUndefined: Self = StObject.set(x, "samplerate", js.undefined)
      
      @scala.inline
      def setSilence(value: Double): Self = StObject.set(x, "silence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilenceUndefined: Self = StObject.set(x, "silence", js.undefined)
      
      @scala.inline
      def setVbr(value: VBR): Self = StObject.set(x, "vbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbrColonvorbis(value: VBRVorbis): Self = StObject.set(x, "vbr:vorbis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVbrColonvorbisUndefined: Self = StObject.set(x, "vbr:vorbis", js.undefined)
      
      @scala.inline
      def setVbrUndefined: Self = StObject.set(x, "vbr", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var autoplay: js.UndefOr[String] = js.native
    
    var resources: js.Array[String] = js.native
    
    var spritemap: StringDictionary[End] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(resources: js.Array[String], spritemap: StringDictionary[End]): Result = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], spritemap = spritemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSpritemap(value: StringDictionary[End]): Self = StObject.set(x, "spritemap", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteNumbers.`-1`
    - typings.audiosprite.audiospriteNumbers.`0`
    - typings.audiosprite.audiospriteNumbers.`1`
    - typings.audiosprite.audiospriteNumbers.`2`
    - typings.audiosprite.audiospriteNumbers.`3`
    - typings.audiosprite.audiospriteNumbers.`4`
    - typings.audiosprite.audiospriteNumbers.`5`
    - typings.audiosprite.audiospriteNumbers.`6`
    - typings.audiosprite.audiospriteNumbers.`7`
    - typings.audiosprite.audiospriteNumbers.`8`
    - typings.audiosprite.audiospriteNumbers.`9`
  */
  trait VBR extends StObject
  object VBR {
    
    @scala.inline
    def `-1`: typings.audiosprite.audiospriteNumbers.`-1` = -1.asInstanceOf[typings.audiosprite.audiospriteNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.audiosprite.audiospriteNumbers.`0` = 0.asInstanceOf[typings.audiosprite.audiospriteNumbers.`0`]
    
    @scala.inline
    def `1`: typings.audiosprite.audiospriteNumbers.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteNumbers.`1`]
    
    @scala.inline
    def `2`: typings.audiosprite.audiospriteNumbers.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteNumbers.`2`]
    
    @scala.inline
    def `3`: typings.audiosprite.audiospriteNumbers.`3` = 3.asInstanceOf[typings.audiosprite.audiospriteNumbers.`3`]
    
    @scala.inline
    def `4`: typings.audiosprite.audiospriteNumbers.`4` = 4.asInstanceOf[typings.audiosprite.audiospriteNumbers.`4`]
    
    @scala.inline
    def `5`: typings.audiosprite.audiospriteNumbers.`5` = 5.asInstanceOf[typings.audiosprite.audiospriteNumbers.`5`]
    
    @scala.inline
    def `6`: typings.audiosprite.audiospriteNumbers.`6` = 6.asInstanceOf[typings.audiosprite.audiospriteNumbers.`6`]
    
    @scala.inline
    def `7`: typings.audiosprite.audiospriteNumbers.`7` = 7.asInstanceOf[typings.audiosprite.audiospriteNumbers.`7`]
    
    @scala.inline
    def `8`: typings.audiosprite.audiospriteNumbers.`8` = 8.asInstanceOf[typings.audiosprite.audiospriteNumbers.`8`]
    
    @scala.inline
    def `9`: typings.audiosprite.audiospriteNumbers.`9` = 9.asInstanceOf[typings.audiosprite.audiospriteNumbers.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteNumbers.`10`
    - typings.audiosprite.audiospriteNumbers.`-1`
    - typings.audiosprite.audiospriteNumbers.`0`
    - typings.audiosprite.audiospriteNumbers.`1`
    - typings.audiosprite.audiospriteNumbers.`2`
    - typings.audiosprite.audiospriteNumbers.`3`
    - typings.audiosprite.audiospriteNumbers.`4`
    - typings.audiosprite.audiospriteNumbers.`5`
    - typings.audiosprite.audiospriteNumbers.`6`
    - typings.audiosprite.audiospriteNumbers.`7`
    - typings.audiosprite.audiospriteNumbers.`8`
    - typings.audiosprite.audiospriteNumbers.`9`
  */
  trait VBRVorbis extends StObject
  object VBRVorbis {
    
    @scala.inline
    def `-1`: typings.audiosprite.audiospriteNumbers.`-1` = -1.asInstanceOf[typings.audiosprite.audiospriteNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.audiosprite.audiospriteNumbers.`0` = 0.asInstanceOf[typings.audiosprite.audiospriteNumbers.`0`]
    
    @scala.inline
    def `1`: typings.audiosprite.audiospriteNumbers.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteNumbers.`1`]
    
    @scala.inline
    def `10`: typings.audiosprite.audiospriteNumbers.`10` = 10.asInstanceOf[typings.audiosprite.audiospriteNumbers.`10`]
    
    @scala.inline
    def `2`: typings.audiosprite.audiospriteNumbers.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteNumbers.`2`]
    
    @scala.inline
    def `3`: typings.audiosprite.audiospriteNumbers.`3` = 3.asInstanceOf[typings.audiosprite.audiospriteNumbers.`3`]
    
    @scala.inline
    def `4`: typings.audiosprite.audiospriteNumbers.`4` = 4.asInstanceOf[typings.audiosprite.audiospriteNumbers.`4`]
    
    @scala.inline
    def `5`: typings.audiosprite.audiospriteNumbers.`5` = 5.asInstanceOf[typings.audiosprite.audiospriteNumbers.`5`]
    
    @scala.inline
    def `6`: typings.audiosprite.audiospriteNumbers.`6` = 6.asInstanceOf[typings.audiosprite.audiospriteNumbers.`6`]
    
    @scala.inline
    def `7`: typings.audiosprite.audiospriteNumbers.`7` = 7.asInstanceOf[typings.audiosprite.audiospriteNumbers.`7`]
    
    @scala.inline
    def `8`: typings.audiosprite.audiospriteNumbers.`8` = 8.asInstanceOf[typings.audiosprite.audiospriteNumbers.`8`]
    
    @scala.inline
    def `9`: typings.audiosprite.audiospriteNumbers.`9` = 9.asInstanceOf[typings.audiosprite.audiospriteNumbers.`9`]
  }
  
  trait _ExportType extends StObject
}
