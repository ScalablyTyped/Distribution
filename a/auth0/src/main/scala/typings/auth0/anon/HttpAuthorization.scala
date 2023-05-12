package typings.auth0.anon

import typings.auth0.auth0Strings.JSONARRAY
import typings.auth0.auth0Strings.JSONLINES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpAuthorization extends StObject {
  
  var httpAuthorization: String
  
  var httpContentFormat: JSONLINES | JSONARRAY
  
  var httpContentType: String
  
  var httpEndpoint: String
}
object HttpAuthorization {
  
  inline def apply(
    httpAuthorization: String,
    httpContentFormat: JSONLINES | JSONARRAY,
    httpContentType: String,
    httpEndpoint: String
  ): HttpAuthorization = {
    val __obj = js.Dynamic.literal(httpAuthorization = httpAuthorization.asInstanceOf[js.Any], httpContentFormat = httpContentFormat.asInstanceOf[js.Any], httpContentType = httpContentType.asInstanceOf[js.Any], httpEndpoint = httpEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpAuthorization] (val x: Self) extends AnyVal {
    
    inline def setHttpAuthorization(value: String): Self = StObject.set(x, "httpAuthorization", value.asInstanceOf[js.Any])
    
    inline def setHttpContentFormat(value: JSONLINES | JSONARRAY): Self = StObject.set(x, "httpContentFormat", value.asInstanceOf[js.Any])
    
    inline def setHttpContentType(value: String): Self = StObject.set(x, "httpContentType", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpoint(value: String): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
  }
}
