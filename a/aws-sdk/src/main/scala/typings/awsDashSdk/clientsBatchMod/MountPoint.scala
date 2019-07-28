package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  /**
    * The path on the container at which to mount the host volume.
    */
  var containerPath: js.UndefOr[String] = js.undefined
  /**
    * If this value is true, the container has read-only access to the volume; otherwise, the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the volume to mount.
    */
  var sourceVolume: js.UndefOr[String] = js.undefined
}

object MountPoint {
  @scala.inline
  def apply(
    containerPath: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    sourceVolume: String = null
  ): MountPoint = {
    val __obj = js.Dynamic.literal()
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceVolume != null) __obj.updateDynamic("sourceVolume")(sourceVolume)
    __obj.asInstanceOf[MountPoint]
  }
}

