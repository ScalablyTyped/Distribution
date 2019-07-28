package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  /**
    * The location of an artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * The artifact's name.
    */
  var name: js.UndefOr[ArtifactName] = js.undefined
  /**
    * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID (Amazon S3).
    */
  var revision: js.UndefOr[Revision] = js.undefined
}

object Artifact {
  @scala.inline
  def apply(location: ArtifactLocation = null, name: ArtifactName = null, revision: Revision = null): Artifact = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (revision != null) __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[Artifact]
  }
}

