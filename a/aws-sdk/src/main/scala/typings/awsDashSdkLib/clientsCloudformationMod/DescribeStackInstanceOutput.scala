package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackInstanceOutput extends js.Object {
  /**
    * The stack instance that matches the specified request parameters.
    */
  var StackInstance: js.UndefOr[StackInstance] = js.undefined
}

object DescribeStackInstanceOutput {
  @scala.inline
  def apply(StackInstance: StackInstance = null): DescribeStackInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (StackInstance != null) __obj.updateDynamic("StackInstance")(StackInstance)
    __obj.asInstanceOf[DescribeStackInstanceOutput]
  }
}

