package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBInstanceToPointInTimeResult extends js.Object {
  var DBInstance: js.UndefOr[DBInstance] = js.undefined
}

object RestoreDBInstanceToPointInTimeResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): RestoreDBInstanceToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[RestoreDBInstanceToPointInTimeResult]
  }
}

