package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSettingDefaultRequest extends StObject {
  
  /**
    * The resource name for which to modify the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the ENI limit for your Amazon ECS container instances is affected. If containerInsights is specified, the default setting for Amazon Web Services CloudWatch Container Insights for your clusters is affected. If tagResourceAuthorization is specified, the opt-in option for tagging resources on creation is affected. For information about the opt-in timeline, see Tagging authorization timeline in the Amazon ECS Developer Guide. When you specify fargateFIPSMode for the name and enabled for the value, Fargate uses FIPS-140 compliant cryptographic algorithms on your tasks. For more information about FIPS-140 compliance with Fargate, see  Amazon Web Services Fargate Federal Information Processing Standard (FIPS) 140-2 compliance in the Amazon Elastic Container Service Developer Guide.
    */
  var name: SettingName
  
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled, disabled, on, and off.
    */
  var value: String
}
object PutAccountSettingDefaultRequest {
  
  inline def apply(name: SettingName, value: String): PutAccountSettingDefaultRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountSettingDefaultRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountSettingDefaultRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
