package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeInfo extends js.Object {
  /**
    * The date when this type was registered.
    */
  var creationDate: Timestamp = js.native
  /**
    * If the type is in deprecated state, then it is set to the date when the type was deprecated.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the type registered through RegisterWorkflowType.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The current status of the workflow type.
    */
  var status: RegistrationStatus = js.native
  /**
    * The workflow type this information is about.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowTypeInfo {
  @scala.inline
  def apply(
    creationDate: Timestamp,
    status: RegistrationStatus,
    workflowType: WorkflowType,
    deprecationDate: Timestamp = null,
    description: Description = null
  ): WorkflowTypeInfo = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfo]
  }
}

