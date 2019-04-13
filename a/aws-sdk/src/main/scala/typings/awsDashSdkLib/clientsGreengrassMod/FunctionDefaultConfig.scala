package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefaultConfig extends js.Object {
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.undefined
}

object FunctionDefaultConfig {
  @scala.inline
  def apply(Execution: FunctionDefaultExecutionConfig = null): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    if (Execution != null) __obj.updateDynamic("Execution")(Execution)
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
}

