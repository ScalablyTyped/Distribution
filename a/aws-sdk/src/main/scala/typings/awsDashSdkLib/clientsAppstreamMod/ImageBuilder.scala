package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuilder extends js.Object {
  /**
    * The version of the AppStream 2.0 agent that is currently being used by the image builder. 
    */
  var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
  /**
    * The ARN for the image builder.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time stamp when the image builder was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The ARN of the image from which this builder was created.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The image builder errors.
    */
  var ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined
  /**
    * The instance type for the image builder.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The name of the image builder.
    */
  var Name: String
  /**
    * The operating system platform of the image builder.
    */
  var Platform: js.UndefOr[PlatformType] = js.undefined
  /**
    * The state of the image builder.
    */
  var State: js.UndefOr[ImageBuilderState] = js.undefined
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined
  /**
    * The VPC configuration of the image builder.
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object ImageBuilder {
  @scala.inline
  def apply(
    Name: String,
    AppstreamAgentVersion: AppstreamAgentVersion = null,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisplayName: String = null,
    DomainJoinInfo: DomainJoinInfo = null,
    EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
    ImageArn: Arn = null,
    ImageBuilderErrors: ResourceErrors = null,
    InstanceType: String = null,
    Platform: PlatformType = null,
    State: ImageBuilderState = null,
    StateChangeReason: ImageBuilderStateChangeReason = null,
    VpcConfig: VpcConfig = null
  ): ImageBuilder = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainJoinInfo != null) __obj.updateDynamic("DomainJoinInfo")(DomainJoinInfo)
    if (!js.isUndefined(EnableDefaultInternetAccess)) __obj.updateDynamic("EnableDefaultInternetAccess")(EnableDefaultInternetAccess)
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageBuilderErrors != null) __obj.updateDynamic("ImageBuilderErrors")(ImageBuilderErrors)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[ImageBuilder]
  }
}

