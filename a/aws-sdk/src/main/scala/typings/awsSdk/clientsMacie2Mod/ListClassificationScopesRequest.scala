package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClassificationScopesRequest extends StObject {
  
  /**
    * The name of the classification scope to retrieve the unique identifier for.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListClassificationScopesRequest {
  
  inline def apply(): ListClassificationScopesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationScopesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClassificationScopesRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
