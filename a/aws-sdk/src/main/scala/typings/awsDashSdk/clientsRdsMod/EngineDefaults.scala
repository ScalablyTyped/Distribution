package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineDefaults extends js.Object {
  /**
    * Specifies the name of the DB parameter group family that the engine default parameters apply to.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    *  An optional pagination token provided by a previous EngineDefaults request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Contains a list of engine default parameters.
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

