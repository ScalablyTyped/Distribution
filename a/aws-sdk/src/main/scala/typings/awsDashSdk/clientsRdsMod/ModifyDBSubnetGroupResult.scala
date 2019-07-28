package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSubnetGroup] = js.undefined
}

object ModifyDBSubnetGroupResult {
  @scala.inline
  def apply(DBSubnetGroup: DBSubnetGroup = null): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
}

