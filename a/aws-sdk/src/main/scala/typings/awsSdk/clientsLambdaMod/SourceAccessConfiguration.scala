package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceAccessConfiguration extends StObject {
  
  /**
    * The type of authentication protocol, VPC components, or virtual host for your event source. For example: "Type":"SASL_SCRAM_512_AUTH".    BASIC_AUTH - (Amazon MQ) The Secrets Manager secret that stores your broker credentials.    BASIC_AUTH - (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key used for SASL/PLAIN authentication of your Apache Kafka brokers.    VPC_SUBNET - The subnets associated with your VPC. Lambda connects to these subnets to fetch data from your self-managed Apache Kafka cluster.    VPC_SECURITY_GROUP - The VPC security group used to manage access to your self-managed Apache Kafka brokers.    SASL_SCRAM_256_AUTH - The Secrets Manager ARN of your secret key used for SASL SCRAM-256 authentication of your self-managed Apache Kafka brokers.    SASL_SCRAM_512_AUTH - The Secrets Manager ARN of your secret key used for SASL SCRAM-512 authentication of your self-managed Apache Kafka brokers.    VIRTUAL_HOST - (Amazon MQ) The name of the virtual host in your RabbitMQ broker. Lambda uses this RabbitMQ host as the event source. This property cannot be specified in an UpdateEventSourceMapping API call.    CLIENT_CERTIFICATE_TLS_AUTH - (Amazon MSK, self-managed Apache Kafka) The Secrets Manager ARN of your secret key containing the certificate chain (X.509 PEM), private key (PKCS#8 PEM), and private key password (optional) used for mutual TLS authentication of your MSK/Apache Kafka brokers.    SERVER_ROOT_CA_CERTIFICATE - (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key containing the root CA certificate (X.509 PEM) used for TLS encryption of your Apache Kafka brokers.   
    */
  var Type: js.UndefOr[SourceAccessType] = js.undefined
  
  /**
    * The value for your chosen configuration in Type. For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
    */
  var URI: js.UndefOr[typings.awsSdk.clientsLambdaMod.URI] = js.undefined
}
object SourceAccessConfiguration {
  
  inline def apply(): SourceAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceAccessConfiguration]
  }
  
  extension [Self <: SourceAccessConfiguration](x: Self) {
    
    inline def setType(value: SourceAccessType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setURI(value: URI): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
