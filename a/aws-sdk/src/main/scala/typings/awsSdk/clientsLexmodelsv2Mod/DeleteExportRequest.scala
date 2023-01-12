package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExportRequest extends StObject {
  
  /**
    * The unique identifier of the export to delete.
    */
  var exportId: Id
}
object DeleteExportRequest {
  
  inline def apply(exportId: Id): DeleteExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExportRequest] (val x: Self) extends AnyVal {
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
  }
}
