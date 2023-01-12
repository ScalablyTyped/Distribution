package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceResponse extends StObject {
  
  /**
    * A structure containing information about an Lake Formation resource.
    */
  var ResourceInfo: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ResourceInfo] = js.undefined
}
object DescribeResourceResponse {
  
  inline def apply(): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceInfo(value: ResourceInfo): Self = StObject.set(x, "ResourceInfo", value.asInstanceOf[js.Any])
    
    inline def setResourceInfoUndefined: Self = StObject.set(x, "ResourceInfo", js.undefined)
  }
}
