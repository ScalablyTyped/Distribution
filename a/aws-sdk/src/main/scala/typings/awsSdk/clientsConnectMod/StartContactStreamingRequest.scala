package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContactStreamingRequest extends StObject {
  
  /**
    * The streaming configuration, such as the Amazon SNS streaming endpoint.
    */
  var ChatStreamingConfiguration: typings.awsSdk.clientsConnectMod.ChatStreamingConfiguration
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsConnectMod.ClientToken
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object StartContactStreamingRequest {
  
  inline def apply(
    ChatStreamingConfiguration: ChatStreamingConfiguration,
    ClientToken: ClientToken,
    ContactId: ContactId,
    InstanceId: InstanceId
  ): StartContactStreamingRequest = {
    val __obj = js.Dynamic.literal(ChatStreamingConfiguration = ChatStreamingConfiguration.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContactStreamingRequest]
  }
  
  extension [Self <: StartContactStreamingRequest](x: Self) {
    
    inline def setChatStreamingConfiguration(value: ChatStreamingConfiguration): Self = StObject.set(x, "ChatStreamingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
