package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAssociationRequest extends js.Object {
  /**
    * The association ID that you want to delete.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
}

object DeleteAssociationRequest {
  @scala.inline
  def apply(AssociationId: AssociationId = null, InstanceId: InstanceId = null, Name: DocumentARN = null): DeleteAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DeleteAssociationRequest]
  }
}

