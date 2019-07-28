package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectResult extends js.Object {
  var details: js.UndefOr[ProjectDetails] = js.undefined
}

object DescribeProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[DescribeProjectResult]
  }
}

