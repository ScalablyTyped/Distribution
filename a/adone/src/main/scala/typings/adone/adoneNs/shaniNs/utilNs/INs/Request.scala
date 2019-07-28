package typings.adone.adoneNs.shaniNs.utilNs.INs

import typings.node.Buffer
import typings.std.Promise
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Promise[Response] {
  /**
    * Attaches an attachment
    */
  def attach(name: String, contents: String): this.type = js.native
  def attach(name: String, contents: String, options: AttachOptions): this.type = js.native
  def attach(name: String, contents: Buffer): this.type = js.native
  def attach(name: String, contents: Buffer, options: AttachOptions): this.type = js.native
  /**
    * Sets the basic auth header
    */
  def auth(username: String, password: String): this.type = js.native
  /**
    * Executes a function with the response and asserts it returns true
    */
  def expect(fn: js.Function1[/* response */ Response, Boolean | js.Promise[Boolean]]): this.type = js.native
  def expectBody(body: String): this.type = js.native
  def expectBody(body: String, options: ExpectBodyOptions): this.type = js.native
  /**
    * Asserts the response json body
    */
  def expectBody(body: js.Object): this.type = js.native
  def expectBody(body: js.Object, options: ExpectBodyOptions): this.type = js.native
  def expectBody(body: Buffer): this.type = js.native
  def expectBody(body: Buffer, options: ExpectBodyOptions): this.type = js.native
  /**
    * Asserts the response body
    */
  def expectBody(body: RegExp): this.type = js.native
  def expectBody(body: RegExp, options: ExpectBodyOptions): this.type = js.native
  /**
    * Asserts that the response body is empty
    */
  def expectEmptyBody(): this.type = js.native
  /**
    * Asserts that the response has a header with the given key and value
    */
  def expectHeader(key: String, value: String): this.type = js.native
  def expectHeader(key: String, value: RegExp): this.type = js.native
  /**
    * Asserts that the response has a header with the given name
    */
  def expectHeaderExists(key: String): this.type = js.native
  /**
    * Asserts that the response does not have a header with the given name
    */
  def expectNoHeader(key: String): this.type = js.native
  /**
    * Asserts the response status
    */
  def expectStatus(code: Double): this.type = js.native
  def expectStatus(code: Double, message: String): this.type = js.native
  /**
    * Asserts the respose status message
    */
  def expectStatusMessage(value: String): this.type = js.native
  /**
    * Attaches an attachment like a field
    */
  def field(name: String, value: String): this.type = js.native
  /**
    * Sets the request method to GET
    */
  def get(path: String): this.type = js.native
  /**
    * Sets the request method to HEAD
    */
  def head(path: String): this.type = js.native
  /**
    * Sets the request method to OPTIONS
    */
  def options(path: String): this.type = js.native
  /**
    * Sets the request method to POST
    */
  def post(path: String): this.type = js.native
  /**
    * Sets the request method to PUT
    */
  def put(path: String): this.type = js.native
  /**
    * Sets the request body
    */
  def send(value: String): this.type = js.native
  /**
    * Sets a header value
    */
  def setHeader(key: String, value: String): this.type = js.native
}

