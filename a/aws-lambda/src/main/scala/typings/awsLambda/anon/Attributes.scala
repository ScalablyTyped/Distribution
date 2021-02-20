package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowChannel
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowEndpoint
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowInitiationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends StObject {
  
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
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: ConnectContactFlowChannel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEndpoint(value: ConnectContactFlowEndpoint): Self = StObject.set(x, "CustomerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerEndpointNull: Self = StObject.set(x, "CustomerEndpoint", null)
    
    @scala.inline
    def setInitialContactId(value: String): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiationMethod(value: ConnectContactFlowInitiationMethod): Self = StObject.set(x, "InitiationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceARN(value: String): Self = StObject.set(x, "InstanceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStreams(value: Customer): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousContactId(value: String): Self = StObject.set(x, "PreviousContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueNull: Self = StObject.set(x, "Queue", null)
    
    @scala.inline
    def setSystemEndpoint(value: ConnectContactFlowEndpoint): Self = StObject.set(x, "SystemEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemEndpointNull: Self = StObject.set(x, "SystemEndpoint", null)
  }
}
