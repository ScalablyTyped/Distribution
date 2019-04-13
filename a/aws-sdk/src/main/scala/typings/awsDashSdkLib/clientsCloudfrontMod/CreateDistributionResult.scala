package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDistributionResult extends js.Object {
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[Distribution] = js.undefined
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fully qualified URI of the new distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[java.lang.String] = js.undefined
}

object CreateDistributionResult {
  @scala.inline
  def apply(
    Distribution: Distribution = null,
    ETag: java.lang.String = null,
    Location: java.lang.String = null
  ): CreateDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (Distribution != null) __obj.updateDynamic("Distribution")(Distribution)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateDistributionResult]
  }
}

