package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The link name associated with the object that needs to be detached.
    */
  var LinkName: typings.awsDashSdk.clientsClouddirectoryMod.LinkName = js.native
  /**
    * The parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference = js.native
}

object DetachObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, LinkName: LinkName, ParentReference: ObjectReference): DetachObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachObjectRequest]
  }
}

