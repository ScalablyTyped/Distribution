package typings.angularDashMocks.angularDashMocksMod.angularMod

import typings.angularDashMocks.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
import typings.angularDashMocks.angularDashMocksMod.angularMod.mockNs.IRequestHandler
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// HttpBackendService
// see https://docs.angularjs.org/api/ngMock/service/$httpBackend
///////////////////////////////////////////////////////////////////////////
@js.native
trait IHttpBackendService extends js.Object {
  /**
    * Creates a new request expectation.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param method HTTP method.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expect(method: String, url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def expect(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def expect(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def expect(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new request expectation for DELETE requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectDELETE(url: String): IRequestHandler = js.native
  def expectDELETE(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectDELETE(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectDELETE(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def expectDELETE(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectDELETE(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def expectDELETE(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def expectDELETE(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def expectDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def expectDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectDELETE(url: RegExp): IRequestHandler = js.native
  def expectDELETE(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectDELETE(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectDELETE(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def expectDELETE(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new request expectation for GET requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectGET(url: String): IRequestHandler = js.native
  def expectGET(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectGET(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectGET(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def expectGET(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectGET(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def expectGET(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def expectGET(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def expectGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def expectGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectGET(url: RegExp): IRequestHandler = js.native
  def expectGET(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectGET(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectGET(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def expectGET(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new request expectation for HEAD requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectHEAD(url: String): IRequestHandler = js.native
  def expectHEAD(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectHEAD(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectHEAD(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def expectHEAD(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectHEAD(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def expectHEAD(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def expectHEAD(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def expectHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def expectHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def expectHEAD(url: RegExp): IRequestHandler = js.native
  def expectHEAD(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def expectHEAD(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectHEAD(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def expectHEAD(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new request expectation for JSONP requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectJSONP(url: String): IRequestHandler = js.native
  def expectJSONP(url: String, keys: js.Array[String]): IRequestHandler = js.native
  def expectJSONP(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def expectJSONP(url: js.Function1[/* url */ String, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def expectJSONP(url: RegExp): IRequestHandler = js.native
  def expectJSONP(url: RegExp, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new request expectation for PATCH requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectPATCH(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def expectPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def expectPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def expectPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new request expectation for POST requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectPOST(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def expectPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def expectPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def expectPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new request expectation for PUT requests.
    * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def expectPUT(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def expectPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def expectPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def expectPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new request expectation that compares only with the requested route.
    * This method offers colon delimited matching of the url path, ignoring the query string.
    * This allows declarations similar to how application routes are configured with `$routeProvider`.
    * As this method converts the definition url to regex, declaration order is important.
    * @param method HTTP method
    * @param url HTTP url string that supports colon param matching
    */
  def expectRoute(method: String, url: String): IRequestHandler = js.native
  /**
    * Flushes pending requests using the trained responses. Requests are flushed in the order they
    * were made, but it is also possible to skip one or more requests (for example to have them
    * flushed later). This is useful for simulating scenarios where responses arrive from the server
    * in any order.
    *
    * If there are no pending requests to flush when the method is called, an exception is thrown (as
    * this is typically a sign of programming error).
    *
    * @param count Number of responses to flush. If undefined/null, all pending requests (starting
    * after `skip`) will be flushed.
    * @param skip Number of pending requests to skip. For example, a value of 5 would skip the first 5 pending requests and start flushing from the 6th onwards. _(default: 0)_
    */
  def flush(): Unit = js.native
  def flush(count: Double): Unit = js.native
  def flush(count: Double, skip: Double): Unit = js.native
  /**
    * Resets all request expectations, but preserves all backend definitions.
    */
  def resetExpectations(): Unit = js.native
  /**
    * Verifies that all of the requests defined via the `expect` api were made. If any of the
    * requests were not made, verifyNoOutstandingExpectation throws an exception.
    * @param digest Do digest before checking expectation. Pass anything except false to trigger digest.
    * NOTE: this flag is purposely undocumented by Angular, which means it's not to be used in normal client code.
    */
  def verifyNoOutstandingExpectation(): Unit = js.native
  def verifyNoOutstandingExpectation(digest: Boolean): Unit = js.native
  /**
    * Verifies that there are no outstanding requests that need to be flushed.
    */
  def verifyNoOutstandingRequest(): Unit = js.native
  /**
    * Creates a new backend definition.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param method HTTP method.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def when(method: String, url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def when(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def when(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def when(
    method: String,
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new backend definition for DELETE requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenDELETE(url: String): IRequestHandler = js.native
  def whenDELETE(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenDELETE(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenDELETE(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def whenDELETE(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenDELETE(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def whenDELETE(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def whenDELETE(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def whenDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def whenDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenDELETE(url: RegExp): IRequestHandler = js.native
  def whenDELETE(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenDELETE(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenDELETE(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def whenDELETE(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new backend definition for GET requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in request url described above
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenGET(url: String): IRequestHandler = js.native
  def whenGET(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenGET(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenGET(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def whenGET(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenGET(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def whenGET(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def whenGET(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def whenGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def whenGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenGET(url: RegExp): IRequestHandler = js.native
  def whenGET(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenGET(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenGET(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def whenGET(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new backend definition for HEAD requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenHEAD(url: String): IRequestHandler = js.native
  def whenHEAD(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenHEAD(url: String, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenHEAD(url: String, headers: IHttpHeaders): IRequestHandler = js.native
  def whenHEAD(url: String, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenHEAD(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def whenHEAD(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean]
  ): IRequestHandler = js.native
  def whenHEAD(
    url: js.Function1[/* url */ String, Boolean],
    headers: js.Function1[/* headers */ IHttpHeaders, Boolean],
    keys: js.Array[String]
  ): IRequestHandler = js.native
  def whenHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
  def whenHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  def whenHEAD(url: RegExp): IRequestHandler = js.native
  def whenHEAD(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
  def whenHEAD(url: RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenHEAD(url: RegExp, headers: IHttpHeaders): IRequestHandler = js.native
  def whenHEAD(url: RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new backend definition for JSONP requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenJSONP(url: String): IRequestHandler = js.native
  def whenJSONP(url: String, keys: js.Array[String]): IRequestHandler = js.native
  def whenJSONP(url: js.Function1[/* url */ String, Boolean]): IRequestHandler = js.native
  def whenJSONP(url: js.Function1[/* url */ String, Boolean], keys: js.Array[String]): IRequestHandler = js.native
  def whenJSONP(url: RegExp): IRequestHandler = js.native
  def whenJSONP(url: RegExp, keys: js.Array[String]): IRequestHandler = js.native
  /**
    * Creates a new backend definition for PATCH requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenPATCH(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def whenPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def whenPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def whenPATCH(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new backend definition for POST requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true
    * if the url matches the current definition.
    * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
    * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenPOST(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def whenPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def whenPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def whenPOST(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new backend definition for PUT requests.
    * Returns an object with respond method that controls how a matched request is handled.
    * @param url HTTP url string, regular expression or function that receives a url and returns true
    * if the url matches the current definition.
    * @param data HTTP request body or function that receives data string and returns true if the data
    * is as expected.
    * @param headers HTTP headers or function that receives http header object and returns true if the
    * headers match the current definition.
    * @param keys Array of keys to assign to regex matches in the request url.
    */
  def whenPUT(url: String | RegExp | (js.Function1[/* url */ String, Boolean])): IRequestHandler = js.native
  def whenPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean])
  ): IRequestHandler = js.native
  def whenPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])
  ): IRequestHandler = js.native
  def whenPUT(
    url: String | RegExp | (js.Function1[/* url */ String, Boolean]),
    data: String | RegExp | js.Object | (js.Function1[/* data */ String, Boolean]),
    headers: IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean]),
    keys: js.Array[String]
  ): IRequestHandler = js.native
  /**
    * Creates a new backend definition that compares only with the requested route.
    * This method offers colon delimited matching of the url path, ignoring the query string.
    * This allows declarations similar to how application routes are configured with `$routeProvider`.
    * As this method converts the definition url to regex, declaration order is important.
    * @param method HTTP method.
    * @param url HTTP url string that supports colon param matching.
    */
  def whenRoute(method: String, url: String): IRequestHandler = js.native
}

