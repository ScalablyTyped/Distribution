package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  /**
    * The path on the container to mount the host volume at.
    */
  var containerPath: js.UndefOr[String] = js.undefined
  /**
    * If this value is true, the container has read-only access to the volume. If this value is false, then the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The name of the volume to mount. Must be a volume name referenced in the name parameter of task definition volume.
    */
  var sourceVolume: js.UndefOr[String] = js.undefined
}

object MountPoint {
  @scala.inline
  def apply(
    containerPath: String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    sourceVolume: String = null
  ): MountPoint = {
    val __obj = js.Dynamic.literal()
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceVolume != null) __obj.updateDynamic("sourceVolume")(sourceVolume)
    __obj.asInstanceOf[MountPoint]
  }
}

