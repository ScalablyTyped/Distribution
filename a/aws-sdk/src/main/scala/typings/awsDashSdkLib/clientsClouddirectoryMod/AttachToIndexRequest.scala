package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachToIndexRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where the object and index exist.
    */
  var DirectoryArn: Arn
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference
}

object AttachToIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): AttachToIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, IndexReference = IndexReference, TargetReference = TargetReference)
  
    __obj.asInstanceOf[AttachToIndexRequest]
  }
}

