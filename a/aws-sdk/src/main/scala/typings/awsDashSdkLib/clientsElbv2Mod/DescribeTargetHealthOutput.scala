package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTargetHealthOutput extends js.Object {
  /**
    * Information about the health of the targets.
    */
  var TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions] = js.undefined
}

object DescribeTargetHealthOutput {
  @scala.inline
  def apply(TargetHealthDescriptions: TargetHealthDescriptions = null): DescribeTargetHealthOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetHealthDescriptions != null) __obj.updateDynamic("TargetHealthDescriptions")(TargetHealthDescriptions)
    __obj.asInstanceOf[DescribeTargetHealthOutput]
  }
}

