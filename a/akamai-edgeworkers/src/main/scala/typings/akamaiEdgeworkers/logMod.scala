package typings.akamaiEdgeworkers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a debug logging facility. When debugging is enabled, log
  * messages are written to response headers or the responseProvider()
  * multipart output.
  */
object logMod {
  
  @JSImport("log", "logger")
  @js.native
  val logger: Logger_ = js.native
  
  trait Logger_ extends StObject {
    
    /**
      * Emit a message to the log. If logging is not enabled, this is a noop.
      *
      * When logging is enabled, the format string indicates how to display
      * the arguments. Format specifiers are:
      *
      * - %s - Call `Value::ToString()` on the corresponding argument.
      * - %d or %i - Convert the argument to an integer.
      * - %f - Convert the argument to a float.
      * - %o or %O - Convert the argument to JSON with `JSON.stringify()`.
      *
      * See https://console.spec.whatwg.org/#formatter.
      *
      * When logging is disabled, the format string is not processed, which
      * makes it more efficient than string arithmatic in production
      * environments.
      *
      * @param format A format string, containing zero or more specifiers.
      * @param values Zero or more values to record in the log.
      */
    def log(
      format: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type any is not an array type */ values: js.Any
    ): Unit
  }
  object Logger_ {
    
    inline def apply(log: (String, js.Any) => Unit): Logger_ = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
      __obj.asInstanceOf[Logger_]
    }
    
    extension [Self <: Logger_](x: Self) {
      
      inline def setLog(value: (String, js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    }
  }
}
