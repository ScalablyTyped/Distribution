package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
}

object CacheParameterGroupNameMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String = null): CacheParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheParameterGroupNameMessage]
  }
}

