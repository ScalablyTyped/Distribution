package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLimitsOutput extends js.Object {
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(OpenShardCount: ShardCountObject, ShardLimit: ShardCountObject): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OpenShardCount = OpenShardCount, ShardLimit = ShardLimit)
  
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

