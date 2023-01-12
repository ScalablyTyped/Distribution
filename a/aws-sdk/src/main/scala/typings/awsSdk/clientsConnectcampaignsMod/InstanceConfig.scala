package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfig extends StObject {
  
  var connectInstanceId: InstanceId
  
  var encryptionConfig: EncryptionConfig
  
  var serviceLinkedRoleArn: ServiceLinkedRoleArn
}
object InstanceConfig {
  
  inline def apply(
    connectInstanceId: InstanceId,
    encryptionConfig: EncryptionConfig,
    serviceLinkedRoleArn: ServiceLinkedRoleArn
  ): InstanceConfig = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any], encryptionConfig = encryptionConfig.asInstanceOf[js.Any], serviceLinkedRoleArn = serviceLinkedRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceConfig] (val x: Self) extends AnyVal {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceLinkedRoleArn(value: ServiceLinkedRoleArn): Self = StObject.set(x, "serviceLinkedRoleArn", value.asInstanceOf[js.Any])
  }
}
