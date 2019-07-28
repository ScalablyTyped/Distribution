package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroup extends js.Object {
  /**
    * The ARN of the resource group.
    */
  var arn: Arn
  /**
    * The time at which resource group is created.
    */
  var createdAt: Timestamp
  /**
    * The tags (key and value pairs) of the resource group. This data type property is used in the CreateResourceGroup action.
    */
  var tags: ResourceGroupTags
}

object ResourceGroup {
  @scala.inline
  def apply(arn: Arn, createdAt: Timestamp, tags: ResourceGroupTags): ResourceGroup = {
    val __obj = js.Dynamic.literal(arn = arn, createdAt = createdAt, tags = tags)
  
    __obj.asInstanceOf[ResourceGroup]
  }
}

