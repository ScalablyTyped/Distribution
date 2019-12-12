package typings.authmosphere

import org.scalablytyped.runtime.TopLevel
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.debug
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.error
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.info
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.trace
import typings.authmosphere.libSrcTypesLoggerMod.LogLevel.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/Logger", JSImport.Namespace)
@js.native
object libSrcTypesLoggerMod extends js.Object {
  @js.native
  sealed trait LogLevel extends js.Object
  
  @js.native
  trait Logger extends js.Object {
    def debug(message: String): Unit = js.native
    def debug(message: String, error: js.Any): Unit = js.native
    def error(message: String): Unit = js.native
    def error(message: String, error: js.Any): Unit = js.native
    def fatal(message: String): Unit = js.native
    def fatal(message: String, error: js.Any): Unit = js.native
    def info(message: String): Unit = js.native
    def info(message: String, error: js.Any): Unit = js.native
    def trace(message: String): Unit = js.native
    def trace(message: String, error: js.Any): Unit = js.native
    def warn(message: String): Unit = js.native
    def warn(message: String, error: js.Any): Unit = js.native
  }
  
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait debug extends LogLevel
    
    @js.native
    sealed trait error extends LogLevel
    
    @js.native
    sealed trait fatal extends LogLevel
    
    @js.native
    sealed trait info extends LogLevel
    
    @js.native
    sealed trait trace extends LogLevel
    
    @js.native
    sealed trait warn extends LogLevel
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel with String] = js.native
    /* "debug" */ @js.native
    object debug extends TopLevel[debug with String]
    
    /* "error" */ @js.native
    object error extends TopLevel[error with String]
    
    /* "fatal" */ @js.native
    object fatal extends TopLevel[fatal with String]
    
    /* "info" */ @js.native
    object info extends TopLevel[info with String]
    
    /* "trace" */ @js.native
    object trace extends TopLevel[trace with String]
    
    /* "warn" */ @js.native
    object warn extends TopLevel[warn with String]
    
  }
  
}

