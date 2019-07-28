package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileResponse extends js.Object {
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typings.awsDashSdk.clientsIamMod.InstanceProfile
}

object GetInstanceProfileResponse {
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile)
  
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
}

