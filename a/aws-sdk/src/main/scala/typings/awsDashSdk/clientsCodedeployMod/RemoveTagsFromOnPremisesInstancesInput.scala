package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances from which to remove tags.
    */
  var instanceNames: InstanceNameList = js.native
  /**
    * The tag key-value pairs to remove from the on-premises instances.
    */
  var tags: TagList = js.native
}

object RemoveTagsFromOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): RemoveTagsFromOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
  }
}

