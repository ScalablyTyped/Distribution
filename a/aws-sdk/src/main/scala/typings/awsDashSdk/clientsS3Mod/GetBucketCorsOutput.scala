package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketCorsOutput extends js.Object {
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CORSRules] = js.native
}

object GetBucketCorsOutput {
  @scala.inline
  def apply(CORSRules: CORSRules = null): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal()
    if (CORSRules != null) __obj.updateDynamic("CORSRules")(CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
}

