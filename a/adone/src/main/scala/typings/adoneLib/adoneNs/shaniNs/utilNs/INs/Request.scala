package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends stdLib.Promise[Response] {
  /**
                       * Attaches an attachment
                       */
  def attach(name: java.lang.String, contents: java.lang.String): this.type = js.native
  /**
                       * Attaches an attachment
                       */
  def attach(name: java.lang.String, contents: java.lang.String, options: AttachOptions): this.type = js.native
  /**
                       * Attaches an attachment
                       */
  def attach(name: java.lang.String, contents: nodeLib.Buffer): this.type = js.native
  /**
                       * Attaches an attachment
                       */
  def attach(name: java.lang.String, contents: nodeLib.Buffer, options: AttachOptions): this.type = js.native
  /**
                       * Sets the basic auth header
                       */
  def auth(username: java.lang.String, password: java.lang.String): this.type = js.native
  /**
                       * Executes a function with the response and asserts it returns true
                       */
  def expect(fn: js.Function1[/* response */ Response, scala.Boolean | js.Promise[scala.Boolean]]): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: java.lang.String): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: java.lang.String, options: ExpectBodyOptions): this.type = js.native
  /**
                       * Asserts the response json body
                       */
  def expectBody(body: js.Object): this.type = js.native
  /**
                       * Asserts the response json body
                       */
  def expectBody(body: js.Object, options: ExpectBodyOptions): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: nodeLib.Buffer): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: nodeLib.Buffer, options: ExpectBodyOptions): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: stdLib.RegExp): this.type = js.native
  /**
                       * Asserts the response body
                       */
  def expectBody(body: stdLib.RegExp, options: ExpectBodyOptions): this.type = js.native
  /**
                       * Asserts that the response body is empty
                       */
  def expectEmptyBody(): this.type = js.native
  /**
                       * Asserts that the response has a header with the given key and value
                       */
  def expectHeader(key: java.lang.String, value: java.lang.String): this.type = js.native
  /**
                       * Asserts that the response has a header with the given key and value
                       */
  def expectHeader(key: java.lang.String, value: stdLib.RegExp): this.type = js.native
  /**
                       * Asserts that the response has a header with the given name
                       */
  def expectHeaderExists(key: java.lang.String): this.type = js.native
  /**
                       * Asserts that the response does not have a header with the given name
                       */
  def expectNoHeader(key: java.lang.String): this.type = js.native
  /**
                       * Asserts the response status
                       */
  def expectStatus(code: scala.Double): this.type = js.native
  /**
                       * Asserts the response status
                       */
  def expectStatus(code: scala.Double, message: java.lang.String): this.type = js.native
  /**
                       * Asserts the respose status message
                       */
  def expectStatusMessage(value: java.lang.String): this.type = js.native
  /**
                       * Attaches an attachment like a field
                       */
  def field(name: java.lang.String, value: java.lang.String): this.type = js.native
  /**
                       * Sets the request method to GET
                       */
  def get(path: java.lang.String): this.type = js.native
  /**
                       * Sets the request method to HEAD
                       */
  def head(path: java.lang.String): this.type = js.native
  /**
                       * Sets the request method to OPTIONS
                       */
  def options(path: java.lang.String): this.type = js.native
  /**
                       * Sets the request method to POST
                       */
  def post(path: java.lang.String): this.type = js.native
  /**
                       * Sets the request method to PUT
                       */
  def put(path: java.lang.String): this.type = js.native
  /**
                       * Sets the request body
                       */
  def send(value: java.lang.String): this.type = js.native
  /**
                       * Sets a header value
                       */
  def setHeader(key: java.lang.String, value: java.lang.String): this.type = js.native
}

