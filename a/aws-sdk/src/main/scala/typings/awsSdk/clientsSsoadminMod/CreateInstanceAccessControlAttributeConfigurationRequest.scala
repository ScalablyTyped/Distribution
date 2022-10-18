package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * Specifies the IAM Identity Center identity store attributes to add to your ABAC configuration. When using an external identity provider as an identity source, you can pass attributes through the SAML assertion. Doing so provides an alternative to configuring attributes from the IAM Identity Center identity store. If a SAML assertion passes any of these attributes, IAM Identity Center will replace the attribute value with the value from the IAM Identity Center identity store.
    */
  var InstanceAccessControlAttributeConfiguration: typings.awsSdk.clientsSsoadminMod.InstanceAccessControlAttributeConfiguration
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typings.awsSdk.clientsSsoadminMod.InstanceArn
}
object CreateInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(
    InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration,
    InstanceArn: InstanceArn
  ): CreateInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceAccessControlAttributeConfiguration = InstanceAccessControlAttributeConfiguration.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceAccessControlAttributeConfigurationRequest]
  }
  
  extension [Self <: CreateInstanceAccessControlAttributeConfigurationRequest](x: Self) {
    
    inline def setInstanceAccessControlAttributeConfiguration(value: InstanceAccessControlAttributeConfiguration): Self = StObject.set(x, "InstanceAccessControlAttributeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
