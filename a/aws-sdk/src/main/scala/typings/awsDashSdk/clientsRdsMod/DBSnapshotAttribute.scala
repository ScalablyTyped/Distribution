package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSnapshotAttribute extends js.Object {
  /**
    * The name of the manual DB snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot. For more information, see the ModifyDBSnapshotAttribute API action.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * The value or values for the manual DB snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of all is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}

object DBSnapshotAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AttributeValueList = null): DBSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSnapshotAttribute]
  }
}

