package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeRule extends js.Object {
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean
  /**
    * Specify the number of days to retain an application versions.
    */
  var MaxAgeInDays: js.UndefOr[BoxedInt] = js.undefined
}

object MaxAgeRule {
  @scala.inline
  def apply(
    Enabled: BoxedBoolean,
    DeleteSourceFromS3: js.UndefOr[Boolean] = js.undefined,
    MaxAgeInDays: Int | Double = null
  ): MaxAgeRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (!js.isUndefined(DeleteSourceFromS3)) __obj.updateDynamic("DeleteSourceFromS3")(DeleteSourceFromS3)
    if (MaxAgeInDays != null) __obj.updateDynamic("MaxAgeInDays")(MaxAgeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeRule]
  }
}

