package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamFile extends js.Object {
  /**
    * The file ID.
    */
  var fileId: js.UndefOr[FileId] = js.undefined
  /**
    * The location of the file in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.undefined
}

object StreamFile {
  @scala.inline
  def apply(fileId: js.UndefOr[FileId] = js.undefined, s3Location: S3Location = null): StreamFile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileId)) __obj.updateDynamic("fileId")(fileId)
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location)
    __obj.asInstanceOf[StreamFile]
  }
}

