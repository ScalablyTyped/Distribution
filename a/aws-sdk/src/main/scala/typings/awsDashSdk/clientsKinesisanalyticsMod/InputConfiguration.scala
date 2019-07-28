package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputConfiguration extends js.Object {
  /**
    * Input source ID. You can get this ID by calling the DescribeApplication operation.
    */
  var Id: typings.awsDashSdk.clientsKinesisanalyticsMod.Id
  /**
    * Point at which you want the application to start processing records from the streaming source.
    */
  var InputStartingPositionConfiguration: typings.awsDashSdk.clientsKinesisanalyticsMod.InputStartingPositionConfiguration
}

object InputConfiguration {
  @scala.inline
  def apply(Id: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): InputConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id, InputStartingPositionConfiguration = InputStartingPositionConfiguration)
  
    __obj.asInstanceOf[InputConfiguration]
  }
}

