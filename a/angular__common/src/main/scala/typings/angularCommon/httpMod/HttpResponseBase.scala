package typings.angularCommon.httpMod

import typings.angularCommon.anon.Status
import typings.angularCommon.httpMod.HttpEventType.Response
import typings.angularCommon.httpMod.HttpEventType.ResponseHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpResponseBase")
@js.native
abstract class HttpResponseBase protected () extends StObject {
  /**
    * Super-constructor for all responses.
    *
    * The single parameter accepted is an initialization hash. Any properties
    * of the response passed there will override the default values.
    */
  def this(init: Status) = this()
  def this(init: Status, defaultStatus: Double) = this()
  def this(init: Status, defaultStatus: Double, defaultStatusText: String) = this()
  def this(init: Status, defaultStatus: Unit, defaultStatusText: String) = this()
  
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
    * Textual description of response status code, defaults to OK.
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
