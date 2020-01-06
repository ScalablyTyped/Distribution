package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmImage extends js.Object {
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var dockerURI: DockerURI = js.native
  /**
    * The name of the algorithm image.
    */
  var name: js.UndefOr[Name] = js.native
}

object AlgorithmImage {
  @scala.inline
  def apply(dockerURI: DockerURI, name: Name = null): AlgorithmImage = {
    val __obj = js.Dynamic.literal(dockerURI = dockerURI.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmImage]
  }
}

