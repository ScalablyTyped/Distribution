package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingShadowOptions extends DeviceOptions {
  /** the timeout for thing operations (default 10 seconds) */
  var operationTimeout: js.UndefOr[scala.Double] = js.undefined
}

object ThingShadowOptions {
  @scala.inline
  def apply(
    accessKeyId: java.lang.String = null,
    autoResubscribe: js.UndefOr[scala.Boolean] = js.undefined,
    baseReconnectTimeMs: scala.Int | scala.Double = null,
    ca: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] = null,
    caCert: java.lang.String | nodeLib.Buffer = null,
    caPath: java.lang.String = null,
    cert: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] = null,
    certPath: java.lang.String = null,
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    clientCert: java.lang.String | nodeLib.Buffer = null,
    clientId: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    drainTimeMs: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    incomingStore: mqttLib.typesLibStoreMod.Store = null,
    keepalive: scala.Int | scala.Double = null,
    key: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[js.Object] = null,
    keyPath: java.lang.String = null,
    maximumReconnectTimeMs: scala.Int | scala.Double = null,
    minimumConnectionTimeMs: scala.Int | scala.Double = null,
    offlineQueueDropBehavior: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.oldest | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.newest = null,
    offlineQueueMaxSize: scala.Int | scala.Double = null,
    offlineQueueing: js.UndefOr[scala.Boolean] = js.undefined,
    operationTimeout: scala.Int | scala.Double = null,
    outgoingStore: mqttLib.typesLibStoreMod.Store = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    privateKey: java.lang.String | nodeLib.Buffer = null,
    protocol: awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.mqtts | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.wss = null,
    protocolId: java.lang.String = null,
    protocolVersion: scala.Int | scala.Double = null,
    queueQoSZero: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectPeriod: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    reschedulePings: js.UndefOr[scala.Boolean] = js.undefined,
    resubscribe: js.UndefOr[scala.Boolean] = js.undefined,
    secretKey: java.lang.String = null,
    servers: js.Array[mqttLib.Anon_Host] = null,
    sessionToken: java.lang.String = null,
    transformWsUrl: (/* url */ java.lang.String, /* options */ mqttLib.typesLibClientDashOptionsMod.IClientOptions, /* client */ mqttLib.typesLibClientMod.MqttClient) => java.lang.String = null,
    username: java.lang.String = null,
    websocketOptions: wsLib.wsMod.WebSocketNs.ClientOptions = null,
    will: mqttLib.Anon_Payload = null,
    wsOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

