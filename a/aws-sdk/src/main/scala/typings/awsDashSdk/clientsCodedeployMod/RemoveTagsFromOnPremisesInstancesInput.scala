package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances from which to remove tags.
    */
  var instanceNames: InstanceNameList
  /**
    * The tag key-value pairs to remove from the on-premises instances.
    */
  var tags: TagList
}

object RemoveTagsFromOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): RemoveTagsFromOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames, tags = tags)
  
    __obj.asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
  }
}

