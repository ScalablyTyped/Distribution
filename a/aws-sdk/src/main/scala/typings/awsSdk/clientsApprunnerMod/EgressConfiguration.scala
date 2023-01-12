package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressConfiguration extends StObject {
  
  /**
    * The type of egress configuration. Set to DEFAULT for access to resources hosted on public networks. Set to VPC to associate your service to a custom VPC specified by VpcConnectorArn.
    */
  var EgressType: js.UndefOr[typings.awsSdk.clientsApprunnerMod.EgressType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when EgressType = VPC.
    */
  var VpcConnectorArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
}
object EgressConfiguration {
  
  inline def apply(): EgressConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EgressConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEgressType(value: EgressType): Self = StObject.set(x, "EgressType", value.asInstanceOf[js.Any])
    
    inline def setEgressTypeUndefined: Self = StObject.set(x, "EgressType", js.undefined)
    
    inline def setVpcConnectorArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcConnectorArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorArnUndefined: Self = StObject.set(x, "VpcConnectorArn", js.undefined)
  }
}
