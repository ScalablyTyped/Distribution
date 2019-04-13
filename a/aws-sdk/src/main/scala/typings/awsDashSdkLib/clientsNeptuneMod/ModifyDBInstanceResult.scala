package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[DBInstance] = js.undefined
}

object ModifyDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): ModifyDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[ModifyDBInstanceResult]
  }
}

