package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderableDBInstanceOptionsMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * An OrderableDBInstanceOption structure containing information about orderable options for the DB instance.
    */
  var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined
}

object OrderableDBInstanceOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, OrderableDBInstanceOptions: OrderableDBInstanceOptionsList = null): OrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (OrderableDBInstanceOptions != null) __obj.updateDynamic("OrderableDBInstanceOptions")(OrderableDBInstanceOptions)
    __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
  }
}

