package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSoftwareUpdatesResult extends js.Object {
  /**
    * The Amazon S3 presigned URL for the update file associated with the specified JobId value. The software update will be available for 2 days after this request is made. To access an update after the 2 days have passed, you'll have to make another call to GetSoftwareUpdates.
    */
  var UpdatesURI: js.UndefOr[String] = js.undefined
}

object GetSoftwareUpdatesResult {
  @scala.inline
  def apply(UpdatesURI: String = null): GetSoftwareUpdatesResult = {
    val __obj = js.Dynamic.literal()
    if (UpdatesURI != null) __obj.updateDynamic("UpdatesURI")(UpdatesURI)
    __obj.asInstanceOf[GetSoftwareUpdatesResult]
  }
}

