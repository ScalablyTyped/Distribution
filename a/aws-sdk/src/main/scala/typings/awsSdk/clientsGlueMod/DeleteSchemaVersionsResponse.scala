package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaVersionsResponse extends StObject {
  
  /**
    * A list of SchemaVersionErrorItem objects, each containing an error and schema version.
    */
  var SchemaVersionErrors: js.UndefOr[SchemaVersionErrorList] = js.undefined
}
object DeleteSchemaVersionsResponse {
  
  inline def apply(): DeleteSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaVersionsResponse]
  }
  
  extension [Self <: DeleteSchemaVersionsResponse](x: Self) {
    
    inline def setSchemaVersionErrors(value: SchemaVersionErrorList): Self = StObject.set(x, "SchemaVersionErrors", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionErrorsUndefined: Self = StObject.set(x, "SchemaVersionErrors", js.undefined)
    
    inline def setSchemaVersionErrorsVarargs(value: SchemaVersionErrorItem*): Self = StObject.set(x, "SchemaVersionErrors", js.Array(value*))
  }
}
