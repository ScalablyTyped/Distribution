package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroupMessage extends js.Object {
  /**
    *  A list of DBSecurityGroup instances. 
    */
  var DBSecurityGroups: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSecurityGroups] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBSecurityGroupMessage {
  @scala.inline
  def apply(DBSecurityGroups: DBSecurityGroups = null, Marker: String = null): DBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSecurityGroupMessage]
  }
}

