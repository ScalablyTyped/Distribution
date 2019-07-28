package typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.mqtts
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.newest
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.oldest
import typings.awsDashIotDashDeviceDashSdk.awsDashIotDashDeviceDashSdkStrings.wss
import typings.mqtt.Anon_AuthenticationData
import typings.mqtt.Anon_Host
import typings.mqtt.Anon_Payload
import typings.mqtt.typesLibClientDashOptionsMod.IClientOptions
import typings.mqtt.typesLibClientMod.MqttClient
import typings.mqtt.typesLibStoreMod.Store
import typings.node.Buffer
import typings.ws.wsMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingShadowOptions extends DeviceOptions {
  /** the timeout for thing operations (default 10 seconds) */
  var operationTimeout: js.UndefOr[Double] = js.undefined
}

object ThingShadowOptions {
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
    operationTimeout: Int | Double = null,
    outgoingStore: Store = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    privateKey: String | Buffer = null,
    properties: Anon_AuthenticationData = null,
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
    servers: js.Array[Anon_Host] = null,
    sessionToken: String = null,
    transformWsUrl: (/* url */ String, /* options */ IClientOptions, /* client */ MqttClient) => String = null,
    username: String = null,
    websocketOptions: ClientOptions = null,
    will: Anon_Payload = null,
    wsOptions: StringDictionary[js.Any] = null
  ): ThingShadowOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId)
    if (!js.isUndefined(autoResubscribe)) __obj.updateDynamic("autoResubscribe")(autoResubscribe)
    if (baseReconnectTimeMs != null) __obj.updateDynamic("baseReconnectTimeMs")(baseReconnectTimeMs.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (caCert != null) __obj.updateDynamic("caCert")(caCert.asInstanceOf[js.Any])
    if (caPath != null) __obj.updateDynamic("caPath")(caPath)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certPath != null) __obj.updateDynamic("certPath")(certPath)
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (clientCert != null) __obj.updateDynamic("clientCert")(clientCert.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (drainTimeMs != null) __obj.updateDynamic("drainTimeMs")(drainTimeMs.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore)
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath)
    if (maximumReconnectTimeMs != null) __obj.updateDynamic("maximumReconnectTimeMs")(maximumReconnectTimeMs.asInstanceOf[js.Any])
    if (minimumConnectionTimeMs != null) __obj.updateDynamic("minimumConnectionTimeMs")(minimumConnectionTimeMs.asInstanceOf[js.Any])
    if (offlineQueueDropBehavior != null) __obj.updateDynamic("offlineQueueDropBehavior")(offlineQueueDropBehavior.asInstanceOf[js.Any])
    if (offlineQueueMaxSize != null) __obj.updateDynamic("offlineQueueMaxSize")(offlineQueueMaxSize.asInstanceOf[js.Any])
    if (!js.isUndefined(offlineQueueing)) __obj.updateDynamic("offlineQueueing")(offlineQueueing)
    if (operationTimeout != null) __obj.updateDynamic("operationTimeout")(operationTimeout.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId)
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(queueQoSZero)) __obj.updateDynamic("queueQoSZero")(queueQoSZero)
    if (reconnectPeriod != null) __obj.updateDynamic("reconnectPeriod")(reconnectPeriod.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(reschedulePings)) __obj.updateDynamic("reschedulePings")(reschedulePings)
    if (!js.isUndefined(resubscribe)) __obj.updateDynamic("resubscribe")(resubscribe)
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (transformWsUrl != null) __obj.updateDynamic("transformWsUrl")(js.Any.fromFunction3(transformWsUrl))
    if (username != null) __obj.updateDynamic("username")(username)
    if (websocketOptions != null) __obj.updateDynamic("websocketOptions")(websocketOptions)
    if (will != null) __obj.updateDynamic("will")(will)
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions)
    __obj.asInstanceOf[ThingShadowOptions]
  }
}

