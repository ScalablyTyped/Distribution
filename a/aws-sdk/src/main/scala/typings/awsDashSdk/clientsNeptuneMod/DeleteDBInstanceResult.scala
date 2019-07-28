package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.DBInstance] = js.undefined
}

object DeleteDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): DeleteDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[DeleteDBInstanceResult]
  }
}

