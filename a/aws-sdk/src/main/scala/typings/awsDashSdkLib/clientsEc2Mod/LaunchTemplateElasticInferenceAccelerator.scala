package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: String
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(Type: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type)
  
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

