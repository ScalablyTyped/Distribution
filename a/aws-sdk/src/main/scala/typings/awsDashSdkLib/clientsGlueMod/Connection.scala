package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    ENCRYPTED_PASSWORD - When you enable connection password protection by setting ConnectionPasswordEncryption in the Data Catalog encryption settings, this field stores the encrypted password.    JDBC_DRIVER_JAR_URI - The Amazon S3 path of the JAR file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use).    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for the JDBC connection.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with hostname matching will be enforced for the JDBC connection on the client. The default is false.  
    */
  var ConnectionProperties: js.UndefOr[ConnectionProperties] = js.undefined
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[ConnectionType] = js.undefined
  /**
    * The time that this connection definition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
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
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
  /**
    * The name of the connection definition.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to make this connection successfully.
    */
  var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
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
    if (ConnectionProperties != null) __obj.updateDynamic("ConnectionProperties")(ConnectionProperties)
    if (ConnectionType != null) __obj.updateDynamic("ConnectionType")(ConnectionType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (MatchCriteria != null) __obj.updateDynamic("MatchCriteria")(MatchCriteria)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PhysicalConnectionRequirements != null) __obj.updateDynamic("PhysicalConnectionRequirements")(PhysicalConnectionRequirements)
    __obj.asInstanceOf[Connection]
  }
}

