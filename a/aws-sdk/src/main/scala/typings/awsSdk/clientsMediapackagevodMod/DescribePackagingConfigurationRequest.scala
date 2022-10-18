package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagingConfigurationRequest extends StObject {
  
  /**
    * The ID of a MediaPackage VOD PackagingConfiguration resource.
    */
  var Id: string
}
object DescribePackagingConfigurationRequest {
  
  inline def apply(Id: string): DescribePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingConfigurationRequest]
  }
  
  extension [Self <: DescribePackagingConfigurationRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
