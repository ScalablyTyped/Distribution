package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAssociationStatusRequest extends js.Object {
  /**
    * The association status.
    */
  var AssociationStatus: awsDashSdkLib.clientsSsmMod.AssociationStatus
  /**
    * The ID of the instance.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN
}

object UpdateAssociationStatusRequest {
  @scala.inline
  def apply(AssociationStatus: AssociationStatus, InstanceId: InstanceId, Name: DocumentARN): UpdateAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus, InstanceId = InstanceId, Name = Name)
  
    __obj.asInstanceOf[UpdateAssociationStatusRequest]
  }
}

