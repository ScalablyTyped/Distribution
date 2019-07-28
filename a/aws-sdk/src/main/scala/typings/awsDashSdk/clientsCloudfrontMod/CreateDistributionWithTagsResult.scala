package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDistributionWithTagsResult extends js.Object {
  /**
    * The distribution's information. 
    */
  var Distribution: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.Distribution] = js.undefined
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified URI of the new distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5. 
    */
  var Location: js.UndefOr[String] = js.undefined
}

object CreateDistributionWithTagsResult {
  @scala.inline
  def apply(Distribution: Distribution = null, ETag: String = null, Location: String = null): CreateDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    if (Distribution != null) __obj.updateDynamic("Distribution")(Distribution)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateDistributionWithTagsResult]
  }
}

