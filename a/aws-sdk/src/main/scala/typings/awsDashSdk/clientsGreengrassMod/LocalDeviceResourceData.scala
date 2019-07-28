package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDeviceResourceData extends js.Object {
  /**
    * Group/owner related settings for local resources.
    */
  var GroupOwnerSetting: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.GroupOwnerSetting] = js.undefined
  /**
    * The local absolute path of the device resource. The source path for a device resource can refer only to a character device or block device under ''/dev''.
    */
  var SourcePath: js.UndefOr[__string] = js.undefined
}

object LocalDeviceResourceData {
  @scala.inline
  def apply(GroupOwnerSetting: GroupOwnerSetting = null, SourcePath: __string = null): LocalDeviceResourceData = {
    val __obj = js.Dynamic.literal()
    if (GroupOwnerSetting != null) __obj.updateDynamic("GroupOwnerSetting")(GroupOwnerSetting)
    if (SourcePath != null) __obj.updateDynamic("SourcePath")(SourcePath)
    __obj.asInstanceOf[LocalDeviceResourceData]
  }
}

