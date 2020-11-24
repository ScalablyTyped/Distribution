package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends js.Object {
  
   // expire after the days
  var date: String = js.native
  
   // rule status, allow values: Enabled or Disabled
  var days: js.UndefOr[Double | String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
   // rule id, if not set, OSS will auto create it with random string.
  var prefix: String = js.native
  
   // store prefix
  var status: RuleStatusType = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(date: String, prefix: String, status: RuleStatusType): LifecycleRule = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: RuleStatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: Double | String): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
