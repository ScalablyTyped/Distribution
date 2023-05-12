package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeSourceSelfManagedKafkaParameters extends StObject {
  
  /**
    * The maximum number of records to include in each batch.
    */
  var BatchSize: js.UndefOr[LimitMax10000] = js.undefined
  
  /**
    * The credentials needed to access the resource.
    */
  var Credentials: js.UndefOr[SelfManagedKafkaAccessConfigurationCredentials] = js.undefined
  
  /**
    * The maximum length of a time to wait for events.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsPipesMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * The ARN of the Secrets Manager secret used for certification.
    */
  var ServerRootCaCertificate: js.UndefOr[SecretManagerArn] = js.undefined
  
  /**
    * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is to be used.
    */
  var Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc] = js.undefined
}
object UpdatePipeSourceSelfManagedKafkaParameters {
  
  inline def apply(): UpdatePipeSourceSelfManagedKafkaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipeSourceSelfManagedKafkaParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeSourceSelfManagedKafkaParameters] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: LimitMax10000): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setCredentials(value: SelfManagedKafkaAccessConfigurationCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setServerRootCaCertificate(value: SecretManagerArn): Self = StObject.set(x, "ServerRootCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerRootCaCertificateUndefined: Self = StObject.set(x, "ServerRootCaCertificate", js.undefined)
    
    inline def setVpc(value: SelfManagedKafkaAccessConfigurationVpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
