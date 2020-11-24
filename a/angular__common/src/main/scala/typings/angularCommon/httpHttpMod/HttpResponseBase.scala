package typings.angularCommon.httpHttpMod

import typings.angularCommon.anon.Headers
import typings.angularCommon.httpHttpMod.HttpEventType.Response
import typings.angularCommon.httpHttpMod.HttpEventType.ResponseHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpResponseBase")
@js.native
abstract class HttpResponseBase protected () extends js.Object {
  /**
    * Super-constructor for all responses.
    *
    * The single parameter accepted is an initialization hash. Any properties
    * of the response passed there will override the default values.
    */
  def this(init: Headers) = this()
  def this(init: Headers, defaultStatus: Double) = this()
  def this(init: Headers, defaultStatus: js.UndefOr[scala.Nothing], defaultStatusText: String) = this()
  def this(init: Headers, defaultStatus: Double, defaultStatusText: String) = this()
  
  /**
    * All response headers.
    */
  val headers: HttpHeaders = js.native
  
  /**
    * Whether the status code falls in the 2xx range.
    */
  val ok: Boolean = js.native
  
  /**
    * Response status code.
    */
  val status: Double = js.native
  
  /**
    * Textual description of response status code.
    *
    * Do not depend on this.
    */
  val statusText: String = js.native
  
  /**
    * Type of the response, narrowed to either the full response or the header.
    */
  val `type`: Response | ResponseHeader = js.native
  
  /**
    * URL of the resource retrieved, or null if not available.
    */
  val url: String | Null = js.native
}
