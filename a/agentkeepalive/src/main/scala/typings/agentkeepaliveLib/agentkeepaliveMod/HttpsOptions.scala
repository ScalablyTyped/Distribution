package typings
package agentkeepaliveLib.agentkeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsOptions
  extends nodeLib.httpsMod.AgentOptions {
  var freeSocketKeepAliveTimeout: js.UndefOr[scala.Double] = js.undefined
  var freeSocketTimeout: js.UndefOr[scala.Double] = js.undefined
  var socketActiveTTL: js.UndefOr[scala.Double] = js.undefined
}

object HttpsOptions {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    NPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    checkServerIdentity: (/* host */ java.lang.String, /* cert */ nodeLib.tlsMod.PeerCertificate) => js.UndefOr[nodeLib.Error] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    freeSocketKeepAliveTimeout: scala.Int | scala.Double = null,
    freeSocketTimeout: scala.Int | scala.Double = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveMsecs: scala.Int | scala.Double = null,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxCachedSessions: scala.Int | scala.Double = null,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minDHSize: scala.Int | scala.Double = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    session: nodeLib.Buffer = null,
    sessionIdContext: java.lang.String = null,
    socket: nodeLib.netMod.Socket = null,
    socketActiveTTL: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): HttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (freeSocketTimeout != null) __obj.updateDynamic("freeSocketTimeout")(freeSocketTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxCachedSessions != null) __obj.updateDynamic("maxCachedSessions")(maxCachedSessions.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (socketActiveTTL != null) __obj.updateDynamic("socketActiveTTL")(socketActiveTTL.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsOptions]
  }
}

