package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleOutput extends js.Object {
  /**
    * 
    */
  var Rules: js.UndefOr[Rules] = js.undefined
}

object GetBucketLifecycleOutput {
  @scala.inline
  def apply(Rules: Rules = null): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
}

