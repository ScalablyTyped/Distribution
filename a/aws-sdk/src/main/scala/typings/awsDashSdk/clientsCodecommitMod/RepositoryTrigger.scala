package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTrigger extends js.Object {
  /**
    * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.  While no content is required in the array, you must include the array itself. 
    */
  var branches: js.UndefOr[BranchNameList] = js.undefined
  /**
    * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined
  /**
    * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
    */
  var destinationArn: Arn
  /**
    * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS).   The valid value "all" cannot be used with any other values. 
    */
  var events: RepositoryTriggerEventList
  /**
    * The name of the trigger.
    */
  var name: RepositoryTriggerName
}

object RepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: Arn,
    events: RepositoryTriggerEventList,
    name: RepositoryTriggerName,
    branches: BranchNameList = null,
    customData: RepositoryTriggerCustomData = null
  ): RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events, name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[RepositoryTrigger]
  }
}

