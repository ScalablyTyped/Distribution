package typings.apn

import typings.apn.anon.Reason
import typings.apn.apnNumbers.`1`
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apn", "Notification")
  @js.native
  /**
    * You can optionally pass in an object representing the payload, or configure properties on the returned object.
    */
  open class Notification () extends StObject {
    def this(payload: Any) = this()
    
    /**
      * The value to specify for `payload.aps.alert` can be either a `String` or an `Object` as outlined by the payload documentation.
      */
    var alert: String | NotificationAlertOptions = js.native
    
    var aps: Aps = js.native
    
    /**
      * The value to specify for `payload.aps.badge`
      */
    var badge: Double = js.native
    
    var collapseId: String = js.native
    
    /**
      * Setting this to true will specify "content-available" in the payload when it is compiled.
      */
    var contentAvailable: Boolean = js.native
    
    /**
      * The UNIX timestamp representing when the notification should expire. This does not contribute to the 2048 byte payload size limit. An expiry of 0 indicates that the notification expires immediately.
      */
    var expiry: Double = js.native
    
    /**
      * A UUID to identify the notification with APNS. If an id is not supplied, APNS will generate one automatically. If an error occurs the response will contain the id. This property populates the apns-id header.
      */
    var id: String = js.native
    
    /**
      * The value to specify for the `mdm` field where applicable.
      */
    var mdm: String | js.Object = js.native
    
    /**
      *
      */
    var mutableContent: Boolean = js.native
    
    /**
      * This Object is JSON encoded and sent as the notification payload. When properties have been set on notification.aps (either directly or with convenience setters) these are added to the payload just before it is sent. If payload already contains an aps property it is replaced.
      */
    var payload: Any = js.native
    
    /**
      * Provide one of the following values:
      *
      * - 10 - The push message is sent immediately. (Default)
      *   > The push notification must trigger an alert, sound, or badge on the device. It is an error use this priority for a push that contains only the content-available key.
      * - 5 - The push message is sent at a time that conserves power on the device receiving it.
      */
    var priority: Double = js.native
    
    /**
      * If supplied this payload will be encoded and transmitted as-is. The convenience setters will have no effect on the JSON output.
      */
    var rawPayload: Any = js.native
    
    /**
      * The value to specify for `payload.aps.sound`
      */
    var sound: String = js.native
    
    var threadId: String = js.native
    
    /**
      * Required: The destination topic for the notification.
      */
    var topic: String = js.native
    
    /**
      * The value to specify for `payload.aps['url-args']`. This used for Safari Push NOtifications and should be an array of values in accordance with the Web Payload Documentation.
      */
    var urlArgs: js.Array[String] = js.native
  }
  
  @JSImport("apn", "Provider")
  @js.native
  open class Provider protected () extends EventEmitter {
    def this(options: ProviderOptions) = this()
    
    /**
      * This is main interface for sending notifications. Create a Notification object and pass it in, along with a single recipient or an array of them and node-apn will take care of the rest, delivering a copy of the notification to each recipient.
      *
      * A "recipient" is a String containing the hex-encoded device token.
      */
    def send(notification: Notification, recipients: String): js.Promise[Responses] = js.native
    def send(notification: Notification, recipients: js.Array[String]): js.Promise[Responses] = js.native
    
    /**
      * Indicate to node-apn that it should close all open connections when the queue of pending notifications is fully drained. This will allow your application to terminate.
      */
    def shutdown(): Unit = js.native
  }
  
  inline def token(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def token(token: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Aps extends StObject {
    
    var alert: js.UndefOr[String | ApsAlert] = js.undefined
    
    var badge: js.UndefOr[Double] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var `content-available`: js.UndefOr[`1`] = js.undefined
    
    var `launch-image`: js.UndefOr[String] = js.undefined
    
    var `mutable-content`: js.UndefOr[`1`] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var `url-args`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Aps {
    
    inline def apply(): Aps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aps]
    }
    
    extension [Self <: Aps](x: Self) {
      
      inline def setAlert(value: String | ApsAlert): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def `setContent-available`(value: `1`): Self = StObject.set(x, "content-available", value.asInstanceOf[js.Any])
      
      inline def `setContent-availableUndefined`: Self = StObject.set(x, "content-available", js.undefined)
      
      inline def `setLaunch-image`(value: String): Self = StObject.set(x, "launch-image", value.asInstanceOf[js.Any])
      
      inline def `setLaunch-imageUndefined`: Self = StObject.set(x, "launch-image", js.undefined)
      
      inline def `setMutable-content`(value: `1`): Self = StObject.set(x, "mutable-content", value.asInstanceOf[js.Any])
      
      inline def `setMutable-contentUndefined`: Self = StObject.set(x, "mutable-content", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def `setUrl-args`(value: js.Array[String]): Self = StObject.set(x, "url-args", value.asInstanceOf[js.Any])
      
      inline def `setUrl-argsUndefined`: Self = StObject.set(x, "url-args", js.undefined)
      
      inline def `setUrl-argsVarargs`(value: String*): Self = StObject.set(x, "url-args", js.Array(value*))
    }
  }
  
  trait ApsAlert extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var `action-loc-key`: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var `loc-args`: js.UndefOr[js.Array[Any]] = js.undefined
    
    var `loc-key`: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `title-loc-args`: js.UndefOr[js.Array[Any]] = js.undefined
    
    var `title-loc-key`: js.UndefOr[String] = js.undefined
  }
  object ApsAlert {
    
    inline def apply(): ApsAlert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApsAlert]
    }
    
    extension [Self <: ApsAlert](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def `setAction-loc-key`(value: String): Self = StObject.set(x, "action-loc-key", value.asInstanceOf[js.Any])
      
      inline def `setAction-loc-keyUndefined`: Self = StObject.set(x, "action-loc-key", js.undefined)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def `setLoc-args`(value: js.Array[Any]): Self = StObject.set(x, "loc-args", value.asInstanceOf[js.Any])
      
      inline def `setLoc-argsUndefined`: Self = StObject.set(x, "loc-args", js.undefined)
      
      inline def `setLoc-argsVarargs`(value: Any*): Self = StObject.set(x, "loc-args", js.Array(value*))
      
      inline def `setLoc-key`(value: String): Self = StObject.set(x, "loc-key", value.asInstanceOf[js.Any])
      
      inline def `setLoc-keyUndefined`: Self = StObject.set(x, "loc-key", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-args`(value: js.Array[Any]): Self = StObject.set(x, "title-loc-args", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-argsUndefined`: Self = StObject.set(x, "title-loc-args", js.undefined)
      
      inline def `setTitle-loc-argsVarargs`(value: Any*): Self = StObject.set(x, "title-loc-args", js.Array(value*))
      
      inline def `setTitle-loc-key`(value: String): Self = StObject.set(x, "title-loc-key", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-keyUndefined`: Self = StObject.set(x, "title-loc-key", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NotificationAlertOptions extends StObject {
    
    var `action-loc-key`: js.UndefOr[String] = js.undefined
    
    var body: String
    
    var `launch-image`: js.UndefOr[String] = js.undefined
    
    var `loc-args`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `loc-key`: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `title-loc-args`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `title-loc-key`: js.UndefOr[String] = js.undefined
  }
  object NotificationAlertOptions {
    
    inline def apply(body: String): NotificationAlertOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationAlertOptions]
    }
    
    extension [Self <: NotificationAlertOptions](x: Self) {
      
      inline def `setAction-loc-key`(value: String): Self = StObject.set(x, "action-loc-key", value.asInstanceOf[js.Any])
      
      inline def `setAction-loc-keyUndefined`: Self = StObject.set(x, "action-loc-key", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def `setLaunch-image`(value: String): Self = StObject.set(x, "launch-image", value.asInstanceOf[js.Any])
      
      inline def `setLaunch-imageUndefined`: Self = StObject.set(x, "launch-image", js.undefined)
      
      inline def `setLoc-args`(value: js.Array[String]): Self = StObject.set(x, "loc-args", value.asInstanceOf[js.Any])
      
      inline def `setLoc-argsUndefined`: Self = StObject.set(x, "loc-args", js.undefined)
      
      inline def `setLoc-argsVarargs`(value: String*): Self = StObject.set(x, "loc-args", js.Array(value*))
      
      inline def `setLoc-key`(value: String): Self = StObject.set(x, "loc-key", value.asInstanceOf[js.Any])
      
      inline def `setLoc-keyUndefined`: Self = StObject.set(x, "loc-key", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-args`(value: js.Array[String]): Self = StObject.set(x, "title-loc-args", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-argsUndefined`: Self = StObject.set(x, "title-loc-args", js.undefined)
      
      inline def `setTitle-loc-argsVarargs`(value: String*): Self = StObject.set(x, "title-loc-args", js.Array(value*))
      
      inline def `setTitle-loc-key`(value: String): Self = StObject.set(x, "title-loc-key", value.asInstanceOf[js.Any])
      
      inline def `setTitle-loc-keyUndefined`: Self = StObject.set(x, "title-loc-key", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ProviderOptions extends StObject {
    
    /**
      * An array of trusted certificates. Each element should contain either a filename to load, or a Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs will be used. - You may need to use this as some environments don't include the CA used by Apple (entrust_2048).
      */
    var ca: js.UndefOr[js.Array[String | Buffer]] = js.undefined
    
    /**
      * The filename of the connection certificate to load from disk, or a Buffer/String containing the certificate data. (Defaults to: `cert.pem`)
      */
    var cert: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * The maximum number of connection failures that will be tolerated before `apn` will "terminate". (Defaults to: 3)
      */
    var connectionRetryLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * The filename of the connection key to load from disk, or a Buffer/String containing the key data. (Defaults to: `key.pem`)
      */
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * The passphrase for the connection key, if required
      */
    var passphrase: js.UndefOr[String] = js.undefined
    
    /**
      * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing the PFX data. If supplied will always be used instead of certificate and key above.
      */
    var pfx: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Specifies which environment to connect to: Production (if true) or Sandbox - The hostname will be set automatically. (Defaults to NODE_ENV == "production", i.e. false unless the NODE_ENV environment variable is set accordingly)
      */
    var production: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reject Unauthorized property to be passed through to tls.connect() (Defaults to `true`)
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration for Provider Authentication Tokens. (Defaults to: null i.e. fallback to Certificates)
      */
    var token: js.UndefOr[ProviderToken] = js.undefined
  }
  object ProviderOptions {
    
    inline def apply(): ProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderOptions]
    }
    
    extension [Self <: ProviderOptions](x: Self) {
      
      inline def setCa(value: js.Array[String | Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setConnectionRetryLimit(value: Double): Self = StObject.set(x, "connectionRetryLimit", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryLimitUndefined: Self = StObject.set(x, "connectionRetryLimit", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: String | Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setToken(value: ProviderToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait ProviderToken extends StObject {
    
    /**
      * The filename of the provider token key (as supplied by Apple) to load from disk, or a Buffer/String containing the key data.
      */
    var key: Buffer | String
    
    /**
      * The ID of the key issued by Apple
      */
    var keyId: String
    
    /**
      * ID of the team associated with the provider token key
      */
    var teamId: String
  }
  object ProviderToken {
    
    inline def apply(key: Buffer | String, keyId: String, teamId: String): ProviderToken = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderToken]
    }
    
    extension [Self <: ProviderToken](x: Self) {
      
      inline def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseFailure extends StObject {
    
    var device: String
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var response: js.UndefOr[Reason] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object ResponseFailure {
    
    inline def apply(device: String): ResponseFailure = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseFailure]
    }
    
    extension [Self <: ResponseFailure](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResponse(value: Reason): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait ResponseSent extends StObject {
    
    var device: String
  }
  object ResponseSent {
    
    inline def apply(device: String): ResponseSent = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseSent]
    }
    
    extension [Self <: ResponseSent](x: Self) {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    }
  }
  
  trait Responses extends StObject {
    
    var failed: js.Array[ResponseFailure]
    
    var sent: js.Array[ResponseSent]
  }
  object Responses {
    
    inline def apply(failed: js.Array[ResponseFailure], sent: js.Array[ResponseSent]): Responses = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Responses]
    }
    
    extension [Self <: Responses](x: Self) {
      
      inline def setFailed(value: js.Array[ResponseFailure]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedVarargs(value: ResponseFailure*): Self = StObject.set(x, "failed", js.Array(value*))
      
      inline def setSent(value: js.Array[ResponseSent]): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setSentVarargs(value: ResponseSent*): Self = StObject.set(x, "sent", js.Array(value*))
    }
  }
}
