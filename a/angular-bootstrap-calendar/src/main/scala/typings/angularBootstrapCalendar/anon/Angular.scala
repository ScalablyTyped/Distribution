package typings.angularBootstrapCalendar.anon

import typings.angularBootstrapCalendar.mod.bootstrap.calendar.IFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Angular extends js.Object {
  
  var angular: IFormats = js.native
  
  var moment: IFormats = js.native
}
object Angular {
  
  @scala.inline
  def apply(angular: IFormats, moment: IFormats): Angular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angular]
  }
  
  @scala.inline
  implicit class AngularOps[Self <: Angular] (val x: Self) extends AnyVal {
    
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
    def setAngular(value: IFormats): Self = this.set("angular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoment(value: IFormats): Self = this.set("moment", value.asInstanceOf[js.Any])
  }
}
