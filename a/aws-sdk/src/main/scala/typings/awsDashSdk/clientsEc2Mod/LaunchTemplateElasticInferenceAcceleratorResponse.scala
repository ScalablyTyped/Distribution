package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticInferenceAcceleratorResponse extends js.Object {
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: js.UndefOr[String] = js.native
}

object LaunchTemplateElasticInferenceAcceleratorResponse {
  @scala.inline
  def apply(Count: Int | scala.Double = null, Type: String = null): LaunchTemplateElasticInferenceAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAcceleratorResponse]
  }
}

