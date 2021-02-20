package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayResponses extends StObject {
  
  /**
    * Returns the entire collection, because of no pagination support.
    */
  var items: js.UndefOr[ListOfGatewayResponse] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object GatewayResponses {
  
  @scala.inline
  def apply(): GatewayResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayResponses]
  }
  
  @scala.inline
  implicit class GatewayResponsesMutableBuilder[Self <: GatewayResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfGatewayResponse): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GatewayResponse*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
