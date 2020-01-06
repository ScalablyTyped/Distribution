package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEngineVersion extends js.Object {
  /**
    * The description of the cache engine.
    */
  var CacheEngineDescription: js.UndefOr[String] = js.native
  /**
    * The description of the cache engine version.
    */
  var CacheEngineVersionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cache engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the cache engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
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
    if (CacheEngineDescription != null) __obj.updateDynamic("CacheEngineDescription")(CacheEngineDescription.asInstanceOf[js.Any])
    if (CacheEngineVersionDescription != null) __obj.updateDynamic("CacheEngineVersionDescription")(CacheEngineVersionDescription.asInstanceOf[js.Any])
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEngineVersion]
  }
}

