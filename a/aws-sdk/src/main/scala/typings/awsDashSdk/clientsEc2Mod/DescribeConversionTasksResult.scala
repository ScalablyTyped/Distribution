package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConversionTasksResult extends js.Object {
  /**
    * Information about the conversion tasks.
    */
  var ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.undefined
}

object DescribeConversionTasksResult {
  @scala.inline
  def apply(ConversionTasks: DescribeConversionTaskList = null): DescribeConversionTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ConversionTasks != null) __obj.updateDynamic("ConversionTasks")(ConversionTasks)
    __obj.asInstanceOf[DescribeConversionTasksResult]
  }
}

