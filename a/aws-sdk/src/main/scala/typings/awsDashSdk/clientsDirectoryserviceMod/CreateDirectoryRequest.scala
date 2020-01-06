package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequest extends js.Object {
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.native
  /**
    * The fully qualified name for the directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typings.awsDashSdk.clientsDirectoryserviceMod.Password = js.native
  /**
    * The NetBIOS name of the directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to the Simple AD directory.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Tags] = js.native
  /**
    * A DirectoryVpcSettings object that contains additional information for the operation.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.native
}

object CreateDirectoryRequest {
  @scala.inline
  def apply(
    Name: DirectoryName,
    Password: Password,
    Size: DirectorySize,
    Description: Description = null,
    ShortName: DirectoryShortName = null,
    Tags: Tags = null,
    VpcSettings: DirectoryVpcSettings = null
  ): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcSettings != null) __obj.updateDynamic("VpcSettings")(VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
}

