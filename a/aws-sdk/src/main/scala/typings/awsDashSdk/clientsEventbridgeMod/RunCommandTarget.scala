package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCommandTarget extends js.Object {
  /**
    * Can be either tag: tag-key or InstanceIds.
    */
  var Key: RunCommandTargetKey
  /**
    * If Key is tag: tag-key, Values is a list of tag values. If Key is InstanceIds, Values is a list of Amazon EC2 instance IDs.
    */
  var Values: RunCommandTargetValues
}

object RunCommandTarget {
  @scala.inline
  def apply(Key: RunCommandTargetKey, Values: RunCommandTargetValues): RunCommandTarget = {
    val __obj = js.Dynamic.literal(Key = Key, Values = Values)
  
    __obj.asInstanceOf[RunCommandTarget]
  }
}

