package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iotMod {
  
  type IoTEvent[T] = String | Double | T
  
  type IoTHandler = Handler[IoTEvent[scala.Nothing], Unit]
  
  trait IoTPreProvisioningHookEvent extends StObject {
    
    var certificateId: String
    
    var certificatePem: String
    
    var claimCertificateId: String
    
    var clientId: String
    
    var parameters: Record[String, String]
    
    var templateArn: String
  }
  object IoTPreProvisioningHookEvent {
    
    inline def apply(
      certificateId: String,
      certificatePem: String,
      claimCertificateId: String,
      clientId: String,
      parameters: Record[String, String],
      templateArn: String
    ): IoTPreProvisioningHookEvent = {
      val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], certificatePem = certificatePem.asInstanceOf[js.Any], claimCertificateId = claimCertificateId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], templateArn = templateArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[IoTPreProvisioningHookEvent]
    }
    
    extension [Self <: IoTPreProvisioningHookEvent](x: Self) {
      
      inline def setCertificateId(value: String): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
      
      inline def setCertificatePem(value: String): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
      
      inline def setClaimCertificateId(value: String): Self = StObject.set(x, "claimCertificateId", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setTemplateArn(value: String): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    }
  }
  
  type IoTPreProvisioningHookHandler = Handler[IoTPreProvisioningHookEvent, IoTPreProvisioningHookResult]
  
  trait IoTPreProvisioningHookResult extends StObject {
    
    var allowProvisioning: Boolean
    
    var parameterOverrides: Record[String, String]
  }
  object IoTPreProvisioningHookResult {
    
    inline def apply(allowProvisioning: Boolean, parameterOverrides: Record[String, String]): IoTPreProvisioningHookResult = {
      val __obj = js.Dynamic.literal(allowProvisioning = allowProvisioning.asInstanceOf[js.Any], parameterOverrides = parameterOverrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[IoTPreProvisioningHookResult]
    }
    
    extension [Self <: IoTPreProvisioningHookResult](x: Self) {
      
      inline def setAllowProvisioning(value: Boolean): Self = StObject.set(x, "allowProvisioning", value.asInstanceOf[js.Any])
      
      inline def setParameterOverrides(value: Record[String, String]): Self = StObject.set(x, "parameterOverrides", value.asInstanceOf[js.Any])
    }
  }
}
