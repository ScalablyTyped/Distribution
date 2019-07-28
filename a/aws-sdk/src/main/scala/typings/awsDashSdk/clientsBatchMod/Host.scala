package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  /**
    * The path on the host container instance that is presented to the container. If this parameter is empty, then the Docker daemon has assigned a host path for you. If this parameter contains a file location, then the data volume persists at the specified location on the host container instance until you delete it manually. If the source path location does not exist on the host container instance, the Docker daemon creates it. If the location does exist, the contents of the source path folder are exported.
    */
  var sourcePath: js.UndefOr[String] = js.undefined
}

object Host {
  @scala.inline
  def apply(sourcePath: String = null): Host = {
    val __obj = js.Dynamic.literal()
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath)
    __obj.asInstanceOf[Host]
  }
}

