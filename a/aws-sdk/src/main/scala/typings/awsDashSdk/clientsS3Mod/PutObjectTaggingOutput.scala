package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectTaggingOutput extends js.Object {
  /**
    * The versionId of the object the tag-set was added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectTaggingOutput {
  @scala.inline
  def apply(VersionId: ObjectVersionId = null): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
}

