package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetObjectInformation extends js.Object {
  /**
    * A reference to the object.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchGetObjectInformation {
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchGetObjectInformation = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
  
    __obj.asInstanceOf[BatchGetObjectInformation]
  }
}

