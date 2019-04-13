package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBSubnetGroupMessage extends js.Object {
  /**
    * The name of the database subnet group to delete.  You can't delete the default subnet group.  Constraints: Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String
}

object DeleteDBSubnetGroupMessage {
  @scala.inline
  def apply(DBSubnetGroupName: String): DeleteDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName)
  
    __obj.asInstanceOf[DeleteDBSubnetGroupMessage]
  }
}

