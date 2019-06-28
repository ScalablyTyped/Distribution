package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    *  The type of attribute or attributes to remove. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints, such as the date when an associated user opted in or out of receiving communications from you through a specific type of channel. endpoint-custom-metrics - Custom metrics that your app reports to Amazon Pinpoint for endpoints, such as the number of app sessions or the number of items left in a cart. endpoint-user-attributes - Custom attributes that describe users, such as first name, last name, and age.
    */
  var AttributeType: __string
  var UpdateAttributesRequest: awsDashSdkLib.clientsPinpointMod.UpdateAttributesRequest
}

object RemoveAttributesRequest {
  @scala.inline
  def apply(ApplicationId: __string, AttributeType: __string, UpdateAttributesRequest: UpdateAttributesRequest): RemoveAttributesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, AttributeType = AttributeType, UpdateAttributesRequest = UpdateAttributesRequest)
  
    __obj.asInstanceOf[RemoveAttributesRequest]
  }
}

