package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackResult extends js.Object {
  /**
    * The stack ID, which is an opaque string that you use to identify the stack when performing actions such as DescribeStacks.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object CreateStackResult {
  @scala.inline
  def apply(StackId: String = null): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CreateStackResult]
  }
}

