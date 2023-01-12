package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDialRequestBatchRequest extends StObject {
  
  var dialRequests: DialRequestList
  
  var id: CampaignId
}
object PutDialRequestBatchRequest {
  
  inline def apply(dialRequests: DialRequestList, id: CampaignId): PutDialRequestBatchRequest = {
    val __obj = js.Dynamic.literal(dialRequests = dialRequests.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDialRequestBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDialRequestBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setDialRequests(value: DialRequestList): Self = StObject.set(x, "dialRequests", value.asInstanceOf[js.Any])
    
    inline def setDialRequestsVarargs(value: DialRequest*): Self = StObject.set(x, "dialRequests", js.Array(value*))
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
