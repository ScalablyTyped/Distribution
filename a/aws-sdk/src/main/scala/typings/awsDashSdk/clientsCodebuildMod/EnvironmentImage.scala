package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentImage extends js.Object {
  /**
    * The description of the Docker image.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the Docker image.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of environment image versions.
    */
  var versions: js.UndefOr[ImageVersions] = js.native
}

object EnvironmentImage {
  @scala.inline
  def apply(description: String = null, name: String = null, versions: ImageVersions = null): EnvironmentImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentImage]
  }
}

