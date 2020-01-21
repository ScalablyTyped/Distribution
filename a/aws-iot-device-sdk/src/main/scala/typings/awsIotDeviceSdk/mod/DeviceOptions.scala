package typings.awsIotDeviceSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.mqtts
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.newest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.oldest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.wss
import typings.mqtt.AnonAuthenticationData
import typings.mqtt.AnonHost
import typings.mqtt.AnonPayload
import typings.mqtt.clientMod.MqttClient
import typings.mqtt.clientOptionsMod.IClientOptions
import typings.mqtt.storeMod.Store
import typings.node.Buffer
import typings.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOptions extends IClientOptions {
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
  def apply(
    accessKeyId: String = null,
    autoResubscribe: js.UndefOr[Boolean] = js.undefined,
    baseReconnectTimeMs: Int | Double = null,
    ca: String | (js.Array[Buffer | String]) | Buffer = null,
    caCert: String | Buffer = null,
    caPath: String = null,
    cert: String | (js.Array[Buffer | String]) | Buffer = null,
    certPath: String = null,
    clean: js.UndefOr[Boolean] = js.undefined,
    clientCert: String | Buffer = null,
    clientId: String = null,
    connectTimeout: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    drainTimeMs: Int | Double = null,
    host: String = null,
    hostname: String = null,
    incomingStore: Store = null,
    keepalive: Int | Double = null,
    key: String | (js.Array[Buffer | js.Object | String]) | Buffer = null,
    keyPath: String = null,
    maximumReconnectTimeMs: Int | Double = null,
    minimumConnectionTimeMs: Int | Double = null,
    offlineQueueDropBehavior: oldest | newest = null,
    offlineQueueMaxSize: Int | Double = null,
    offlineQueueing: js.UndefOr[Boolean] = js.undefined,
    outgoingStore: Store = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    privateKey: String | Buffer = null,
    properties: AnonAuthenticationData = null,
    protocol: mqtts | wss = null,
    protocolId: String = null,
    protocolVersion: Int | Double = null,
    queueQoSZero: js.UndefOr[Boolean] = js.undefined,
    reconnectPeriod: Int | Double = null,
    region: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    reschedulePings: js.UndefOr[Boolean] = js.undefined,
    resubscribe: js.UndefOr[Boolean] = js.undefined,
    secretKey: String = null,
    servers: js.Array[AnonHost] = null,
    sessionToken: String = null,
    transformWsUrl: (/* url */ String, /* options */ IClientOptions, /* client */ MqttClient) => String = null,
    username: String = null,
    websocketOptions: ClientOptions = null,
    will: AnonPayload = null,
    wsOptions: StringDictionary[js.Any] = null
  ): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResubscribe)) __obj.updateDynamic("autoResubscribe")(autoResubscribe.asInstanceOf[js.Any])
    if (baseReconnectTimeMs != null) __obj.updateDynamic("baseReconnectTimeMs")(baseReconnectTimeMs.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (caCert != null) __obj.updateDynamic("caCert")(caCert.asInstanceOf[js.Any])
    if (caPath != null) __obj.updateDynamic("caPath")(caPath.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certPath != null) __obj.updateDynamic("certPath")(certPath.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (clientCert != null) __obj.updateDynamic("clientCert")(clientCert.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (drainTimeMs != null) __obj.updateDynamic("drainTimeMs")(drainTimeMs.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (maximumReconnectTimeMs != null) __obj.updateDynamic("maximumReconnectTimeMs")(maximumReconnectTimeMs.asInstanceOf[js.Any])
    if (minimumConnectionTimeMs != null) __obj.updateDynamic("minimumConnectionTimeMs")(minimumConnectionTimeMs.asInstanceOf[js.Any])
    if (offlineQueueDropBehavior != null) __obj.updateDynamic("offlineQueueDropBehavior")(offlineQueueDropBehavior.asInstanceOf[js.Any])
    if (offlineQueueMaxSize != null) __obj.updateDynamic("offlineQueueMaxSize")(offlineQueueMaxSize.asInstanceOf[js.Any])
    if (!js.isUndefined(offlineQueueing)) __obj.updateDynamic("offlineQueueing")(offlineQueueing.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(queueQoSZero)) __obj.updateDynamic("queueQoSZero")(queueQoSZero.asInstanceOf[js.Any])
    if (reconnectPeriod != null) __obj.updateDynamic("reconnectPeriod")(reconnectPeriod.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(reschedulePings)) __obj.updateDynamic("reschedulePings")(reschedulePings.asInstanceOf[js.Any])
    if (!js.isUndefined(resubscribe)) __obj.updateDynamic("resubscribe")(resubscribe.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (transformWsUrl != null) __obj.updateDynamic("transformWsUrl")(js.Any.fromFunction3(transformWsUrl))
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (websocketOptions != null) __obj.updateDynamic("websocketOptions")(websocketOptions.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOptions]
  }
}

