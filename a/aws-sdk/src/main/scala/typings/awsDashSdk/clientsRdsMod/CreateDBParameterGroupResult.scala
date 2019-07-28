package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBParameterGroupResult extends js.Object {
  var DBParameterGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBParameterGroup] = js.undefined
}

object CreateDBParameterGroupResult {
  @scala.inline
  def apply(DBParameterGroup: DBParameterGroup = null): CreateDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroup != null) __obj.updateDynamic("DBParameterGroup")(DBParameterGroup)
    __obj.asInstanceOf[CreateDBParameterGroupResult]
  }
}

