package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBParameterGroupResult extends js.Object {
  var DBParameterGroup: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.DBParameterGroup] = js.native
}

object CreateDBParameterGroupResult {
  @scala.inline
  def apply(DBParameterGroup: DBParameterGroup = null): CreateDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroup != null) __obj.updateDynamic("DBParameterGroup")(DBParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBParameterGroupResult]
  }
}

