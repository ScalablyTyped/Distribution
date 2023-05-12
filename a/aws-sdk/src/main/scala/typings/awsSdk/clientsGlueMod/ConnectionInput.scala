package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInput extends StObject {
  
  /**
    * These key-value pairs define parameters for the connection.
    */
  var ConnectionProperties: typings.awsSdk.clientsGlueMod.ConnectionProperties
  
  /**
    * The type of the connection. Currently, these types are supported:    JDBC - Designates a connection to a database through Java Database Connectivity (JDBC).  JDBC Connections use the following ConnectionParameters.   Required: All of (HOST, PORT, JDBC_ENGINE) or JDBC_CONNECTION_URL.   Required: All of (USERNAME, PASSWORD) or SECRET_ID.   Optional: JDBC_ENFORCE_SSL, CUSTOM_JDBC_CERT, CUSTOM_JDBC_CERT_STRING, SKIP_CUSTOM_JDBC_CERT_VALIDATION. These parameters are used to configure SSL with JDBC.      KAFKA - Designates a connection to an Apache Kafka streaming platform.  KAFKA Connections use the following ConnectionParameters.   Required: KAFKA_BOOTSTRAP_SERVERS.   Optional: KAFKA_SSL_ENABLED, KAFKA_CUSTOM_CERT, KAFKA_SKIP_CUSTOM_CERT_VALIDATION. These parameters are used to configure SSL with KAFKA.   Optional: KAFKA_CLIENT_KEYSTORE, KAFKA_CLIENT_KEYSTORE_PASSWORD, KAFKA_CLIENT_KEY_PASSWORD, ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD, ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD. These parameters are used to configure TLS client configuration with SSL in KAFKA.   Optional: KAFKA_SASL_MECHANISM. Can be specified as SCRAM-SHA-512, GSSAPI, or AWS_MSK_IAM.   Optional: KAFKA_SASL_SCRAM_USERNAME, KAFKA_SASL_SCRAM_PASSWORD, ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD. These parameters are used to configure SASL/SCRAM-SHA-512 authentication with KAFKA.   Optional: KAFKA_SASL_GSSAPI_KEYTAB, KAFKA_SASL_GSSAPI_KRB5_CONF, KAFKA_SASL_GSSAPI_SERVICE, KAFKA_SASL_GSSAPI_PRINCIPAL. These parameters are used to configure SASL/GSSAPI authentication with KAFKA.      MONGODB - Designates a connection to a MongoDB document database.  MONGODB Connections use the following ConnectionParameters.   Required: CONNECTION_URL.   Required: All of (USERNAME, PASSWORD) or SECRET_ID.      NETWORK - Designates a network connection to a data source within an Amazon Virtual Private Cloud environment (Amazon VPC).  NETWORK Connections do not require ConnectionParameters. Instead, provide a PhysicalConnectionRequirements.    MARKETPLACE - Uses configuration settings contained in a connector purchased from Amazon Web Services Marketplace to read from and write to data stores that are not natively supported by Glue.  MARKETPLACE Connections use the following ConnectionParameters.   Required: CONNECTOR_TYPE, CONNECTOR_URL, CONNECTOR_CLASS_NAME, CONNECTION_URL.   Required for JDBC CONNECTOR_TYPE connections: All of (USERNAME, PASSWORD) or SECRET_ID.      CUSTOM - Uses configuration settings contained in a custom connector to read from and write to data stores that are not natively supported by Glue.    SFTP is not supported. For more information about how optional ConnectionProperties are used to configure features in Glue, consult Glue connection properties. For more information about how optional ConnectionProperties are used to configure features in Glue Studio, consult Using connectors and connections.
    */
  var ConnectionType: typings.awsSdk.clientsGlueMod.ConnectionType
  
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.clientsGlueMod.MatchCriteria] = js.undefined
  
  /**
    * The name of the connection. Connection will not function as expected without a name.
    */
  var Name: NameString
  
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to successfully make this connection.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typings.awsSdk.clientsGlueMod.PhysicalConnectionRequirements] = js.undefined
}
object ConnectionInput {
  
  inline def apply(ConnectionProperties: ConnectionProperties, ConnectionType: ConnectionType, Name: NameString): ConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionProperties = ConnectionProperties.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionInput] (val x: Self) extends AnyVal {
    
    inline def setConnectionProperties(value: ConnectionProperties): Self = StObject.set(x, "ConnectionProperties", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMatchCriteria(value: MatchCriteria): Self = StObject.set(x, "MatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setMatchCriteriaUndefined: Self = StObject.set(x, "MatchCriteria", js.undefined)
    
    inline def setMatchCriteriaVarargs(value: NameString*): Self = StObject.set(x, "MatchCriteria", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = StObject.set(x, "PhysicalConnectionRequirements", value.asInstanceOf[js.Any])
    
    inline def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "PhysicalConnectionRequirements", js.undefined)
  }
}
