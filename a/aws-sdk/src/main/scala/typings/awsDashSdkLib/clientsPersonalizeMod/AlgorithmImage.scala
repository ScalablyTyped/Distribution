package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmImage extends js.Object {
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var dockerURI: DockerURI
  /**
    * The name of the algorithm image.
    */
  var name: js.UndefOr[Name] = js.undefined
}

object AlgorithmImage {
  @scala.inline
  def apply(dockerURI: DockerURI, name: Name = null): AlgorithmImage = {
    val __obj = js.Dynamic.literal(dockerURI = dockerURI)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AlgorithmImage]
  }
}

