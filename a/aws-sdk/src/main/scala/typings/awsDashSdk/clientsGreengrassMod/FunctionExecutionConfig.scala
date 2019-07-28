package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionExecutionConfig extends js.Object {
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
}

object FunctionExecutionConfig {
  @scala.inline
  def apply(IsolationMode: FunctionIsolationMode = null, RunAs: FunctionRunAsConfig = null): FunctionExecutionConfig = {
    val __obj = js.Dynamic.literal()
    if (IsolationMode != null) __obj.updateDynamic("IsolationMode")(IsolationMode.asInstanceOf[js.Any])
    if (RunAs != null) __obj.updateDynamic("RunAs")(RunAs)
    __obj.asInstanceOf[FunctionExecutionConfig]
  }
}

