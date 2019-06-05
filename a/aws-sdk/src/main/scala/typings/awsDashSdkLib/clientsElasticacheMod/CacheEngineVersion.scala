package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEngineVersion extends js.Object {
  /**
    * The description of the cache engine.
    */
  var CacheEngineDescription: js.UndefOr[String] = js.undefined
  /**
    * The description of the cache engine version.
    */
  var CacheEngineVersionDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version number of the cache engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
}

object CacheEngineVersion {
  @scala.inline
  def apply(
    CacheEngineDescription: String = null,
    CacheEngineVersionDescription: String = null,
    CacheParameterGroupFamily: String = null,
    Engine: String = null,
    EngineVersion: String = null
  ): CacheEngineVersion = {
    val __obj = js.Dynamic.literal()
    if (CacheEngineDescription != null) __obj.updateDynamic("CacheEngineDescription")(CacheEngineDescription)
    if (CacheEngineVersionDescription != null) __obj.updateDynamic("CacheEngineVersionDescription")(CacheEngineVersionDescription)
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    __obj.asInstanceOf[CacheEngineVersion]
  }
}

