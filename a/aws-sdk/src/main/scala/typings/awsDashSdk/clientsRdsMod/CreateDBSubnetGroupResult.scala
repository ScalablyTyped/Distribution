package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSubnetGroup] = js.undefined
}

object CreateDBSubnetGroupResult {
  @scala.inline
  def apply(DBSubnetGroup: DBSubnetGroup = null): CreateDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    __obj.asInstanceOf[CreateDBSubnetGroupResult]
  }
}

