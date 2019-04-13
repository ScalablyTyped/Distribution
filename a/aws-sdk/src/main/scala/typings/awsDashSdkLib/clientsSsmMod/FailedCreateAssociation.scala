package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedCreateAssociation extends js.Object {
  /**
    * The association.
    */
  var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined
  /**
    * The source of the failure.
    */
  var Fault: js.UndefOr[Fault] = js.undefined
  /**
    * A description of the failure.
    */
  var Message: js.UndefOr[BatchErrorMessage] = js.undefined
}

object FailedCreateAssociation {
  @scala.inline
  def apply(
    Entry: CreateAssociationBatchRequestEntry = null,
    Fault: Fault = null,
    Message: BatchErrorMessage = null
  ): FailedCreateAssociation = {
    val __obj = js.Dynamic.literal()
    if (Entry != null) __obj.updateDynamic("Entry")(Entry)
    if (Fault != null) __obj.updateDynamic("Fault")(Fault.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[FailedCreateAssociation]
  }
}

