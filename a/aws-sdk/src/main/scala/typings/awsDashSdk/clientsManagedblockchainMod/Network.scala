package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * Attributes of the blockchain framework for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Framework] = js.native
  /**
    * Attributes of the blockchain framework that the network uses.
    */
  var FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes] = js.native
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.native
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
  /**
    * The voting rules for the network to decide if a proposal is accepted.
    */
  var VotingPolicy: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.VotingPolicy] = js.native
  /**
    * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service name to create a VPC endpoint to access network resources.
    */
  var VpcEndpointServiceName: js.UndefOr[String] = js.native
}

object Network {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    Framework: Framework = null,
    FrameworkAttributes: NetworkFrameworkAttributes = null,
    FrameworkVersion: FrameworkVersionString = null,
    Id: ResourceIdString = null,
    Name: NameString = null,
    Status: NetworkStatus = null,
    VotingPolicy: VotingPolicy = null,
    VpcEndpointServiceName: String = null
  ): Network = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Framework != null) __obj.updateDynamic("Framework")(Framework.asInstanceOf[js.Any])
    if (FrameworkAttributes != null) __obj.updateDynamic("FrameworkAttributes")(FrameworkAttributes.asInstanceOf[js.Any])
    if (FrameworkVersion != null) __obj.updateDynamic("FrameworkVersion")(FrameworkVersion.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VotingPolicy != null) __obj.updateDynamic("VotingPolicy")(VotingPolicy.asInstanceOf[js.Any])
    if (VpcEndpointServiceName != null) __obj.updateDynamic("VpcEndpointServiceName")(VpcEndpointServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

