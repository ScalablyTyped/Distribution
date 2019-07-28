package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetAttributes extends js.Object {
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.undefined
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.undefined
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.undefined
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object AssetAttributes {
  @scala.inline
  def apply(
    schemaVersion: NumericVersion,
    agentId: AgentId = null,
    amiId: AmiId = null,
    autoScalingGroup: AutoScalingGroup = null,
    hostname: Hostname = null,
    ipv4Addresses: Ipv4AddressList = null,
    networkInterfaces: NetworkInterfaces = null,
    tags: Tags = null
  ): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion)
    if (agentId != null) __obj.updateDynamic("agentId")(agentId)
    if (amiId != null) __obj.updateDynamic("amiId")(amiId)
    if (autoScalingGroup != null) __obj.updateDynamic("autoScalingGroup")(autoScalingGroup)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (ipv4Addresses != null) __obj.updateDynamic("ipv4Addresses")(ipv4Addresses)
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[AssetAttributes]
  }
}

