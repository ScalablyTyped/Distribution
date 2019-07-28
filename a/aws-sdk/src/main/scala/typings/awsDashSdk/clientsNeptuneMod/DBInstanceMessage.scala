package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBInstanceMessage extends js.Object {
  /**
    *  A list of DBInstance instances.
    */
  var DBInstances: js.UndefOr[DBInstanceList] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBInstanceMessage {
  @scala.inline
  def apply(DBInstances: DBInstanceList = null, Marker: String = null): DBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    if (DBInstances != null) __obj.updateDynamic("DBInstances")(DBInstances)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBInstanceMessage]
  }
}

