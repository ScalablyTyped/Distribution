package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDomainInput extends js.Object {
  /**
    * A text description of the domain.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Name of the domain to register. The name must be unique in the region that the domain is registered in. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var name: DomainName
  /**
    * Tags to be added when registering a domain. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[ResourceTagList] = js.undefined
  /**
    * The duration (in days) that records and histories of workflow executions on the domain should be kept by the service. After the retention period, the workflow execution isn't available in the results of visibility calls. If you pass the value NONE or 0 (zero), then the workflow execution history isn't retained. As soon as the workflow execution completes, the execution record and its history are deleted. The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits, see: Amazon SWF Service Limits in the Amazon SWF Developer Guide.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays
}

object RegisterDomainInput {
  @scala.inline
  def apply(
    name: DomainName,
    workflowExecutionRetentionPeriodInDays: DurationInDays,
    description: Description = null,
    tags: ResourceTagList = null
  ): RegisterDomainInput = {
    val __obj = js.Dynamic.literal(name = name, workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RegisterDomainInput]
  }
}

