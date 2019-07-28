package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the connector definition version for this group.
    */
  var ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the core definition version for this group.
    */
  var CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the device definition version for this group.
    */
  var DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the function definition version for this group.
    */
  var FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The ARN of the logger definition version for this group.
    */
  var LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the resource definition version for this group.
    */
  var ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the subscription definition version for this group.
    */
  var SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
}

object CreateGroupVersionRequest {
  @scala.inline
  def apply(
    GroupId: __string,
    AmznClientToken: __string = null,
    ConnectorDefinitionVersionArn: __string = null,
    CoreDefinitionVersionArn: __string = null,
    DeviceDefinitionVersionArn: __string = null,
    FunctionDefinitionVersionArn: __string = null,
    LoggerDefinitionVersionArn: __string = null,
    ResourceDefinitionVersionArn: __string = null,
    SubscriptionDefinitionVersionArn: __string = null
  ): CreateGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (ConnectorDefinitionVersionArn != null) __obj.updateDynamic("ConnectorDefinitionVersionArn")(ConnectorDefinitionVersionArn)
    if (CoreDefinitionVersionArn != null) __obj.updateDynamic("CoreDefinitionVersionArn")(CoreDefinitionVersionArn)
    if (DeviceDefinitionVersionArn != null) __obj.updateDynamic("DeviceDefinitionVersionArn")(DeviceDefinitionVersionArn)
    if (FunctionDefinitionVersionArn != null) __obj.updateDynamic("FunctionDefinitionVersionArn")(FunctionDefinitionVersionArn)
    if (LoggerDefinitionVersionArn != null) __obj.updateDynamic("LoggerDefinitionVersionArn")(LoggerDefinitionVersionArn)
    if (ResourceDefinitionVersionArn != null) __obj.updateDynamic("ResourceDefinitionVersionArn")(ResourceDefinitionVersionArn)
    if (SubscriptionDefinitionVersionArn != null) __obj.updateDynamic("SubscriptionDefinitionVersionArn")(SubscriptionDefinitionVersionArn)
    __obj.asInstanceOf[CreateGroupVersionRequest]
  }
}

