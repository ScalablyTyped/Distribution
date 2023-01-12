package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// LogService
// see http://docs.angularjs.org/api/ng/service/$log
// see http://docs.angularjs.org/api/ng/provider/$logProvider
///////////////////////////////////////////////////////////////////////////
trait ILogService extends StObject {
  
  def debug(args: Any*): Unit
  @JSName("debug")
  var debug_Original: ILogCall
  
  def error(args: Any*): Unit
  @JSName("error")
  var error_Original: ILogCall
  
  def info(args: Any*): Unit
  @JSName("info")
  var info_Original: ILogCall
  
  def log(args: Any*): Unit
  @JSName("log")
  var log_Original: ILogCall
  
  def warn(args: Any*): Unit
  @JSName("warn")
  var warn_Original: ILogCall
}
object ILogService {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    log: /* repeated */ Any => Unit,
    warn: /* repeated */ Any => Unit
  ): ILogService = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[ILogService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILogService] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
