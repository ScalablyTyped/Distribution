package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    ENCRYPTED_PASSWORD - When you enable connection password protection by setting ConnectionPasswordEncryption in the Data Catalog encryption settings, this field stores the encrypted password.    JDBC_DRIVER_JAR_URI - The Amazon Simple Storage Service (Amazon S3) path of the JAR file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use.)    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for the JDBC connection.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with hostname matching is enforced for the JDBC connection on the client. The default is false.    CUSTOM_JDBC_CERT - An Amazon S3 location specifying the customer's root certificate. AWS Glue uses this root certificate to validate the customer’s certificate when connecting to the customer database. AWS Glue only handles X.509 certificates. The certificate provided must be DER-encoded and supplied in Base64 encoding PEM format.    SKIP_CUSTOM_JDBC_CERT_VALIDATION - By default, this is false. AWS Glue validates the Signature algorithm and Subject Public Key Algorithm for the customer certificate. The only permitted algorithms for the Signature algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the key length must be at least 2048. You can set the value of this property to true to skip AWS Glue’s validation of the customer certificate.    CUSTOM_JDBC_CERT_STRING - A custom JDBC certificate string which is used for domain match or distinguished name match to prevent a man-in-the-middle attack. In Oracle database, this is used as the SSL_SERVER_CERT_DN; in Microsoft SQL Server, this is used as the hostNameInCertificate.  
    */
  var ConnectionProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionProperties] = js.native
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionType] = js.native
  /**
    * The time that this connection definition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The user, group, or role that last updated this connection definition.
    */
  var LastUpdatedBy: js.UndefOr[NameString] = js.native
  /**
    * The last time that this connection definition was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MatchCriteria] = js.native
  /**
    * The name of the connection definition.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to make this connection successfully.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typings.awsDashSdk.clientsGlueMod.PhysicalConnectionRequirements] = js.native
}

object Connection {
  @scala.inline
  def apply(
    ConnectionProperties: ConnectionProperties = null,
    ConnectionType: ConnectionType = null,
    CreationTime: Timestamp = null,
    Description: DescriptionString = null,
    LastUpdatedBy: NameString = null,
    LastUpdatedTime: Timestamp = null,
    MatchCriteria: MatchCriteria = null,
    Name: NameString = null,
    PhysicalConnectionRequirements: PhysicalConnectionRequirements = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (ConnectionProperties != null) __obj.updateDynamic("ConnectionProperties")(ConnectionProperties.asInstanceOf[js.Any])
    if (ConnectionType != null) __obj.updateDynamic("ConnectionType")(ConnectionType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (MatchCriteria != null) __obj.updateDynamic("MatchCriteria")(MatchCriteria.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PhysicalConnectionRequirements != null) __obj.updateDynamic("PhysicalConnectionRequirements")(PhysicalConnectionRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

