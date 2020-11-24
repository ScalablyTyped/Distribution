package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewayRoutesOutput extends js.Object {
  
  /**
    * The list of existing gateway routes for the specified service mesh and virtual gateway.
    */
  var gatewayRoutes: GatewayRouteList = js.native
  
  /**
    * The nextToken value to include in a future ListGatewayRoutes request. When the results of a ListGatewayRoutes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListGatewayRoutesOutput {
  
  @scala.inline
  def apply(gatewayRoutes: GatewayRouteList): ListGatewayRoutesOutput = {
    val __obj = js.Dynamic.literal(gatewayRoutes = gatewayRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewayRoutesOutput]
  }
  
  @scala.inline
  implicit class ListGatewayRoutesOutputOps[Self <: ListGatewayRoutesOutput] (val x: Self) extends AnyVal {
    
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
    def setGatewayRoutesVarargs(value: GatewayRouteRef*): Self = this.set("gatewayRoutes", js.Array(value :_*))
    
    @scala.inline
    def setGatewayRoutes(value: GatewayRouteList): Self = this.set("gatewayRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
