package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket event for which to invoke the AWS Lambda function. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList
  /**
    * 
    */
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
    */
  var LambdaFunctionArn: typings.awsDashSdk.clientsS3Mod.LambdaFunctionArn
}

object LambdaFunctionConfiguration {
  @scala.inline
  def apply(
    Events: EventList,
    LambdaFunctionArn: LambdaFunctionArn,
    Filter: NotificationConfigurationFilter = null,
    Id: NotificationId = null
  ): LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events, LambdaFunctionArn = LambdaFunctionArn)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[LambdaFunctionConfiguration]
  }
}

