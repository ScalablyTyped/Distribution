package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLifecyclePolicyOutput extends js.Object {
  /**
    * The object lifecycle policy that is assigned to the container.
    */
  var LifecyclePolicy: awsDashSdkLib.clientsMediastoreMod.LifecyclePolicy
}

object GetLifecyclePolicyOutput {
  @scala.inline
  def apply(LifecyclePolicy: LifecyclePolicy): GetLifecyclePolicyOutput = {
    val __obj = js.Dynamic.literal(LifecyclePolicy = LifecyclePolicy)
  
    __obj.asInstanceOf[GetLifecyclePolicyOutput]
  }
}

