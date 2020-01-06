package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationBatchResult extends js.Object {
  /**
    * Information about the associations that failed.
    */
  var Failed: js.UndefOr[FailedCreateAssociationList] = js.native
  /**
    * Information about the associations that succeeded.
    */
  var Successful: js.UndefOr[AssociationDescriptionList] = js.native
}

object CreateAssociationBatchResult {
  @scala.inline
  def apply(Failed: FailedCreateAssociationList = null, Successful: AssociationDescriptionList = null): CreateAssociationBatchResult = {
    val __obj = js.Dynamic.literal()
    if (Failed != null) __obj.updateDynamic("Failed")(Failed.asInstanceOf[js.Any])
    if (Successful != null) __obj.updateDynamic("Successful")(Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchResult]
  }
}

