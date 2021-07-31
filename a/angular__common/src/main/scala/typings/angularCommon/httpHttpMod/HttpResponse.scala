package typings.angularCommon.httpHttpMod

import typings.angularCommon.anon.Body
import typings.angularCommon.anon.Headers
import typings.angularCommon.anon.Status
import typings.angularCommon.httpHttpMod.HttpEventType.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
class HttpResponse[T] ()
  extends HttpResponseBase
     with HttpEvent[T] {
  def this(init: Body[T]) = this()
  
  /**
    * The response body, or `null` if one was not returned.
    */
  val body: T | Null = js.native
  
  def clone(update: Headers): HttpResponse[T] = js.native
  def clone[V](update: Status[V]): HttpResponse[V] = js.native
  
  @JSName("type")
  val type_HttpResponse: Response = js.native
}
