package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshCacheOutput extends js.Object {
  var FileShareARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
  var NotificationId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.NotificationId] = js.undefined
}

object RefreshCacheOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null, NotificationId: NotificationId = null): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    if (NotificationId != null) __obj.updateDynamic("NotificationId")(NotificationId)
    __obj.asInstanceOf[RefreshCacheOutput]
  }
}

