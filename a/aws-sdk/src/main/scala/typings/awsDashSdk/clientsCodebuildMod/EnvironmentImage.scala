package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentImage extends js.Object {
  /**
    * The description of the Docker image.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the Docker image.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A list of environment image versions.
    */
  var versions: js.UndefOr[ImageVersions] = js.undefined
}

object EnvironmentImage {
  @scala.inline
  def apply(description: String = null, name: String = null, versions: ImageVersions = null): EnvironmentImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[EnvironmentImage]
  }
}

