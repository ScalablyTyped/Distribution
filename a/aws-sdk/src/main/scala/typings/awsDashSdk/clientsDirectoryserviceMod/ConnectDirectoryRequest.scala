package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectDirectoryRequest extends js.Object {
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings
  /**
    * A textual description for the directory.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.undefined
  /**
    * The fully qualified name of the on-premises directory, such as corp.example.com.
    */
  var Name: DirectoryName
  /**
    * The password for the on-premises user account.
    */
  var Password: ConnectPassword
  /**
    * The NetBIOS name of the on-premises directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  /**
    * The size of the directory.
    */
  var Size: DirectorySize
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Tags] = js.undefined
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
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings, Name = Name, Password = Password, Size = Size.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ShortName != null) __obj.updateDynamic("ShortName")(ShortName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
}

