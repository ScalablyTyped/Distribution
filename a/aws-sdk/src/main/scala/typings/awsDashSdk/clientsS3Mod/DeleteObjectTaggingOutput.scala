package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectTaggingOutput extends js.Object {
  /**
    * The versionId of the object the tag-set was removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply(VersionId: ObjectVersionId = null): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
}

