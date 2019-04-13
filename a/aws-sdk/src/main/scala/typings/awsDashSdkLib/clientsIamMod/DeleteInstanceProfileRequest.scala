package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
}

object DeleteInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType): DeleteInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName)
  
    __obj.asInstanceOf[DeleteInstanceProfileRequest]
  }
}

