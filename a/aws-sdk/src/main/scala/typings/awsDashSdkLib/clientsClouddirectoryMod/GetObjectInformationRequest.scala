package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectInformationRequest extends js.Object {
  /**
    * The consistency level at which to retrieve the object information.
    */
  var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
  /**
    * The ARN of the directory being retrieved.
    */
  var DirectoryArn: Arn
  /**
    * A reference to the object.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
}

object GetObjectInformationRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, ConsistencyLevel: ConsistencyLevel = null): GetObjectInformationRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInformationRequest]
  }
}

