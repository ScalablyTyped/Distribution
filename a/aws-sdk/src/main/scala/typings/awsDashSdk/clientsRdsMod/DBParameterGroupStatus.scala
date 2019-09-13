package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBParameterGroupStatus extends js.Object {
  /**
    * The name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
}

object DBParameterGroupStatus {
  @scala.inline
  def apply(DBParameterGroupName: String = null, ParameterApplyStatus: String = null): DBParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName)
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus)
    __obj.asInstanceOf[DBParameterGroupStatus]
  }
}

