package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVirtualRouterOutput extends StObject {
  
  /**
    * The full description of your virtual router.
    */
  var virtualRouter: VirtualRouterData = js.native
}
object DescribeVirtualRouterOutput {
  
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DescribeVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualRouterOutput]
  }
  
  @scala.inline
  implicit class DescribeVirtualRouterOutputMutableBuilder[Self <: DescribeVirtualRouterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
