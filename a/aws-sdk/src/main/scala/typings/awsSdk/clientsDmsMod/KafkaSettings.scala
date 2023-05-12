package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaSettings extends StObject {
  
  /**
    * A comma-separated list of one or more broker locations in your Kafka cluster that host your Kafka instance. Specify each broker location in the form  broker-hostname-or-ip:port . For example, "ec2-12-345-678-901.compute-1.amazonaws.com:2345". For more information and examples of specifying a list of broker locations, see Using Apache Kafka as a target for Database Migration Service in the Database Migration Service User Guide. 
    */
  var Broker: js.UndefOr[String] = js.undefined
  
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kafka message output. The default is false.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Include NULL and empty columns for records migrated to the endpoint. The default is false.
    */
  var IncludeNullAndEmpty: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Shows the partition value within the Kafka message output unless the partition type is schema-table-type. The default is false.
    */
  var IncludePartitionValue: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Includes any data definition language (DDL) operations that change the table in the control data, such as rename-table, drop-table, add-column, drop-column, and rename-column. The default is false.
    */
  var IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for transaction_id, previous transaction_id, and transaction_record_id (the record offset within a transaction). The default is false.
    */
  var IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The output format for the records created on the endpoint. The message format is JSON (default) or JSON_UNFORMATTED (a single line with no tab).
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined
  
  /**
    * The maximum size in bytes for records created on the endpoint The default is 1,000,000.
    */
  var MessageMaxBytes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this optional parameter to true to avoid adding a '0x' prefix to raw data in hexadecimal format. For example, by default, DMS adds a '0x' prefix to the LOB column type in hexadecimal format moving from an Oracle source to a Kafka target. Use the NoHexPrefix endpoint setting to enable migration of RAW data type columns without adding the '0x' prefix.
    */
  var NoHexPrefix: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same partition, which causes throttling. The default is false.
    */
  var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * For SASL/SSL authentication, DMS supports the SCRAM-SHA-512 mechanism by default. DMS versions 3.5.0 and later also support the PLAIN mechanism. To use the PLAIN mechanism, set this parameter to PLAIN. 
    */
  var SaslMechanism: js.UndefOr[KafkaSaslMechanism] = js.undefined
  
  /**
    * The secure password you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
    */
  var SaslPassword: js.UndefOr[SecretString] = js.undefined
  
  /**
    *  The secure user name you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
    */
  var SaslUsername: js.UndefOr[String] = js.undefined
  
  /**
    * Set secure connection to a Kafka target endpoint using Transport Layer Security (TLS). Options include ssl-encryption, ssl-authentication, and sasl-ssl. sasl-ssl requires SaslUsername and SaslPassword.
    */
  var SecurityProtocol: js.UndefOr[KafkaSecurityProtocol] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the private certificate authority (CA) cert that DMS uses to securely connect to your Kafka target endpoint.
    */
  var SslCaCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the client certificate used to securely connect to a Kafka target endpoint.
    */
  var SslClientCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the client private key used to securely connect to a Kafka target endpoint.
    */
  var SslClientKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    *  The password for the client private key used to securely connect to a Kafka target endpoint.
    */
  var SslClientKeyPassword: js.UndefOr[SecretString] = js.undefined
  
  /**
    * The topic to which you migrate the data. If you don't specify a topic, DMS specifies "kafka-default-topic" as the migration topic.
    */
  var Topic: js.UndefOr[String] = js.undefined
}
object KafkaSettings {
  
  inline def apply(): KafkaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaSettings] (val x: Self) extends AnyVal {
    
    inline def setBroker(value: String): Self = StObject.set(x, "Broker", value.asInstanceOf[js.Any])
    
    inline def setBrokerUndefined: Self = StObject.set(x, "Broker", js.undefined)
    
    inline def setIncludeControlDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeControlDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeControlDetailsUndefined: Self = StObject.set(x, "IncludeControlDetails", js.undefined)
    
    inline def setIncludeNullAndEmpty(value: BooleanOptional): Self = StObject.set(x, "IncludeNullAndEmpty", value.asInstanceOf[js.Any])
    
    inline def setIncludeNullAndEmptyUndefined: Self = StObject.set(x, "IncludeNullAndEmpty", js.undefined)
    
    inline def setIncludePartitionValue(value: BooleanOptional): Self = StObject.set(x, "IncludePartitionValue", value.asInstanceOf[js.Any])
    
    inline def setIncludePartitionValueUndefined: Self = StObject.set(x, "IncludePartitionValue", js.undefined)
    
    inline def setIncludeTableAlterOperations(value: BooleanOptional): Self = StObject.set(x, "IncludeTableAlterOperations", value.asInstanceOf[js.Any])
    
    inline def setIncludeTableAlterOperationsUndefined: Self = StObject.set(x, "IncludeTableAlterOperations", js.undefined)
    
    inline def setIncludeTransactionDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeTransactionDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeTransactionDetailsUndefined: Self = StObject.set(x, "IncludeTransactionDetails", js.undefined)
    
    inline def setMessageFormat(value: MessageFormatValue): Self = StObject.set(x, "MessageFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageFormatUndefined: Self = StObject.set(x, "MessageFormat", js.undefined)
    
    inline def setMessageMaxBytes(value: IntegerOptional): Self = StObject.set(x, "MessageMaxBytes", value.asInstanceOf[js.Any])
    
    inline def setMessageMaxBytesUndefined: Self = StObject.set(x, "MessageMaxBytes", js.undefined)
    
    inline def setNoHexPrefix(value: BooleanOptional): Self = StObject.set(x, "NoHexPrefix", value.asInstanceOf[js.Any])
    
    inline def setNoHexPrefixUndefined: Self = StObject.set(x, "NoHexPrefix", js.undefined)
    
    inline def setPartitionIncludeSchemaTable(value: BooleanOptional): Self = StObject.set(x, "PartitionIncludeSchemaTable", value.asInstanceOf[js.Any])
    
    inline def setPartitionIncludeSchemaTableUndefined: Self = StObject.set(x, "PartitionIncludeSchemaTable", js.undefined)
    
    inline def setSaslMechanism(value: KafkaSaslMechanism): Self = StObject.set(x, "SaslMechanism", value.asInstanceOf[js.Any])
    
    inline def setSaslMechanismUndefined: Self = StObject.set(x, "SaslMechanism", js.undefined)
    
    inline def setSaslPassword(value: SecretString): Self = StObject.set(x, "SaslPassword", value.asInstanceOf[js.Any])
    
    inline def setSaslPasswordUndefined: Self = StObject.set(x, "SaslPassword", js.undefined)
    
    inline def setSaslUsername(value: String): Self = StObject.set(x, "SaslUsername", value.asInstanceOf[js.Any])
    
    inline def setSaslUsernameUndefined: Self = StObject.set(x, "SaslUsername", js.undefined)
    
    inline def setSecurityProtocol(value: KafkaSecurityProtocol): Self = StObject.set(x, "SecurityProtocol", value.asInstanceOf[js.Any])
    
    inline def setSecurityProtocolUndefined: Self = StObject.set(x, "SecurityProtocol", js.undefined)
    
    inline def setSslCaCertificateArn(value: String): Self = StObject.set(x, "SslCaCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setSslCaCertificateArnUndefined: Self = StObject.set(x, "SslCaCertificateArn", js.undefined)
    
    inline def setSslClientCertificateArn(value: String): Self = StObject.set(x, "SslClientCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setSslClientCertificateArnUndefined: Self = StObject.set(x, "SslClientCertificateArn", js.undefined)
    
    inline def setSslClientKeyArn(value: String): Self = StObject.set(x, "SslClientKeyArn", value.asInstanceOf[js.Any])
    
    inline def setSslClientKeyArnUndefined: Self = StObject.set(x, "SslClientKeyArn", js.undefined)
    
    inline def setSslClientKeyPassword(value: SecretString): Self = StObject.set(x, "SslClientKeyPassword", value.asInstanceOf[js.Any])
    
    inline def setSslClientKeyPasswordUndefined: Self = StObject.set(x, "SslClientKeyPassword", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "Topic", js.undefined)
  }
}
