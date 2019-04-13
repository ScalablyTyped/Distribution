package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateIamInstanceProfileRequest extends js.Object {
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification
  /**
    * The ID of the instance.
    */
  var InstanceId: String
}

object AssociateIamInstanceProfileRequest {
  @scala.inline
  def apply(IamInstanceProfile: IamInstanceProfileSpecification, InstanceId: String): AssociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(IamInstanceProfile = IamInstanceProfile, InstanceId = InstanceId)
  
    __obj.asInstanceOf[AssociateIamInstanceProfileRequest]
  }
}

