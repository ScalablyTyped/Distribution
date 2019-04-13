package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBSecurityGroupMessage extends js.Object {
  /**
    *  A list of DBSecurityGroup instances. 
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBSecurityGroupMessage {
  @scala.inline
  def apply(DBSecurityGroups: DBSecurityGroups = null, Marker: String = null): DBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBSecurityGroupMessage]
  }
}

