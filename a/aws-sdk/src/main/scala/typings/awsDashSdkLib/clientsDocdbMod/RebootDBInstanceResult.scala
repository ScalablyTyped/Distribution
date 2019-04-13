package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootDBInstanceResult extends js.Object {
  var DBInstance: js.UndefOr[DBInstance] = js.undefined
}

object RebootDBInstanceResult {
  @scala.inline
  def apply(DBInstance: DBInstance = null): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
}

