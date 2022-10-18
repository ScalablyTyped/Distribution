package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentResponse extends StObject {
  
  var ApplicationComponent: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ApplicationComponent] = js.undefined
  
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ResourceList] = js.undefined
}
object DescribeComponentResponse {
  
  inline def apply(): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentResponse]
  }
  
  extension [Self <: DescribeComponentResponse](x: Self) {
    
    inline def setApplicationComponent(value: ApplicationComponent): Self = StObject.set(x, "ApplicationComponent", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentUndefined: Self = StObject.set(x, "ApplicationComponent", js.undefined)
    
    inline def setResourceList(value: ResourceList): Self = StObject.set(x, "ResourceList", value.asInstanceOf[js.Any])
    
    inline def setResourceListUndefined: Self = StObject.set(x, "ResourceList", js.undefined)
    
    inline def setResourceListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceList", js.Array(value*))
  }
}
