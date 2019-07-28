package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContactAttributesRequest extends js.Object {
  /**
    * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: typings.awsDashSdk.clientsConnectMod.Attributes
  /**
    * The unique identifier of the contact for which to update attributes. This is the identifier for the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
}

object UpdateContactAttributesRequest {
  @scala.inline
  def apply(Attributes: Attributes, InitialContactId: ContactId, InstanceId: InstanceId): UpdateContactAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, InitialContactId = InitialContactId, InstanceId = InstanceId)
  
    __obj.asInstanceOf[UpdateContactAttributesRequest]
  }
}

