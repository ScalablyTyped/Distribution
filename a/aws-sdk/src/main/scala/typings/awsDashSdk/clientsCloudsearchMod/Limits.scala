package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limits extends js.Object {
  var MaximumPartitionCount: typings.awsDashSdk.clientsCloudsearchMod.MaximumPartitionCount
  var MaximumReplicationCount: typings.awsDashSdk.clientsCloudsearchMod.MaximumReplicationCount
}

object Limits {
  @scala.inline
  def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount, MaximumReplicationCount = MaximumReplicationCount)
  
    __obj.asInstanceOf[Limits]
  }
}

