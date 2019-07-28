package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineDefaults extends js.Object {
  /**
    * The name of the DB cluster parameter group family to return the engine parameter information for.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The parameters of a particular DB cluster parameter group family.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object EngineDefaults {
  @scala.inline
  def apply(DBParameterGroupFamily: String = null, Marker: String = null, Parameters: ParametersList = null): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[EngineDefaults]
  }
}

