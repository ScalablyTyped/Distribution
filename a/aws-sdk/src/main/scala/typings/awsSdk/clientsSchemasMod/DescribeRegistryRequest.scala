package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistryRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
}
object DescribeRegistryRequest {
  
  inline def apply(RegistryName: string): DescribeRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistryRequest]
  }
  
  extension [Self <: DescribeRegistryRequest](x: Self) {
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
