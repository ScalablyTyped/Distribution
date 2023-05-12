package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSGlobal("connect.LogLevel")
@js.native
object LogLevel extends StObject {
  
  @js.native
  sealed trait CRITICAL
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait LOG
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait TEST
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait TRACE
    extends StObject
       with LogLevel
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
}
