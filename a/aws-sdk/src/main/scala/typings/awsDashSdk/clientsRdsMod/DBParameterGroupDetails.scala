package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBParameterGroupDetails extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  A list of Parameter values. 
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object DBParameterGroupDetails {
  @scala.inline
  def apply(Marker: String = null, Parameters: ParametersList = null): DBParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DBParameterGroupDetails]
  }
}

