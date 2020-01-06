package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstanceMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved DB instances.
    */
  var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.native
}

object ReservedDBInstanceMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedDBInstances: ReservedDBInstanceList = null): ReservedDBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReservedDBInstances != null) __obj.updateDynamic("ReservedDBInstances")(ReservedDBInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedDBInstanceMessage]
  }
}

