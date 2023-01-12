package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    *  The type of attribute or attributes to remove. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints, such as the date when an associated user opted in or out of receiving communications from you through a specific type of channel. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints, such as the number of app sessions or the number of items left in a cart. endpoint-user-attributes - Custom attributes that describe users, such as first name, last name, and age.
    */
  var AttributeType: string
  
  var UpdateAttributesRequest: typings.awsSdk.clientsPinpointMod.UpdateAttributesRequest
}
object RemoveAttributesRequest {
  
  inline def apply(ApplicationId: string, AttributeType: string, UpdateAttributesRequest: UpdateAttributesRequest): RemoveAttributesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setAttributeType(value: string): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setUpdateAttributesRequest(value: UpdateAttributesRequest): Self = StObject.set(x, "UpdateAttributesRequest", value.asInstanceOf[js.Any])
  }
}
