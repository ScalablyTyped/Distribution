package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait ClientOptions extends AuthOptions {
  /**
  		 * When true will automatically connect to Ably when library is instanced. This is true by default
  		 */
  var autoConnect: js.UndefOr[scala.Boolean] = js.undefined
  var defaultTokenParams: js.UndefOr[TokenParams] = js.undefined
  /**
  		 * When true, messages published on channels by this client will be echoed back to this client.
  		 * This is true by default
  		 */
  var echoMessages: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Use this only if you have been provided a dedicated environment by Ably
  		 */
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var fallbackHosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * Logger configuration
  		 */
  var log: js.UndefOr[LogInfo] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * When true, messages will be queued whilst the connection is disconnected. True by default.
  		 */
  var queueMessages: js.UndefOr[scala.Boolean] = js.undefined
  var realtimeHost: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Can be used to explicitly recover a connection.
  		 * See https://www.ably.io/documentation/realtime/connection#connection-state-recovery
  		 */
  var recover: js.UndefOr[standardCallback | java.lang.String] = js.undefined
  var restHost: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Use a non-secure connection connection. By default, a TLS connection is used to connect to Ably
  		 */
  var tls: js.UndefOr[scala.Boolean] = js.undefined
  var tlsPort: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * When true, the more efficient MsgPack binary encoding is used.
  		 * When false, JSON text encoding is used.
  		 */
  var useBinaryProtocol: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    authCallback: (/* data */ TokenParams, /* callback */ js.Function2[
      /* error */ ErrorInfo | java.lang.String, 
      /* tokenRequestOrDetails */ TokenDetails | TokenRequest | java.lang.String, 
      scala.Unit
    ]) => scala.Unit = null,
    authHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    authMethod: HTTPMethods = null,
    authParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    authUrl: java.lang.String = null,
    autoConnect: js.UndefOr[scala.Boolean] = js.undefined,
    clientId: java.lang.String = null,
    defaultTokenParams: TokenParams = null,
    echoMessages: js.UndefOr[scala.Boolean] = js.undefined,
    environment: java.lang.String = null,
    fallbackHosts: js.Array[java.lang.String] = null,
    key: java.lang.String = null,
    log: LogInfo = null,
    port: scala.Int | scala.Double = null,
    queryTime: js.UndefOr[scala.Boolean] = js.undefined,
    queueMessages: js.UndefOr[scala.Boolean] = js.undefined,
    realtimeHost: java.lang.String = null,
    recover: standardCallback | java.lang.String = null,
    restHost: java.lang.String = null,
    tls: js.UndefOr[scala.Boolean] = js.undefined,
    tlsPort: scala.Int | scala.Double = null,
    token: TokenDetails | java.lang.String = null,
    tokenDetails: TokenDetails = null,
    useBinaryProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    useTokenAuth: js.UndefOr[scala.Boolean] = js.undefined
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

