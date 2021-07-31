package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasRespondWith extends StObject {
  
  /**
    * Indicates that a complete response is being generated for a
    * request, rather than fetching a response from cache or the origin.
    *
    * If called multiple times within an event handler, the last
    * Response arguments passed in would be the arguments used to
    * generate a response.
    *
    * The maximum response body string length is 2K characters. If
    * validation of the passed in Response object fails it will throw
    * an exception. For example, a Response body bigger than the limit
    * will cause an exception.
    *
    * The deny_reason is an optional argument, and only used if the
    * status code is 403.
    *
    * @param status The HTTP status code
    * @param headers Properties used as key/value pairs for the response
    *  headers
    * @param body The content of the response body
    * @param deny_reason The deny reason set if the status code is a 403
    */
  def respondWith(status: Double, headers: js.Object, body: String): Unit = js.native
  def respondWith(status: Double, headers: js.Object, body: String, deny_reason: String): Unit = js.native
}
