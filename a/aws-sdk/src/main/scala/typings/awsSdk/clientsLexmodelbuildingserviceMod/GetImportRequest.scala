package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportRequest extends StObject {
  
  /**
    * The identifier of the import job information to return.
    */
  var importId: String
}
object GetImportRequest {
  
  inline def apply(importId: String): GetImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportRequest]
  }
  
  extension [Self <: GetImportRequest](x: Self) {
    
    inline def setImportId(value: String): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
  }
}
