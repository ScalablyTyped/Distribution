package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryRequest extends js.Object {
  /**
    * A textual description for the directory.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The fully qualified name for the directory, such as corp.example.com.
    */
  var Name: DirectoryName
  /**
    * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password.
    */
  var Password: awsDashSdkLib.clientsDirectoryserviceMod.Password
  /**
    * The short name of the directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  /**
    * The size of the directory.
    */
  var Size: DirectorySize
  /**
    * The tags to be assigned to the Simple AD directory.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * A DirectoryVpcSettings object that contains additional information for the operation.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined
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
    val __obj = js.Dynamic.literal(Name = Name, Password = Password, Size = Size.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcSettings != null) __obj.updateDynamic("VpcSettings")(VpcSettings)
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
}

