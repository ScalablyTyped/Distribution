package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignRequest extends StObject {
  
  /**
    *  The name of the campaign to retrieve information about. 
    */
  var name: campaignName
}
object GetCampaignRequest {
  
  inline def apply(name: campaignName): GetCampaignRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
