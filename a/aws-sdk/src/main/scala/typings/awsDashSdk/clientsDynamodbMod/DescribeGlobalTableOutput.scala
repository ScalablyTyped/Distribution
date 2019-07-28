package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableOutput extends js.Object {
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.GlobalTableDescription] = js.undefined
}

object DescribeGlobalTableOutput {
  @scala.inline
  def apply(GlobalTableDescription: GlobalTableDescription = null): DescribeGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription)
    __obj.asInstanceOf[DescribeGlobalTableOutput]
  }
}

