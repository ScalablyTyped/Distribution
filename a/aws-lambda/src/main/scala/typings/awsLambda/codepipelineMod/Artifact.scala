package typings.awsLambda.codepipelineMod

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
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
}

