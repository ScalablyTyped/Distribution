package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficDistributionRequest extends StObject {
  
  /**
    * The identifier of the traffic distribution group.
    */
  var Id: TrafficDistributionGroupIdOrArn
}
object GetTrafficDistributionRequest {
  
  inline def apply(Id: TrafficDistributionGroupIdOrArn): GetTrafficDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficDistributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTrafficDistributionRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: TrafficDistributionGroupIdOrArn): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
