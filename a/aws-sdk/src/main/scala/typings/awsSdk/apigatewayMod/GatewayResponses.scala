package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayResponses extends js.Object {
  
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
  implicit class GatewayResponsesOps[Self <: GatewayResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: GatewayResponse*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ListOfGatewayResponse): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
