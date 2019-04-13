package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineConfig extends js.Object {
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[FunctionsIds] = js.undefined
}

object PipelineConfig {
  @scala.inline
  def apply(functions: FunctionsIds = null): PipelineConfig = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    __obj.asInstanceOf[PipelineConfig]
  }
}

