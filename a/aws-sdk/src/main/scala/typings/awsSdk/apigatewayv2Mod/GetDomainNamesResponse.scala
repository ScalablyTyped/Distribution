package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNamesResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfDomainName] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.apigatewayv2Mod.NextToken] = js.undefined
}
object GetDomainNamesResponse {
  
  @scala.inline
  def apply(): GetDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainNamesResponse]
  }
  
  @scala.inline
  implicit class GetDomainNamesResponseMutableBuilder[Self <: GetDomainNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfDomainName): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DomainName*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
