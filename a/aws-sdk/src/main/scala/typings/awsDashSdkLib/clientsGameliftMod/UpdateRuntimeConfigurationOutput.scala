package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRuntimeConfigurationOutput extends js.Object {
  /**
    * The run-time configuration currently in force. If the update was successful, this object matches the one in the request.
    */
  var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
}

object UpdateRuntimeConfigurationOutput {
  @scala.inline
  def apply(RuntimeConfiguration: RuntimeConfiguration = null): UpdateRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (RuntimeConfiguration != null) __obj.updateDynamic("RuntimeConfiguration")(RuntimeConfiguration)
    __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
  }
}

