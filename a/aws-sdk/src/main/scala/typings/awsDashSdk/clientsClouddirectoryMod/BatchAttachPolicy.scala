package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachPolicy extends js.Object {
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference = js.native
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}

object BatchAttachPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchAttachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchAttachPolicy]
  }
}

