package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfigurationFilter extends js.Object {
  /**
    * 
    */
  var Key: js.UndefOr[S3KeyFilter] = js.undefined
}

object NotificationConfigurationFilter {
  @scala.inline
  def apply(Key: S3KeyFilter = null): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
}

