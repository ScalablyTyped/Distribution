package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogInfo extends js.Object {
  
  /**
  		 * A function to handle each line of log output. If handler is not specified, console.log is used.
  		 **/
  var handler: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  
  /**
  		 * A number controlling the verbosity of the output. Valid values are: 0 (no logs), 1 (errors only),
  		 * 2 (errors plus connection and channel state changes), 3 (high-level debug output), and 4 (full debug output).
  		 **/
  var level: js.UndefOr[Double] = js.native
}
object LogInfo {
  
  @scala.inline
  def apply(): LogInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogInfo]
  }
  
  @scala.inline
  implicit class LogInfoOps[Self <: LogInfo] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: /* msg */ String => Unit): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
