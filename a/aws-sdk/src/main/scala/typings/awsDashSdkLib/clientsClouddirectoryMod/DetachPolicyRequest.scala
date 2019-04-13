package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}

object DetachPolicyRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, PolicyReference: ObjectReference): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference, PolicyReference = PolicyReference)
  
    __obj.asInstanceOf[DetachPolicyRequest]
  }
}

