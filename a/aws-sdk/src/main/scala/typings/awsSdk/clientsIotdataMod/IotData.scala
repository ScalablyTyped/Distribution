package typings.awsSdk.clientsIotdataMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotData extends Service {
  
  @JSName("config")
  var config_IotData: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the shadow for the specified thing. Requires permission to access the DeleteThingShadow action. For more information, see DeleteThingShadow in the IoT Developer Guide.
    */
  def deleteThingShadow(): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]): Request[DeleteThingShadowResponse, AWSError] = js.native
  /**
    * Deletes the shadow for the specified thing. Requires permission to access the DeleteThingShadow action. For more information, see DeleteThingShadow in the IoT Developer Guide.
    */
  def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(
    params: DeleteThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]
  ): Request[DeleteThingShadowResponse, AWSError] = js.native
  
  /**
    * Gets the details of a single retained message for the specified topic. This action returns the message payload of the retained message, which can incur messaging costs. To list only the topic names of the retained messages, call ListRetainedMessages. Requires permission to access the GetRetainedMessage action. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def getRetainedMessage(): Request[GetRetainedMessageResponse, AWSError] = js.native
  def getRetainedMessage(callback: js.Function2[/* err */ AWSError, /* data */ GetRetainedMessageResponse, Unit]): Request[GetRetainedMessageResponse, AWSError] = js.native
  /**
    * Gets the details of a single retained message for the specified topic. This action returns the message payload of the retained message, which can incur messaging costs. To list only the topic names of the retained messages, call ListRetainedMessages. Requires permission to access the GetRetainedMessage action. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def getRetainedMessage(params: GetRetainedMessageRequest): Request[GetRetainedMessageResponse, AWSError] = js.native
  def getRetainedMessage(
    params: GetRetainedMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRetainedMessageResponse, Unit]
  ): Request[GetRetainedMessageResponse, AWSError] = js.native
  
  /**
    * Gets the shadow for the specified thing. Requires permission to access the GetThingShadow action. For more information, see GetThingShadow in the IoT Developer Guide.
    */
  def getThingShadow(): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]): Request[GetThingShadowResponse, AWSError] = js.native
  /**
    * Gets the shadow for the specified thing. Requires permission to access the GetThingShadow action. For more information, see GetThingShadow in the IoT Developer Guide.
    */
  def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(
    params: GetThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]
  ): Request[GetThingShadowResponse, AWSError] = js.native
  
  /**
    * Lists the shadows for the specified thing. Requires permission to access the ListNamedShadowsForThing action.
    */
  def listNamedShadowsForThing(): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  def listNamedShadowsForThing(callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  /**
    * Lists the shadows for the specified thing. Requires permission to access the ListNamedShadowsForThing action.
    */
  def listNamedShadowsForThing(params: ListNamedShadowsForThingRequest): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  def listNamedShadowsForThing(
    params: ListNamedShadowsForThingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]
  ): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
  
  /**
    * Lists summary information about the retained messages stored for the account. This action returns only the topic names of the retained messages. It doesn't return any message payloads. Although this action doesn't return a message payload, it can still incur messaging costs. To get the message payload of a retained message, call GetRetainedMessage with the topic name of the retained message. Requires permission to access the ListRetainedMessages action. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def listRetainedMessages(): Request[ListRetainedMessagesResponse, AWSError] = js.native
  def listRetainedMessages(callback: js.Function2[/* err */ AWSError, /* data */ ListRetainedMessagesResponse, Unit]): Request[ListRetainedMessagesResponse, AWSError] = js.native
  /**
    * Lists summary information about the retained messages stored for the account. This action returns only the topic names of the retained messages. It doesn't return any message payloads. Although this action doesn't return a message payload, it can still incur messaging costs. To get the message payload of a retained message, call GetRetainedMessage with the topic name of the retained message. Requires permission to access the ListRetainedMessages action. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def listRetainedMessages(params: ListRetainedMessagesRequest): Request[ListRetainedMessagesResponse, AWSError] = js.native
  def listRetainedMessages(
    params: ListRetainedMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRetainedMessagesResponse, Unit]
  ): Request[ListRetainedMessagesResponse, AWSError] = js.native
  
  /**
    * Publishes an MQTT message. Requires permission to access the Publish action. For more information about MQTT messages, see MQTT Protocol in the IoT Developer Guide. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def publish(): Request[js.Object, AWSError] = js.native
  def publish(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Publishes an MQTT message. Requires permission to access the Publish action. For more information about MQTT messages, see MQTT Protocol in the IoT Developer Guide. For more information about messaging costs, see Amazon Web Services IoT Core pricing - Messaging.
    */
  def publish(params: PublishRequest): Request[js.Object, AWSError] = js.native
  def publish(params: PublishRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the shadow for the specified thing. Requires permission to access the UpdateThingShadow action. For more information, see UpdateThingShadow in the IoT Developer Guide.
    */
  def updateThingShadow(): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]): Request[UpdateThingShadowResponse, AWSError] = js.native
  /**
    * Updates the shadow for the specified thing. Requires permission to access the UpdateThingShadow action. For more information, see UpdateThingShadow in the IoT Developer Guide.
    */
  def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(
    params: UpdateThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]
  ): Request[UpdateThingShadowResponse, AWSError] = js.native
}
