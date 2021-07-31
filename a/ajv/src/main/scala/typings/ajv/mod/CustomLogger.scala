package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLogger extends StObject {
  
  def error(args: js.Any*): js.Any
  
  def log(args: js.Any*): js.Any
  
  def warn(args: js.Any*): js.Any
}
object CustomLogger {
  
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => js.Any,
    log: /* repeated */ js.Any => js.Any,
    warn: /* repeated */ js.Any => js.Any
  ): CustomLogger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[CustomLogger]
  }
  
  @scala.inline
  implicit class CustomLoggerMutableBuilder[Self <: CustomLogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
