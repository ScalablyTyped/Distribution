package typings.accedoAccedoOne.mod.AccedoLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logobject extends Details {
  
  /**
    * the log type
    */
  var logType: Level = js.native
  
  /** Extra metadata (will go through JSON.stringify) */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * The timestamp for the log, as a UTC ISO 8601 string
    * (ie. '2016-07-04T06:17:21Z'), or a POSIX millisecond
    * number
    */
  var timestamp: String | Double = js.native
}
object Logobject {
  
  @scala.inline
  def apply(logType: Level, message: String, timestamp: String | Double): Logobject = {
    val __obj = js.Dynamic.literal(logType = logType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logobject]
  }
  
  @scala.inline
  implicit class LogobjectOps[Self <: Logobject] (val x: Self) extends AnyVal {
    
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
    def setLogType(value: Level): Self = this.set("logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String | Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
