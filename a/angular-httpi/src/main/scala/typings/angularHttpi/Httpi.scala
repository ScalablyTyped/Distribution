package typings.angularHttpi

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IRequestShortcutConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Httpi {
  
  @js.native
  trait HttpiFactory extends StObject {
    
    def apply(config: HttpiPayload): IHttpPromise[js.Object] = js.native
    
    def resource(url: String): HttpiResource = js.native
  }
  
  @js.native
  trait HttpiPayload extends IRequestShortcutConfig {
    
    @JSName("data")
    var data_HttpiPayload: js.UndefOr[js.Object] = js.native
    
    var keepTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    @JSName("params")
    var params_HttpiPayload: js.UndefOr[js.Object] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object HttpiPayload {
    
    @scala.inline
    def apply(): HttpiPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpiPayload]
    }
    
    @scala.inline
    implicit class HttpiPayloadMutableBuilder[Self <: HttpiPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKeepTrailingSlash(value: Boolean): Self = StObject.set(x, "keepTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepTrailingSlashUndefined: Self = StObject.set(x, "keepTrailingSlash", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait HttpiResource extends StObject {
    
    def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
    
    def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource = js.native
  }
  object HttpiResource {
    
    @scala.inline
    def apply(
      delete: HttpiPayload => IHttpPromise[js.Any],
      get: HttpiPayload => IHttpPromise[js.Any],
      head: HttpiPayload => IHttpPromise[js.Any],
      jsonp: HttpiPayload => IHttpPromise[js.Any],
      post: HttpiPayload => IHttpPromise[js.Any],
      put: HttpiPayload => IHttpPromise[js.Any],
      setKeepTrailingSlash: Boolean => HttpiResource
    ): HttpiResource = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), head = js.Any.fromFunction1(head), jsonp = js.Any.fromFunction1(jsonp), post = js.Any.fromFunction1(post), put = js.Any.fromFunction1(put), setKeepTrailingSlash = js.Any.fromFunction1(setKeepTrailingSlash))
      __obj.asInstanceOf[HttpiResource]
    }
    
    @scala.inline
    implicit class HttpiResourceMutableBuilder[Self <: HttpiResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHead(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "head", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJsonp(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "jsonp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPost(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPut(value: HttpiPayload => IHttpPromise[js.Any]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetKeepTrailingSlash(value: Boolean => HttpiResource): Self = StObject.set(x, "setKeepTrailingSlash", js.Any.fromFunction1(value))
    }
  }
}
