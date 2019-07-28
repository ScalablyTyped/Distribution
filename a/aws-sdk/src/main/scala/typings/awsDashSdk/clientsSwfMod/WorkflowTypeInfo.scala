package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTypeInfo extends js.Object {
  /**
    * The date when this type was registered.
    */
  var creationDate: Timestamp
  /**
    * If the type is in deprecated state, then it is set to the date when the type was deprecated.
    */
  var deprecationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the type registered through RegisterWorkflowType.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The current status of the workflow type.
    */
  var status: RegistrationStatus
  /**
    * The workflow type this information is about.
    */
  var workflowType: WorkflowType
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
    val __obj = js.Dynamic.literal(creationDate = creationDate, status = status.asInstanceOf[js.Any], workflowType = workflowType)
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[WorkflowTypeInfo]
  }
}

