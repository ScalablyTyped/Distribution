package typings.appdmg.mod

import typings.appdmg.appdmgStrings.`step-begin`
import typings.appdmg.appdmgStrings.`step-end`
import typings.appdmg.appdmgStrings.fail
import typings.appdmg.appdmgStrings.ok
import typings.appdmg.appdmgStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends js.Object {
  
  var current: Double = js.native
  
  var status: ok | skip | fail = js.native
  
  var title: String = js.native
  
  var total: Double = js.native
  
  var `type`: `step-begin` | `step-end` = js.native
}
object Progress {
  
  @scala.inline
  def apply(
    current: Double,
    status: ok | skip | fail,
    title: String,
    total: Double,
    `type`: `step-begin` | `step-end`
  ): Progress = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ok | skip | fail): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `step-begin` | `step-end`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
