package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    ENCRYPTED_PASSWORD - When you enable connection password protection by setting ConnectionPasswordEncryption in the Data Catalog encryption settings, this field stores the encrypted password.    JDBC_DRIVER_JAR_URI - The Amazon Simple Storage Service (Amazon S3) path of the JAR file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use.)    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for connecting to a JDBC data source.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with hostname matching is enforced for the JDBC connection on the client. The default is false.    CUSTOM_JDBC_CERT - An Amazon S3 location specifying the customer's root certificate. Glue uses this root certificate to validate the customer’s certificate when connecting to the customer database. Glue only handles X.509 certificates. The certificate provided must be DER-encoded and supplied in Base64 encoding PEM format.    SKIP_CUSTOM_JDBC_CERT_VALIDATION - By default, this is false. Glue validates the Signature algorithm and Subject Public Key Algorithm for the customer certificate. The only permitted algorithms for the Signature algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the key length must be at least 2048. You can set the value of this property to true to skip Glue’s validation of the customer certificate.    CUSTOM_JDBC_CERT_STRING - A custom JDBC certificate string which is used for domain match or distinguished name match to prevent a man-in-the-middle attack. In Oracle database, this is used as the SSL_SERVER_CERT_DN; in Microsoft SQL Server, this is used as the hostNameInCertificate.    CONNECTION_URL - The URL for connecting to a general (non-JDBC) data source.    SECRET_ID - The secret ID used for the secret manager of credentials.    CONNECTOR_URL - The connector URL for a MARKETPLACE or CUSTOM connection.    CONNECTOR_TYPE - The connector type for a MARKETPLACE or CUSTOM connection.    CONNECTOR_CLASS_NAME - The connector class name for a MARKETPLACE or CUSTOM connection.    KAFKA_BOOTSTRAP_SERVERS - A comma-separated list of host and port pairs that are the addresses of the Apache Kafka brokers in a Kafka cluster to which a Kafka client will connect to and bootstrap itself.    KAFKA_SSL_ENABLED - Whether to enable or disable SSL on an Apache Kafka connection. Default value is "true".    KAFKA_CUSTOM_CERT - The Amazon S3 URL for the private CA cert file (.pem format). The default is an empty string.    KAFKA_SKIP_CUSTOM_CERT_VALIDATION - Whether to skip the validation of the CA cert file or not. Glue validates for three algorithms: SHA256withRSA, SHA384withRSA and SHA512withRSA. Default value is "false".    KAFKA_CLIENT_KEYSTORE - The Amazon S3 location of the client keystore file for Kafka client side authentication (Optional).    KAFKA_CLIENT_KEYSTORE_PASSWORD - The password to access the provided keystore (Optional).    KAFKA_CLIENT_KEY_PASSWORD - A keystore can consist of multiple keys, so this is the password to access the client key to be used with the Kafka server side key (Optional).    ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD - The encrypted version of the Kafka client keystore password (if the user has the Glue encrypt passwords setting selected).    ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD - The encrypted version of the Kafka client key password (if the user has the Glue encrypt passwords setting selected).    KAFKA_SASL_MECHANISM - "SCRAM-SHA-512", "GSSAPI", or "AWS_MSK_IAM". These are the supported SASL Mechanisms.    KAFKA_SASL_SCRAM_USERNAME - A plaintext username used to authenticate with the "SCRAM-SHA-512" mechanism.    KAFKA_SASL_SCRAM_PASSWORD - A plaintext password used to authenticate with the "SCRAM-SHA-512" mechanism.    ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD - The encrypted version of the Kafka SASL SCRAM password (if the user has the Glue encrypt passwords setting selected).    KAFKA_SASL_GSSAPI_KEYTAB - The S3 location of a Kerberos keytab file. A keytab stores long-term keys for one or more principals. For more information, see MIT Kerberos Documentation: Keytab.    KAFKA_SASL_GSSAPI_KRB5_CONF - The S3 location of a Kerberos krb5.conf file. A krb5.conf stores Kerberos configuration information, such as the location of the KDC server. For more information, see MIT Kerberos Documentation: krb5.conf.    KAFKA_SASL_GSSAPI_SERVICE - The Kerberos service name, as set with sasl.kerberos.service.name in your Kafka Configuration.    KAFKA_SASL_GSSAPI_PRINCIPAL - The name of the Kerberos princial used by Glue. For more information, see Kafka Documentation: Configuring Kafka Brokers.  
    */
  var ConnectionProperties: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionProperties] = js.undefined
  
  /**
    * The type of the connection. Currently, SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionType] = js.undefined
  
  /**
    * The time that this connection definition was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The user, group, or role that last updated this connection definition.
    */
  var LastUpdatedBy: js.UndefOr[NameString] = js.undefined
  
  /**
    * The last time that this connection definition was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.clientsGlueMod.MatchCriteria] = js.undefined
  
  /**
    * The name of the connection definition.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to make this connection successfully.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typings.awsSdk.clientsGlueMod.PhysicalConnectionRequirements] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    inline def setConnectionProperties(value: ConnectionProperties): Self = StObject.set(x, "ConnectionProperties", value.asInstanceOf[js.Any])
    
    inline def setConnectionPropertiesUndefined: Self = StObject.set(x, "ConnectionProperties", js.undefined)
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "ConnectionType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdatedBy(value: NameString): Self = StObject.set(x, "LastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "LastUpdatedBy", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setMatchCriteria(value: MatchCriteria): Self = StObject.set(x, "MatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setMatchCriteriaUndefined: Self = StObject.set(x, "MatchCriteria", js.undefined)
    
    inline def setMatchCriteriaVarargs(value: NameString*): Self = StObject.set(x, "MatchCriteria", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = StObject.set(x, "PhysicalConnectionRequirements", value.asInstanceOf[js.Any])
    
    inline def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "PhysicalConnectionRequirements", js.undefined)
  }
}
