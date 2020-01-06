package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateObjectAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference = js.native
}

object UpdateObjectAttributesRequest {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, DirectoryArn: Arn, ObjectReference: ObjectReference): UpdateObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateObjectAttributesRequest]
  }
}

