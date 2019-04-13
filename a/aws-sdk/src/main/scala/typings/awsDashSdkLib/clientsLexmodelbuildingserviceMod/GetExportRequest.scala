package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportRequest extends js.Object {
  /**
    * The format of the exported data.
    */
  var exportType: ExportType
  /**
    * The name of the bot to export.
    */
  var name: Name
  /**
    * The type of resource to export. 
    */
  var resourceType: ResourceType
  /**
    * The version of the bot to export.
    */
  var version: NumericalVersion
}

object GetExportRequest {
  @scala.inline
  def apply(exportType: ExportType, name: Name, resourceType: ResourceType, version: NumericalVersion): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], name = name, resourceType = resourceType.asInstanceOf[js.Any], version = version)
  
    __obj.asInstanceOf[GetExportRequest]
  }
}

