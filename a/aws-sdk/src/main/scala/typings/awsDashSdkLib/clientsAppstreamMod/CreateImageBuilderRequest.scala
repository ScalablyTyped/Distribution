package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageBuilderRequest extends js.Object {
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
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
  var Name: awsDashSdkLib.clientsAppstreamMod.Name
  /**
    * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The VPC configuration for the image builder. You can specify only one subnet.
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object CreateImageBuilderRequest {
  @scala.inline
  def apply(
    InstanceType: String,
    Name: Name,
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

