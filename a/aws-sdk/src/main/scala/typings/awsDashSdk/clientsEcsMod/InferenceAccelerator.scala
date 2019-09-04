package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InferenceAccelerator extends js.Object {
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String
}

object InferenceAccelerator {
  @scala.inline
  def apply(deviceName: String, deviceType: String): InferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, deviceType = deviceType)
  
    __obj.asInstanceOf[InferenceAccelerator]
  }
}

