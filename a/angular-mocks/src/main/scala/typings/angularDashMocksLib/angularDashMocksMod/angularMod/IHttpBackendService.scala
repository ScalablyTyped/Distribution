package typings
package angularDashMocksLib.angularDashMocksMod.angularMod

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
  def expect(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def expect(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def expect(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def expect(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for DELETE requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url is as expected.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectDELETE(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for GET requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectGET(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for HEAD requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  
  def expectHEAD(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: java.lang.String, keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: js.Function1[/* url */ java.lang.String, scala.Boolean], keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for JSONP requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectJSONP(url: stdLib.RegExp, keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PATCH requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPATCH(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PATCH requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PATCH requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PATCH requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for POST requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPOST(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for POST requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for POST requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for POST requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PUT requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPUT(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PUT requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PUT requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation for PUT requests.
       * Throws a preformatted error if expectation(s) don't match supplied string, regular expression, object, or if function returns false.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def expectPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new request expectation that compares only with the requested route.
       * This method offers colon delimited matching of the url path, ignoring the query string.
       * This allows declarations similar to how application routes are configured with `$routeProvider`.
       * As this method converts the definition url to regex, declaration order is important.
       * @param method HTTP method
       * @param url HTTP url string that supports colon param matching
       */
  def expectRoute(method: java.lang.String, url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def flush(): scala.Unit = js.native
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
  def flush(count: scala.Double): scala.Unit = js.native
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
  def flush(count: scala.Double, skip: scala.Double): scala.Unit = js.native
  /**
       * Resets all request expectations, but preserves all backend definitions.
       */
  def resetExpectations(): scala.Unit = js.native
  /**
       * Verifies that all of the requests defined via the `expect` api were made. If any of the
       * requests were not made, verifyNoOutstandingExpectation throws an exception.
       * @param digest Do digest before checking expectation. Pass anything except false to trigger digest.
       * NOTE: this flag is purposely undocumented by Angular, which means it's not to be used in normal client code.
       */
  def verifyNoOutstandingExpectation(): scala.Unit = js.native
  /**
       * Verifies that all of the requests defined via the `expect` api were made. If any of the
       * requests were not made, verifyNoOutstandingExpectation throws an exception.
       * @param digest Do digest before checking expectation. Pass anything except false to trigger digest.
       * NOTE: this flag is purposely undocumented by Angular, which means it's not to be used in normal client code.
       */
  def verifyNoOutstandingExpectation(digest: scala.Boolean): scala.Unit = js.native
  /**
       * Verifies that there are no outstanding requests that need to be flushed.
       */
  def verifyNoOutstandingRequest(): scala.Unit = js.native
  /**
       * Creates a new backend definition.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param method HTTP method.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def when(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param method HTTP method.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def when(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param method HTTP method.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def when(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param method HTTP method.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def when(
    method: java.lang.String,
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for DELETE requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenDELETE(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for GET requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in request url described above
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenGET(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: java.lang.String,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: java.lang.String,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: js.Function1[/* url */ java.lang.String, scala.Boolean],
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: stdLib.RegExp,
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders,
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for HEAD requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenHEAD(
    url: stdLib.RegExp,
    headers: js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ],
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: java.lang.String, keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: js.Function1[/* url */ java.lang.String, scala.Boolean]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: js.Function1[/* url */ java.lang.String, scala.Boolean], keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: stdLib.RegExp): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for JSONP requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenJSONP(url: stdLib.RegExp, keys: js.Array[java.lang.String]): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for PATCH requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPATCH(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for PATCH requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for PATCH requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for PATCH requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPATCH(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for POST requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true
       * if the url matches the current definition.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPOST(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for POST requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true
       * if the url matches the current definition.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for POST requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true
       * if the url matches the current definition.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition for POST requests.
       * Returns an object with respond method that controls how a matched request is handled.
       * @param url HTTP url string, regular expression or function that receives a url and returns true
       * if the url matches the current definition.
       * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
       * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
       * @param keys Array of keys to assign to regex matches in the request url.
       */
  def whenPOST(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def whenPUT(url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def whenPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def whenPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ])
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
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
  def whenPUT(
    url: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]),
    data: java.lang.String | stdLib.RegExp | js.Object | (js.Function1[/* data */ java.lang.String, scala.Boolean]),
    headers: angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders | (js.Function1[
      /* headers */ angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IHttpHeaders, 
      scala.Boolean
    ]),
    keys: js.Array[java.lang.String]
  ): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
  /**
       * Creates a new backend definition that compares only with the requested route.
       * This method offers colon delimited matching of the url path, ignoring the query string.
       * This allows declarations similar to how application routes are configured with `$routeProvider`.
       * As this method converts the definition url to regex, declaration order is important.
       * @param method HTTP method.
       * @param url HTTP url string that supports colon param matching.
       */
  def whenRoute(method: java.lang.String, url: java.lang.String): angularDashMocksLib.angularDashMocksMod.angularMod.mockNs.IRequestHandler = js.native
}

