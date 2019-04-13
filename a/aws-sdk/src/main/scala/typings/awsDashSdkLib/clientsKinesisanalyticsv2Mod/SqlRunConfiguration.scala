package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlRunConfiguration extends js.Object {
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: awsDashSdkLib.clientsKinesisanalyticsv2Mod.InputStartingPositionConfiguration
}

object SqlRunConfiguration {
  @scala.inline
  def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId, InputStartingPositionConfiguration = InputStartingPositionConfiguration)
  
    __obj.asInstanceOf[SqlRunConfiguration]
  }
}

