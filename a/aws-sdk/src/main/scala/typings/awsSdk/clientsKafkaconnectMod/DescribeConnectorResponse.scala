package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorResponse extends StObject {
  
  /**
    * Information about the capacity of the connector, whether it is auto scaled or provisioned.
    */
  var capacity: js.UndefOr[CapacityDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the connector.
    */
  var connectorArn: js.UndefOr[string] = js.undefined
  
  /**
    * A map of keys to values that represent the configuration for the connector.
    */
  var connectorConfiguration: js.UndefOr[SyntheticDescribeConnectorResponseMapOfString] = js.undefined
  
  /**
    * A summary description of the connector.
    */
  var connectorDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the connector.
    */
  var connectorName: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the connector.
    */
  var connectorState: js.UndefOr[ConnectorState] = js.undefined
  
  /**
    * The time the connector was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current version of the connector.
    */
  var currentVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The Apache Kafka cluster that the connector is connected to.
    */
  var kafkaCluster: js.UndefOr[KafkaClusterDescription] = js.undefined
  
  /**
    * The type of client authentication used to connect to the Apache Kafka cluster. The value is NONE when no client authentication is used.
    */
  var kafkaClusterClientAuthentication: js.UndefOr[KafkaClusterClientAuthenticationDescription] = js.undefined
  
  /**
    * Details of encryption in transit to the Apache Kafka cluster.
    */
  var kafkaClusterEncryptionInTransit: js.UndefOr[KafkaClusterEncryptionInTransitDescription] = js.undefined
  
  /**
    * The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
    */
  var kafkaConnectVersion: js.UndefOr[string] = js.undefined
  
  /**
    * Details about delivering logs to Amazon CloudWatch Logs.
    */
  var logDelivery: js.UndefOr[LogDeliveryDescription] = js.undefined
  
  /**
    * Specifies which plugins were used for this connector.
    */
  var plugins: js.UndefOr[listOfPluginDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon Web Services resources.
    */
  var serviceExecutionRoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * Details about the state of a connector.
    */
  var stateDescription: js.UndefOr[StateDescription] = js.undefined
  
  /**
    * Specifies which worker configuration was used for the connector.
    */
  var workerConfiguration: js.UndefOr[WorkerConfigurationDescription] = js.undefined
}
object DescribeConnectorResponse {
  
  inline def apply(): DescribeConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: CapacityDescription): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
    
    inline def setConnectorConfiguration(value: SyntheticDescribeConnectorResponseMapOfString): Self = StObject.set(x, "connectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfigurationUndefined: Self = StObject.set(x, "connectorConfiguration", js.undefined)
    
    inline def setConnectorDescription(value: string): Self = StObject.set(x, "connectorDescription", value.asInstanceOf[js.Any])
    
    inline def setConnectorDescriptionUndefined: Self = StObject.set(x, "connectorDescription", js.undefined)
    
    inline def setConnectorName(value: string): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setConnectorState(value: ConnectorState): Self = StObject.set(x, "connectorState", value.asInstanceOf[js.Any])
    
    inline def setConnectorStateUndefined: Self = StObject.set(x, "connectorState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setKafkaCluster(value: KafkaClusterDescription): Self = StObject.set(x, "kafkaCluster", value.asInstanceOf[js.Any])
    
    inline def setKafkaClusterClientAuthentication(value: KafkaClusterClientAuthenticationDescription): Self = StObject.set(x, "kafkaClusterClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setKafkaClusterClientAuthenticationUndefined: Self = StObject.set(x, "kafkaClusterClientAuthentication", js.undefined)
    
    inline def setKafkaClusterEncryptionInTransit(value: KafkaClusterEncryptionInTransitDescription): Self = StObject.set(x, "kafkaClusterEncryptionInTransit", value.asInstanceOf[js.Any])
    
    inline def setKafkaClusterEncryptionInTransitUndefined: Self = StObject.set(x, "kafkaClusterEncryptionInTransit", js.undefined)
    
    inline def setKafkaClusterUndefined: Self = StObject.set(x, "kafkaCluster", js.undefined)
    
    inline def setKafkaConnectVersion(value: string): Self = StObject.set(x, "kafkaConnectVersion", value.asInstanceOf[js.Any])
    
    inline def setKafkaConnectVersionUndefined: Self = StObject.set(x, "kafkaConnectVersion", js.undefined)
    
    inline def setLogDelivery(value: LogDeliveryDescription): Self = StObject.set(x, "logDelivery", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryUndefined: Self = StObject.set(x, "logDelivery", js.undefined)
    
    inline def setPlugins(value: listOfPluginDescription): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginDescription*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setServiceExecutionRoleArn(value: string): Self = StObject.set(x, "serviceExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceExecutionRoleArnUndefined: Self = StObject.set(x, "serviceExecutionRoleArn", js.undefined)
    
    inline def setStateDescription(value: StateDescription): Self = StObject.set(x, "stateDescription", value.asInstanceOf[js.Any])
    
    inline def setStateDescriptionUndefined: Self = StObject.set(x, "stateDescription", js.undefined)
    
    inline def setWorkerConfiguration(value: WorkerConfigurationDescription): Self = StObject.set(x, "workerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationUndefined: Self = StObject.set(x, "workerConfiguration", js.undefined)
  }
}
