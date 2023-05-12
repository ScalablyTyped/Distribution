package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeSourceSelfManagedKafkaParameters extends StObject {
  
  /**
    * An array of server URLs.
    */
  var AdditionalBootstrapServers: js.UndefOr[KafkaBootstrapServers] = js.undefined
  
  /**
    * The maximum number of records to include in each batch.
    */
  var BatchSize: js.UndefOr[LimitMax10000] = js.undefined
  
  /**
    * The name of the destination queue to consume.
    */
  var ConsumerGroupID: js.UndefOr[URI] = js.undefined
  
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
    * (Streams only) The position in a stream from which to start reading.
    */
  var StartingPosition: js.UndefOr[SelfManagedKafkaStartPosition] = js.undefined
  
  /**
    * The name of the topic that the pipe will read from.
    */
  var TopicName: KafkaTopicName
  
  /**
    * This structure specifies the VPC subnets and security groups for the stream, and whether a public IP address is to be used.
    */
  var Vpc: js.UndefOr[SelfManagedKafkaAccessConfigurationVpc] = js.undefined
}
object PipeSourceSelfManagedKafkaParameters {
  
  inline def apply(TopicName: KafkaTopicName): PipeSourceSelfManagedKafkaParameters = {
    val __obj = js.Dynamic.literal(TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeSourceSelfManagedKafkaParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeSourceSelfManagedKafkaParameters] (val x: Self) extends AnyVal {
    
    inline def setAdditionalBootstrapServers(value: KafkaBootstrapServers): Self = StObject.set(x, "AdditionalBootstrapServers", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBootstrapServersUndefined: Self = StObject.set(x, "AdditionalBootstrapServers", js.undefined)
    
    inline def setAdditionalBootstrapServersVarargs(value: EndpointString*): Self = StObject.set(x, "AdditionalBootstrapServers", js.Array(value*))
    
    inline def setBatchSize(value: LimitMax10000): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setConsumerGroupID(value: URI): Self = StObject.set(x, "ConsumerGroupID", value.asInstanceOf[js.Any])
    
    inline def setConsumerGroupIDUndefined: Self = StObject.set(x, "ConsumerGroupID", js.undefined)
    
    inline def setCredentials(value: SelfManagedKafkaAccessConfigurationCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setServerRootCaCertificate(value: SecretManagerArn): Self = StObject.set(x, "ServerRootCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerRootCaCertificateUndefined: Self = StObject.set(x, "ServerRootCaCertificate", js.undefined)
    
    inline def setStartingPosition(value: SelfManagedKafkaStartPosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setTopicName(value: KafkaTopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setVpc(value: SelfManagedKafkaAccessConfigurationVpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
