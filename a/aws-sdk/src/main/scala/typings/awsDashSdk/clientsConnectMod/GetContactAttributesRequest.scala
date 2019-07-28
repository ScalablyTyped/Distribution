package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContactAttributesRequest extends js.Object {
  /**
    * The ID for the initial contact in Amazon Connect associated with the attributes to update.
    */
  var InitialContactId: ContactId
  /**
    * The instance ID for the instance from which to retrieve contact attributes.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
}

object GetContactAttributesRequest {
  @scala.inline
  def apply(InitialContactId: ContactId, InstanceId: InstanceId): GetContactAttributesRequest = {
    val __obj = js.Dynamic.literal(InitialContactId = InitialContactId, InstanceId = InstanceId)
  
    __obj.asInstanceOf[GetContactAttributesRequest]
  }
}

