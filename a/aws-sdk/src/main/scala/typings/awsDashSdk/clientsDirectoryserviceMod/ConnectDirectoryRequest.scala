package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectDirectoryRequest extends js.Object {
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings = js.native
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.native
  /**
    * The fully qualified name of the on-premises directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the on-premises user account.
    */
  var Password: ConnectPassword = js.native
  /**
    * The NetBIOS name of the on-premises directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Tags] = js.native
}

object ConnectDirectoryRequest {
  @scala.inline
  def apply(
    ConnectSettings: DirectoryConnectSettings,
    Name: DirectoryName,
    Password: ConnectPassword,
    Size: DirectorySize,
    Description: Description = null,
    ShortName: DirectoryShortName = null,
    Tags: Tags = null
  ): ConnectDirectoryRequest = {
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
}

