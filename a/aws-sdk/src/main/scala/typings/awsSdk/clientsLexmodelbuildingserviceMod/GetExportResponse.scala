package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportResponse extends StObject {
  
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
  
  inline def apply(): GetExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportResponse]
  }
  
  extension [Self <: GetExportResponse](x: Self) {
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "exportStatus", js.undefined)
    
    inline def setExportType(value: ExportType): Self = StObject.set(x, "exportType", value.asInstanceOf[js.Any])
    
    inline def setExportTypeUndefined: Self = StObject.set(x, "exportType", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
