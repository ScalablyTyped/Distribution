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
  /**
    * Optional clientId that can be used to specify the identity for this client. In most cases
    * it is preferable to instead specift a clientId in the token issued to this client.
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
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

