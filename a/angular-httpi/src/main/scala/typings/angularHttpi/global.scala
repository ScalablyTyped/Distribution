package typings.angularHttpi

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IHttpService
import typings.angularHttpi.Httpi.HttpiPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Httpi {
    
    @JSGlobal("Httpi.HttpiResource")
    @js.native
    class HttpiResource protected ()
      extends StObject
         with typings.angularHttpi.Httpi.HttpiResource {
      def this(http: IHttpService, url: String) = this()
      
      /* CompleteClass */
      override def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
      
      /* CompleteClass */
      override def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): typings.angularHttpi.Httpi.HttpiResource = js.native
    }
  }
}
