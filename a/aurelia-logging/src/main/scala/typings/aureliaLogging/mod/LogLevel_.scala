package typings.aureliaLogging.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevel_
  extends /**
  * Additional log levels defined at runtime.
  */
/* level */ StringDictionary[Double] {
  
  /**
    * Log all messages.
    */
  var debug: Double = js.native
  
  /**
    * Log only error messages.
    */
  var error: Double = js.native
  
  /**
    * Log informational messages or above.
    */
  var info: Double = js.native
  
  /**
    * No logging.
    */
  var none: Double = js.native
  
  /**
    * Log warnings messages or above.
    */
  var warn: Double = js.native
}
object LogLevel_ {
  
  @scala.inline
  def apply(debug: Double, error: Double, info: Double, none: Double, warn: Double): LogLevel_ = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel_]
  }
  
  @scala.inline
  implicit class LogLevel_Ops[Self <: LogLevel_] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: Double): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
