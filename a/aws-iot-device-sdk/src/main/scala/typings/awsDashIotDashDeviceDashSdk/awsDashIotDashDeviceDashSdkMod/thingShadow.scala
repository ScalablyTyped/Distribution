package typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkMod

import typings.awsDashIotDashDeviceDashSdk.Anon_0
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.accepted
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.close
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.connect
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.delete
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.delta
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.error
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.foreignStateChange
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.message
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.offline
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.reconnect
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.rejected
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.status
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.timeout
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.update
import typings.mqtt.mqttMod.Client
import typings.mqtt.typesLibClientDashOptionsMod.IClientPublishOptions
import typings.mqtt.typesLibClientDashOptionsMod.IClientSubscribeOptions
import typings.mqtt.typesLibClientMod.ClientSubscribeCallback
import typings.mqtt.typesLibClientMod.ISubscriptionGrant
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-iot-device-sdk", "thingShadow")
@js.native
class thingShadow () extends EventEmitter {
  def this(options: ThingShadowOptions) = this()
  /**
    * Delete the Thing Shadow named thingName, which must have been previously
    * registered using awsIot.thingShadow#register(). The thingShadow class
    * will subscribe to all applicable topics and publish on the delete sub-topic.
    *
    * This function returns a clientToken, which is a unique value associated
    * with the delete operation. When a "status" or "timeout" event is
    * emitted, the clientToken will be supplied as one of the parameters,
    * allowing the application to keep track of the status of each operation.
    * The caller may supply their own clientToken value (optional); if
    * supplied, the value of clientToken will be used rather than the
    * internally generated value. Note that this value should be of atomic
    * type (i.e. numeric or string). This function returns "null" if an
    * operation is already in progress.
    */
  def delete(thingName: String): String | Null = js.native
  def delete(thingName: String, clientToken: String): String | Null = js.native
  /**
    * end - close connection
    *
    * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
    *     This parameter is optional.
    * @param callback
    */
  def end(): Client = js.native
  def end(force: Boolean): Client = js.native
  def end(force: Boolean, callback: js.Function): Client = js.native
  /**
    * Get the current state of the Thing Shadow named thingName, which must
    * have been previously registered using awsIot.thingShadow#register().
    * The thingShadow class will subscribe to all applicable topics and
    * publish on the get sub-topic.
    *
    * This function returns a clientToken, which is a unique value
    * associated with the get operation. When a "status or "timeout" event
    * is emitted, the clientToken will be supplied as one of the parameters,
    * allowing the application to keep track of the status of each operation.
    * The caller may supply their own clientToken value (optional); if
    * supplied, the value of clientToken will be used rather than the
    * internally generated value. Note that this value should be of atomic
    * type (i.e. numeric or string). This function returns "null" if an
    * operation is already in progress.
    */
  def get(thingName: String): String | Null = js.native
  def get(thingName: String, clientToken: String): String | Null = js.native
  /** Emitted when a different client"s update or delete operation is accepted on the shadow. */
  def on(
    event: foreignStateChange,
    listener: js.Function3[
      /* thingName */ String, 
      /* operation */ update | delete, 
      /* stateObject */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when an operation update|get|delete completes.
    *
    * thingName - name of the Thing Shadow for which the operation has completed
    * stat - status of the operation accepted|rejected
    * clientToken - the operation"s clientToken
    * stateObject - the stateObject returned for the operation
    *
    * Applications can use clientToken values to correlate status events with
    * the operations that they are associated with by saving the clientTokens
    * returned from each operation.
    */
  def on(
    event: status,
    listener: js.Function4[
      /* thingName */ String, 
      /* operationStatus */ accepted | rejected, 
      /* clientToken */ String, 
      /* stateObject */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  /** Emitted when a delta has been received for a registered Thing Shadow. */
  @JSName("on")
  def on_delta(event: delta, listener: js.Function2[/* thingName */ String, /* stateObject */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  /** Emitted when a message is received on a topic not related to any Thing Shadows */
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* topic */ String, /* payload */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_offline(event: offline, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, listener: js.Function0[Unit]): this.type = js.native
  /** Emitted when an operation update|get|delete has timed out. */
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function2[/* thingName */ String, /* clientToken */ String, Unit]): this.type = js.native
  def publish(topic: String, message: String): Client = js.native
  def publish(topic: String, message: String, options: IClientPublishOptions): Client = js.native
  def publish(topic: String, message: String, options: IClientPublishOptions, callback: js.Function): Client = js.native
  // The following publish, subscribe, unsubscribe and end Definitions
  // are copied from the mqtt definition as they are re-surfaced through
  // thingShadow
  // https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e7772769fab8c206449ce9673cac417370330aa9/mqtt/mqtt.d.ts#L199
  /**
    * Publish a message to a topic
    *
    * @param topic
    * @param message
    * @param options
    * @param callback
    */
  def publish(topic: String, message: Buffer): Client = js.native
  def publish(topic: String, message: Buffer, options: IClientPublishOptions): Client = js.native
  def publish(topic: String, message: Buffer, options: IClientPublishOptions, callback: js.Function): Client = js.native
  /**
    * Register interest in the Thing Shadow named thingName.
    *
    * The thingShadow class will subscribe to any applicable topics, and will
    * fire events for the Thing Shadow until awsIot.thingShadow#unregister()
    * is called with thingName
    *
    * If the callback parameter is provided, it will be invoked after
    * registration is complete (i.e., when subscription ACKs have been received
    * for all shadow topics). Applications should wait until shadow
    * registration is complete before performing update/get/delete operations.
    */
  def register(thingName: String): Unit = js.native
  def register(thingName: String, options: RegisterOptions): Unit = js.native
  def register(
    thingName: String,
    options: RegisterOptions,
    callback: js.Function2[/* error */ Error, /* failedTopics */ js.Array[ISubscriptionGrant], Unit]
  ): Unit = js.native
  /**
    * Subscribe to a topic or topics
    * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
    * @param the options to subscribe with
    * @param callback fired on suback
    */
  def subscribe(topic: String): Client = js.native
  def subscribe(topic: String, options: Anon_0): Client = js.native
  def subscribe(topic: String, options: Anon_0, callback: ClientSubscribeCallback): Client = js.native
  def subscribe(topic: js.Array[String]): Client = js.native
  def subscribe(topic: js.Array[String], options: Anon_0): Client = js.native
  def subscribe(topic: js.Array[String], options: Anon_0, callback: ClientSubscribeCallback): Client = js.native
  /**
    * Unregister interest in the Thing Shadow named thingName.
    *
    * The thingShadow class will unsubscribe from all applicable topics
    * and no more events will be fired for thingName.
    */
  def unregister(thingName: String): Unit = js.native
  /**
    * Unsubscribe from a topic or topics
    *
    * @param topic  is a String topic or an array of topics to unsubscribe from
    * @param options
    * @param callback  fired on unsuback
    */
  def unsubscribe(topic: String): Client = js.native
  def unsubscribe(topic: String, options: IClientSubscribeOptions): Client = js.native
  def unsubscribe(topic: String, options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
  def unsubscribe(topic: js.Array[String]): Client = js.native
  def unsubscribe(topic: js.Array[String], options: IClientSubscribeOptions): Client = js.native
  def unsubscribe(topic: js.Array[String], options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
  /**
    * Update the Thing Shadow named thingName with the state specified in the
    * JavaScript object stateObject. thingName must have been previously
    * registered using awsIot.thingShadow#register().
    *
    * The thingShadow class will subscribe to all applicable topics and
    * publish stateObject on the update sub-topic.
    *
    * This function returns a clientToken, which is a unique value associated
    * with the update operation. When a "status" or "timeout" event is emitted,
    * the clientToken will be supplied as one of the parameters, allowing the
    * application to keep track of the status of each operation. The caller may
    * create their own clientToken value; if stateObject contains a clientToken
    * property, that will be used rather than the internally generated value.
    * Note that it should be of atomic type (i.e. numeric or string).
    * This function returns "null" if an operation is already in progress.
    */
  def update(thingName: String, stateObject: js.Any): String | Null = js.native
}

