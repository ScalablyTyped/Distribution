package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaResource extends js.Object {
  /**
    * The array of ARNs for S3Resource objects to trigger the LambdaResource objects associated with this job.
    */
  var EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the associated local Amazon S3 resource.
    */
  var LambdaArn: js.UndefOr[ResourceARN] = js.undefined
}

object LambdaResource {
  @scala.inline
  def apply(EventTriggers: EventTriggerDefinitionList = null, LambdaArn: ResourceARN = null): LambdaResource = {
    val __obj = js.Dynamic.literal()
    if (EventTriggers != null) __obj.updateDynamic("EventTriggers")(EventTriggers)
    if (LambdaArn != null) __obj.updateDynamic("LambdaArn")(LambdaArn)
    __obj.asInstanceOf[LambdaResource]
  }
}

