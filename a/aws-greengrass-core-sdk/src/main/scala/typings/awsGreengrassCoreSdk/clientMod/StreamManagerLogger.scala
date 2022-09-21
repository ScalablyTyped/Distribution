package typings.awsGreengrassCoreSdk.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamManagerLogger extends StObject {
  
  def debug(args: scala.Nothing*): Unit
  
  def error(args: scala.Nothing*): Unit
  
  def info(args: scala.Nothing*): Unit
  
  def warn(args: scala.Nothing*): Unit
}
object StreamManagerLogger {
  
  inline def apply(
    debug: /* repeated */ scala.Nothing => Unit,
    error: /* repeated */ scala.Nothing => Unit,
    info: /* repeated */ scala.Nothing => Unit,
    warn: /* repeated */ scala.Nothing => Unit
  ): StreamManagerLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[StreamManagerLogger]
  }
  
  extension [Self <: StreamManagerLogger](x: Self) {
    
    inline def setDebug(value: /* repeated */ scala.Nothing => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ scala.Nothing => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ scala.Nothing => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ scala.Nothing => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
