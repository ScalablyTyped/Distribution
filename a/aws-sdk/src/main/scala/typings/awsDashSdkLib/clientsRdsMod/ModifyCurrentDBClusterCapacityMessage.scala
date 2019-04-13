package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCurrentDBClusterCapacityMessage extends js.Object {
  /**
    * The DB cluster capacity. Constraints:   Value must be 2, 4, 8, 16, 32, 64, 128, or 256.  
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DB cluster.  
    */
  var DBClusterIdentifier: String
  /**
    * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300.   Value must be from 10 through 600.  
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange, the default, sets the capacity to the specified value as soon as possible.  RollbackCapacityChange ignores the capacity change if a scaling point is not found in the timeout period.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}

object ModifyCurrentDBClusterCapacityMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    Capacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined,
    TimeoutAction: String = null
  ): ModifyCurrentDBClusterCapacityMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
    if (!js.isUndefined(Capacity)) __obj.updateDynamic("Capacity")(Capacity)
    if (!js.isUndefined(SecondsBeforeTimeout)) __obj.updateDynamic("SecondsBeforeTimeout")(SecondsBeforeTimeout)
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction)
    __obj.asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
  }
}

