package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualServiceOutput extends StObject {
  
  /**
    * The full description of your virtual service.
    */
  var virtualService: VirtualServiceData
}
object DescribeVirtualServiceOutput {
  
  @scala.inline
  def apply(virtualService: VirtualServiceData): DescribeVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceOutput]
  }
  
  @scala.inline
  implicit class DescribeVirtualServiceOutputMutableBuilder[Self <: DescribeVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
