package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectRetentionOutput extends js.Object {
  /**
    * The container element for an object's retention settings.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.undefined
}

object GetObjectRetentionOutput {
  @scala.inline
  def apply(Retention: ObjectLockRetention = null): GetObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    if (Retention != null) __obj.updateDynamic("Retention")(Retention)
    __obj.asInstanceOf[GetObjectRetentionOutput]
  }
}

