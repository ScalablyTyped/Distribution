package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineConfig extends js.Object {
  /**
    * A list of Function objects.
    */
  var functions: js.UndefOr[FunctionsIds] = js.native
}

object PipelineConfig {
  @scala.inline
  def apply(functions: FunctionsIds = null): PipelineConfig = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineConfig]
  }
}

