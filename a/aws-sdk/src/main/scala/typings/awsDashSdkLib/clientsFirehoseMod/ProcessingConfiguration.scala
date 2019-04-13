package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The data processors.
    */
  var Processors: js.UndefOr[ProcessorList] = js.undefined
}

object ProcessingConfiguration {
  @scala.inline
  def apply(Enabled: js.UndefOr[BooleanObject] = js.undefined, Processors: ProcessorList = null): ProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (Processors != null) __obj.updateDynamic("Processors")(Processors)
    __obj.asInstanceOf[ProcessingConfiguration]
  }
}

