package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachPolicy extends js.Object {
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference
}

object BatchAttachPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchAttachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference, PolicyReference = PolicyReference)
  
    __obj.asInstanceOf[BatchAttachPolicy]
  }
}

