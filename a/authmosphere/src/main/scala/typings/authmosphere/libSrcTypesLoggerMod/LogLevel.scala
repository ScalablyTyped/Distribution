package typings.authmosphere.libSrcTypesLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("authmosphere/lib/src/types/Logger", "LogLevel")
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
  
  /* "debug" */ val debug: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.debug with String = js.native
  /* "error" */ val error: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.error with String = js.native
  /* "fatal" */ val fatal: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal with String = js.native
  /* "info" */ val info: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.info with String = js.native
  /* "trace" */ val trace: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.trace with String = js.native
  /* "warn" */ val warn: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.warn with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogLevel with String] = js.native
}

