package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
  /**
    * The number of instances to reserve. Default: 1 
    */
  var DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Customer-specified identifier to track this reservation. Example: myreservationID
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Reserved DB instance offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
    */
  var ReservedDBInstancesOfferingId: String
  var Tags: js.UndefOr[TagList] = js.undefined
}

object PurchaseReservedDBInstancesOfferingMessage {
  @scala.inline
  def apply(
    ReservedDBInstancesOfferingId: String,
    DBInstanceCount: Int | scala.Double = null,
    ReservedDBInstanceId: String = null,
    Tags: TagList = null
  ): PurchaseReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedDBInstancesOfferingId = ReservedDBInstancesOfferingId)
    if (DBInstanceCount != null) __obj.updateDynamic("DBInstanceCount")(DBInstanceCount.asInstanceOf[js.Any])
    if (ReservedDBInstanceId != null) __obj.updateDynamic("ReservedDBInstanceId")(ReservedDBInstanceId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
  }
}

