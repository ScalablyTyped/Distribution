package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportResponse extends js.Object {
  /**
    * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.native
  /**
    * The format of the exported data.
    */
  var exportType: js.UndefOr[ExportType] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The name of the bot being exported.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of the exported resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The version of the bot being exported.
    */
  var version: js.UndefOr[NumericalVersion] = js.native
}

object GetExportResponse {
  @scala.inline
  def apply(
    exportStatus: ExportStatus = null,
    exportType: ExportType = null,
    failureReason: String = null,
    name: Name = null,
    resourceType: ResourceType = null,
    url: String = null,
    version: NumericalVersion = null
  ): GetExportResponse = {
    val __obj = js.Dynamic.literal()
    if (exportStatus != null) __obj.updateDynamic("exportStatus")(exportStatus.asInstanceOf[js.Any])
    if (exportType != null) __obj.updateDynamic("exportType")(exportType.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportResponse]
  }
}

