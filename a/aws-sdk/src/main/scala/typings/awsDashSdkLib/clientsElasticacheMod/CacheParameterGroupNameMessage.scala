package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
}

object CacheParameterGroupNameMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String = null): CacheParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName)
    __obj.asInstanceOf[CacheParameterGroupNameMessage]
  }
}

