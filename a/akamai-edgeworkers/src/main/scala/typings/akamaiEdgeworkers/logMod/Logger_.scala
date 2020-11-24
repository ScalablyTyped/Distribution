package typings.akamaiEdgeworkers.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger_ extends js.Object {
  
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
  ): Unit = js.native
}
object Logger_ {
  
  @scala.inline
  def apply(log: (String, js.Any) => Unit): Logger_ = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[Logger_]
  }
  
  @scala.inline
  implicit class Logger_Ops[Self <: Logger_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLog(value: (String, js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
  }
}
