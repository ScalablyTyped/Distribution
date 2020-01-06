package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLimitsOutput extends js.Object {
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject = js.native
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject = js.native
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(OpenShardCount: ShardCountObject, ShardLimit: ShardCountObject): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

