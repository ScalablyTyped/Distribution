package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactDetail extends js.Object {
  /**
    * The artifact object name for the action execution.
    */
  var name: js.UndefOr[ArtifactName] = js.undefined
  /**
    * The Amazon S3 artifact location for the action execution.
    */
  var s3location: js.UndefOr[S3Location] = js.undefined
}

object ArtifactDetail {
  @scala.inline
  def apply(name: ArtifactName = null, s3location: S3Location = null): ArtifactDetail = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (s3location != null) __obj.updateDynamic("s3location")(s3location)
    __obj.asInstanceOf[ArtifactDetail]
  }
}

