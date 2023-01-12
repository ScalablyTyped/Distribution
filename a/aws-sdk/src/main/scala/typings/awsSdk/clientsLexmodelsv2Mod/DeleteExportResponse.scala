package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExportResponse extends StObject {
  
  /**
    * The unique identifier of the deleted export.
    */
  var exportId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the ListExports operation and calls to the  DescribeExport operation with the export identifier will fail.
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.undefined
}
object DeleteExportResponse {
  
  inline def apply(): DeleteExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExportResponse] (val x: Self) extends AnyVal {
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "exportStatus", js.undefined)
  }
}
