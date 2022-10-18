package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaCreationStatusResponse extends StObject {
  
  /**
    * Detailed information about the status of the schema creation operation.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the schema (PROCESSING, FAILED, SUCCESS, or NOT_APPLICABLE). When the schema is in the ACTIVE state, you can add data.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object GetSchemaCreationStatusResponse {
  
  inline def apply(): GetSchemaCreationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaCreationStatusResponse]
  }
  
  extension [Self <: GetSchemaCreationStatusResponse](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
