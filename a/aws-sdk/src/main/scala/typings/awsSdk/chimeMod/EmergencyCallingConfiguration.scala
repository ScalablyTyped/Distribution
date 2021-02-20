package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmergencyCallingConfiguration extends StObject {
  
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
  implicit class EmergencyCallingConfigurationMutableBuilder[Self <: EmergencyCallingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDNIS(value: DNISEmergencyCallingConfigurationList): Self = StObject.set(x, "DNIS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNISUndefined: Self = StObject.set(x, "DNIS", js.undefined)
    
    @scala.inline
    def setDNISVarargs(value: DNISEmergencyCallingConfiguration*): Self = StObject.set(x, "DNIS", js.Array(value :_*))
  }
}
