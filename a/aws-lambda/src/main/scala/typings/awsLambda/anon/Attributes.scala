package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowChannel
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowEndpoint
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowInitiationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var Attributes: StringDictionary[String]
  
  var Channel: ConnectContactFlowChannel
  
  var ContactId: String
  
  var CustomerEndpoint: ConnectContactFlowEndpoint | Null
  
  var InitialContactId: String
  
  var InitiationMethod: ConnectContactFlowInitiationMethod
  
  var InstanceARN: String
  
  var MediaStreams: Customer
  
  var PreviousContactId: String
  
  var Queue: String | Null
  
  var SystemEndpoint: ConnectContactFlowEndpoint | Null
}
object Attributes {
  
  inline def apply(
    Attributes: StringDictionary[String],
    Channel: ConnectContactFlowChannel,
    ContactId: String,
    InitialContactId: String,
    InitiationMethod: ConnectContactFlowInitiationMethod,
    InstanceARN: String,
    MediaStreams: Customer,
    PreviousContactId: String
  ): Attributes = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InitiationMethod = InitiationMethod.asInstanceOf[js.Any], InstanceARN = InstanceARN.asInstanceOf[js.Any], MediaStreams = MediaStreams.asInstanceOf[js.Any], PreviousContactId = PreviousContactId.asInstanceOf[js.Any], CustomerEndpoint = null, Queue = null, SystemEndpoint = null)
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: ConnectContactFlowChannel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setContactId(value: String): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setCustomerEndpoint(value: ConnectContactFlowEndpoint): Self = StObject.set(x, "CustomerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCustomerEndpointNull: Self = StObject.set(x, "CustomerEndpoint", null)
    
    inline def setInitialContactId(value: String): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInitiationMethod(value: ConnectContactFlowInitiationMethod): Self = StObject.set(x, "InitiationMethod", value.asInstanceOf[js.Any])
    
    inline def setInstanceARN(value: String): Self = StObject.set(x, "InstanceARN", value.asInstanceOf[js.Any])
    
    inline def setMediaStreams(value: Customer): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactId(value: String): Self = StObject.set(x, "PreviousContactId", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: String): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueNull: Self = StObject.set(x, "Queue", null)
    
    inline def setSystemEndpoint(value: ConnectContactFlowEndpoint): Self = StObject.set(x, "SystemEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSystemEndpointNull: Self = StObject.set(x, "SystemEndpoint", null)
  }
}
