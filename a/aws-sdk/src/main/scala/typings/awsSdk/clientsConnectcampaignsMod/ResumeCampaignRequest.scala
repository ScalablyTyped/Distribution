package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeCampaignRequest extends StObject {
  
  var id: CampaignId
}
object ResumeCampaignRequest {
  
  inline def apply(id: CampaignId): ResumeCampaignRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeCampaignRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeCampaignRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
