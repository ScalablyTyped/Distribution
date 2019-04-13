package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchDestination extends js.Object {
  /**
    * A list of dimensions upon which to categorize your emails when you publish email sending events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations
}

object CloudWatchDestination {
  @scala.inline
  def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations)
  
    __obj.asInstanceOf[CloudWatchDestination]
  }
}

