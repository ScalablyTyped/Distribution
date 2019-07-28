package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteObject extends js.Object {
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchDeleteObject {
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchDeleteObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
  
    __obj.asInstanceOf[BatchDeleteObject]
  }
}

