package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBInstanceReadReplicaResult extends js.Object {
  var DBInstance: js.UndefOr[DBInstance] = js.undefined
}

object CreateDBInstanceReadReplicaResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): CreateDBInstanceReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[CreateDBInstanceReadReplicaResult]
  }
}

