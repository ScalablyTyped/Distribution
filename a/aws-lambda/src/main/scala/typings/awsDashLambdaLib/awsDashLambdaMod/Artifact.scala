package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  var location: ArtifactLocation
  var name: java.lang.String
  var revision: java.lang.String | scala.Null
}

object Artifact {
  @scala.inline
  def apply(location: ArtifactLocation, name: java.lang.String, revision: java.lang.String = null): Artifact = {
    val __obj = js.Dynamic.literal(location = location, name = name)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[Artifact]
  }
}

