package typings
package authmosphereLib.libSrcTypesLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("authmosphere/lib/src/types/Logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait debug
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  @js.native
  sealed trait error
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  @js.native
  sealed trait fatal
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  @js.native
  sealed trait info
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  @js.native
  sealed trait trace
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  @js.native
  sealed trait warn
    extends authmosphereLib.libSrcTypesLoggerMod.LogLevel
  
  /* "debug" */ val debug: debug with java.lang.String = js.native
  /* "error" */ val error: error with java.lang.String = js.native
  /* "fatal" */ val fatal: fatal with java.lang.String = js.native
  /* "info" */ val info: info with java.lang.String = js.native
  /* "trace" */ val trace: trace with java.lang.String = js.native
  /* "warn" */ val warn: warn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.LogLevel with java.lang.String] = js.native
}

