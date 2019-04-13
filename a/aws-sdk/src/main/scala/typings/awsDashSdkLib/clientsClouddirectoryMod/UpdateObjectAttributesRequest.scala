package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateObjectAttributesRequest extends js.Object {
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
}

object UpdateObjectAttributesRequest {
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, DirectoryArn: Arn, ObjectReference: ObjectReference): UpdateObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates, DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
  
    __obj.asInstanceOf[UpdateObjectAttributesRequest]
  }
}

