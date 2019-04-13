package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticInferenceAcceleratorResponse extends js.Object {
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: js.UndefOr[String] = js.undefined
}

object LaunchTemplateElasticInferenceAcceleratorResponse {
  @scala.inline
  def apply(Type: String = null): LaunchTemplateElasticInferenceAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAcceleratorResponse]
  }
}

