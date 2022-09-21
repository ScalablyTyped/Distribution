package typings.angularHttpi

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IRequestShortcutConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Httpi {
  
  @js.native
  trait HttpiFactory extends StObject {
    
    def apply(config: HttpiPayload): IHttpPromise[js.Object] = js.native
    
    def resource(url: String): HttpiResource = js.native
  }
  
  trait HttpiPayload
    extends StObject
       with IRequestShortcutConfig {
    
    @JSName("data")
    var data_HttpiPayload: js.UndefOr[js.Object] = js.undefined
    
    var keepTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    @JSName("params")
    var params_HttpiPayload: js.UndefOr[js.Object] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object HttpiPayload {
    
    inline def apply(): HttpiPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpiPayload]
    }
    
    extension [Self <: HttpiPayload](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKeepTrailingSlash(value: Boolean): Self = StObject.set(x, "keepTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setKeepTrailingSlashUndefined: Self = StObject.set(x, "keepTrailingSlash", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait HttpiResource extends StObject {
    
    def delete[T](config: HttpiPayload): IHttpPromise[T]
    
    def get[T](config: HttpiPayload): IHttpPromise[T]
    
    def head[T](config: HttpiPayload): IHttpPromise[T]
    
    def jsonp[T](config: HttpiPayload): IHttpPromise[T]
    
    def post[T](config: HttpiPayload): IHttpPromise[T]
    
    def put[T](config: HttpiPayload): IHttpPromise[T]
    
    def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource
  }
  object HttpiResource {
    
    inline def apply(
      delete: HttpiPayload => IHttpPromise[Any],
      get: HttpiPayload => IHttpPromise[Any],
      head: HttpiPayload => IHttpPromise[Any],
      jsonp: HttpiPayload => IHttpPromise[Any],
      post: HttpiPayload => IHttpPromise[Any],
      put: HttpiPayload => IHttpPromise[Any],
      setKeepTrailingSlash: Boolean => HttpiResource
    ): HttpiResource = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), head = js.Any.fromFunction1(head), jsonp = js.Any.fromFunction1(jsonp), post = js.Any.fromFunction1(post), put = js.Any.fromFunction1(put), setKeepTrailingSlash = js.Any.fromFunction1(setKeepTrailingSlash))
      __obj.asInstanceOf[HttpiResource]
    }
    
    extension [Self <: HttpiResource](x: Self) {
      
      inline def setDelete(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHead(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "head", js.Any.fromFunction1(value))
      
      inline def setJsonp(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "jsonp", js.Any.fromFunction1(value))
      
      inline def setPost(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPut(value: HttpiPayload => IHttpPromise[Any]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setSetKeepTrailingSlash(value: Boolean => HttpiResource): Self = StObject.set(x, "setKeepTrailingSlash", js.Any.fromFunction1(value))
    }
  }
}
