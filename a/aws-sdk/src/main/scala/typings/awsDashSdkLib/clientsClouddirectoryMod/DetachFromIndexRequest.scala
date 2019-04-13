package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachFromIndexRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory the index and object exist in.
    */
  var DirectoryArn: Arn
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference
}

object DetachFromIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): DetachFromIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, IndexReference = IndexReference, TargetReference = TargetReference)
  
    __obj.asInstanceOf[DetachFromIndexRequest]
  }
}

