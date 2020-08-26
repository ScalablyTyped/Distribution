package typings.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
@js.native
trait ClientOptions extends AuthOptions {
  /**
  		 * When true will automatically connect to Ably when library is instanced. This is true by default
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.native
  var closeOnUnload: js.UndefOr[Boolean] = js.native
  var defaultTokenParams: js.UndefOr[TokenParams] = js.native
  var disconnectedRetryTimeout: js.UndefOr[Double] = js.native
  /**
  		 * When true, messages published on channels by this client will be echoed back to this client.
  		 * This is true by default
  		 */
  var echoMessages: js.UndefOr[Boolean] = js.native
  /**
  		 * Use this only if you have been provided a dedicated environment by Ably
  		 */
  var environment: js.UndefOr[String] = js.native
  var fallbackHosts: js.UndefOr[js.Array[String]] = js.native
  var fallbackHostsUseDefault: js.UndefOr[Boolean] = js.native
  var idempotentRestPublishing: js.UndefOr[Boolean] = js.native
  /**
  		 * Logger configuration
  		 */
  var log: js.UndefOr[LogInfo] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
  		 * When true, messages will be queued whilst the connection is disconnected. True by default.
  		 */
  var queueMessages: js.UndefOr[Boolean] = js.native
  var realtimeHost: js.UndefOr[String] = js.native
  /**
  		 * Can be used to explicitly recover a connection.
  		 * See https://www.ably.io/documentation/realtime/connection#connection-state-recovery
  		 */
  var recover: js.UndefOr[standardCallback | String] = js.native
  var restHost: js.UndefOr[String] = js.native
  var suspendedRetryTimeout: js.UndefOr[Double] = js.native
  /**
  		 * Use a non-secure connection connection. By default, a TLS connection is used to connect to Ably
  		 */
  var tls: js.UndefOr[Boolean] = js.native
  var tlsPort: js.UndefOr[Double] = js.native
  var transportParams: js.UndefOr[StringDictionary[String]] = js.native
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
  		 * When true, the more efficient MsgPack binary encoding is used.
  		 * When false, JSON text encoding is used.
  		 */
  var useBinaryProtocol: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    @scala.inline
    def setCloseOnUnload(value: Boolean): Self = this.set("closeOnUnload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnUnload: Self = this.set("closeOnUnload", js.undefined)
    @scala.inline
    def setDefaultTokenParams(value: TokenParams): Self = this.set("defaultTokenParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTokenParams: Self = this.set("defaultTokenParams", js.undefined)
    @scala.inline
    def setDisconnectedRetryTimeout(value: Double): Self = this.set("disconnectedRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisconnectedRetryTimeout: Self = this.set("disconnectedRetryTimeout", js.undefined)
    @scala.inline
    def setEchoMessages(value: Boolean): Self = this.set("echoMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoMessages: Self = this.set("echoMessages", js.undefined)
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFallbackHostsVarargs(value: String*): Self = this.set("fallbackHosts", js.Array(value :_*))
    @scala.inline
    def setFallbackHosts(value: js.Array[String]): Self = this.set("fallbackHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackHosts: Self = this.set("fallbackHosts", js.undefined)
    @scala.inline
    def setFallbackHostsUseDefault(value: Boolean): Self = this.set("fallbackHostsUseDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackHostsUseDefault: Self = this.set("fallbackHostsUseDefault", js.undefined)
    @scala.inline
    def setIdempotentRestPublishing(value: Boolean): Self = this.set("idempotentRestPublishing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotentRestPublishing: Self = this.set("idempotentRestPublishing", js.undefined)
    @scala.inline
    def setLog(value: LogInfo): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQueueMessages(value: Boolean): Self = this.set("queueMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueMessages: Self = this.set("queueMessages", js.undefined)
    @scala.inline
    def setRealtimeHost(value: String): Self = this.set("realtimeHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtimeHost: Self = this.set("realtimeHost", js.undefined)
    @scala.inline
    def setRecoverFunction2(value: (/* error */ ErrorInfo, /* results */ js.Any) => Unit): Self = this.set("recover", js.Any.fromFunction2(value))
    @scala.inline
    def setRecover(value: standardCallback | String): Self = this.set("recover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecover: Self = this.set("recover", js.undefined)
    @scala.inline
    def setRestHost(value: String): Self = this.set("restHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestHost: Self = this.set("restHost", js.undefined)
    @scala.inline
    def setSuspendedRetryTimeout(value: Double): Self = this.set("suspendedRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendedRetryTimeout: Self = this.set("suspendedRetryTimeout", js.undefined)
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setTlsPort(value: Double): Self = this.set("tlsPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsPort: Self = this.set("tlsPort", js.undefined)
    @scala.inline
    def setTransportParams(value: StringDictionary[String]): Self = this.set("transportParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportParams: Self = this.set("transportParams", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: Transport*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    @scala.inline
    def setUseBinaryProtocol(value: Boolean): Self = this.set("useBinaryProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBinaryProtocol: Self = this.set("useBinaryProtocol", js.undefined)
  }
  
}

