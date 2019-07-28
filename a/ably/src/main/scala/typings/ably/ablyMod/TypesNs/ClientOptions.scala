package typings.ably.ablyMod.TypesNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait ClientOptions extends AuthOptions {
  /**
  		 * When true will automatically connect to Ably when library is instanced. This is true by default
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var defaultTokenParams: js.UndefOr[TokenParams] = js.undefined
  /**
  		 * When true, messages published on channels by this client will be echoed back to this client.
  		 * This is true by default
  		 */
  var echoMessages: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Use this only if you have been provided a dedicated environment by Ably
  		 */
  var environment: js.UndefOr[String] = js.undefined
  var fallbackHosts: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * Logger configuration
  		 */
  var log: js.UndefOr[LogInfo] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /**
  		 * When true, messages will be queued whilst the connection is disconnected. True by default.
  		 */
  var queueMessages: js.UndefOr[Boolean] = js.undefined
  var realtimeHost: js.UndefOr[String] = js.undefined
  /**
  		 * Can be used to explicitly recover a connection.
  		 * See https://www.ably.io/documentation/realtime/connection#connection-state-recovery
  		 */
  var recover: js.UndefOr[standardCallback | String] = js.undefined
  var restHost: js.UndefOr[String] = js.undefined
  /**
  		 * Use a non-secure connection connection. By default, a TLS connection is used to connect to Ably
  		 */
  var tls: js.UndefOr[Boolean] = js.undefined
  var tlsPort: js.UndefOr[Double] = js.undefined
  /**
  		 * When true, the more efficient MsgPack binary encoding is used.
  		 * When false, JSON text encoding is used.
  		 */
  var useBinaryProtocol: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    authCallback: (/* data */ TokenParams, /* callback */ js.Function2[
      /* error */ ErrorInfo | String, 
      /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
      Unit
    ]) => Unit = null,
    authHeaders: StringDictionary[String] = null,
    authMethod: HTTPMethods = null,
    authParams: StringDictionary[String] = null,
    authUrl: String = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    defaultTokenParams: TokenParams = null,
    echoMessages: js.UndefOr[Boolean] = js.undefined,
    environment: String = null,
    fallbackHosts: js.Array[String] = null,
    key: String = null,
    log: LogInfo = null,
    port: Int | Double = null,
    queryTime: js.UndefOr[Boolean] = js.undefined,
    queueMessages: js.UndefOr[Boolean] = js.undefined,
    realtimeHost: String = null,
    recover: standardCallback | String = null,
    restHost: String = null,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsPort: Int | Double = null,
    token: TokenDetails | String = null,
    tokenDetails: TokenDetails = null,
    useBinaryProtocol: js.UndefOr[Boolean] = js.undefined,
    useTokenAuth: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (authCallback != null) __obj.updateDynamic("authCallback")(js.Any.fromFunction2(authCallback))
    if (authHeaders != null) __obj.updateDynamic("authHeaders")(authHeaders)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams)
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl)
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (defaultTokenParams != null) __obj.updateDynamic("defaultTokenParams")(defaultTokenParams)
    if (!js.isUndefined(echoMessages)) __obj.updateDynamic("echoMessages")(echoMessages)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (fallbackHosts != null) __obj.updateDynamic("fallbackHosts")(fallbackHosts)
    if (key != null) __obj.updateDynamic("key")(key)
    if (log != null) __obj.updateDynamic("log")(log)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(queryTime)) __obj.updateDynamic("queryTime")(queryTime)
    if (!js.isUndefined(queueMessages)) __obj.updateDynamic("queueMessages")(queueMessages)
    if (realtimeHost != null) __obj.updateDynamic("realtimeHost")(realtimeHost)
    if (recover != null) __obj.updateDynamic("recover")(recover.asInstanceOf[js.Any])
    if (restHost != null) __obj.updateDynamic("restHost")(restHost)
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls)
    if (tlsPort != null) __obj.updateDynamic("tlsPort")(tlsPort.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tokenDetails != null) __obj.updateDynamic("tokenDetails")(tokenDetails)
    if (!js.isUndefined(useBinaryProtocol)) __obj.updateDynamic("useBinaryProtocol")(useBinaryProtocol)
    if (!js.isUndefined(useTokenAuth)) __obj.updateDynamic("useTokenAuth")(useTokenAuth)
    __obj.asInstanceOf[ClientOptions]
  }
}

