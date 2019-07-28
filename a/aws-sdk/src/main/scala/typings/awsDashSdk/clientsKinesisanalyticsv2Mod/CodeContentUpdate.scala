package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeContentUpdate extends js.Object {
  /**
    * Describes an update to the location of code for an application.
    */
  var S3ContentLocationUpdate: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.S3ContentLocationUpdate] = js.undefined
  /**
    * Describes an update to the text code for an application.
    */
  var TextContentUpdate: js.UndefOr[TextContent] = js.undefined
  /**
    * Describes an update to the zipped code for an application.
    */
  var ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.undefined
}

object CodeContentUpdate {
  @scala.inline
  def apply(
    S3ContentLocationUpdate: S3ContentLocationUpdate = null,
    TextContentUpdate: TextContent = null,
    ZipFileContentUpdate: ZipFileContent = null
  ): CodeContentUpdate = {
    val __obj = js.Dynamic.literal()
    if (S3ContentLocationUpdate != null) __obj.updateDynamic("S3ContentLocationUpdate")(S3ContentLocationUpdate)
    if (TextContentUpdate != null) __obj.updateDynamic("TextContentUpdate")(TextContentUpdate)
    if (ZipFileContentUpdate != null) __obj.updateDynamic("ZipFileContentUpdate")(ZipFileContentUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeContentUpdate]
  }
}

