package typings.adone.glossesStdMod

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpsMod.AgentOptions
import typings.node.httpsMod.RequestOptions
import typings.node.httpsMod.ServerOptions
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "https")
@js.native
object httpsNs extends js.Object {
  @js.native
  class Agent ()
    extends typings.node.httpsMod.Agent {
    def this(options: AgentOptions) = this()
  }
  
  @js.native
  class Server ()
    extends typings.node.httpsMod.Server {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  var globalAgent: typings.node.httpsMod.Agent = js.native
  def createServer(): typings.node.httpsMod.Server = js.native
  def createServer(options: ServerOptions): typings.node.httpsMod.Server = js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): typings.node.httpsMod.Server = js.native
  def createServer(requestListener: RequestListener): typings.node.httpsMod.Server = js.native
  def get(options: String): ClientRequest = js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: RequestOptions): ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: URL): ClientRequest = js.native
  def get(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: String, options: RequestOptions): ClientRequest = js.native
  def get(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: URL, options: RequestOptions): ClientRequest = js.native
  def get(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: String): ClientRequest = js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: RequestOptions): ClientRequest = js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: URL): ClientRequest = js.native
  def request(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: String, options: RequestOptions): ClientRequest = js.native
  def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: URL, options: RequestOptions): ClientRequest = js.native
  def request(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

