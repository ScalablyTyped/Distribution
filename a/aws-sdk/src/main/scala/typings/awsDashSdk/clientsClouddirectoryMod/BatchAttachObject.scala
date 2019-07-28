package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachObject extends js.Object {
  /**
    * The child object reference that is to be attached to the object.
    */
  var ChildReference: ObjectReference
  /**
    * The name of the link.
    */
  var LinkName: typings.awsDashSdk.clientsClouddirectoryMod.LinkName
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference
}

object BatchAttachObject {
  @scala.inline
  def apply(ChildReference: ObjectReference, LinkName: LinkName, ParentReference: ObjectReference): BatchAttachObject = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference, LinkName = LinkName, ParentReference = ParentReference)
  
    __obj.asInstanceOf[BatchAttachObject]
  }
}

