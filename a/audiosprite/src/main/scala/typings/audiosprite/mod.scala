package typings.audiosprite

import org.scalablytyped.runtime.StringDictionary
import typings.audiosprite.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(files: js.Array[String], callback: js.Function2[/* error */ js.Error, /* obj */ Result, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    files: js.Array[String],
    option: Option,
    callback: js.Function2[/* error */ js.Error, /* obj */ Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("audiosprite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteInts.`1`
    - typings.audiosprite.audiospriteInts.`2`
  */
  trait Channels extends StObject
  object Channels {
    
    inline def `1`: typings.audiosprite.audiospriteInts.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteInts.`1`]
    
    inline def `2`: typings.audiosprite.audiospriteInts.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteInts.`2`]
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
    
    inline def debug: typings.audiosprite.audiospriteStrings.debug = "debug".asInstanceOf[typings.audiosprite.audiospriteStrings.debug]
    
    inline def error: typings.audiosprite.audiospriteStrings.error = "error".asInstanceOf[typings.audiosprite.audiospriteStrings.error]
    
    inline def info: typings.audiosprite.audiospriteStrings.info = "info".asInstanceOf[typings.audiosprite.audiospriteStrings.info]
    
    inline def notice: typings.audiosprite.audiospriteStrings.notice = "notice".asInstanceOf[typings.audiosprite.audiospriteStrings.notice]
    
    inline def warning: typings.audiosprite.audiospriteStrings.warning = "warning".asInstanceOf[typings.audiosprite.audiospriteStrings.warning]
  }
  
  trait Logger extends StObject {
    
    var debug: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var autoplay: js.UndefOr[String | Null] = js.undefined
    
    var bitrate: js.UndefOr[Double] = js.undefined
    
    var channels: js.UndefOr[Channels] = js.undefined
    
    var `export`: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[ExportType] = js.undefined
    
    var gap: js.UndefOr[Double] = js.undefined
    
    var ignorerounding: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayNull: Self = StObject.set(x, "autoplay", null)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      inline def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setExport(value: String): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setFormat(value: ExportType): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatNull: Self = StObject.set(x, "format", null)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setIgnorerounding(value: Boolean): Self = StObject.set(x, "ignorerounding", value.asInstanceOf[js.Any])
      
      inline def setIgnoreroundingUndefined: Self = StObject.set(x, "ignorerounding", js.undefined)
      
      inline def setLog(value: LogLevel): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoop(value: js.Array[String]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLoopVarargs(value: String*): Self = StObject.set(x, "loop", js.Array(value*))
      
      inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRawparts(value: String): Self = StObject.set(x, "rawparts", value.asInstanceOf[js.Any])
      
      inline def setRawpartsUndefined: Self = StObject.set(x, "rawparts", js.undefined)
      
      inline def setSamplerate(value: Double): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
      
      inline def setSamplerateUndefined: Self = StObject.set(x, "samplerate", js.undefined)
      
      inline def setSilence(value: Double): Self = StObject.set(x, "silence", value.asInstanceOf[js.Any])
      
      inline def setSilenceUndefined: Self = StObject.set(x, "silence", js.undefined)
      
      inline def setVbr(value: VBR): Self = StObject.set(x, "vbr", value.asInstanceOf[js.Any])
      
      inline def setVbrColonvorbis(value: VBRVorbis): Self = StObject.set(x, "vbr:vorbis", value.asInstanceOf[js.Any])
      
      inline def setVbrColonvorbisUndefined: Self = StObject.set(x, "vbr:vorbis", js.undefined)
      
      inline def setVbrUndefined: Self = StObject.set(x, "vbr", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var autoplay: js.UndefOr[String] = js.undefined
    
    var resources: js.Array[String]
    
    var spritemap: StringDictionary[End]
  }
  object Result {
    
    inline def apply(resources: js.Array[String], spritemap: StringDictionary[End]): Result = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], spritemap = spritemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSpritemap(value: StringDictionary[End]): Self = StObject.set(x, "spritemap", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteInts.`-1`
    - typings.audiosprite.audiospriteInts.`0`
    - typings.audiosprite.audiospriteInts.`1`
    - typings.audiosprite.audiospriteInts.`2`
    - typings.audiosprite.audiospriteInts.`3`
    - typings.audiosprite.audiospriteInts.`4`
    - typings.audiosprite.audiospriteInts.`5`
    - typings.audiosprite.audiospriteInts.`6`
    - typings.audiosprite.audiospriteInts.`7`
    - typings.audiosprite.audiospriteInts.`8`
    - typings.audiosprite.audiospriteInts.`9`
  */
  trait VBR extends StObject
  object VBR {
    
    inline def `-1`: typings.audiosprite.audiospriteInts.`-1` = -1.asInstanceOf[typings.audiosprite.audiospriteInts.`-1`]
    
    inline def `0`: typings.audiosprite.audiospriteInts.`0` = 0.asInstanceOf[typings.audiosprite.audiospriteInts.`0`]
    
    inline def `1`: typings.audiosprite.audiospriteInts.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteInts.`1`]
    
    inline def `2`: typings.audiosprite.audiospriteInts.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteInts.`2`]
    
    inline def `3`: typings.audiosprite.audiospriteInts.`3` = 3.asInstanceOf[typings.audiosprite.audiospriteInts.`3`]
    
    inline def `4`: typings.audiosprite.audiospriteInts.`4` = 4.asInstanceOf[typings.audiosprite.audiospriteInts.`4`]
    
    inline def `5`: typings.audiosprite.audiospriteInts.`5` = 5.asInstanceOf[typings.audiosprite.audiospriteInts.`5`]
    
    inline def `6`: typings.audiosprite.audiospriteInts.`6` = 6.asInstanceOf[typings.audiosprite.audiospriteInts.`6`]
    
    inline def `7`: typings.audiosprite.audiospriteInts.`7` = 7.asInstanceOf[typings.audiosprite.audiospriteInts.`7`]
    
    inline def `8`: typings.audiosprite.audiospriteInts.`8` = 8.asInstanceOf[typings.audiosprite.audiospriteInts.`8`]
    
    inline def `9`: typings.audiosprite.audiospriteInts.`9` = 9.asInstanceOf[typings.audiosprite.audiospriteInts.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.audiosprite.audiospriteInts.`10`
    - typings.audiosprite.audiospriteInts.`-1`
    - typings.audiosprite.audiospriteInts.`0`
    - typings.audiosprite.audiospriteInts.`1`
    - typings.audiosprite.audiospriteInts.`2`
    - typings.audiosprite.audiospriteInts.`3`
    - typings.audiosprite.audiospriteInts.`4`
    - typings.audiosprite.audiospriteInts.`5`
    - typings.audiosprite.audiospriteInts.`6`
    - typings.audiosprite.audiospriteInts.`7`
    - typings.audiosprite.audiospriteInts.`8`
    - typings.audiosprite.audiospriteInts.`9`
  */
  trait VBRVorbis extends StObject
  object VBRVorbis {
    
    inline def `-1`: typings.audiosprite.audiospriteInts.`-1` = -1.asInstanceOf[typings.audiosprite.audiospriteInts.`-1`]
    
    inline def `0`: typings.audiosprite.audiospriteInts.`0` = 0.asInstanceOf[typings.audiosprite.audiospriteInts.`0`]
    
    inline def `1`: typings.audiosprite.audiospriteInts.`1` = 1.asInstanceOf[typings.audiosprite.audiospriteInts.`1`]
    
    inline def `10`: typings.audiosprite.audiospriteInts.`10` = 10.asInstanceOf[typings.audiosprite.audiospriteInts.`10`]
    
    inline def `2`: typings.audiosprite.audiospriteInts.`2` = 2.asInstanceOf[typings.audiosprite.audiospriteInts.`2`]
    
    inline def `3`: typings.audiosprite.audiospriteInts.`3` = 3.asInstanceOf[typings.audiosprite.audiospriteInts.`3`]
    
    inline def `4`: typings.audiosprite.audiospriteInts.`4` = 4.asInstanceOf[typings.audiosprite.audiospriteInts.`4`]
    
    inline def `5`: typings.audiosprite.audiospriteInts.`5` = 5.asInstanceOf[typings.audiosprite.audiospriteInts.`5`]
    
    inline def `6`: typings.audiosprite.audiospriteInts.`6` = 6.asInstanceOf[typings.audiosprite.audiospriteInts.`6`]
    
    inline def `7`: typings.audiosprite.audiospriteInts.`7` = 7.asInstanceOf[typings.audiosprite.audiospriteInts.`7`]
    
    inline def `8`: typings.audiosprite.audiospriteInts.`8` = 8.asInstanceOf[typings.audiosprite.audiospriteInts.`8`]
    
    inline def `9`: typings.audiosprite.audiospriteInts.`9` = 9.asInstanceOf[typings.audiosprite.audiospriteInts.`9`]
  }
  
  trait _ExportType extends StObject
}
