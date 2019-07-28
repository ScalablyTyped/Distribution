package typings.adone.glossesStdMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.RequestListener
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerOptions
import typings.node.netMod.Socket
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "http")
@js.native
object httpNs extends js.Object {
  @js.native
  class Agent ()
    extends typings.node.httpMod.Agent {
    def this(opts: AgentOptions) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  @js.native
  class ClientRequest protected ()
    extends typings.node.httpMod.ClientRequest {
    def this(url: String) = this()
    def this(url: ClientRequestArgs) = this()
    def this(url: URL) = this()
    def this(url: String, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: ClientRequestArgs, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
    def this(url: URL, cb: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]) = this()
  }
  
  @js.native
  class IncomingMessage protected ()
    extends typings.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  @js.native
  class OutgoingMessage ()
    extends typings.node.httpMod.OutgoingMessage
  
  @js.native
  class Server ()
    extends typings.node.httpMod.Server {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  @js.native
  class ServerResponse protected ()
    extends typings.node.httpMod.ServerResponse {
    def this(req: typings.node.httpMod.IncomingMessage) = this()
  }
  
  val METHODS: js.Array[String] = js.native
  var globalAgent: typings.node.httpMod.Agent = js.native
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 8KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: Double = js.native
  def createServer(): typings.node.httpMod.Server = js.native
  def createServer(options: ServerOptions): typings.node.httpMod.Server = js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): typings.node.httpMod.Server = js.native
  def createServer(requestListener: RequestListener): typings.node.httpMod.Server = js.native
  def get(options: String): typings.node.httpMod.ClientRequest = js.native
  def get(options: String, callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]): typings.node.httpMod.ClientRequest = js.native
  def get(options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def get(
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  def get(options: URL): typings.node.httpMod.ClientRequest = js.native
  def get(options: URL, callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]): typings.node.httpMod.ClientRequest = js.native
  def get(url: String, options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def get(
    url: String,
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  def get(url: URL, options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def get(
    url: URL,
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  def request(options: String): typings.node.httpMod.ClientRequest = js.native
  def request(options: String, callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]): typings.node.httpMod.ClientRequest = js.native
  def request(options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def request(
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  def request(options: URL): typings.node.httpMod.ClientRequest = js.native
  def request(options: URL, callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]): typings.node.httpMod.ClientRequest = js.native
  def request(url: String, options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def request(
    url: String,
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  def request(url: URL, options: RequestOptions): typings.node.httpMod.ClientRequest = js.native
  def request(
    url: URL,
    options: RequestOptions,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage, Unit]
  ): typings.node.httpMod.ClientRequest = js.native
  @js.native
  object STATUS_CODES
    extends /* errorCode */ NumberDictionary[js.UndefOr[String]]
       with /* errorCode */ StringDictionary[js.UndefOr[String]]
  
}

