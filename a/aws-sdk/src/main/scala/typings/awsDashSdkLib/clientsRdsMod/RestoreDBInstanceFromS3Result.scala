package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBInstanceFromS3Result extends js.Object {
  var DBInstance: js.UndefOr[DBInstance] = js.undefined
}

object RestoreDBInstanceFromS3Result {
  @scala.inline
  def apply(DBInstance: DBInstance = null): RestoreDBInstanceFromS3Result = {
    val __obj = js.Dynamic.literal()
    if (DBInstance != null) __obj.updateDynamic("DBInstance")(DBInstance)
    __obj.asInstanceOf[RestoreDBInstanceFromS3Result]
  }
}

