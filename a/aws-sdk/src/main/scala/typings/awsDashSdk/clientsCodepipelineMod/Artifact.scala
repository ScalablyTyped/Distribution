package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  /**
    * The location of an artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.native
  /**
    * The artifact's name.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  /**
    * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID (Amazon S3).
    */
  var revision: js.UndefOr[Revision] = js.native
}

object Artifact {
  @scala.inline
  def apply(location: ArtifactLocation = null, name: ArtifactName = null, revision: Revision = null): Artifact = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
}

