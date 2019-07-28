package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
}

object GetInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName)
  
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
}

