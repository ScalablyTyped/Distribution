package typings.awsIotDeviceSdk.mod

import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.mqtts
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.newest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.oldest
import typings.awsIotDeviceSdk.awsIotDeviceSdkStrings.wss
import typings.mqtt.clientOptionsMod.IClientOptions
import typings.node.Buffer
import typings.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOptions extends IClientOptions {
  
  /**
    * used to specify the Access Key ID when protocol is set to "wss".
    * Overrides the environment variable AWS_ACCESS_KEY_ID if set.
    */
  var accessKeyId: js.UndefOr[String] = js.native
  
  /**
    * set to "true" to automatically re-subscribe to topics after
    * reconnection (default "true")
    */
  var autoResubscribe: js.UndefOr[Boolean] = js.native
  
  /** the base reconnection time in milliseconds (default 1000) */
  var baseReconnectTimeMs: js.UndefOr[Double] = js.native
  
  /**
    * same as caPath, but can also accept a buffer containing CA certificate
    * data
    */
  var caCert: js.UndefOr[String | Buffer] = js.native
  
  /** path of your CA certificate file */
  var caPath: js.UndefOr[String] = js.native
  
  /**
    * path of the client certificate file path of the private key file
    * associated with the client certificate
    */
  var certPath: js.UndefOr[String] = js.native
  
  /**
    * same as certPath, but can also accept a buffer containing client
    * certificate data
    */
  var clientCert: js.UndefOr[String | Buffer] = js.native
  
  /** enable console logging, default false */
  // NB Not documented but present in examples, see
  // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b468d/device/index.js#L436
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * the minimum time in milliseconds between publishes when draining
    * after reconnection (default 250)
    */
  var drainTimeMs: js.UndefOr[Double] = js.native
  
  /** path of the private key file associated with the client certificate */
  var keyPath: js.UndefOr[String] = js.native
  
  /** the maximum reconnection time in milliseconds (default 128000) */
  var maximumReconnectTimeMs: js.UndefOr[Double] = js.native
  
  /**
    * the minimum time in milliseconds that a connection must be maintained
    * in order to be considered stable (default 20000)
    */
  var minimumConnectionTimeMs: js.UndefOr[Double] = js.native
  
  /**
    * set to "oldest" or "newest" to define drop behavior on a full
    * queue when offlineQueueMaxSize > 0
    */
  var offlineQueueDropBehavior: js.UndefOr[oldest | newest] = js.native
  
  /**
    * enforce a maximum size for the offline message queue
    * (default 0, e.g. no maximum)
    */
  var offlineQueueMaxSize: js.UndefOr[Double] = js.native
  
  /** set to "true" to automatically queue published messages while
    * offline (default "true")
    */
  var offlineQueueing: js.UndefOr[Boolean] = js.native
  
  /**
    * same as keyPath, but can also accept a buffer containing private key
    * data
    */
  var privateKey: js.UndefOr[String | Buffer] = js.native
  
  /**
    * the connection type, either "mqtts" (default) or "wss" (WebSocket/TLS).
    * Note that when set to "wss", values must be provided for the
    * Access Key ID and Secret Key in either the following options or in
    * environment variables as specified in WebSocket Configuration[1].
    *
    * 1. https://github.com/aws/aws-iot-device-sdk-js#websockets
    */
  @JSName("protocol")
  var protocol_DeviceOptions: js.UndefOr[mqtts | wss] = js.native
  
  /** the AWS IoT region you will operate in (default "us-east-1") */
  var region: js.UndefOr[String] = js.native
  
  /**
    * used to specify the Secret Key when protocol is set to "wss".
    * Overrides the environment variable AWS_SECRET_ACCESS_KEY if set.
    */
  var secretKey: js.UndefOr[String] = js.native
  
  /**
    * (required when authenticating via Cognito, optional otherwise) used
    * to specify the Session Token when protocol is set to "wss". Overrides
    * the environment variable AWS_SESSION_TOKEN if set.
    */
  var sessionToken: js.UndefOr[String] = js.native
  
  /**
    * if protocol is set to "wss", you can use this parameter to pass
    * additional options to the underlying WebSocket object;
    * these options are documented here.
    */
  var websocketOptions: js.UndefOr[ClientOptions] = js.native
}
object DeviceOptions {
  
  @scala.inline
  def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  
  @scala.inline
  implicit class DeviceOptionsOps[Self <: DeviceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    
    @scala.inline
    def setAutoResubscribe(value: Boolean): Self = this.set("autoResubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResubscribe: Self = this.set("autoResubscribe", js.undefined)
    
    @scala.inline
    def setBaseReconnectTimeMs(value: Double): Self = this.set("baseReconnectTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseReconnectTimeMs: Self = this.set("baseReconnectTimeMs", js.undefined)
    
    @scala.inline
    def setCaCert(value: String | Buffer): Self = this.set("caCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCert: Self = this.set("caCert", js.undefined)
    
    @scala.inline
    def setCaPath(value: String): Self = this.set("caPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaPath: Self = this.set("caPath", js.undefined)
    
    @scala.inline
    def setCertPath(value: String): Self = this.set("certPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertPath: Self = this.set("certPath", js.undefined)
    
    @scala.inline
    def setClientCert(value: String | Buffer): Self = this.set("clientCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCert: Self = this.set("clientCert", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDrainTimeMs(value: Double): Self = this.set("drainTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainTimeMs: Self = this.set("drainTimeMs", js.undefined)
    
    @scala.inline
    def setKeyPath(value: String): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    
    @scala.inline
    def setMaximumReconnectTimeMs(value: Double): Self = this.set("maximumReconnectTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumReconnectTimeMs: Self = this.set("maximumReconnectTimeMs", js.undefined)
    
    @scala.inline
    def setMinimumConnectionTimeMs(value: Double): Self = this.set("minimumConnectionTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumConnectionTimeMs: Self = this.set("minimumConnectionTimeMs", js.undefined)
    
    @scala.inline
    def setOfflineQueueDropBehavior(value: oldest | newest): Self = this.set("offlineQueueDropBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineQueueDropBehavior: Self = this.set("offlineQueueDropBehavior", js.undefined)
    
    @scala.inline
    def setOfflineQueueMaxSize(value: Double): Self = this.set("offlineQueueMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineQueueMaxSize: Self = this.set("offlineQueueMaxSize", js.undefined)
    
    @scala.inline
    def setOfflineQueueing(value: Boolean): Self = this.set("offlineQueueing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfflineQueueing: Self = this.set("offlineQueueing", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String | Buffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setProtocol(value: mqtts | wss): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    
    @scala.inline
    def setWebsocketOptions(value: ClientOptions): Self = this.set("websocketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocketOptions: Self = this.set("websocketOptions", js.undefined)
  }
}
