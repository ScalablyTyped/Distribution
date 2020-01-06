package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetGroupAttributesOutput extends js.Object {
  /**
    * Information about the target group attributes
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.native
}

object DescribeTargetGroupAttributesOutput {
  @scala.inline
  def apply(Attributes: TargetGroupAttributes = null): DescribeTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetGroupAttributesOutput]
  }
}

