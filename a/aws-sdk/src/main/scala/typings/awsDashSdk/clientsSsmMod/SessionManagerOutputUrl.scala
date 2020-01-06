package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionManagerOutputUrl extends js.Object {
  /**
    * Reserved for future use.
    */
  var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.native
  /**
    * Reserved for future use.
    */
  var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.native
}

object SessionManagerOutputUrl {
  @scala.inline
  def apply(
    CloudWatchOutputUrl: SessionManagerCloudWatchOutputUrl = null,
    S3OutputUrl: SessionManagerS3OutputUrl = null
  ): SessionManagerOutputUrl = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputUrl != null) __obj.updateDynamic("CloudWatchOutputUrl")(CloudWatchOutputUrl.asInstanceOf[js.Any])
    if (S3OutputUrl != null) __obj.updateDynamic("S3OutputUrl")(S3OutputUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionManagerOutputUrl]
  }
}

