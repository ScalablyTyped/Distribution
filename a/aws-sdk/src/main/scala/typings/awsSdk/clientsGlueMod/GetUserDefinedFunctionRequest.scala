package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserDefinedFunctionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the function to be retrieved is located. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database where the function is located.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the function.
    */
  var FunctionName: NameString
}
object GetUserDefinedFunctionRequest {
  
  inline def apply(DatabaseName: NameString, FunctionName: NameString): GetUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionRequest]
  }
  
  extension [Self <: GetUserDefinedFunctionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
