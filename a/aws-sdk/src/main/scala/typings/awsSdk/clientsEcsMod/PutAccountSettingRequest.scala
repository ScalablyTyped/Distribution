package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSettingRequest extends StObject {
  
  /**
    * The Amazon ECS resource name for which to modify the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the elastic network interface (ENI) limit for your Amazon ECS container instances is affected. If containerInsights is specified, the default setting for Amazon Web Services CloudWatch Container Insights for your clusters is affected. If fargateFIPSMode is specified, Fargate FIPS 140 compliance is affected. If tagResourceAuthorization is specified, the opt-in option for tagging resources on creation is affected. For information about the opt-in timeline, see Tagging authorization timeline in the Amazon ECS Developer Guide.
    */
  var name: SettingName
  
  /**
    * The ARN of the principal, which can be a user, role, or the root user. If you specify the root user, it modifies the account setting for all users, roles, and the root user of the account unless a user or role explicitly overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.  Federated users assume the account setting of the root user and can't have explicit account settings set for them. 
    */
  var principalArn: js.UndefOr[String] = js.undefined
  
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled, disabled, on, and off.
    */
  var value: String
}
object PutAccountSettingRequest {
  
  inline def apply(name: SettingName, value: String): PutAccountSettingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountSettingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountSettingRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
