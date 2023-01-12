package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS cluster control plane logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String
  
  var resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.undefined
}
object UpdateClusterConfigRequest {
  
  inline def apply(name: String): UpdateClusterConfigRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourcesVpcConfig(value: VpcConfigRequest): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setResourcesVpcConfigUndefined: Self = StObject.set(x, "resourcesVpcConfig", js.undefined)
  }
}
