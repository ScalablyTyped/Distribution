package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketCorsOutput extends js.Object {
  /**
    * 
    */
  var CORSRules: js.UndefOr[CORSRules] = js.undefined
}

object GetBucketCorsOutput {
  @scala.inline
  def apply(CORSRules: CORSRules = null): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal()
    if (CORSRules != null) __obj.updateDynamic("CORSRules")(CORSRules)
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
}

