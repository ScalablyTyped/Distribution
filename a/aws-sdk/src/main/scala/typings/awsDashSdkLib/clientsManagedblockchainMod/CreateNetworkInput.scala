package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  /**
    * An optional description for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: awsDashSdkLib.clientsManagedblockchainMod.Framework
  /**
    *  Configuration properties of the blockchain framework relevant to the network configuration. 
    */
  var FrameworkConfiguration: js.UndefOr[NetworkFrameworkConfiguration] = js.undefined
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: FrameworkVersionString
  /**
    * Configuration properties for the first member within the network.
    */
  var MemberConfiguration: awsDashSdkLib.clientsManagedblockchainMod.MemberConfiguration
  /**
    * The name of the network.
    */
  var Name: NameString
  /**
    *  The voting rules used by the network to determine if a proposal is approved. 
    */
  var VotingPolicy: awsDashSdkLib.clientsManagedblockchainMod.VotingPolicy
}

object CreateNetworkInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    Framework: Framework,
    FrameworkVersion: FrameworkVersionString,
    MemberConfiguration: MemberConfiguration,
    Name: NameString,
    VotingPolicy: VotingPolicy,
    Description: DescriptionString = null,
    FrameworkConfiguration: NetworkFrameworkConfiguration = null
  ): CreateNetworkInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken, Framework = Framework.asInstanceOf[js.Any], FrameworkVersion = FrameworkVersion, MemberConfiguration = MemberConfiguration, Name = Name, VotingPolicy = VotingPolicy)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FrameworkConfiguration != null) __obj.updateDynamic("FrameworkConfiguration")(FrameworkConfiguration)
    __obj.asInstanceOf[CreateNetworkInput]
  }
}

