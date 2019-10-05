package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeFrom extends js.Object {
  /**
    * If this value is true, the container has read-only access to the volume. If this value is false, then the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The name of another container within the same task definition from which to mount volumes.
    */
  var sourceContainer: js.UndefOr[String] = js.undefined
}

object VolumeFrom {
  @scala.inline
  def apply(readOnly: js.UndefOr[scala.Boolean] = js.undefined, sourceContainer: String = null): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceContainer != null) __obj.updateDynamic("sourceContainer")(sourceContainer)
    __obj.asInstanceOf[VolumeFrom]
  }
}

