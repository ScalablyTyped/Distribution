package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMicrosoftADRequest extends js.Object {
  /**
    * A description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.native
  /**
    * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  /**
    * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the default administrative user named Admin. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typings.awsDashSdk.clientsDirectoryserviceMod.Password = js.native
  /**
    * The NetBIOS name for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The tags to be assigned to the AWS Managed Microsoft AD directory.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Tags] = js.native
  /**
    * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
    */
  var VpcSettings: DirectoryVpcSettings = js.native
}

object CreateMicrosoftADRequest {
  @scala.inline
  def apply(
    Name: DirectoryName,
    Password: Password,
    VpcSettings: DirectoryVpcSettings,
    Description: Description = null,
    Edition: DirectoryEdition = null,
    ShortName: DirectoryShortName = null,
    Tags: Tags = null
  ): CreateMicrosoftADRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], VpcSettings = VpcSettings.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Edition != null) __obj.updateDynamic("Edition")(Edition.asInstanceOf[js.Any])
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMicrosoftADRequest]
  }
}

