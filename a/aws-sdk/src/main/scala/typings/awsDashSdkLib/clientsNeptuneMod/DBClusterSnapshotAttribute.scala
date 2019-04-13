package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterSnapshotAttribute extends js.Object {
  /**
    * The name of the manual DB cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot. For more information, see the ModifyDBClusterSnapshotAttribute API action.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  /**
    * The value(s) for the manual DB cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of all is in the list, then the manual DB cluster snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
}

object DBClusterSnapshotAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AttributeValueList = null): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues)
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
}

