package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * The link name associated with the object that needs to be detached.
    */
  var LinkName: awsDashSdkLib.clientsClouddirectoryMod.LinkName
  /**
    * The parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference
}

object DetachObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, LinkName: LinkName, ParentReference: ObjectReference): DetachObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, LinkName = LinkName, ParentReference = ParentReference)
  
    __obj.asInstanceOf[DetachObjectRequest]
  }
}

