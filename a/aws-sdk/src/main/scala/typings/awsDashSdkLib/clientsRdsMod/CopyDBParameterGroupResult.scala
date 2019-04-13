package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDBParameterGroupResult extends js.Object {
  var DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
}

object CopyDBParameterGroupResult {
  @scala.inline
  def apply(DBParameterGroup: DBParameterGroup = null): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroup != null) __obj.updateDynamic("DBParameterGroup")(DBParameterGroup)
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
}

