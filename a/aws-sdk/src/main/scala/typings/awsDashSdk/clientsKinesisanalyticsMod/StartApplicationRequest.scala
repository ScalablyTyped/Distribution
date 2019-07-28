package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartApplicationRequest extends js.Object {
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts reading the streaming source associated with the input. You can also specify where in the streaming source you want Amazon Kinesis Analytics to start reading.
    */
  var InputConfigurations: typings.awsDashSdk.clientsKinesisanalyticsMod.InputConfigurations
}

object StartApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, InputConfigurations: InputConfigurations): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, InputConfigurations = InputConfigurations)
  
    __obj.asInstanceOf[StartApplicationRequest]
  }
}

