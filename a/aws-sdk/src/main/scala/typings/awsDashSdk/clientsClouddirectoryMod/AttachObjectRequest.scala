package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachObjectRequest extends js.Object {
  /**
    * The child object reference to be attached to the object.
    */
  var ChildReference: ObjectReference
  /**
    * Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * The link name with which the child object is attached to the parent.
    */
  var LinkName: typings.awsDashSdk.clientsClouddirectoryMod.LinkName
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference
}

object AttachObjectRequest {
  @scala.inline
  def apply(
    ChildReference: ObjectReference,
    DirectoryArn: Arn,
    LinkName: LinkName,
    ParentReference: ObjectReference
  ): AttachObjectRequest = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference, DirectoryArn = DirectoryArn, LinkName = LinkName, ParentReference = ParentReference)
  
    __obj.asInstanceOf[AttachObjectRequest]
  }
}

