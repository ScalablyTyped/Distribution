package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetachPolicy extends js.Object {
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}

object BatchDetachPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchDetachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference, PolicyReference = PolicyReference)
  
    __obj.asInstanceOf[BatchDetachPolicy]
  }
}

