package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFacetNamesResponse extends StObject {
  
  /**
    * The names of facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[FacetNameList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListFacetNamesResponse {
  
  inline def apply(): ListFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacetNamesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFacetNamesResponse] (val x: Self) extends AnyVal {
    
    inline def setFacetNames(value: FacetNameList): Self = StObject.set(x, "FacetNames", value.asInstanceOf[js.Any])
    
    inline def setFacetNamesUndefined: Self = StObject.set(x, "FacetNames", js.undefined)
    
    inline def setFacetNamesVarargs(value: FacetName*): Self = StObject.set(x, "FacetNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
