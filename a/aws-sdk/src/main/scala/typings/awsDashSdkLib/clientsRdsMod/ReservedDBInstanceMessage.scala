package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedDBInstanceMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of reserved DB instances.
    */
  var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined
}

object ReservedDBInstanceMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedDBInstances: ReservedDBInstanceList = null): ReservedDBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedDBInstances != null) __obj.updateDynamic("ReservedDBInstances")(ReservedDBInstances)
    __obj.asInstanceOf[ReservedDBInstanceMessage]
  }
}

