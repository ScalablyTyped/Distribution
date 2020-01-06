package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactDetail extends js.Object {
  /**
    * The artifact object name for the action execution.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  /**
    * The Amazon S3 artifact location for the action execution.
    */
  var s3location: js.UndefOr[S3Location] = js.native
}

object ArtifactDetail {
  @scala.inline
  def apply(name: ArtifactName = null, s3location: S3Location = null): ArtifactDetail = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3location != null) __obj.updateDynamic("s3location")(s3location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetail]
  }
}

