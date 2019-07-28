package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference
}

object AttachPolicyRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, PolicyReference: ObjectReference): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference, PolicyReference = PolicyReference)
  
    __obj.asInstanceOf[AttachPolicyRequest]
  }
}

