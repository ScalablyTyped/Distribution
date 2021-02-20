package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcLinksResponse extends StObject {
  
  /**
    * A collection of VPC links.
    */
  var Items: js.UndefOr[listOfVpcLink] = js.native
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.apigatewayv2Mod.NextToken] = js.native
}
object GetVpcLinksResponse {
  
  @scala.inline
  def apply(): GetVpcLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcLinksResponse]
  }
  
  @scala.inline
  implicit class GetVpcLinksResponseMutableBuilder[Self <: GetVpcLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfVpcLink): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: VpcLink*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
