package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileShareInfo extends js.Object {
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  var FileShareId: js.UndefOr[FileShareId] = js.undefined
  var FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined
  var FileShareType: js.UndefOr[FileShareType] = js.undefined
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object FileShareInfo {
  @scala.inline
  def apply(
    FileShareARN: FileShareARN = null,
    FileShareId: FileShareId = null,
    FileShareStatus: FileShareStatus = null,
    FileShareType: FileShareType = null,
    GatewayARN: GatewayARN = null
  ): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    if (FileShareId != null) __obj.updateDynamic("FileShareId")(FileShareId)
    if (FileShareStatus != null) __obj.updateDynamic("FileShareStatus")(FileShareStatus)
    if (FileShareType != null) __obj.updateDynamic("FileShareType")(FileShareType.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[FileShareInfo]
  }
}

