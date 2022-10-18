package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedDataIdentifiersRequest extends StObject {
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListManagedDataIdentifiersRequest {
  
  inline def apply(): ListManagedDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedDataIdentifiersRequest]
  }
  
  extension [Self <: ListManagedDataIdentifiersRequest](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
