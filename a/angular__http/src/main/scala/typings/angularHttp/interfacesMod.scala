package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularHttp.enumsMod.ReadyState
import typings.angularHttp.enumsMod.RequestMethod
import typings.angularHttp.enumsMod.ResponseContentType
import typings.angularHttp.enumsMod.ResponseType
import typings.angularHttp.headersMod.Headers
import typings.angularHttp.staticRequestMod.Request
import typings.angularHttp.urlSearchParamsMod.URLSearchParams
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @JSImport("@angular/http/src/interfaces", "Connection")
  @js.native
  abstract class Connection () extends StObject {
    
    var readyState: ReadyState = js.native
    
    var request: Request = js.native
    
    var response: js.Any = js.native
  }
  
  @JSImport("@angular/http/src/interfaces", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend () extends StObject {
    
    def createConnection(request: js.Any): Connection = js.native
  }
  
  @JSImport("@angular/http/src/interfaces", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy () extends StObject {
    
    def configureRequest(req: Request): Unit = js.native
  }
  
  @js.native
  trait RequestArgs extends RequestOptionsArgs {
    
    @JSName("url")
    var url_RequestArgs: String | Null = js.native
  }
  object RequestArgs {
    
    @scala.inline
    def apply(): RequestArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestArgs]
    }
    
    @scala.inline
    implicit class RequestArgsMutableBuilder[Self <: RequestArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  @js.native
  trait RequestOptionsArgs extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[Headers | Null] = js.native
    
    var method: js.UndefOr[String | RequestMethod | Null] = js.native
    
    var params: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.native
    
    var responseType: js.UndefOr[ResponseContentType | Null] = js.native
    
    /** @deprecated from 4.0.0. Use params instead. */
    var search: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.native
    
    var url: js.UndefOr[String | Null] = js.native
    
    var withCredentials: js.UndefOr[Boolean | Null] = js.native
  }
  object RequestOptionsArgs {
    
    @scala.inline
    def apply(): RequestOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsArgs]
    }
    
    @scala.inline
    implicit class RequestOptionsArgsMutableBuilder[Self <: RequestOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String | RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNull: Self = StObject.set(x, "method", null)
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNull: Self = StObject.set(x, "params", null)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setResponseType(value: ResponseContentType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setSearch(value: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsNull: Self = StObject.set(x, "withCredentials", null)
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait ResponseOptionsArgs extends StObject {
    
    var body: js.UndefOr[String | js.Object | FormData | ArrayBuffer | Blob | Null] = js.native
    
    var headers: js.UndefOr[Headers | Null] = js.native
    
    var status: js.UndefOr[Double | Null] = js.native
    
    var statusText: js.UndefOr[String | Null] = js.native
    
    var `type`: js.UndefOr[ResponseType | Null] = js.native
    
    var url: js.UndefOr[String | Null] = js.native
  }
  object ResponseOptionsArgs {
    
    @scala.inline
    def apply(): ResponseOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseOptionsArgs]
    }
    
    @scala.inline
    implicit class ResponseOptionsArgsMutableBuilder[Self <: ResponseOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object | FormData | ArrayBuffer | Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusNull: Self = StObject.set(x, "status", null)
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextNull: Self = StObject.set(x, "statusText", null)
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
