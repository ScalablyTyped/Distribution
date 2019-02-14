package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "https")
@js.native
object httpsNs extends js.Object {
  @js.native
  class Agent ()
    extends nodeLib.httpsMod.Agent {
    def this(options: nodeLib.httpsMod.AgentOptions) = this()
  }
  
  @js.native
  class Server protected ()
    extends nodeLib.httpsMod.Server {
    def this(options: nodeLib.httpsMod.ServerOptions) = this()
    def this(options: nodeLib.httpsMod.ServerOptions, requestListener: nodeLib.httpMod.RequestListener) = this()
  }
  
  var globalAgent: nodeLib.httpsMod.Agent = js.native
  def createServer(options: nodeLib.httpsMod.ServerOptions): nodeLib.httpsMod.Server = js.native
  def createServer(options: nodeLib.httpsMod.ServerOptions, requestListener: nodeLib.httpMod.RequestListener): nodeLib.httpsMod.Server = js.native
  def get(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: java.lang.String, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: nodeLib.urlMod.URL, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: java.lang.String, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: nodeLib.urlMod.URL, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

