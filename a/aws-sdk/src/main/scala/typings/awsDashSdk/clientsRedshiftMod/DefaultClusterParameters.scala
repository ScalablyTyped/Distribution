package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultClusterParameters extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The name of the cluster parameter group family to which the engine default parameters apply.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The list of cluster default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object DefaultClusterParameters {
  @scala.inline
  def apply(Marker: String = null, ParameterGroupFamily: String = null, Parameters: ParametersList = null): DefaultClusterParameters = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ParameterGroupFamily != null) __obj.updateDynamic("ParameterGroupFamily")(ParameterGroupFamily)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DefaultClusterParameters]
  }
}

