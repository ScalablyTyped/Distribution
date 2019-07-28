package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterCapacityInfo extends js.Object {
  /**
    * The current capacity of the DB cluster.
    */
  var CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A value that specifies the capacity that the DB cluster scales to next.
    */
  var PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}

object DBClusterCapacityInfo {
  @scala.inline
  def apply(
    CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    DBClusterIdentifier: String = null,
    PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
    TimeoutAction: String = null
  ): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentCapacity)) __obj.updateDynamic("CurrentCapacity")(CurrentCapacity)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (!js.isUndefined(PendingCapacity)) __obj.updateDynamic("PendingCapacity")(PendingCapacity)
    if (!js.isUndefined(SecondsBeforeTimeout)) __obj.updateDynamic("SecondsBeforeTimeout")(SecondsBeforeTimeout)
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction)
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
}

