package typings.angularCommon.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/common/http", "HttpXsrfTokenExtractor")
@js.native
open class HttpXsrfTokenExtractor () extends StObject {
  
  /**
    * Get the XSRF token to use with an outgoing request.
    *
    * Will be called for every request, so the token may change between requests.
    */
  def getToken(): String | Null = js.native
}
