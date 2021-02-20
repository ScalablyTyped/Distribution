package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSmartHomeAppliancesResponse extends StObject {
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The smart home appliances.
    */
  var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.native
}
object ListSmartHomeAppliancesResponse {
  
  @scala.inline
  def apply(): ListSmartHomeAppliancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
  }
  
  @scala.inline
  implicit class ListSmartHomeAppliancesResponseMutableBuilder[Self <: ListSmartHomeAppliancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSmartHomeAppliances(value: SmartHomeApplianceList): Self = StObject.set(x, "SmartHomeAppliances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartHomeAppliancesUndefined: Self = StObject.set(x, "SmartHomeAppliances", js.undefined)
    
    @scala.inline
    def setSmartHomeAppliancesVarargs(value: SmartHomeAppliance*): Self = StObject.set(x, "SmartHomeAppliances", js.Array(value :_*))
  }
}
