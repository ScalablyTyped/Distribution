package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportResponse extends js.Object {
  /**
    * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.undefined
  /**
    * The format of the exported data.
    */
  var exportType: js.UndefOr[ExportType] = js.undefined
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  /**
    * The name of the bot being exported.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The type of the exported resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * The version of the bot being exported.
    */
  var version: js.UndefOr[NumericalVersion] = js.undefined
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
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetExportResponse]
  }
}

