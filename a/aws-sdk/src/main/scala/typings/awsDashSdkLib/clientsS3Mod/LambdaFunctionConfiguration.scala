package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionConfiguration extends js.Object {
  /**
    * 
    */
  var Events: EventList
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Lambda cloud function that Amazon S3 can invoke when it detects events of the specified type.
    */
  var LambdaFunctionArn: awsDashSdkLib.clientsS3Mod.LambdaFunctionArn
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

