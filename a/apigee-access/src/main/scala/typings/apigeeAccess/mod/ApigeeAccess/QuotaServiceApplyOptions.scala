package typings.apigeeAccess.mod.ApigeeAccess

import typings.apigeeAccess.apigeeAccessStrings.day
import typings.apigeeAccess.apigeeAccessStrings.hour
import typings.apigeeAccess.apigeeAccessStrings.minute
import typings.apigeeAccess.apigeeAccessStrings.month
import typings.apigeeAccess.apigeeAccessStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaServiceApplyOptions extends js.Object {
  
  var allow: Double = js.native
  
  var identifier: String = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var timeUnit: minute | hour | day | week | month = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object QuotaServiceApplyOptions {
  
  @scala.inline
  def apply(allow: Double, identifier: String, timeUnit: minute | hour | day | week | month): QuotaServiceApplyOptions = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyOptions]
  }
  
  @scala.inline
  implicit class QuotaServiceApplyOptionsOps[Self <: QuotaServiceApplyOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Double): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: minute | hour | day | week | month): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
