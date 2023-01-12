package typings.awsSdk.clientsAppmeshMod

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
  
  inline def apply(virtualService: VirtualServiceData): DescribeVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
