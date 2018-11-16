package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-iot-device-sdk", "thingShadow")
@js.native
class thingShadow ()
  extends nodeLib.NodeJSNs.EventEmitter {
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
  def delete(thingName: java.lang.String): java.lang.String | scala.Null = js.native
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
  def delete(thingName: java.lang.String, clientToken: java.lang.String): java.lang.String | scala.Null = js.native
  /**
     * end - close connection
     *
     * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
     *     This parameter is optional.
     * @param callback
     */
  def end(): mqttLib.mqttMod.Client = js.native
  /**
     * end - close connection
     *
     * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
     *     This parameter is optional.
     * @param callback
     */
  def end(force: scala.Boolean): mqttLib.mqttMod.Client = js.native
  /**
     * end - close connection
     *
     * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
     *     This parameter is optional.
     * @param callback
     */
  def end(force: scala.Boolean, callback: js.Function): mqttLib.mqttMod.Client = js.native
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
  def get(thingName: java.lang.String): java.lang.String | scala.Null = js.native
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
  def get(thingName: java.lang.String, clientToken: java.lang.String): java.lang.String | scala.Null = js.native
  /** Emitted when a different client"s update or delete operation is accepted on the shadow. */
  def on(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.foreignStateChange,
    listener: js.Function3[
      /* thingName */ java.lang.String, 
      /* operation */ awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.update | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.delete, 
      /* stateObject */ js.Any, 
      scala.Unit
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
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.status,
    listener: js.Function4[
      /* thingName */ java.lang.String, 
      /* operationStatus */ awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.accepted | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.rejected, 
      /* clientToken */ java.lang.String, 
      /* stateObject */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_close(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.connect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /** Emitted when a delta has been received for a registered Thing Shadow. */
  @JSName("on")
  def on_delta(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.delta,
    listener: js.Function2[/* thingName */ java.lang.String, /* stateObject */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /** Emitted when a message is received on a topic not related to any Thing Shadows */
  @JSName("on")
  def on_message(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.message,
    listener: js.Function2[/* topic */ java.lang.String, /* payload */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_offline(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.offline,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reconnect(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.reconnect,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /** Emitted when an operation update|get|delete has timed out. */
  @JSName("on")
  def on_timeout(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.timeout,
    listener: js.Function2[/* thingName */ java.lang.String, /* clientToken */ java.lang.String, scala.Unit]
  ): this.type = js.native
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
  def publish(topic: java.lang.String, message: java.lang.String): mqttLib.mqttMod.Client = js.native
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
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): mqttLib.mqttMod.Client = js.native
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
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: js.Function
  ): mqttLib.mqttMod.Client = js.native
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
  def publish(topic: java.lang.String, message: nodeLib.Buffer): mqttLib.mqttMod.Client = js.native
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
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): mqttLib.mqttMod.Client = js.native
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
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: js.Function
  ): mqttLib.mqttMod.Client = js.native
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
  def register(thingName: java.lang.String): scala.Unit = js.native
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
  def register(thingName: java.lang.String, options: RegisterOptions): scala.Unit = js.native
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
  def register(
    thingName: java.lang.String,
    options: RegisterOptions,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* failedTopics */ js.Array[mqttLib.typesLibClientMod.ISubscriptionGrant], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(topic: java.lang.String): mqttLib.mqttMod.Client = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(topic: java.lang.String, options: awsDashIotDashDeviceDashSdkLib.Anon_Qos): mqttLib.mqttMod.Client = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(
    topic: java.lang.String,
    options: awsDashIotDashDeviceDashSdkLib.Anon_Qos,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(topic: js.Array[java.lang.String]): mqttLib.mqttMod.Client = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(topic: js.Array[java.lang.String], options: awsDashIotDashDeviceDashSdkLib.Anon_Qos): mqttLib.mqttMod.Client = js.native
  /**
     * Subscribe to a topic or topics
     * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
     * @param the options to subscribe with
     * @param callback fired on suback
     */
  def subscribe(
    topic: js.Array[java.lang.String],
    options: awsDashIotDashDeviceDashSdkLib.Anon_Qos,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  /**
     * Unregister interest in the Thing Shadow named thingName.
     *
     * The thingShadow class will unsubscribe from all applicable topics
     * and no more events will be fired for thingName.
     */
  def unregister(thingName: java.lang.String): scala.Unit = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(topic: java.lang.String): mqttLib.mqttMod.Client = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(topic: java.lang.String, options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions): mqttLib.mqttMod.Client = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(
    topic: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(topic: js.Array[java.lang.String]): mqttLib.mqttMod.Client = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(
    topic: js.Array[java.lang.String],
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions
  ): mqttLib.mqttMod.Client = js.native
  /**
     * Unsubscribe from a topic or topics
     *
     * @param topic  is a String topic or an array of topics to unsubscribe from
     * @param options
     * @param callback  fired on unsuback
     */
  def unsubscribe(
    topic: js.Array[java.lang.String],
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
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
  def update(thingName: java.lang.String, stateObject: js.Any): java.lang.String | scala.Null = js.native
}

