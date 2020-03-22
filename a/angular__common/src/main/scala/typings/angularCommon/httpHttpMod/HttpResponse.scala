package typings.angularCommon.httpHttpMod

import typings.angularCommon.AnonBody
import typings.angularCommon.AnonHeaders
import typings.angularCommon.AnonStatus
import typings.angularCommon.httpHttpMod.HttpEventType.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
class HttpResponse[T] ()
  extends HttpResponseBase
     with HttpEvent[T] {
  def this(init: AnonBody[T]) = this()
  /**
    * The response body, or `null` if one was not returned.
    */
  val body: T | Null = js.native
  @JSName("type")
  val type_HttpResponse: Response = js.native
  def clone(update: AnonHeaders): HttpResponse[T] = js.native
  def clone[V](update: AnonStatus[V]): HttpResponse[V] = js.native
}

