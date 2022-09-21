package typings.angularMocks

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IServiceProvider
import typings.angular.mod.Injectable
import typings.angularMocks.angularMocksStrings.alt
import typings.angularMocks.angularMocksStrings.ctrl
import typings.angularMocks.angularMocksStrings.meta
import typings.angularMocks.angularMocksStrings.shift
import typings.angularMocks.anon.Call
import typings.angularMocks.anon.Dictkey
import typings.angularMocks.mod.angularAugmentingMod.IInjectStatic
import typings.angularMocks.mod.angularAugmentingMod.mock.IBrowserTriggerEventData
import typings.angularMocks.mod.angularAugmentingMod.mock.IHttpHeaders
import typings.angularMocks.mod.angularAugmentingMod.mock.IRequestHandler
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  ///////////////////////////////////////////////////////////////////////////////
  // functions attached to global object (window)
  ///////////////////////////////////////////////////////////////////////////////
  // Use `angular.mock.module` instead of `module`, as `module` conflicts with commonjs.
  // declare var module: (...modules: any[]) => any;
  object global {
    
    /**
      * This is a global (window) function that is only available when the `ngMock` module is included.
      * It can be used to trigger a native browser event on an element, which is useful for unit testing.
      *
      * @param element Either a wrapped jQuery/jqLite node or a DOM element.
      * @param eventType Optional event type. If none is specified, the function tries to determine the
      *     right event type for the element, e.g. `change` for `input[text]`.
      * @param eventData An optional object which contains additional event data used when creating the
      *     event.
      */
    inline def browserTrigger(element: JQuery): Unit = js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def browserTrigger(element: JQuery, eventType: String): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def browserTrigger(element: JQuery, eventType: String, eventData: IBrowserTriggerEventData): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def browserTrigger(element: JQuery, eventType: Unit, eventData: IBrowserTriggerEventData): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def browserTrigger(element: Element): Unit = js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def browserTrigger(element: Element, eventType: String): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def browserTrigger(element: Element, eventType: String, eventData: IBrowserTriggerEventData): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def browserTrigger(element: Element, eventType: Unit, eventData: IBrowserTriggerEventData): Unit = (js.Dynamic.global.applyDynamic("browserTrigger")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], eventData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("inject")
    @js.native
    val inject: IInjectStatic = js.native
  }
  
  ///////////////////////////////////////////////////////////////////////////////
  // ngMock module (angular-mocks.js)
  ///////////////////////////////////////////////////////////////////////////////
  /* augmented module */
  object angularAugmentingMod {
    
    ///////////////////////////////////////////////////////////////////////////
    // AngularStatic
    // We reopen it to add the MockStatic definition
    ///////////////////////////////////////////////////////////////////////////
    trait IAngularStatic extends StObject {
      
      var mock: IMockStatic
    }
    object IAngularStatic {
      
      inline def apply(mock: IMockStatic): IAngularStatic = {
        val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAngularStatic]
      }
      
      extension [Self <: IAngularStatic](x: Self) {
        
        inline def setMock(value: IMockStatic): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // ComponentControllerService
    // see https://docs.angularjs.org/api/ngMock/service/$componentController
    ///////////////////////////////////////////////////////////////////////////
    type IComponentControllerService = js.Function4[
        /* componentName */ String, 
        /* locals */ Dictkey, 
        /* bindings */ js.UndefOr[Any], 
        /* ident */ js.UndefOr[String], 
        Any
      ]
    
    ///////////////////////////////////////////////////////////////////////////
    // ControllerService mock
    // see https://docs.angularjs.org/api/ngMock/service/$controller
    // This interface extends http://docs.angularjs.org/api/ng.$controller
    ///////////////////////////////////////////////////////////////////////////
    type IControllerService = js.Function3[
        /* controllerConstructor */ (Instantiable1[/* args (repeated) */ Any, Any]) | (js.Function1[/* repeated */ Any, Any]) | String, 
        /* locals */ js.UndefOr[Any], 
        /* bindings */ js.UndefOr[Any], 
        Any
      ]
    
    ///////////////////////////////////////////////////////////////////////////
    // ExceptionHandlerService
    // see https://docs.angularjs.org/api/ngMock/service/$exceptionHandler
    // see https://docs.angularjs.org/api/ngMock/provider/$exceptionHandlerProvider
    ///////////////////////////////////////////////////////////////////////////
    trait IExceptionHandlerProvider
      extends StObject
         with IServiceProvider {
      
      def mode(mode: String): Unit
    }
    object IExceptionHandlerProvider {
      
      inline def apply($get: Any, mode: String => Unit): IExceptionHandlerProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], mode = js.Any.fromFunction1(mode))
        __obj.asInstanceOf[IExceptionHandlerProvider]
      }
      
      extension [Self <: IExceptionHandlerProvider](x: Self) {
        
        inline def setMode(value: String => Unit): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // FlushPendingTasksService
    // see https://docs.angularjs.org/api/ngMock/service/$flushPendingTasks
    ///////////////////////////////////////////////////////////////////////////
    type IFlushPendingTasksService = js.Function1[/* delay */ js.UndefOr[Double], Unit]
    
    ///////////////////////////////////////////////////////////////////////////
    // HttpBackendService
    // see https://docs.angularjs.org/api/ngMock/service/$httpBackend
    ///////////////////////////////////////////////////////////////////////////
    @js.native
    trait IHttpBackendService extends StObject {
      
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
        method: String,
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def expectDELETE(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def expectDELETE(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def expectDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def expectDELETE(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def expectGET(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def expectGET(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def expectGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def expectGET(url: js.RegExp): IRequestHandler = js.native
      def expectGET(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def expectGET(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def expectGET(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectGET(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def expectGET(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def expectHEAD(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def expectHEAD(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def expectHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def expectHEAD(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def expectJSONP(url: js.RegExp): IRequestHandler = js.native
      def expectJSONP(url: js.RegExp, keys: js.Array[String]): IRequestHandler = js.native
      
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
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def expectPOST(
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def expectPUT(
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def flush(count: Unit, skip: Double): Unit = js.native
      
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
      def when(
        method: String,
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def whenDELETE(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def whenDELETE(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def whenDELETE(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def whenDELETE(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def whenGET(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def whenGET(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def whenGET(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def whenGET(url: js.RegExp): IRequestHandler = js.native
      def whenGET(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def whenGET(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def whenGET(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenGET(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def whenGET(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def whenHEAD(url: String, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
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
      def whenHEAD(url: js.Function1[/* url */ String, Boolean], headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders): IRequestHandler = js.native
      def whenHEAD(url: js.Function1[/* url */ String, Boolean], headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean]): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp, headers: js.Function1[/* headers */ IHttpHeaders, Boolean], keys: js.Array[String]): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp, headers: Unit, keys: js.Array[String]): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp, headers: IHttpHeaders): IRequestHandler = js.native
      def whenHEAD(url: js.RegExp, headers: IHttpHeaders, keys: js.Array[String]): IRequestHandler = js.native
      
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
      def whenJSONP(url: js.RegExp): IRequestHandler = js.native
      def whenJSONP(url: js.RegExp, keys: js.Array[String]): IRequestHandler = js.native
      
      /**
        * Creates a new backend definition for PATCH requests.
        * Returns an object with respond method that controls how a matched request is handled.
        * @param url HTTP url string, regular expression or function that receives a url and returns true if the url matches the current expctation.
        * @param data HTTP request body string, json object, regular expression or function that receives the data and returns true if the data matches the current expectation.
        * @param headers HTTP headers object or function that receives the headers and returns true if the headers match the current expectation.
        * @param keys Array of keys to assign to regex matches in the request url.
        */
      def whenPATCH(
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def whenPOST(
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
      def whenPUT(
        url: String | js.RegExp | (js.Function1[/* url */ String, Boolean]),
        data: js.UndefOr[String | js.RegExp | js.Object | (js.Function1[/* data */ String, Boolean])],
        headers: js.UndefOr[IHttpHeaders | (js.Function1[/* headers */ IHttpHeaders, Boolean])],
        keys: js.UndefOr[js.Array[String]]
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
    
    // see https://docs.angularjs.org/api/ngMock/function/angular.mock.inject
    // Depending on context, it might return a function, however having `void | (() => void)`
    // as a return type seems to be not useful. E.g. it requires type assertions in `beforeEach(inject(...))`.
    @js.native
    trait IInjectStatic extends StObject {
      
      def apply(fns: (Injectable[js.Function1[/* repeated */ Any, Unit]])*): Any = js.native
      
      // void | (() => void);
      def strictDi(): Any = js.native
      def strictDi(`val`: Boolean): Any = js.native
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // IntervalService
    // see https://docs.angularjs.org/api/ngMock/service/$interval
    // Augments the original service
    ///////////////////////////////////////////////////////////////////////////
    trait IIntervalService extends StObject {
      
      /**
        * Runs interval tasks scheduled to be run in the next `millis` milliseconds.
        *
        * @param millis - The maximum timeout amount to flush up until.
        * @return The amount of time moved forward.
        */
      def flush(millis: Double): Double
    }
    object IIntervalService {
      
      inline def apply(flush: Double => Double): IIntervalService = {
        val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush))
        __obj.asInstanceOf[IIntervalService]
      }
      
      extension [Self <: IIntervalService](x: Self) {
        
        inline def setFlush(value: Double => Double): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      }
    }
    
    trait ILogCall extends StObject {
      
      var logs: js.Array[String]
    }
    object ILogCall {
      
      inline def apply(logs: js.Array[String]): ILogCall = {
        val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILogCall]
      }
      
      extension [Self <: ILogCall](x: Self) {
        
        inline def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
        
        inline def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value*))
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // LogService
    // see https://docs.angularjs.org/api/ngMock/service/$log
    // Augments the original service
    ///////////////////////////////////////////////////////////////////////////
    trait ILogService extends StObject {
      
      def assertEmpty(): Unit
      
      def reset(): Unit
    }
    object ILogService {
      
      inline def apply(assertEmpty: () => Unit, reset: () => Unit): ILogService = {
        val __obj = js.Dynamic.literal(assertEmpty = js.Any.fromFunction0(assertEmpty), reset = js.Any.fromFunction0(reset))
        __obj.asInstanceOf[ILogService]
      }
      
      extension [Self <: ILogService](x: Self) {
        
        inline def setAssertEmpty(value: () => Unit): Self = StObject.set(x, "assertEmpty", js.Any.fromFunction0(value))
        
        inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait IMockStatic extends StObject {
      
      def TzDate(offset: Double, timestamp: String): js.Date = js.native
      // see https://docs.angularjs.org/api/ngMock/type/angular.mock.TzDate
      def TzDate(offset: Double, timestamp: Double): js.Date = js.native
      
      // see https://docs.angularjs.org/api/ngMock/function/angular.mock.dump
      def dump(obj: Any): String = js.native
      
      def inject(fns: (Injectable[js.Function1[/* repeated */ Any, Unit]])*): Any = js.native
      @JSName("inject")
      var inject_Original: IInjectStatic = js.native
      
      // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
      def module(modules: Any*): Any = js.native
      // see https://docs.angularjs.org/api/ngMock/function/angular.mock.module
      @JSName("module")
      var module_Original: Call = js.native
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // TimeoutService
    // see https://docs.angularjs.org/api/ngMock/service/$timeout
    // Augments the original service
    ///////////////////////////////////////////////////////////////////////////
    @js.native
    trait ITimeoutService extends StObject {
      
      /**
        * **Deprecated** since version 1.7.3. (Use `$flushPendingTasks` instead.)
        *
        * ---
        * Flushes the queue of pending tasks.
        *
        * _This method is essentially an alias of `$flushPendingTasks`._
        *
        * > For historical reasons, this method will also flush non-`$timeout` pending tasks, such as
        * > `$q` promises and tasks scheduled via `$applyAsync` and `$evalAsync`.
        *
        * @param delay - The maximum timeout amount to flush up until.
        */
      def flush(): Unit = js.native
      def flush(delay: Double): Unit = js.native
      
      /**
        * **Deprecated** since version 1.7.3. (Use `$verifyNoPendingTasks` instead.)
        *
        * ---
        * Verifies that there are no pending tasks that need to be flushed. It throws an error if there
        * are still pending tasks.
        *
        * _This method is essentially an alias of `$verifyNoPendingTasks` (called with no arguments)._
        *
        * > For historical reasons, this method will also verify non-`$timeout` pending tasks, such as
        * > pending `$http` requests, in-progress `$route` transitions, unresolved `$q` promises and
        * > tasks scheduled via `$applyAsync` and `$evalAsync`.
        * >
        * > It is recommended to use `$verifyNoPendingTasks` instead, which additionally supports
        * > verifying a specific type of tasks. For example, you can verify there are no pending
        * > timeouts with `$verifyNoPendingTasks('$timeout')`.
        */
      def verifyNoPendingTasks(): Unit = js.native
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // VerifyNoPendingTasksService
    // see https://docs.angularjs.org/api/ngMock/service/$verifyNoPendingTasks
    ///////////////////////////////////////////////////////////////////////////
    type IVerifyNoPendingTasksService = js.Function1[/* taskType */ js.UndefOr[String], Unit]
    
    ///////////////////////////////////////////////////////////////////////////
    // AnimateService
    // see https://docs.angularjs.org/api/ngMock/service/$animate
    ///////////////////////////////////////////////////////////////////////////
    object animate {
      
      trait IAnimateService extends StObject {
        
        /**
          * This method will close all pending animations (both Javascript and CSS) and it will also flush any remaining
          * animation frames and/or callbacks.
          */
        def closeAndFlush(): Unit
        
        /**
          * This method is used to flush the pending callbacks and animation frames to either start
          * an animation or conclude an animation. Note that this will not actually close an
          * actively running animation (see `closeAndFlush()`} for that).
          */
        def flush(): Unit
      }
      object IAnimateService {
        
        inline def apply(closeAndFlush: () => Unit, flush: () => Unit): IAnimateService = {
          val __obj = js.Dynamic.literal(closeAndFlush = js.Any.fromFunction0(closeAndFlush), flush = js.Any.fromFunction0(flush))
          __obj.asInstanceOf[IAnimateService]
        }
        
        extension [Self <: IAnimateService](x: Self) {
          
          inline def setCloseAndFlush(value: () => Unit): Self = StObject.set(x, "closeAndFlush", js.Any.fromFunction0(value))
          
          inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
        }
      }
    }
    
    object mock {
      
      /**
        * Contains additional event data used by the `browserTrigger` function when creating an event.
        */
      trait IBrowserTriggerEventData extends StObject {
        
        /**
          * [Event.bubbles](https://developer.mozilla.org/docs/Web/API/Event/bubbles).
          * Not applicable to all events.
          */
        var bubbles: js.UndefOr[Boolean] = js.undefined
        
        /**
          * [Event.cancelable](https://developer.mozilla.org/docs/Web/API/Event/cancelable).
          * Not applicable to all events.
          */
        var cancelable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * [charCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charcode)
          * for keyboard events (keydown, keypress, and keyup).
          */
        var charcode: js.UndefOr[Double] = js.undefined
        
        /**
          * [data](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data) for
          * [CompositionEvents](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent).
          */
        var data: js.UndefOr[String] = js.undefined
        
        /**
          * The elapsedTime for
          * [TransitionEvent](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
          * and [AnimationEvent](https://developer.mozilla.org/docs/Web/API/AnimationEvent).
          */
        var elapsedTime: js.UndefOr[Double] = js.undefined
        
        /**
          * [keyCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keycode)
          * for keyboard events (keydown, keypress, and keyup).
          */
        var keycode: js.UndefOr[Double] = js.undefined
        
        /**
          * An array of possible modifier keys (ctrl, alt, shift, meta) for
          * [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent) and
          * keyboard events (keydown, keypress, and keyup).
          */
        var keys: js.UndefOr[js.Array[ctrl | alt | shift | meta]] = js.undefined
        
        /**
          * The [relatedTarget](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
          * for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent).
          */
        var relatedTarget: js.UndefOr[Node] = js.undefined
        
        /**
          * [which](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/which)
          * for keyboard events (keydown, keypress, and keyup).
          */
        var which: js.UndefOr[Double] = js.undefined
        
        /**
          * x-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
          * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
          */
        var x: js.UndefOr[Double] = js.undefined
        
        /**
          * y-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
          * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
          */
        var y: js.UndefOr[Double] = js.undefined
      }
      object IBrowserTriggerEventData {
        
        inline def apply(): IBrowserTriggerEventData = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IBrowserTriggerEventData]
        }
        
        extension [Self <: IBrowserTriggerEventData](x: Self) {
          
          inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
          
          inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
          
          inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
          
          inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
          
          inline def setCharcode(value: Double): Self = StObject.set(x, "charcode", value.asInstanceOf[js.Any])
          
          inline def setCharcodeUndefined: Self = StObject.set(x, "charcode", js.undefined)
          
          inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
          
          inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
          
          inline def setKeycode(value: Double): Self = StObject.set(x, "keycode", value.asInstanceOf[js.Any])
          
          inline def setKeycodeUndefined: Self = StObject.set(x, "keycode", js.undefined)
          
          inline def setKeys(value: js.Array[ctrl | alt | shift | meta]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
          
          inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
          
          inline def setKeysVarargs(value: (ctrl | alt | shift | meta)*): Self = StObject.set(x, "keys", js.Array(value*))
          
          inline def setRelatedTarget(value: Node): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
          
          inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
          
          inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
          
          inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
          
          inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
          
          inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
          
          inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
          
          inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
        }
      }
      
      type IHttpHeaders = StringDictionary[Any]
      
      /** Object returned by the the mocked HttpBackendService expect/when methods */
      @js.native
      trait IRequestHandler extends StObject {
        
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
        def respond(data: String, headers: Unit, responseText: String): IRequestHandler = js.native
        def respond(data: String, headers: IHttpHeaders): IRequestHandler = js.native
        def respond(data: String, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
        def respond(data: js.Object): IRequestHandler = js.native
        def respond(data: js.Object, headers: Unit, responseText: String): IRequestHandler = js.native
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
        def respond(status: Double, data: String): IRequestHandler = js.native
        def respond(status: Double, data: String, headers: Unit, responseText: String): IRequestHandler = js.native
        def respond(status: Double, data: String, headers: IHttpHeaders): IRequestHandler = js.native
        def respond(status: Double, data: String, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
        def respond(status: Double, data: js.Object): IRequestHandler = js.native
        def respond(status: Double, data: js.Object, headers: Unit, responseText: String): IRequestHandler = js.native
        def respond(status: Double, data: js.Object, headers: IHttpHeaders): IRequestHandler = js.native
        def respond(status: Double, data: js.Object, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
        def respond(status: Double, data: Unit, headers: Unit, responseText: String): IRequestHandler = js.native
        def respond(status: Double, data: Unit, headers: IHttpHeaders): IRequestHandler = js.native
        def respond(status: Double, data: Unit, headers: IHttpHeaders, responseText: String): IRequestHandler = js.native
      }
    }
  }
}
