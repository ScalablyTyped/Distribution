package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendChannelMessageRequest extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The Idempotency token for each client request.
    */
  var ClientRequestToken: typings.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The content of the message.
    */
  var Content: NonEmptyContent = js.native
  
  /**
    * The optional metadata for each message. 
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * Boolean that controls whether the message is persisted on the back end. Required.
    */
  var Persistence: ChannelMessagePersistenceType = js.native
  
  /**
    * The type of message, STANDARD or CONTROL.
    */
  var Type: ChannelMessageType = js.native
}
object SendChannelMessageRequest {
  
  @scala.inline
  def apply(
    ChannelArn: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Content: NonEmptyContent,
    Persistence: ChannelMessagePersistenceType,
    Type: ChannelMessageType
  ): SendChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Persistence = Persistence.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendChannelMessageRequest]
  }
  
  @scala.inline
  implicit class SendChannelMessageRequestOps[Self <: SendChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: NonEmptyContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistence(value: ChannelMessagePersistenceType): Self = this.set("Persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChannelMessageType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
  }
}
