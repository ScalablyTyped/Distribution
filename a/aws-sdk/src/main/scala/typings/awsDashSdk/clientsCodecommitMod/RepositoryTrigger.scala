package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTrigger extends js.Object {
  /**
    * The branches to be included in the trigger configuration. If you specify an empty array, the trigger applies to all branches.  Although no content is required in the array, you must include the array itself. 
    */
  var branches: js.UndefOr[BranchNameList] = js.native
  /**
    * Any custom data associated with the trigger to be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[RepositoryTriggerCustomData] = js.native
  /**
    * The ARN of the resource that is the target for a trigger (for example, the ARN of a topic in Amazon SNS).
    */
  var destinationArn: Arn = js.native
  /**
    * The repository events that cause the trigger to run actions in another service, such as sending a notification through Amazon SNS.   The valid value "all" cannot be used with any other values. 
    */
  var events: RepositoryTriggerEventList = js.native
  /**
    * The name of the trigger.
    */
  var name: RepositoryTriggerName = js.native
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
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTrigger]
  }
}

