package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectRetentionOutput extends js.Object {
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
}

object PutObjectRetentionOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): PutObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRetentionOutput]
  }
}

