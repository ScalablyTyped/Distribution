package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRestoreStatusMessage extends js.Object {
  /**
    * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of status details for one or more table restore requests.
    */
  var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined
}

object TableRestoreStatusMessage {
  @scala.inline
  def apply(Marker: String = null, TableRestoreStatusDetails: TableRestoreStatusList = null): TableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (TableRestoreStatusDetails != null) __obj.updateDynamic("TableRestoreStatusDetails")(TableRestoreStatusDetails)
    __obj.asInstanceOf[TableRestoreStatusMessage]
  }
}

