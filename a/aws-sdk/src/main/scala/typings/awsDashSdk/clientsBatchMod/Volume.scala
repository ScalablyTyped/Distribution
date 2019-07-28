package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * The contents of the host parameter determine whether your data volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data is not guaranteed to persist after the containers associated with it stop running.
    */
  var host: js.UndefOr[Host] = js.undefined
  /**
    * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints.
    */
  var name: js.UndefOr[String] = js.undefined
}

object Volume {
  @scala.inline
  def apply(host: Host = null, name: String = null): Volume = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Volume]
  }
}

