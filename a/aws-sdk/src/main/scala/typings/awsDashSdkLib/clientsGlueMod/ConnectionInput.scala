package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInput extends js.Object {
  /**
    * These key-value pairs define parameters for the connection.
    */
  var ConnectionProperties: awsDashSdkLib.clientsGlueMod.ConnectionProperties
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: awsDashSdkLib.clientsGlueMod.ConnectionType
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
  /**
    * The name of the connection.
    */
  var Name: NameString
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to successfully make this connection.
    */
  var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
}

object ConnectionInput {
  @scala.inline
  def apply(
    ConnectionProperties: ConnectionProperties,
    ConnectionType: ConnectionType,
    Name: NameString,
    Description: DescriptionString = null,
    MatchCriteria: MatchCriteria = null,
    PhysicalConnectionRequirements: PhysicalConnectionRequirements = null
  ): ConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionProperties = ConnectionProperties, ConnectionType = ConnectionType.asInstanceOf[js.Any], Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MatchCriteria != null) __obj.updateDynamic("MatchCriteria")(MatchCriteria)
    if (PhysicalConnectionRequirements != null) __obj.updateDynamic("PhysicalConnectionRequirements")(PhysicalConnectionRequirements)
    __obj.asInstanceOf[ConnectionInput]
  }
}

