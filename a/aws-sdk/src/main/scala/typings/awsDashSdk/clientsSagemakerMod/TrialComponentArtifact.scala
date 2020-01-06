package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentArtifact extends js.Object {
  /**
    * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of a type and a subtype concatenated with a slash (/) character, for example, text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
    */
  var MediaType: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MediaType] = js.native
  /**
    * The location of the artifact.
    */
  var Value: TrialComponentArtifactValue = js.native
}

object TrialComponentArtifact {
  @scala.inline
  def apply(Value: TrialComponentArtifactValue, MediaType: MediaType = null): TrialComponentArtifact = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    if (MediaType != null) __obj.updateDynamic("MediaType")(MediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentArtifact]
  }
}

