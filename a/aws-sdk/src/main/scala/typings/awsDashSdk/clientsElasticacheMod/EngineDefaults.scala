package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineDefaults extends js.Object {
  /**
    * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
    */
  var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
  /**
    * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Contains a list of engine default parameters.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
}

object EngineDefaults {
  @scala.inline
  def apply(
    CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList = null,
    CacheParameterGroupFamily: String = null,
    Marker: String = null,
    Parameters: ParametersList = null
  ): EngineDefaults = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeTypeSpecificParameters != null) __obj.updateDynamic("CacheNodeTypeSpecificParameters")(CacheNodeTypeSpecificParameters)
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[EngineDefaults]
  }
}

