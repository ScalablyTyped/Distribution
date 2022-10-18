package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableVersionsResponse extends StObject {
  
  /**
    * A continuation token, if the list of available versions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of strings identifying available versions of the specified table.
    */
  var TableVersions: js.UndefOr[GetTableVersionsList] = js.undefined
}
object GetTableVersionsResponse {
  
  inline def apply(): GetTableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionsResponse]
  }
  
  extension [Self <: GetTableVersionsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableVersions(value: GetTableVersionsList): Self = StObject.set(x, "TableVersions", value.asInstanceOf[js.Any])
    
    inline def setTableVersionsUndefined: Self = StObject.set(x, "TableVersions", js.undefined)
    
    inline def setTableVersionsVarargs(value: TableVersion*): Self = StObject.set(x, "TableVersions", js.Array(value*))
  }
}
