package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheParameterGroup extends js.Object {
  /**
    * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The description for this cache parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
}

object CacheParameterGroup {
  @scala.inline
  def apply(
    CacheParameterGroupFamily: String = null,
    CacheParameterGroupName: String = null,
    Description: String = null
  ): CacheParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily)
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CacheParameterGroup]
  }
}

