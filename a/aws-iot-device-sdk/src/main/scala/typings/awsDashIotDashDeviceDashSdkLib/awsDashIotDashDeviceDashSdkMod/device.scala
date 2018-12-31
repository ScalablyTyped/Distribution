package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-iot-device-sdk", "device")
@js.native
/**
  * Returns a wrapper for the mqtt.Client() class, configured for a TLS
  * connection with the AWS IoT platform and with arguments as specified
  * in options.
  */
class device ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: DeviceOptions) = this()
  /**
    * end - close connection
    *
    * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
    *     This parameter is optional.
    * @param callback
    */
  def end(): mqttLib.mqttMod.Client = js.native
  def end(force: scala.Boolean): mqttLib.mqttMod.Client = js.native
  def end(force: scala.Boolean, callback: js.Function): mqttLib.mqttMod.Client = js.native
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
  // Error | string comes from:
  // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b46/device/index.js#L744
  // Remove when https://github.com/aws/aws-iot-device-sdk-js/issues/95 is fixed
  @JSName("on")
  def on_error(
    event: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error | java.lang.String, scala.Unit]
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
  def publish(topic: java.lang.String, message: java.lang.String): mqttLib.mqttMod.Client = js.native
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): mqttLib.mqttMod.Client = js.native
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): mqttLib.mqttMod.Client = js.native
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
  def publish(topic: java.lang.String, message: nodeLib.Buffer): mqttLib.mqttMod.Client = js.native
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): mqttLib.mqttMod.Client = js.native
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    options: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): mqttLib.mqttMod.Client = js.native
  /**
    * Subscribe to a topic or topics
    * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
    * @param the options to subscribe with
    * @param callback fired on suback
    */
  def subscribe(topic: java.lang.String): mqttLib.mqttMod.Client = js.native
  def subscribe(topic: java.lang.String, options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions): mqttLib.mqttMod.Client = js.native
  def subscribe(
    topic: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  def subscribe(topic: js.Array[java.lang.String]): mqttLib.mqttMod.Client = js.native
  def subscribe(
    topic: js.Array[java.lang.String],
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions
  ): mqttLib.mqttMod.Client = js.native
  def subscribe(
    topic: js.Array[java.lang.String],
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
  def unsubscribe(topic: java.lang.String): mqttLib.mqttMod.Client = js.native
  def unsubscribe(topic: java.lang.String, options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions): mqttLib.mqttMod.Client = js.native
  def unsubscribe(
    topic: java.lang.String,
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  def unsubscribe(topic: js.Array[java.lang.String]): mqttLib.mqttMod.Client = js.native
  def unsubscribe(
    topic: js.Array[java.lang.String],
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions
  ): mqttLib.mqttMod.Client = js.native
  def unsubscribe(
    topic: js.Array[java.lang.String],
    options: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: mqttLib.typesLibClientMod.ClientSubscribeCallback
  ): mqttLib.mqttMod.Client = js.native
  /**
    * Update the credentials set used to authenticate via WebSocket/SigV4.
    *
    * This method is designed to be invoked during the callback of the
    * getCredentialsForIdentity method in the AWS SDK for JavaScript.
    */
  def updateWebSocketCredentials(
    accessKeyId: java.lang.String,
    secretKey: java.lang.String,
    sessionToken: java.lang.String,
    expiration: stdLib.Date
  ): scala.Unit = js.native
}

