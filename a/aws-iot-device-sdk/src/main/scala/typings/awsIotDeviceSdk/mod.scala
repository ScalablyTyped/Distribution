package typings.awsIotDeviceSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsIotDeviceSdk.anon.Qos
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.accepted
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.close
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.connect
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.delete
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.delta
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.error
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.foreignStateChange
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.message
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.mqtts
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.newest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.offline
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.oldest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.reconnect
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.rejected
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.status
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.timeout
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.update
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.wss
import typings.mqtt.clientMod.ClientSubscribeCallback
import typings.mqtt.clientMod.ISubscriptionGrant
import typings.mqtt.clientMod.PacketCallback
import typings.mqtt.clientOptionsMod.IClientPublishOptions
import typings.mqtt.clientOptionsMod.IClientSubscribeOptions
import typings.mqtt.mod.Client
import typings.mqtt.mod.IClientOptions
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import typings.ws.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-iot-device-sdk", "device")
  @js.native
  /**
    * Returns a wrapper for the mqtt.Client() class, configured for a TLS
    * connection with the AWS IoT platform and with arguments as specified
    * in options.
    */
  class device () extends EventEmitter {
    def this(options: DeviceOptions) = this()
    
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
    def end(force: Unit, callback: js.Function): Client = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    // Error | string comes from:
    // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b46/device/index.js#L744
    // Remove when https://github.com/aws/aws-iot-device-sdk-js/issues/95 is fixed
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Error | String, Unit]): this.type = js.native
    /** Emitted when a message is received on a topic not related to any Thing Shadows */
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* topic */ String, /* payload */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_offline(event: offline, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reconnect(event: reconnect, listener: js.Function0[Unit]): this.type = js.native
    
    def publish(topic: String, message: String): Client = js.native
    def publish(
      topic: String,
      message: String,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Client = js.native
    def publish(topic: String, message: String, options: IClientPublishOptions): Client = js.native
    def publish(
      topic: String,
      message: String,
      options: IClientPublishOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Client = js.native
    // The following publish, subscribe, unsubscribe and end Definitions
    // are derived from the mqtt definition as they are re-surfaced through
    // thingShadow
    // https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e7772769fab8c206449ce9673cac417370330aa9/mqtt/mqtt.d.ts#L199
    /**
      * Publish a message to a topic
      *
      * @param topic to publish to
      * @param message to publish
      * @param publish options
      * @param called when publish succeeds or fails
      */
    def publish(topic: String, message: Buffer): Client = js.native
    def publish(
      topic: String,
      message: Buffer,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Client = js.native
    def publish(topic: String, message: Buffer, options: IClientPublishOptions): Client = js.native
    def publish(
      topic: String,
      message: Buffer,
      options: IClientPublishOptions,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Client = js.native
    
    /**
      * Subscribe to a topic or topics
      * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
      * @param the options to subscribe with
      * @param callback fired on suback
      */
    def subscribe(topic: String): Client = js.native
    def subscribe(topic: String, options: Unit, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: String, options: IClientSubscribeOptions): Client = js.native
    def subscribe(topic: String, options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: js.Array[String]): Client = js.native
    def subscribe(topic: js.Array[String], options: Unit, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: js.Array[String], options: IClientSubscribeOptions): Client = js.native
    def subscribe(topic: js.Array[String], options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
    
    /**
      * Unsubscribe from a topic or topics
      *
      * @param topic  is a String topic or an array of topics to unsubscribe from
      * @param callback  fired on unsuback
      */
    def unsubscribe(topic: String): Client = js.native
    def unsubscribe(topic: String, callback: PacketCallback): Client = js.native
    def unsubscribe(topic: js.Array[String]): Client = js.native
    def unsubscribe(topic: js.Array[String], callback: PacketCallback): Client = js.native
    
    /**
      * Update the credentials set used to authenticate via WebSocket/SigV4.
      *
      * This method is designed to be invoked during the callback of the
      * getCredentialsForIdentity method in the AWS SDK for JavaScript.
      */
    def updateWebSocketCredentials(accessKeyId: String, secretKey: String, sessionToken: String, expiration: Date): Unit = js.native
  }
  
  @JSImport("aws-iot-device-sdk", "jobs")
  @js.native
  /**
    * The `jobs` class wraps an instance of the `device` class with additional functionality to
    * handle job execution management through the AWS IoT Jobs platform. Arguments in `deviceOptions`
    * are the same as those in the device class and the `jobs` class supports all of the
    * same events and functions as the `device` class.
    */
  class jobs () extends device {
    def this(options: DeviceOptions) = this()
    
    /**
      * Causes any existing queued job executions for the given thing to be published
      * to the appropriate subscribeToJobs handler. Only needs to be called once per thing.
      *
      * @param thingName - name of the Thing to cancel job execution notifications for
      * @param callback - function (err) callback for when the startJobNotifications operation completes
      */
    def startJobNotifications(thingName: String, callback: js.Function1[/* error */ Error, Unit]): Client = js.native
    
    /**
      * Subscribes to job execution notifications for the thing named `thingName`. If
      * `operationName` is specified then the callback will only be called when a job
      * ready for execution contains a property called `operation` in its job document with
      * a value matching `operationName`. If `operationName` is omitted then the callback
      * will be called for every job ready for execution that does not match another
      * `subscribeToJobs` subscription.
      *
      * @param thingName - name of the Thing to receive job execution notifications
      * @param operationName - optionally filter job execution notifications to jobs with a value
      *      for the `operation` property that matches `operationName
      * @param callback - function (err, job) callback for when a job execution is ready for processing or an error occurs
      *     - `err` a subscription error or an error that occurs when client is disconnecting
      *     - `job` an object that contains  job execution information and functions for updating job execution status.
      */
    def subscribeToJobs(thingName: String, operationName: String): Unit = js.native
    def subscribeToJobs(
      thingName: String,
      operationName: String,
      callback: js.Function2[/* err */ Error, /* job */ job, Unit]
    ): Unit = js.native
    
    /**
      * Unsubscribes from job execution notifications for the thing named `thingName` having
      * operations with a value of the given `operationName`. If `operationName` is omitted then
      * the default handler for the thing with the given name is unsubscribed.
      *
      * @param thingName - name of the Thing to cancel job execution notifications for
      * @param operationName - optional name of previously subscribed operation names
      * @param callback - function (err) callback for when the unsubscribe operation completes
      */
    def unsubscribeFromJobs(thingName: String, operationName: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
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
    def end(force: Unit, callback: js.Function): Client = js.native
    
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
    def publish(topic: String, message: String, options: Unit, callback: js.Function): Client = js.native
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
    def publish(topic: String, message: Buffer, options: Unit, callback: js.Function): Client = js.native
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
    def register(
      thingName: String,
      options: Unit,
      callback: js.Function2[/* error */ Error, /* failedTopics */ js.Array[ISubscriptionGrant], Unit]
    ): Unit = js.native
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
    def subscribe(topic: String, options: Unit, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: String, options: Qos): Client = js.native
    def subscribe(topic: String, options: Qos, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: js.Array[String]): Client = js.native
    def subscribe(topic: js.Array[String], options: Unit, callback: ClientSubscribeCallback): Client = js.native
    def subscribe(topic: js.Array[String], options: Qos): Client = js.native
    def subscribe(topic: js.Array[String], options: Qos, callback: ClientSubscribeCallback): Client = js.native
    
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
    def unsubscribe(topic: String, options: Unit, callback: ClientSubscribeCallback): Client = js.native
    def unsubscribe(topic: String, options: IClientSubscribeOptions): Client = js.native
    def unsubscribe(topic: String, options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
    def unsubscribe(topic: js.Array[String]): Client = js.native
    def unsubscribe(topic: js.Array[String], options: Unit, callback: ClientSubscribeCallback): Client = js.native
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
  
  trait DeviceOptions
    extends StObject
       with IClientOptions {
    
    /**
      * used to specify the Access Key ID when protocol is set to "wss".
      * Overrides the environment variable AWS_ACCESS_KEY_ID if set.
      */
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * set to "true" to automatically re-subscribe to topics after
      * reconnection (default "true")
      */
    var autoResubscribe: js.UndefOr[Boolean] = js.undefined
    
    /** the base reconnection time in milliseconds (default 1000) */
    var baseReconnectTimeMs: js.UndefOr[Double] = js.undefined
    
    /**
      * same as caPath, but can also accept a buffer containing CA certificate
      * data
      */
    var caCert: js.UndefOr[String | Buffer] = js.undefined
    
    /** path of your CA certificate file */
    var caPath: js.UndefOr[String] = js.undefined
    
    /**
      * path of the client certificate file path of the private key file
      * associated with the client certificate
      */
    var certPath: js.UndefOr[String] = js.undefined
    
    /**
      * same as certPath, but can also accept a buffer containing client
      * certificate data
      */
    var clientCert: js.UndefOr[String | Buffer] = js.undefined
    
    /** enable console logging, default false */
    // NB Not documented but present in examples, see
    // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b468d/device/index.js#L436
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the minimum time in milliseconds between publishes when draining
      * after reconnection (default 250)
      */
    var drainTimeMs: js.UndefOr[Double] = js.undefined
    
    /** path of the private key file associated with the client certificate */
    var keyPath: js.UndefOr[String] = js.undefined
    
    /** the maximum reconnection time in milliseconds (default 128000) */
    var maximumReconnectTimeMs: js.UndefOr[Double] = js.undefined
    
    /**
      * the minimum time in milliseconds that a connection must be maintained
      * in order to be considered stable (default 20000)
      */
    var minimumConnectionTimeMs: js.UndefOr[Double] = js.undefined
    
    /**
      * set to "oldest" or "newest" to define drop behavior on a full
      * queue when offlineQueueMaxSize > 0
      */
    var offlineQueueDropBehavior: js.UndefOr[oldest | newest] = js.undefined
    
    /**
      * enforce a maximum size for the offline message queue
      * (default 0, e.g. no maximum)
      */
    var offlineQueueMaxSize: js.UndefOr[Double] = js.undefined
    
    /** set to "true" to automatically queue published messages while
      * offline (default "true")
      */
    var offlineQueueing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * same as keyPath, but can also accept a buffer containing private key
      * data
      */
    var privateKey: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * the connection type, either "mqtts" (default) or "wss" (WebSocket/TLS).
      * Note that when set to "wss", values must be provided for the
      * Access Key ID and Secret Key in either the following options or in
      * environment variables as specified in WebSocket Configuration[1].
      *
      * 1. https://github.com/aws/aws-iot-device-sdk-js#websockets
      */
    @JSName("protocol")
    var protocol_DeviceOptions: js.UndefOr[mqtts | wss] = js.undefined
    
    /** the AWS IoT region you will operate in (default "us-east-1") */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * used to specify the Secret Key when protocol is set to "wss".
      * Overrides the environment variable AWS_SECRET_ACCESS_KEY if set.
      */
    var secretKey: js.UndefOr[String] = js.undefined
    
    /**
      * (required when authenticating via Cognito, optional otherwise) used
      * to specify the Session Token when protocol is set to "wss". Overrides
      * the environment variable AWS_SESSION_TOKEN if set.
      */
    var sessionToken: js.UndefOr[String] = js.undefined
    
    /**
      * if protocol is set to "wss", you can use this parameter to pass
      * additional options to the underlying WebSocket object;
      * these options are documented here.
      */
    var websocketOptions: js.UndefOr[ClientOptions] = js.undefined
  }
  object DeviceOptions {
    
    @scala.inline
    def apply(): DeviceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceOptions]
    }
    
    @scala.inline
    implicit class DeviceOptionsMutableBuilder[Self <: DeviceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setAutoResubscribe(value: Boolean): Self = StObject.set(x, "autoResubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResubscribeUndefined: Self = StObject.set(x, "autoResubscribe", js.undefined)
      
      @scala.inline
      def setBaseReconnectTimeMs(value: Double): Self = StObject.set(x, "baseReconnectTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseReconnectTimeMsUndefined: Self = StObject.set(x, "baseReconnectTimeMs", js.undefined)
      
      @scala.inline
      def setCaCert(value: String | Buffer): Self = StObject.set(x, "caCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertUndefined: Self = StObject.set(x, "caCert", js.undefined)
      
      @scala.inline
      def setCaPath(value: String): Self = StObject.set(x, "caPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaPathUndefined: Self = StObject.set(x, "caPath", js.undefined)
      
      @scala.inline
      def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
      
      @scala.inline
      def setClientCert(value: String | Buffer): Self = StObject.set(x, "clientCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertUndefined: Self = StObject.set(x, "clientCert", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDrainTimeMs(value: Double): Self = StObject.set(x, "drainTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrainTimeMsUndefined: Self = StObject.set(x, "drainTimeMs", js.undefined)
      
      @scala.inline
      def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
      
      @scala.inline
      def setMaximumReconnectTimeMs(value: Double): Self = StObject.set(x, "maximumReconnectTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumReconnectTimeMsUndefined: Self = StObject.set(x, "maximumReconnectTimeMs", js.undefined)
      
      @scala.inline
      def setMinimumConnectionTimeMs(value: Double): Self = StObject.set(x, "minimumConnectionTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumConnectionTimeMsUndefined: Self = StObject.set(x, "minimumConnectionTimeMs", js.undefined)
      
      @scala.inline
      def setOfflineQueueDropBehavior(value: oldest | newest): Self = StObject.set(x, "offlineQueueDropBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineQueueDropBehaviorUndefined: Self = StObject.set(x, "offlineQueueDropBehavior", js.undefined)
      
      @scala.inline
      def setOfflineQueueMaxSize(value: Double): Self = StObject.set(x, "offlineQueueMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineQueueMaxSizeUndefined: Self = StObject.set(x, "offlineQueueMaxSize", js.undefined)
      
      @scala.inline
      def setOfflineQueueing(value: Boolean): Self = StObject.set(x, "offlineQueueing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineQueueingUndefined: Self = StObject.set(x, "offlineQueueing", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String | Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setProtocol(value: mqtts | wss): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      @scala.inline
      def setWebsocketOptions(value: ClientOptions): Self = StObject.set(x, "websocketOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsocketOptionsUndefined: Self = StObject.set(x, "websocketOptions", js.undefined)
    }
  }
  
  trait RegisterOptions extends StObject {
    
    /**
      * set to false to allow receiving messages with old version
      * numbers (default true)
      */
    var discardStale: js.UndefOr[Boolean] = js.undefined
    
    /** set to true to send version numbers with shadow updates (default true) */
    var enableVersioning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set to true to not subscribe to the delta sub-topic for this
      * Thing Shadow; used in cases where the application is not interested in
      * changes (e.g. update only.) (default false)
      */
    var ignoreDeltas: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set to false to unsubscribe from all operation sub-topics while not
      * performing an operation (default true)
      */
    var persistentSubscribe: js.UndefOr[Boolean] = js.undefined
  }
  object RegisterOptions {
    
    @scala.inline
    def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    @scala.inline
    implicit class RegisterOptionsMutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiscardStale(value: Boolean): Self = StObject.set(x, "discardStale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscardStaleUndefined: Self = StObject.set(x, "discardStale", js.undefined)
      
      @scala.inline
      def setEnableVersioning(value: Boolean): Self = StObject.set(x, "enableVersioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVersioningUndefined: Self = StObject.set(x, "enableVersioning", js.undefined)
      
      @scala.inline
      def setIgnoreDeltas(value: Boolean): Self = StObject.set(x, "ignoreDeltas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDeltasUndefined: Self = StObject.set(x, "ignoreDeltas", js.undefined)
      
      @scala.inline
      def setPersistentSubscribe(value: Boolean): Self = StObject.set(x, "persistentSubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentSubscribeUndefined: Self = StObject.set(x, "persistentSubscribe", js.undefined)
    }
  }
  
  trait ThingShadowOptions
    extends StObject
       with DeviceOptions {
    
    /** the timeout for thing operations (default 10 seconds) */
    var operationTimeout: js.UndefOr[Double] = js.undefined
  }
  object ThingShadowOptions {
    
    @scala.inline
    def apply(): ThingShadowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingShadowOptions]
    }
    
    @scala.inline
    implicit class ThingShadowOptionsMutableBuilder[Self <: ThingShadowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperationTimeout(value: Double): Self = StObject.set(x, "operationTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTimeoutUndefined: Self = StObject.set(x, "operationTimeout", js.undefined)
    }
  }
  
  @js.native
  trait job extends StObject {
    
    /**
      * The JSON document describing details of the job to be executed eg.
      * {
      *   "operation": "install",
      *   "otherProperty": "value",
      *   ...
      * }
      */
    var document: jobDocument = js.native
    
    /**
      * Update the status of the job execution to be FAILED for the thing associated with the job.
      *
      * @param statusDetails - optional document describing the status details of the in progress job e.g.
      * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
      */
    def failed(): Unit = js.native
    def failed(statusDetails: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def failed(statusDetails: statusDetails): Unit = js.native
    def failed(statusDetails: statusDetails, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /** Object that contains job execution information and functions for updating job execution status. */
    /** Returns the job id. */
    var id: String = js.native
    
    /**
      * Update the status of the job execution to be IN_PROGRESS for the thing associated with the job.
      *
      * @param statusDetails - optional document describing the status details of the in progress job
      * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
      */
    def inProgress(): Unit = js.native
    def inProgress(statusDetails: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def inProgress(statusDetails: statusDetails): Unit = js.native
    def inProgress(statusDetails: statusDetails, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Returns the job operation from the job document. Eg. 'install', 'reboot', etc.
      */
    var operation: String = js.native
    
    /**
      * Returns the current job status according to AWS Orchestra.
      */
    var status: jobStatus = js.native
    
    /**
      * Update the status of the job execution to be SUCCESS for the thing associated with the job.
      *
      * @param statusDetails - optional document describing the status details of the in progress job e.g.
      * @param callback - function(err) optional callback for when the operation completes, err is null if no error occurred
      */
    def succeeded(): Unit = js.native
    def succeeded(statusDetails: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def succeeded(statusDetails: statusDetails): Unit = js.native
    def succeeded(statusDetails: statusDetails, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  type jobDocument = StringDictionary[js.Any]
  
  trait jobStatus extends StObject {
    
    var status: String
    
    var statusDetails: typings.awsIotDeviceSdk.mod.statusDetails
  }
  object jobStatus {
    
    @scala.inline
    def apply(status: String, statusDetails: statusDetails): jobStatus = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusDetails = statusDetails.asInstanceOf[js.Any])
      __obj.asInstanceOf[jobStatus]
    }
    
    @scala.inline
    implicit class jobStatusMutableBuilder[Self <: jobStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDetails(value: statusDetails): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    }
  }
  
  trait statusDetails extends StObject {
    
    var progress: String
  }
  object statusDetails {
    
    @scala.inline
    def apply(progress: String): statusDetails = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[statusDetails]
    }
    
    @scala.inline
    implicit class statusDetailsMutableBuilder[Self <: statusDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
