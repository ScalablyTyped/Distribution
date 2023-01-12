package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protection extends StObject {
  
  /**
    * The automatic application layer DDoS mitigation settings for the protection. This configuration determines whether Shield Advanced automatically manages rules in the web ACL in order to respond to application layer events that Shield Advanced determines to be DDoS attacks. 
    */
  var ApplicationLayerAutomaticResponseConfiguration: js.UndefOr[typings.awsSdk.clientsShieldMod.ApplicationLayerAutomaticResponseConfiguration] = js.undefined
  
  /**
    * The unique identifier (ID) for the Route 53 health check that's associated with the protection. 
    */
  var HealthCheckIds: js.UndefOr[typings.awsSdk.clientsShieldMod.HealthCheckIds] = js.undefined
  
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.undefined
  
  /**
    * The name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the protection.
    */
  var ProtectionArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the Amazon Web Services resource that is protected.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsShieldMod.ResourceArn] = js.undefined
}
object Protection {
  
  inline def apply(): Protection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Protection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Protection] (val x: Self) extends AnyVal {
    
    inline def setApplicationLayerAutomaticResponseConfiguration(value: ApplicationLayerAutomaticResponseConfiguration): Self = StObject.set(x, "ApplicationLayerAutomaticResponseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationLayerAutomaticResponseConfigurationUndefined: Self = StObject.set(x, "ApplicationLayerAutomaticResponseConfiguration", js.undefined)
    
    inline def setHealthCheckIds(value: HealthCheckIds): Self = StObject.set(x, "HealthCheckIds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIdsUndefined: Self = StObject.set(x, "HealthCheckIds", js.undefined)
    
    inline def setHealthCheckIdsVarargs(value: HealthCheckId*): Self = StObject.set(x, "HealthCheckIds", js.Array(value*))
    
    inline def setId(value: ProtectionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ProtectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProtectionArn(value: ResourceArn): Self = StObject.set(x, "ProtectionArn", value.asInstanceOf[js.Any])
    
    inline def setProtectionArnUndefined: Self = StObject.set(x, "ProtectionArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
