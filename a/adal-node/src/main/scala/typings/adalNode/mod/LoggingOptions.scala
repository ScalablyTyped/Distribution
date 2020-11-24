package typings.adalNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef LoggingOptions
  * @memberOf Logging
  * @property {LoggingCallback} [log] The function to call when ADAL generates a log entry.
  * @property {LoggingLevel} [level] The maximum level of log entries to generate.
  * @property {boolean} [loggingWithPII] This value indicts if personal identity related information such as token and claims should be logged. The default value is false.
  */
@js.native
trait LoggingOptions extends js.Object {
  
  var level: js.UndefOr[LoggingLevel] = js.native
  
  var log: js.UndefOr[LoggingCallback] = js.native
  
  var loggingWithPII: js.UndefOr[Boolean] = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(): LoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingOptions]
  }
  
  @scala.inline
  implicit class LoggingOptionsOps[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: LoggingLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: (/* level */ LoggingLevel, /* message */ String, /* error */ js.UndefOr[Error]) => Unit): Self = this.set("log", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setLoggingWithPII(value: Boolean): Self = this.set("loggingWithPII", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingWithPII: Self = this.set("loggingWithPII", js.undefined)
  }
}
