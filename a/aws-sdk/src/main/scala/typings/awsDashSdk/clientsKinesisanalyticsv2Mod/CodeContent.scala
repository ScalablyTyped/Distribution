package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeContent extends js.Object {
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var S3ContentLocation: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.S3ContentLocation] = js.undefined
  /**
    * The text-format code for a Java-based Kinesis Data Analytics application.
    */
  var TextContent: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.TextContent] = js.undefined
  /**
    * The zip-format code for a Java-based Kinesis Data Analytics application.
    */
  var ZipFileContent: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ZipFileContent] = js.undefined
}

object CodeContent {
  @scala.inline
  def apply(
    S3ContentLocation: S3ContentLocation = null,
    TextContent: TextContent = null,
    ZipFileContent: ZipFileContent = null
  ): CodeContent = {
    val __obj = js.Dynamic.literal()
    if (S3ContentLocation != null) __obj.updateDynamic("S3ContentLocation")(S3ContentLocation)
    if (TextContent != null) __obj.updateDynamic("TextContent")(TextContent)
    if (ZipFileContent != null) __obj.updateDynamic("ZipFileContent")(ZipFileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeContent]
  }
}

