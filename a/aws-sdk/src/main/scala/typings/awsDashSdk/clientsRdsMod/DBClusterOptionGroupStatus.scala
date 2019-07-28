package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterOptionGroupStatus extends js.Object {
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object DBClusterOptionGroupStatus {
  @scala.inline
  def apply(DBClusterOptionGroupName: String = null, Status: String = null): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (DBClusterOptionGroupName != null) __obj.updateDynamic("DBClusterOptionGroupName")(DBClusterOptionGroupName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
}

