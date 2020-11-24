package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowChannel
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowEndpoint
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowInitiationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var Attributes: StringDictionary[String] = js.native
  
  var Channel: ConnectContactFlowChannel = js.native
  
  var ContactId: String = js.native
  
  var CustomerEndpoint: ConnectContactFlowEndpoint | Null = js.native
  
  var InitialContactId: String = js.native
  
  var InitiationMethod: ConnectContactFlowInitiationMethod = js.native
  
  var InstanceARN: String = js.native
  
  var MediaStreams: Customer = js.native
  
  var PreviousContactId: String = js.native
  
  var Queue: String | Null = js.native
  
  var SystemEndpoint: ConnectContactFlowEndpoint | Null = js.native
}
object Attributes {
  
  @scala.inline
  def apply(
    Attributes: StringDictionary[String],
    Channel: ConnectContactFlowChannel,
    ContactId: String,
    InitialContactId: String,
    InitiationMethod: ConnectContactFlowInitiationMethod,
    InstanceARN: String,
    MediaStreams: Customer,
    PreviousContactId: String
  ): Attributes = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InitiationMethod = InitiationMethod.asInstanceOf[js.Any], InstanceARN = InstanceARN.asInstanceOf[js.Any], MediaStreams = MediaStreams.asInstanceOf[js.Any], PreviousContactId = PreviousContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: ConnectContactFlowChannel): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactId(value: String): Self = this.set("ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContactId(value: String): Self = this.set("InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiationMethod(value: ConnectContactFlowInitiationMethod): Self = this.set("InitiationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceARN(value: String): Self = this.set("InstanceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStreams(value: Customer): Self = this.set("MediaStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousContactId(value: String): Self = this.set("PreviousContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEndpoint(value: ConnectContactFlowEndpoint): Self = this.set("CustomerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEndpointNull: Self = this.set("CustomerEndpoint", null)
    
    @scala.inline
    def setQueue(value: String): Self = this.set("Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueNull: Self = this.set("Queue", null)
    
    @scala.inline
    def setSystemEndpoint(value: ConnectContactFlowEndpoint): Self = this.set("SystemEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemEndpointNull: Self = this.set("SystemEndpoint", null)
  }
}
