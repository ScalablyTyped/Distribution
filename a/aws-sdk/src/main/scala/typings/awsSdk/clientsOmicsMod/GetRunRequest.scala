package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunRequest extends StObject {
  
  /**
    * The run's export format.
    */
  var `export`: js.UndefOr[RunExportList] = js.undefined
  
  /**
    * The run's ID.
    */
  var id: RunId
}
object GetRunRequest {
  
  inline def apply(id: RunId): GetRunRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunRequest] (val x: Self) extends AnyVal {
    
    inline def setExport(value: RunExportList): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: RunExport*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
