package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomLogSourceRequest extends StObject {
  
  /**
    * The name for a third-party custom source. This must be a Regionally unique value.
    */
  var customSourceName: CustomSourceType
  
  /**
    * The Open Cybersecurity Schema Framework (OCSF) event class which describes the type of data that the custom source will send to Security Lake.
    */
  var eventClass: OcsfEventClass
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be used by the Glue crawler. The recommended IAM policies are:   The managed policy AWSGlueServiceRole    A custom policy granting access to your Amazon S3 Data Lake  
    */
  var glueInvocationRoleArn: RoleArn
  
  /**
    * The Amazon Web Services account ID of the custom source that will write logs and events into the Amazon S3 Data Lake.
    */
  var logProviderAccountId: AwsAccountId
}
object CreateCustomLogSourceRequest {
  
  inline def apply(
    customSourceName: CustomSourceType,
    eventClass: OcsfEventClass,
    glueInvocationRoleArn: RoleArn,
    logProviderAccountId: AwsAccountId
  ): CreateCustomLogSourceRequest = {
    val __obj = js.Dynamic.literal(customSourceName = customSourceName.asInstanceOf[js.Any], eventClass = eventClass.asInstanceOf[js.Any], glueInvocationRoleArn = glueInvocationRoleArn.asInstanceOf[js.Any], logProviderAccountId = logProviderAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomLogSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomLogSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomSourceName(value: CustomSourceType): Self = StObject.set(x, "customSourceName", value.asInstanceOf[js.Any])
    
    inline def setEventClass(value: OcsfEventClass): Self = StObject.set(x, "eventClass", value.asInstanceOf[js.Any])
    
    inline def setGlueInvocationRoleArn(value: RoleArn): Self = StObject.set(x, "glueInvocationRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLogProviderAccountId(value: AwsAccountId): Self = StObject.set(x, "logProviderAccountId", value.asInstanceOf[js.Any])
  }
}
