package typings.angularMocks.mod.angularAugmentingMod.mock

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def respond(data: String): IRequestHandler = js.native
  def respond(data: String, headers: js.UndefOr[scala.Nothing], responseText: String): IRequestHandler = js.native
  def respond(data: String, headers: IHttpHeaders): IRequestHandler = js.native
  def respond(data: String, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
  def respond(data: js.Object): IRequestHandler = js.native
  def respond(data: js.Object, headers: js.UndefOr[scala.Nothing], responseText: String): IRequestHandler = js.native
  def respond(data: js.Object, headers: IHttpHeaders): IRequestHandler = js.native
  def respond(data: js.Object, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
  /**
    * Controls the response for a matched request using a function to construct the response.
    * Returns the RequestHandler object for possible overrides.
    * @param func Function that receives the request HTTP method, url, data, headers, and an array of keys
    * to regex matches in the request url and returns an array containing response status (number), data,
    * headers, and status text.
    */
  def respond(
    func: js.Function5[
      /* method */ String, 
      /* url */ String, 
      /* data */ String | js.Object, 
      /* headers */ IHttpHeaders, 
      /* params */ StringDictionary[String], 
      js.Tuple4[Double, String | js.Object, IHttpHeaders, String]
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
  def respond(status: Double): IRequestHandler = js.native
  def respond(
    status: Double,
    data: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    responseText: String
  ): IRequestHandler = js.native
  def respond(status: Double, data: js.UndefOr[scala.Nothing], headers: IHttpHeaders): IRequestHandler = js.native
  def respond(status: Double, data: js.UndefOr[scala.Nothing], headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
  def respond(status: Double, data: String): IRequestHandler = js.native
  def respond(status: Double, data: String, headers: js.UndefOr[scala.Nothing], responseText: String): IRequestHandler = js.native
  def respond(status: Double, data: String, headers: IHttpHeaders): IRequestHandler = js.native
  def respond(status: Double, data: String, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
  def respond(status: Double, data: js.Object): IRequestHandler = js.native
  def respond(status: Double, data: js.Object, headers: js.UndefOr[scala.Nothing], responseText: String): IRequestHandler = js.native
  def respond(status: Double, data: js.Object, headers: IHttpHeaders): IRequestHandler = js.native
  def respond(status: Double, data: js.Object, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
}
