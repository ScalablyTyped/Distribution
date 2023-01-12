package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseURL extends StObject {
  
  /**
    * **This URL should not be used.** The CDK Provider Framework will call this URL
    * automatically based on the response produced by the Lambda handler.
    */
  var ResponseURL: String
}
object ResponseURL {
  
  inline def apply(ResponseURL: String): ResponseURL = {
    val __obj = js.Dynamic.literal(ResponseURL = ResponseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseURL] (val x: Self) extends AnyVal {
    
    inline def setResponseURL(value: String): Self = StObject.set(x, "ResponseURL", value.asInstanceOf[js.Any])
  }
}
