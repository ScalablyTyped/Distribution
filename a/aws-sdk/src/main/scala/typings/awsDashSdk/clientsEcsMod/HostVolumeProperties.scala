package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostVolumeProperties extends js.Object {
  /**
    * When the host parameter is used, specify a sourcePath to declare the path on the host container instance that is presented to the container. If this parameter is empty, then the Docker daemon has assigned a host path for you. If the host parameter contains a sourcePath file location, then the data volume persists at the specified location on the host container instance until you delete it manually. If the sourcePath value does not exist on the host container instance, the Docker daemon creates it. If the location does exist, the contents of the source path folder are exported. If you are using the Fargate launch type, the sourcePath parameter is not supported.
    */
  var sourcePath: js.UndefOr[String] = js.undefined
}

object HostVolumeProperties {
  @scala.inline
  def apply(sourcePath: String = null): HostVolumeProperties = {
    val __obj = js.Dynamic.literal()
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath)
    __obj.asInstanceOf[HostVolumeProperties]
  }
}

