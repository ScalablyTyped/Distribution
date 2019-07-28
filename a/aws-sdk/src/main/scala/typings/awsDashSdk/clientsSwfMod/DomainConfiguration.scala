package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainConfiguration extends js.Object {
  /**
    * The retention period for workflow executions in this domain.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays
}

object DomainConfiguration {
  @scala.inline
  def apply(workflowExecutionRetentionPeriodInDays: DurationInDays): DomainConfiguration = {
    val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays)
  
    __obj.asInstanceOf[DomainConfiguration]
  }
}

