package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualRoutersOutput extends StObject {
  
  /**
    * The nextToken value to include in a future ListVirtualRouters request. When the results of a ListVirtualRouters request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of existing virtual routers for the specified service mesh.
    */
  var virtualRouters: VirtualRouterList = js.native
}
object ListVirtualRoutersOutput {
  
  @scala.inline
  def apply(virtualRouters: VirtualRouterList): ListVirtualRoutersOutput = {
    val __obj = js.Dynamic.literal(virtualRouters = virtualRouters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualRoutersOutput]
  }
  
  @scala.inline
  implicit class ListVirtualRoutersOutputMutableBuilder[Self <: ListVirtualRoutersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualRouters(value: VirtualRouterList): Self = StObject.set(x, "virtualRouters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRoutersVarargs(value: VirtualRouterRef*): Self = StObject.set(x, "virtualRouters", js.Array(value :_*))
  }
}
