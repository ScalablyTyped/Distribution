package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageBuilderRequest extends js.Object {
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Description] = js.undefined
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DisplayName] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DomainJoinInfo] = js.undefined
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The ARN of the public, private, or shared image to use.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the image used to create the image builder.
    */
  var ImageName: js.UndefOr[String] = js.undefined
  /**
    * The instance type to use when launching the image builder.
    */
  var InstanceType: String
  /**
    * A unique name for the image builder.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
  /**
    * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Tags] = js.undefined
  /**
    * The VPC configuration for the image builder. You can specify only one subnet.
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.VpcConfig] = js.undefined
}

object CreateImageBuilderRequest {
  @scala.inline
  def apply(
    InstanceType: String,
    Name: Name,
    AccessEndpoints: AccessEndpointList = null,
    AppstreamAgentVersion: AppstreamAgentVersion = null,
    Description: Description = null,
    DisplayName: DisplayName = null,
    DomainJoinInfo: DomainJoinInfo = null,
    EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
    ImageArn: Arn = null,
    ImageName: String = null,
    Tags: Tags = null,
    VpcConfig: VpcConfig = null
  ): CreateImageBuilderRequest = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType, Name = Name)
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints)
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainJoinInfo != null) __obj.updateDynamic("DomainJoinInfo")(DomainJoinInfo)
    if (!js.isUndefined(EnableDefaultInternetAccess)) __obj.updateDynamic("EnableDefaultInternetAccess")(EnableDefaultInternetAccess)
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[CreateImageBuilderRequest]
  }
}

