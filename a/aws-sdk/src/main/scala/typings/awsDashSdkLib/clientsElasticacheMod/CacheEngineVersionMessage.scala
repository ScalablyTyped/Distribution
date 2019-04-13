package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEngineVersionMessage extends js.Object {
  /**
    * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
    */
  var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object CacheEngineVersionMessage {
  @scala.inline
  def apply(CacheEngineVersions: CacheEngineVersionList = null, Marker: String = null): CacheEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheEngineVersions != null) __obj.updateDynamic("CacheEngineVersions")(CacheEngineVersions)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[CacheEngineVersionMessage]
  }
}

