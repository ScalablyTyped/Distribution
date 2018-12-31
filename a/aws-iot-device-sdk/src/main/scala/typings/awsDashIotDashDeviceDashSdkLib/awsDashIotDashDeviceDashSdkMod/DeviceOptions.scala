package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOptions
  extends mqttLib.typesLibClientDashOptionsMod.IClientOptions {
  /**
    * used to specify the Access Key ID when protocol is set to "wss".
    * Overrides the environment variable AWS_ACCESS_KEY_ID if set.
    */
  var accessKeyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * set to "true" to automatically re-subscribe to topics after
    * reconnection (default "true")
    */
  var autoResubscribe: js.UndefOr[scala.Boolean] = js.undefined
  /** the base reconnection time in milliseconds (default 1000) */
  var baseReconnectTimeMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * same as caPath, but can also accept a buffer containing CA certificate
    * data
    */
  var caCert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /** path of your CA certificate file */
  var caPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * path of the client certificate file path of the private key file
    * associated with the client certificate
    */
  var certPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * same as certPath, but can also accept a buffer containing client
    * certificate data
    */
  var clientCert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /** enable console logging, default false */
  // NB Not documented but present in examples, see
  // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b468d/device/index.js#L436
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the minimum time in milliseconds between publishes when draining
    * after reconnection (default 250)
    */
  var drainTimeMs: js.UndefOr[scala.Double] = js.undefined
  /** path of the private key file associated with the client certificate */
  var keyPath: js.UndefOr[java.lang.String] = js.undefined
  /** the maximum reconnection time in milliseconds (default 128000) */
  var maximumReconnectTimeMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * the minimum time in milliseconds that a connection must be maintained
    * in order to be considered stable (default 20000)
    */
  var minimumConnectionTimeMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * set to "oldest" or "newest" to define drop behavior on a full
    * queue when offlineQueueMaxSize > 0
    */
  var offlineQueueDropBehavior: js.UndefOr[
    awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.oldest | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.newest
  ] = js.undefined
  /**
    * enforce a maximum size for the offline message queue
    * (default 0, e.g. no maximum)
    */
  var offlineQueueMaxSize: js.UndefOr[scala.Double] = js.undefined
  /** set to "true" to automatically queue published messages while
    * offline (default "true")
    */
  var offlineQueueing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * same as keyPath, but can also accept a buffer containing private key
    * data
    */
  var privateKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * the connection type, either "mqtts" (default) or "wss" (WebSocket/TLS).
    * Note that when set to "wss", values must be provided for the
    * Access Key ID and Secret Key in either the following options or in
    * environment variables as specified in WebSocket Configuration[1].
    *
    * 1. https://github.com/aws/aws-iot-device-sdk-js#websockets
    */
  @JSName("protocol")
  var protocol_DeviceOptions: js.UndefOr[
    awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.mqtts | awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkLibStrings.wss
  ] = js.undefined
  /** the AWS IoT region you will operate in (default "us-east-1") */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * used to specify the Secret Key when protocol is set to "wss".
    * Overrides the environment variable AWS_SECRET_ACCESS_KEY if set.
    */
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (required when authenticating via Cognito, optional otherwise) used
    * to specify the Session Token when protocol is set to "wss". Overrides
    * the environment variable AWS_SESSION_TOKEN if set.
    */
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if protocol is set to "wss", you can use this parameter to pass
    * additional options to the underlying WebSocket object;
    * these options are documented here.
    */
  var websocketOptions: js.UndefOr[wsLib.wsMod.WebSocketNs.ClientOptions] = js.undefined
}

