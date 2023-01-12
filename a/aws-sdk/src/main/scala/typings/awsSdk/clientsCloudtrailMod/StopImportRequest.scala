package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopImportRequest extends StObject {
  
  /**
    *  The ID of the import. 
    */
  var ImportId: UUID
}
object StopImportRequest {
  
  inline def apply(ImportId: UUID): StopImportRequest = {
    val __obj = js.Dynamic.literal(ImportId = ImportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopImportRequest] (val x: Self) extends AnyVal {
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
  }
}
