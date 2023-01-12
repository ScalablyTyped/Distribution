package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportRequest extends StObject {
  
  /**
    *  The ID for the import. 
    */
  var ImportId: UUID
}
object GetImportRequest {
  
  inline def apply(ImportId: UUID): GetImportRequest = {
    val __obj = js.Dynamic.literal(ImportId = ImportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImportRequest] (val x: Self) extends AnyVal {
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
  }
}
