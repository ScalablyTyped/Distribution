package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSubnetGroupMessage extends js.Object {
  /**
    * The description for the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The name for the DB subnet group. This value is stored as a lowercase string. You can't modify the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String
  /**
    * The EC2 subnet IDs for the DB subnet group.
    */
  var SubnetIds: SubnetIdentifierList
}

object ModifyDBSubnetGroupMessage {
  @scala.inline
  def apply(
    DBSubnetGroupName: String,
    SubnetIds: SubnetIdentifierList,
    DBSubnetGroupDescription: String = null
  ): ModifyDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName, SubnetIds = SubnetIds)
    if (DBSubnetGroupDescription != null) __obj.updateDynamic("DBSubnetGroupDescription")(DBSubnetGroupDescription)
    __obj.asInstanceOf[ModifyDBSubnetGroupMessage]
  }
}

