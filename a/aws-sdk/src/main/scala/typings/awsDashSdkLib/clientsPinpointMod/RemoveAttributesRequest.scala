package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributesRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * Type of attribute. Can be endpoint-custom-attributes, endpoint-custom-metrics, endpoint-user-attributes.
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

