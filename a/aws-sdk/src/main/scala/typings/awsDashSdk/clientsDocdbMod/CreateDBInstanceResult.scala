package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.DBInstance] = js.undefined
}

object CreateDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): CreateDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[CreateDBInstanceResult]
  }
}

