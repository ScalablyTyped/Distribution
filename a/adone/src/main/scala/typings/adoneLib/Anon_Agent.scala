package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Agent extends js.Object {
  var Agent: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.httpNs.Agent] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  var ClientRequest: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, adoneLib.glossesStdMod.httpNs.ClientRequest] = js.native
  var IncomingMessage: org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, adoneLib.glossesStdMod.httpNs.IncomingMessage] = js.native
  val METHODS: js.Array[java.lang.String] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  var OutgoingMessage: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.httpNs.OutgoingMessage] = js.native
  val STATUS_CODES: /* import warning: ImportType.apply Failed type conversion: {[errorCode: number] : string | undefined, [errorCode: string] : string | undefined, [errorCode: number] : string | undefined, [errorCode: string] : string | undefined} */ js.Any = js.native
  var Server: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.httpNs.Server] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  var ServerResponse: org.scalablytyped.runtime.Instantiable1[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    adoneLib.glossesStdMod.httpNs.ServerResponse
  ] = js.native
  var globalAgent: nodeLib.httpMod.Agent = js.native
  def createClient(): js.Any = js.native
  def createClient(port: scala.Double): js.Any = js.native
  def createClient(port: scala.Double, host: java.lang.String): js.Any = js.native
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  def get(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

