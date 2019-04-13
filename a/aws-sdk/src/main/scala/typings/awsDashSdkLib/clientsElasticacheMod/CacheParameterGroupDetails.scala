package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheParameterGroupDetails extends js.Object {
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of Parameter instances.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object CacheParameterGroupDetails {
  @scala.inline
  def apply(
    CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList = null,
    Marker: String = null,
    Parameters: ParametersList = null
  ): CacheParameterGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeTypeSpecificParameters != null) __obj.updateDynamic("CacheNodeTypeSpecificParameters")(CacheNodeTypeSpecificParameters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[CacheParameterGroupDetails]
  }
}

