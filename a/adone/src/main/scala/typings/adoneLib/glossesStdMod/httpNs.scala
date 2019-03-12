package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "http")
@js.native
object httpNs extends js.Object {
  @js.native
  class Agent ()
    extends nodeLib.httpMod.Agent {
    def this(opts: nodeLib.httpMod.AgentOptions) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  @js.native
  class ClientRequest protected ()
    extends nodeLib.httpMod.ClientRequest {
    def this(url: java.lang.String) = this()
    def this(url: nodeLib.httpMod.ClientRequestArgs) = this()
    def this(url: nodeLib.urlMod.URL) = this()
    def this(url: java.lang.String, cb: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]) = this()
    def this(url: nodeLib.httpMod.ClientRequestArgs, cb: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]) = this()
    def this(url: nodeLib.urlMod.URL, cb: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]) = this()
  }
  
  @js.native
  class IncomingMessage protected ()
    extends nodeLib.httpMod.IncomingMessage {
    def this(socket: nodeLib.netMod.Socket) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  @js.native
  class OutgoingMessage ()
    extends nodeLib.httpMod.OutgoingMessage
  
  @js.native
  class Server ()
    extends nodeLib.httpMod.Server {
    def this(options: nodeLib.httpMod.ServerOptions) = this()
    def this(requestListener: nodeLib.httpMod.RequestListener) = this()
    def this(options: nodeLib.httpMod.ServerOptions, requestListener: nodeLib.httpMod.RequestListener) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  @js.native
  class ServerResponse protected ()
    extends nodeLib.httpMod.ServerResponse {
    def this(req: nodeLib.httpMod.IncomingMessage) = this()
  }
  
  val METHODS: js.Array[java.lang.String] = js.native
  var globalAgent: nodeLib.httpMod.Agent = js.native
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 8KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: scala.Double = js.native
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(options: nodeLib.httpMod.ServerOptions): nodeLib.httpMod.Server = js.native
  def createServer(options: nodeLib.httpMod.ServerOptions, requestListener: nodeLib.httpMod.RequestListener): nodeLib.httpMod.Server = js.native
  def createServer(requestListener: nodeLib.httpMod.RequestListener): nodeLib.httpMod.Server = js.native
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
  @js.native
  object STATUS_CODES
    extends /* errorCode */ org.scalablytyped.runtime.NumberDictionary[js.UndefOr[java.lang.String]]
       with /* errorCode */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
}

