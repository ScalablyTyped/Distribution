package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * Updates the attributes for your ABAC configuration.
    */
  var InstanceAccessControlAttributeConfiguration: typings.awsSdk.clientsSsoadminMod.InstanceAccessControlAttributeConfiguration
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typings.awsSdk.clientsSsoadminMod.InstanceArn
}
object UpdateInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(
    InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration,
    InstanceArn: InstanceArn
  ): UpdateInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceAccessControlAttributeConfiguration = InstanceAccessControlAttributeConfiguration.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceAccessControlAttributeConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInstanceAccessControlAttributeConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceAccessControlAttributeConfiguration(value: InstanceAccessControlAttributeConfiguration): Self = StObject.set(x, "InstanceAccessControlAttributeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
