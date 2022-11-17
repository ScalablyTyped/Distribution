package typings.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.HeadersStatus
import typings.angularCommon.anon.IgnoreCancelled
import typings.angularCommon.anon.TypeofHttpClientModule
import typings.angularCommon.httpMod.HttpEvent
import typings.angularCommon.httpMod.HttpHeaders
import typings.angularCommon.httpMod.HttpRequest
import typings.angularCore.mod.Provider
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.std.Blob
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpTestingMod {
  
  @JSImport("@angular/common/http/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http/testing", "HttpClientTestingModule")
  @js.native
  open class HttpClientTestingModule () extends StObject
  /* static members */
  object HttpClientTestingModule {
    
    @JSImport("@angular/common/http/testing", "HttpClientTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/common/http/testing", "HttpClientTestingModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[HttpClientTestingModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[HttpClientTestingModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/http/testing", "HttpClientTestingModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[HttpClientTestingModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[HttpClientTestingModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/http/testing", "HttpClientTestingModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        HttpClientTestingModule, 
        scala.Nothing, 
        js.Array[TypeofHttpClientModule], 
        scala.Nothing
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          HttpClientTestingModule, 
          scala.Nothing, 
          js.Array[TypeofHttpClientModule], 
          scala.Nothing
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@angular/common/http/testing", "HttpTestingController")
  @js.native
  open class HttpTestingController () extends StObject {
    
    /**
      * Expect that no requests have been made which match the given predicate function.
      *
      * If a matching request has been made, fail with an error message including the given request
      * description, if any.
      */
    def expectNone(matchFn: js.Function1[/* req */ HttpRequest[Any], Boolean]): Unit = js.native
    def expectNone(matchFn: js.Function1[/* req */ HttpRequest[Any], Boolean], description: String): Unit = js.native
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
    def expectOne(matchFn: js.Function1[/* req */ HttpRequest[Any], Boolean]): TestRequest = js.native
    def expectOne(matchFn: js.Function1[/* req */ HttpRequest[Any], Boolean], description: String): TestRequest = js.native
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
    def `match`(`match`: js.Function1[/* req */ HttpRequest[Any], Boolean]): js.Array[TestRequest] = js.native
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
  
  @JSImport("@angular/common/http/testing", "TestRequest")
  @js.native
  open class TestRequest protected () extends StObject {
    def this(request: HttpRequest[Any], observer: Observer[HttpEvent[Any]]) = this()
    
    /**
      * Whether the request was cancelled after it was sent.
      */
    def cancelled: Boolean = js.native
    
    /**
      * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
      * @deprecated Http requests never emit an `ErrorEvent`. Please specify a `ProgressEvent`.
      */
    def error(error: ErrorEvent): Unit = js.native
    def error(error: ErrorEvent, opts: TestRequestErrorOptions): Unit = js.native
    /**
      * Resolve the request by returning an `ProgressEvent` (e.g. simulating a network failure).
      */
    def error(error: ProgressEvent[EventTarget]): Unit = js.native
    def error(error: ProgressEvent[EventTarget], opts: TestRequestErrorOptions): Unit = js.native
    
    /**
      * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
      * request.
      */
    def event(event: HttpEvent[Any]): Unit = js.native
    
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
    def flush(body: String, opts: HeadersStatus): Unit = js.native
    def flush(body: js.Array[Boolean | String | Double | js.Object | Null]): Unit = js.native
    def flush(body: js.Array[Boolean | String | Double | js.Object | Null], opts: HeadersStatus): Unit = js.native
    def flush(body: js.Object): Unit = js.native
    def flush(body: js.Object, opts: HeadersStatus): Unit = js.native
    def flush(body: js.typedarray.ArrayBuffer): Unit = js.native
    def flush(body: js.typedarray.ArrayBuffer, opts: HeadersStatus): Unit = js.native
    def flush(body: Boolean): Unit = js.native
    def flush(body: Boolean, opts: HeadersStatus): Unit = js.native
    def flush(body: Double): Unit = js.native
    def flush(body: Double, opts: HeadersStatus): Unit = js.native
    def flush(body: Null, opts: HeadersStatus): Unit = js.native
    def flush(body: Blob): Unit = js.native
    def flush(body: Blob, opts: HeadersStatus): Unit = js.native
    
    /* private */ var observer: Any = js.native
    
    var request: HttpRequest[Any] = js.native
  }
  
  inline def provideHttpClientTesting(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideHttpClientTesting")().asInstanceOf[js.Array[Provider]]
  
  trait RequestMatch extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestMatch {
    
    inline def apply(): RequestMatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestMatch]
    }
    
    extension [Self <: RequestMatch](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * Type that describes options that can be used to create an error
    * in `TestRequest`.
    */
  trait TestRequestErrorOptions extends StObject {
    
    var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object TestRequestErrorOptions {
    
    inline def apply(): TestRequestErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestRequestErrorOptions]
    }
    
    extension [Self <: TestRequestErrorOptions](x: Self) {
      
      inline def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
