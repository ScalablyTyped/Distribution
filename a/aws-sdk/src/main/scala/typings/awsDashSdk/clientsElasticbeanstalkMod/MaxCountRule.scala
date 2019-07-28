package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxCountRule extends js.Object {
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean
  /**
    * Specify the maximum number of application versions to retain.
    */
  var MaxCount: js.UndefOr[BoxedInt] = js.undefined
}

object MaxCountRule {
  @scala.inline
  def apply(
    Enabled: BoxedBoolean,
    DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined,
    MaxCount: js.UndefOr[BoxedInt] = js.undefined
  ): MaxCountRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (!js.isUndefined(DeleteSourceFromS3)) __obj.updateDynamic("DeleteSourceFromS3")(DeleteSourceFromS3)
    if (!js.isUndefined(MaxCount)) __obj.updateDynamic("MaxCount")(MaxCount)
    __obj.asInstanceOf[MaxCountRule]
  }
}

