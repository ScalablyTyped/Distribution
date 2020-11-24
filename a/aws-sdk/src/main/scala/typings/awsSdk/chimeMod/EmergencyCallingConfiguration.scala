package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmergencyCallingConfiguration extends js.Object {
  
  /**
    * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
    */
  var DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList] = js.native
}
object EmergencyCallingConfiguration {
  
  @scala.inline
  def apply(): EmergencyCallingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmergencyCallingConfiguration]
  }
  
  @scala.inline
  implicit class EmergencyCallingConfigurationOps[Self <: EmergencyCallingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDNISVarargs(value: DNISEmergencyCallingConfiguration*): Self = this.set("DNIS", js.Array(value :_*))
    
    @scala.inline
    def setDNIS(value: DNISEmergencyCallingConfigurationList): Self = this.set("DNIS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDNIS: Self = this.set("DNIS", js.undefined)
  }
}
