package typings.angularCommon

import typings.angularCommon.anon.IgnoreCancelled
import typings.angularCommon.anon.StatusText
import typings.angularCommon.httpHttpMod.HttpEvent
import typings.angularCommon.httpMod.HttpBackend
import typings.angularCommon.httpMod.HttpRequest
import typings.rxjs.mod.Observable_
import typings.rxjs.typesMod.Observer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/common/http/testing/testing", "HttpClientTestingModule")
  @js.native
  class HttpClientTestingModule () extends StObject
  
  @JSImport("@angular/common/http/testing/testing", "HttpTestingController")
  @js.native
  abstract class HttpTestingController () extends StObject {
    
    /**
      * Expect that no requests have been made which match the given predicate function.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean]): Unit = js.native
    def expectNone(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): Unit = js.native
    /**
      * Expect that no requests have been made which match the given parameters.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(params: RequestMatch): Unit = js.native
    def expectNone(params: RequestMatch, description: String): Unit = js.native
    /**
      * Expect that no requests have been made which match the given URL.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    /**
      * Expect that no requests have been made which match the given condition.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(url: String): Unit = js.native
    def expectNone(url: String, description: String): Unit = js.native
    
    /**
      * Expect that a single request has been made which matches the given predicate function, and
      * return its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean]): TestRequest = js.native
    def expectOne(matchFn: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): TestRequest = js.native
    /**
      * Expect that a single request has been made which matches the given parameters, and return
      * its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(params: RequestMatch): TestRequest = js.native
    def expectOne(params: RequestMatch, description: String): TestRequest = js.native
    /**
      * Expect that a single request has been made which matches the given URL, and return its
      * mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    /**
      * Expect that a single request has been made which matches the given condition, and return
      * its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(url: String): TestRequest = js.native
    def expectOne(url: String, description: String): TestRequest = js.native
    
    /**
      * Search for requests that match the given parameter, without any expectations.
      */
    def `match`(`match`: String): js.Array[TestRequest] = js.native
    def `match`(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): js.Array[TestRequest] = js.native
    def `match`(`match`: RequestMatch): js.Array[TestRequest] = js.native
    
    /**
      * Verify that no unmatched requests are outstanding.
      *
      * If any requests are outstanding, fail with an error message indicating which requests were not
      * handled.
      *
      * If `ignoreCancelled` is not set (the default), `verify()` will also fail if cancelled requests
      * were not explicitly matched.
      */
    def verify(): Unit = js.native
    def verify(opts: IgnoreCancelled): Unit = js.native
  }
  
  @JSImport("@angular/common/http/testing/testing", "TestRequest")
  @js.native
  class TestRequest protected () extends StObject {
    def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
    
    /**
      * Whether the request was cancelled after it was sent.
      */
    def cancelled: Boolean = js.native
    
    /**
      * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
      */
    def error(error: ErrorEvent): Unit = js.native
    def error(error: ErrorEvent, opts: StatusText): Unit = js.native
    
    /**
      * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
      * request.
      */
    def event(event: HttpEvent[_]): Unit = js.native
    
    /**
      * Resolve the request by returning a body plus additional HTTP information (such as response
      * headers) if provided.
      * If the request specifies an expected body type, the body is converted into the requested type.
      * Otherwise, the body is converted to `JSON` by default.
      *
      * Both successful and unsuccessful responses can be delivered via `flush()`.
      */
    def flush(): Unit = js.native
    def flush(body: String): Unit = js.native
    def flush(body: String, opts: StatusText): Unit = js.native
    def flush(body: js.Array[Boolean | String | Double | js.Object | Null]): Unit = js.native
    def flush(body: js.Array[Boolean | String | Double | js.Object | Null], opts: StatusText): Unit = js.native
    def flush(body: js.Object): Unit = js.native
    def flush(body: js.Object, opts: StatusText): Unit = js.native
    def flush(body: Boolean): Unit = js.native
    def flush(body: Boolean, opts: StatusText): Unit = js.native
    def flush(body: Double): Unit = js.native
    def flush(body: Double, opts: StatusText): Unit = js.native
    def flush(body: Null, opts: StatusText): Unit = js.native
    def flush(body: ArrayBuffer): Unit = js.native
    def flush(body: ArrayBuffer, opts: StatusText): Unit = js.native
    def flush(body: Blob): Unit = js.native
    def flush(body: Blob, opts: StatusText): Unit = js.native
    
    var observer: js.Any = js.native
    
    var request: HttpRequest[_] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCommon.testingTestingMod.HttpTestingController because Inheritance from two classes. Inlined `match`, `match`, `match`, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectOne, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, expectNone, verify, verify */ @JSImport("@angular/common/http/testing/testing", "\u0275angular_packages_common_http_testing_testing_a")
  @js.native
  class ɵangularPackagesCommonHttpTestingTestingA () extends HttpBackend {
    
    /**
      * Helper function to search for requests in the list of open requests.
      */
    var _match: js.Any = js.native
    
    var descriptionFromMatcher: js.Any = js.native
    
    /**
      * Expect that no outstanding requests match the given matcher, and throw an error
      * if any do.
      */
    /**
      * Expect that no requests have been made which match the given URL.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    /**
      * Expect that no requests have been made which match the given condition.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(`match`: String): Unit = js.native
    def expectNone(`match`: String, description: String): Unit = js.native
    /**
      * Expect that no requests have been made which match the given predicate function.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): Unit = js.native
    def expectNone(`match`: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): Unit = js.native
    /**
      * Expect that no requests have been made which match the given parameters.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(`match`: RequestMatch): Unit = js.native
    def expectNone(`match`: RequestMatch, description: String): Unit = js.native
    
    /**
      * Expect that a single outstanding request matches the given matcher, and return
      * it.
      *
      * Requests returned through this API will no longer be in the list of open requests,
      * and thus will not match twice.
      */
    /**
      * Expect that a single request has been made which matches the given URL, and return its
      * mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    /**
      * Expect that a single request has been made which matches the given condition, and return
      * its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(`match`: String): TestRequest = js.native
    def expectOne(`match`: String, description: String): TestRequest = js.native
    /**
      * Expect that a single request has been made which matches the given predicate function, and
      * return its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): TestRequest = js.native
    def expectOne(`match`: js.Function1[/* req */ HttpRequest[_], Boolean], description: String): TestRequest = js.native
    /**
      * Expect that a single request has been made which matches the given parameters, and return
      * its mock.
      *
      * If no such request has been made, or more than one such request has been made, fail with an
      * error message including the given request description, if any.
      */
    def expectOne(`match`: RequestMatch): TestRequest = js.native
    def expectOne(`match`: RequestMatch, description: String): TestRequest = js.native
    
    /**
      * Handle an incoming request by queueing it in the list of open requests.
      */
    def handle(req: HttpRequest[_]): Observable_[HttpEvent[_]] = js.native
    
    /**
      * Search for requests in the list of open requests, and return all that match
      * without asserting anything about the number of matches.
      */
    /**
      * Search for requests that match the given parameter, without any expectations.
      */
    def `match`(`match`: String): js.Array[TestRequest] = js.native
    def `match`(`match`: js.Function1[/* req */ HttpRequest[_], Boolean]): js.Array[TestRequest] = js.native
    def `match`(`match`: RequestMatch): js.Array[TestRequest] = js.native
    
    /**
      * List of pending requests which have not yet been expected.
      */
    var open: js.Any = js.native
    
    /**
      * Validate that there are no outstanding requests.
      */
    /**
      * Verify that no unmatched requests are outstanding.
      *
      * If any requests are outstanding, fail with an error message indicating which requests were not
      * handled.
      *
      * If `ignoreCancelled` is not set (the default), `verify()` will also fail if cancelled requests
      * were not explicitly matched.
      */
    def verify(): Unit = js.native
    def verify(opts: IgnoreCancelled): Unit = js.native
  }
  
  @js.native
  trait RequestMatch extends StObject {
    
    var method: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object RequestMatch {
    
    @scala.inline
    def apply(): RequestMatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestMatch]
    }
    
    @scala.inline
    implicit class RequestMatchMutableBuilder[Self <: RequestMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
