package typings
package angularDashMocksLib.angularDashMocksMod.angularMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object returned by the the mocked HttpBackendService expect/when methods */
@js.native
trait IRequestHandler extends js.Object {
  /**
         * Any request matching a backend definition or expectation with passThrough handler will be
         * passed through to the real backend (an XHR request will be made to the server.)
         * Available when ngMockE2E is loaded
         */
  def passThrough(): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: java.lang.String): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: java.lang.String, headers: IHttpHeaders): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: java.lang.String, headers: IHttpHeaders, responseText: java.lang.String): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: js.Object): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: js.Object, headers: IHttpHeaders): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using the HTTP status code 200 and supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(data: js.Object, headers: IHttpHeaders, responseText: java.lang.String): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using a function to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param func Function that receives the request HTTP method, url, data, headers, and an array of keys
         * to regex matches in the request url and returns an array containing response status (number), data,
         * headers, and status text.
         */
  def respond(
    func: js.Function5[
      /* method */ java.lang.String, 
      /* url */ java.lang.String, 
      /* data */ java.lang.String | js.Object, 
      /* headers */ IHttpHeaders, 
      /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      js.Tuple4[scala.Double, java.lang.String | js.Object, IHttpHeaders, java.lang.String]
    ]
  ): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double, data: java.lang.String): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double, data: java.lang.String, headers: IHttpHeaders): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(
    status: scala.Double,
    data: java.lang.String,
    headers: IHttpHeaders,
    responseText: java.lang.String
  ): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double, data: js.Object): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double, data: js.Object, headers: IHttpHeaders): IRequestHandler = js.native
  /**
         * Controls the response for a matched request using supplied static data to construct the response.
         * Returns the RequestHandler object for possible overrides.
         * @param status HTTP status code to add to the response.
         * @param data Data to add to the response.
         * @param headers Headers object to add to the response.
         * @param responseText Response text to add to the response.
         */
  def respond(status: scala.Double, data: js.Object, headers: IHttpHeaders, responseText: java.lang.String): IRequestHandler = js.native
}

