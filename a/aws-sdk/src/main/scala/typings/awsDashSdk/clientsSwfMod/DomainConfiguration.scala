package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainConfiguration extends js.Object {
  /**
    * The retention period for workflow executions in this domain.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays = js.native
}

object DomainConfiguration {
  @scala.inline
  def apply(workflowExecutionRetentionPeriodInDays: DurationInDays): DomainConfiguration = {
    val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainConfiguration]
  }
}

