package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcIngressConnectionsFilter extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a service to filter by. 
    */
  var ServiceArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The ID of a VPC Endpoint to filter by. 
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
}
object ListVpcIngressConnectionsFilter {
  
  inline def apply(): ListVpcIngressConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcIngressConnectionsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcIngressConnectionsFilter] (val x: Self) extends AnyVal {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "ServiceArn", js.undefined)
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
