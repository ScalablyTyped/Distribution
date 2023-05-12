package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedEndpointSessionCredentialsRequest extends StObject {
  
  /**
    * The client idempotency token of the job run request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Type of the token requested. Currently supported and default value of this field is “TOKEN.”
    */
  var credentialType: CredentialType
  
  /**
    * Duration in seconds for which the session token is valid. The default duration is 15 minutes and the maximum is 12 hours.
    */
  var durationInSeconds: js.UndefOr[JavaInteger] = js.undefined
  
  /**
    * The ARN of the managed endpoint for which the request is submitted. 
    */
  var endpointIdentifier: String2048
  
  /**
    * The IAM Execution Role ARN that will be used by the job run. 
    */
  var executionRoleArn: IAMRoleArn
  
  /**
    * String identifier used to separate sections of the execution logs uploaded to S3.
    */
  var logContext: js.UndefOr[LogContext] = js.undefined
  
  /**
    * The ARN of the Virtual Cluster which the Managed Endpoint belongs to. 
    */
  var virtualClusterIdentifier: String2048
}
object GetManagedEndpointSessionCredentialsRequest {
  
  inline def apply(
    credentialType: CredentialType,
    endpointIdentifier: String2048,
    executionRoleArn: IAMRoleArn,
    virtualClusterIdentifier: String2048
  ): GetManagedEndpointSessionCredentialsRequest = {
    val __obj = js.Dynamic.literal(credentialType = credentialType.asInstanceOf[js.Any], endpointIdentifier = endpointIdentifier.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], virtualClusterIdentifier = virtualClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedEndpointSessionCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManagedEndpointSessionCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCredentialType(value: CredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: JavaInteger): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    inline def setEndpointIdentifier(value: String2048): Self = StObject.set(x, "endpointIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: IAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLogContext(value: LogContext): Self = StObject.set(x, "logContext", value.asInstanceOf[js.Any])
    
    inline def setLogContextUndefined: Self = StObject.set(x, "logContext", js.undefined)
    
    inline def setVirtualClusterIdentifier(value: String2048): Self = StObject.set(x, "virtualClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
