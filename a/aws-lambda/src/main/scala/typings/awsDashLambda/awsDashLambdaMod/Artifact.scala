package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  var location: ArtifactLocation
  var name: String
  var revision: String | Null
}

object Artifact {
  @scala.inline
  def apply(location: ArtifactLocation, name: String, revision: String = null): Artifact = {
    val __obj = js.Dynamic.literal(location = location, name = name)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[Artifact]
  }
}

