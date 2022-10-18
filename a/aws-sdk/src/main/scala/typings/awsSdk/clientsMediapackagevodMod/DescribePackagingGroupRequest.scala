package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagingGroupRequest extends StObject {
  
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string
}
object DescribePackagingGroupRequest {
  
  inline def apply(Id: string): DescribePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingGroupRequest]
  }
  
  extension [Self <: DescribePackagingGroupRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
