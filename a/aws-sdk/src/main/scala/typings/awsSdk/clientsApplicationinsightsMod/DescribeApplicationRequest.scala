package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationRequest extends StObject {
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
}
object DescribeApplicationRequest {
  
  inline def apply(ResourceGroupName: ResourceGroupName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
  
  extension [Self <: DescribeApplicationRequest](x: Self) {
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
