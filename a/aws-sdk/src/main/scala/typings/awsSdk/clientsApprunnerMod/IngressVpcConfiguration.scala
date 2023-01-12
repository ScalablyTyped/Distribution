package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngressVpcConfiguration extends StObject {
  
  /**
    * The ID of the VPC endpoint that your App Runner service connects to. 
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC that is used for the VPC endpoint.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object IngressVpcConfiguration {
  
  inline def apply(): IngressVpcConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressVpcConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngressVpcConfiguration] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
