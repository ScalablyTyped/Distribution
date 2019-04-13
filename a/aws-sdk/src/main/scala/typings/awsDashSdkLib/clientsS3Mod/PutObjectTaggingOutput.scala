package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectTaggingOutput extends js.Object {
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object PutObjectTaggingOutput {
  @scala.inline
  def apply(VersionId: ObjectVersionId = null): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
}

