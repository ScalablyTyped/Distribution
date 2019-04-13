package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleConfigurationOutput extends js.Object {
  /**
    * 
    */
  var Rules: js.UndefOr[LifecycleRules] = js.undefined
}

object GetBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply(Rules: LifecycleRules = null): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
}

