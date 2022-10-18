package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMemberInput extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  
  /**
    * The unique identifier of the invitation that is sent to the member to join the network.
    */
  var InvitationId: ResourceIdString
  
  /**
    * Member configuration parameters.
    */
  var MemberConfiguration: typings.awsSdk.clientsManagedblockchainMod.MemberConfiguration
  
  /**
    * The unique identifier of the network in which the member is created.
    */
  var NetworkId: ResourceIdString
}
object CreateMemberInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestTokenString,
    InvitationId: ResourceIdString,
    MemberConfiguration: MemberConfiguration,
    NetworkId: ResourceIdString
  ): CreateMemberInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MemberConfiguration = MemberConfiguration.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberInput]
  }
  
  extension [Self <: CreateMemberInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setInvitationId(value: ResourceIdString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setMemberConfiguration(value: MemberConfiguration): Self = StObject.set(x, "MemberConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
