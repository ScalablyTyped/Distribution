package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * A reference that identifies the object.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object DeleteObjectRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
  
    __obj.asInstanceOf[DeleteObjectRequest]
  }
}

