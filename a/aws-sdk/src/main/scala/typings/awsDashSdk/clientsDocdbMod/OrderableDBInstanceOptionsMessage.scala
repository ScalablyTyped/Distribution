package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOptionsMessage extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The options that are available for a particular orderable DB instance.
    */
  var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.native
}

object OrderableDBInstanceOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, OrderableDBInstanceOptions: OrderableDBInstanceOptionsList = null): OrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OrderableDBInstanceOptions != null) __obj.updateDynamic("OrderableDBInstanceOptions")(OrderableDBInstanceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
  }
}

