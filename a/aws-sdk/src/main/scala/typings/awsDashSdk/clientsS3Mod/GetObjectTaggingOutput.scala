package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTaggingOutput extends js.Object {
  /**
    * 
    */
  var TagSet: typings.awsDashSdk.clientsS3Mod.TagSet
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object GetObjectTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet, VersionId: ObjectVersionId = null): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
}

