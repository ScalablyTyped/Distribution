package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances to which to add tags.
    */
  var instanceNames: InstanceNameList
  /**
    * The tag key-value pairs to add to the on-premises instances. Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
    */
  var tags: TagList
}

object AddTagsToOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): AddTagsToOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames, tags = tags)
  
    __obj.asInstanceOf[AddTagsToOnPremisesInstancesInput]
  }
}

