package typings.autocannon.autocannonMod

import typings.autocannon.autocannonStrings.body
import typings.autocannon.autocannonStrings.headers
import typings.autocannon.autocannonStrings.response
import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is passed as the first parameter of both the `setupClient` function and the `response` event from an autocannon instance.
  *
  * You can use this to modify the requests you are sending while benchmarking.
  */
@js.native
trait Client extends EventEmitter {
  /**
    * Emitted when a request sent from this client has received the body of a reply.
    */
  @JSName("on")
  def on_body(event: body, listener: js.Function1[/* body */ Buffer, Unit]): this.type = js.native
  /**
    * Emitted when a request sent from this client has received the headers of its reply.
    */
  @JSName("on")
  def on_headers(event: headers, listener: js.Function1[/* headers */ IncomingHttpHeaders, Unit]): this.type = js.native
  /**
    * Emitted when the client has received a completed response for a request it made.
    */
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function3[/* statusCode */ Double, /* resBytes */ Double, /* responseTime */ Double, Unit]
  ): this.type = js.native
  def setBody(): Unit = js.native
  /**
    * Used to modify the body of the request this client iterator is currently on. body
    * @param body - should be a `String` or `Buffer`, or `undefined` if you want to remove the body.
    */
  def setBody(body: String): Unit = js.native
  def setBody(body: Buffer): Unit = js.native
  def setHeaders(): Unit = js.native
  /**
    * Used to modify the headers of the request this client iterator is currently on.
    * @param headers - should be an `Object`, or `undefined` if you want to remove your headers.
    */
  def setHeaders(headers: IncomingHttpHeaders): Unit = js.native
  def setHeadersAndBody(): Unit = js.native
  def setHeadersAndBody(headers: js.UndefOr[scala.Nothing], body: String): Unit = js.native
  def setHeadersAndBody(headers: js.UndefOr[scala.Nothing], body: Buffer): Unit = js.native
  def setHeadersAndBody(headers: IncomingHttpHeaders): Unit = js.native
  /**
    * Used to modify the both the headers and body this client iterator is currently on.
    * @param headers - should be an `Object`, or `undefined` if you want to remove your headers.
    * @param body - should be a `String` or `Buffer`, or `undefined` if you want to remove the body.
    */
  def setHeadersAndBody(headers: IncomingHttpHeaders, body: String): Unit = js.native
  def setHeadersAndBody(headers: IncomingHttpHeaders, body: Buffer): Unit = js.native
  /**
    * Used to modify the both the entire request that this client iterator is currently on.
    * Defaults to the values passed into the autocannon instance when it was created.
    *
    * _Note: call this when modifying multiple request values for faster encoding._
    */
  def setRequest(request: Request): Unit = js.native
  /**
    * Used to overwrite the entire requests array that was passed into the instance on initiation.
    *
    * _Note: call this when modifying multiple requests for faster encoding._
    */
  def setRequests(newRequests: js.Array[Request]): Unit = js.native
}

