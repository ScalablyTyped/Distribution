package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSecurityGroupMessage extends js.Object {
  /**
    * A list of cache security groups. Each element in the list contains detailed information about one group.
    */
  var CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object CacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroups: CacheSecurityGroups = null, Marker: String = null): CacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroups != null) __obj.updateDynamic("CacheSecurityGroups")(CacheSecurityGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[CacheSecurityGroupMessage]
  }
}

