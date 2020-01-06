package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDestination extends js.Object {
  /**
    * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations = js.native
}

object CloudWatchDestination {
  @scala.inline
  def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudWatchDestination]
  }
}

