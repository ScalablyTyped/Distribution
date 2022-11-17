package typings.angularCommon.httpMod

import typings.angularCommon.anon.Status
import typings.angularCommon.httpMod.HttpEventType.ResponseHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpHeaderResponse")
@js.native
/**
  * Create a new `HttpHeaderResponse` with the given parameters.
  */
open class HttpHeaderResponse () extends HttpResponseBase {
  def this(init: Status) = this()
  
  def clone(update: Status): HttpHeaderResponse = js.native
  
  @JSName("type")
  val type_HttpHeaderResponse: ResponseHeader = js.native
}
