package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInput extends StObject {
  
  /**
    * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than once. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon Web Services CLI. 
    */
  var ClientRequestToken: ClientRequestTokenString
  
  /**
    * An optional description for the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: typings.awsSdk.clientsManagedblockchainMod.Framework
  
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
  var MemberConfiguration: typings.awsSdk.clientsManagedblockchainMod.MemberConfiguration
  
  /**
    * The name of the network.
    */
  var Name: NameString
  
  /**
    * Tags to assign to the network. Each tag consists of a key and optional value. When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an overall maximum of 50 tags added to each resource. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  var Tags: js.UndefOr[InputTagMap] = js.undefined
  
  /**
    *  The voting rules used by the network to determine if a proposal is approved. 
    */
  var VotingPolicy: typings.awsSdk.clientsManagedblockchainMod.VotingPolicy
}
object CreateNetworkInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestTokenString,
    Framework: Framework,
    FrameworkVersion: FrameworkVersionString,
    MemberConfiguration: MemberConfiguration,
    Name: NameString,
    VotingPolicy: VotingPolicy
  ): CreateNetworkInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Framework = Framework.asInstanceOf[js.Any], FrameworkVersion = FrameworkVersion.asInstanceOf[js.Any], MemberConfiguration = MemberConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], VotingPolicy = VotingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInput]
  }
  
  extension [Self <: CreateNetworkInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkConfiguration(value: NetworkFrameworkConfiguration): Self = StObject.set(x, "FrameworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFrameworkConfigurationUndefined: Self = StObject.set(x, "FrameworkConfiguration", js.undefined)
    
    inline def setFrameworkVersion(value: FrameworkVersionString): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setMemberConfiguration(value: MemberConfiguration): Self = StObject.set(x, "MemberConfiguration", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVotingPolicy(value: VotingPolicy): Self = StObject.set(x, "VotingPolicy", value.asInstanceOf[js.Any])
  }
}
