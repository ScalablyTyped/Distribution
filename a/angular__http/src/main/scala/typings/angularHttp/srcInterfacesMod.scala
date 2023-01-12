package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularHttp.srcEnumsMod.ReadyState
import typings.angularHttp.srcEnumsMod.RequestMethod
import typings.angularHttp.srcEnumsMod.ResponseContentType
import typings.angularHttp.srcEnumsMod.ResponseType
import typings.angularHttp.srcHeadersMod.Headers
import typings.angularHttp.srcStaticRequestMod.Request
import typings.angularHttp.srcUrlSearchParamsMod.URLSearchParams
import typings.std.Blob
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInterfacesMod {
  
  /* note: abstract class */ @JSImport("@angular/http/src/interfaces", "Connection")
  @js.native
  open class Connection () extends StObject {
    
    var readyState: ReadyState = js.native
    
    var request: Request = js.native
    
    var response: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular/http/src/interfaces", "ConnectionBackend")
  @js.native
  open class ConnectionBackend () extends StObject {
    
    def createConnection(request: Any): Connection = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular/http/src/interfaces", "XSRFStrategy")
  @js.native
  open class XSRFStrategy () extends StObject {
    
    def configureRequest(req: Request): Unit = js.native
  }
  
  trait RequestArgs
    extends StObject
       with RequestOptionsArgs {
    
    @JSName("url")
    var url_RequestArgs: String | Null
  }
  object RequestArgs {
    
    inline def apply(): RequestArgs = {
      val __obj = js.Dynamic.literal(url = null)
      __obj.asInstanceOf[RequestArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestArgs] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  trait RequestOptionsArgs extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Headers | Null] = js.undefined
    
    var method: js.UndefOr[String | RequestMethod | Null] = js.undefined
    
    var params: js.UndefOr[String | URLSearchParams | (StringDictionary[Any | js.Array[Any]]) | Null] = js.undefined
    
    var responseType: js.UndefOr[ResponseContentType | Null] = js.undefined
    
    /** @deprecated from 4.0.0. Use params instead. */
    var search: js.UndefOr[String | URLSearchParams | (StringDictionary[Any | js.Array[Any]]) | Null] = js.undefined
    
    var url: js.UndefOr[String | Null] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean | Null] = js.undefined
  }
  object RequestOptionsArgs {
    
    inline def apply(): RequestOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptionsArgs] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String | RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodNull: Self = StObject.set(x, "method", null)
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: String | URLSearchParams | (StringDictionary[Any | js.Array[Any]])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setResponseType(value: ResponseContentType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setSearch(value: String | URLSearchParams | (StringDictionary[Any | js.Array[Any]])): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsNull: Self = StObject.set(x, "withCredentials", null)
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait ResponseOptionsArgs extends StObject {
    
    var body: js.UndefOr[String | js.Object | FormData | js.typedarray.ArrayBuffer | Blob | Null] = js.undefined
    
    var headers: js.UndefOr[Headers | Null] = js.undefined
    
    var status: js.UndefOr[Double | Null] = js.undefined
    
    var statusText: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[ResponseType | Null] = js.undefined
    
    var url: js.UndefOr[String | Null] = js.undefined
  }
  object ResponseOptionsArgs {
    
    inline def apply(): ResponseOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseOptionsArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseOptionsArgs] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String | js.Object | FormData | js.typedarray.ArrayBuffer | Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextNull: Self = StObject.set(x, "statusText", null)
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
