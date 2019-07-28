package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotEventsDestinationConfiguration extends js.Object {
  /**
    * The name of the AWS IoT Events input to which data set contents are delivered.
    */
  var inputName: IotEventsInputName
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events input.
    */
  var roleArn: RoleArn
}

object IotEventsDestinationConfiguration {
  @scala.inline
  def apply(inputName: IotEventsInputName, roleArn: RoleArn): IotEventsDestinationConfiguration = {
    val __obj = js.Dynamic.literal(inputName = inputName, roleArn = roleArn)
  
    __obj.asInstanceOf[IotEventsDestinationConfiguration]
  }
}

