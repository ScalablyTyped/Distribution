package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSRule extends StObject {
  
  // configure for Access-Control-Allow-Methods header
  var allowedHeader: js.UndefOr[String | js.Array[String]] = js.native
  
  // configure for Access-Control-Allow-Origin header
  var allowedMethod: String | js.Array[String] = js.native
  
  var allowedOrigin: String | js.Array[String] = js.native
  
  // configure for Access-Control-Allow-Headers header
  var exposeHeader: js.UndefOr[String | js.Array[String]] = js.native
  
  // configure for Access-Control-Expose-Headers header
  var maxAgeSeconds: js.UndefOr[String | js.Array[String]] = js.native
}
object CORSRule {
  
  @scala.inline
  def apply(allowedMethod: String | js.Array[String], allowedOrigin: String | js.Array[String]): CORSRule = {
    val __obj = js.Dynamic.literal(allowedMethod = allowedMethod.asInstanceOf[js.Any], allowedOrigin = allowedOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  
  @scala.inline
  implicit class CORSRuleMutableBuilder[Self <: CORSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedHeader(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeaderUndefined: Self = StObject.set(x, "allowedHeader", js.undefined)
    
    @scala.inline
    def setAllowedHeaderVarargs(value: String*): Self = StObject.set(x, "allowedHeader", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethod(value: String | js.Array[String]): Self = StObject.set(x, "allowedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodVarargs(value: String*): Self = StObject.set(x, "allowedMethod", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigin(value: String | js.Array[String]): Self = StObject.set(x, "allowedOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginVarargs(value: String*): Self = StObject.set(x, "allowedOrigin", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeader(value: String | js.Array[String]): Self = StObject.set(x, "exposeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeaderUndefined: Self = StObject.set(x, "exposeHeader", js.undefined)
    
    @scala.inline
    def setExposeHeaderVarargs(value: String*): Self = StObject.set(x, "exposeHeader", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: String | js.Array[String]): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setMaxAgeSecondsVarargs(value: String*): Self = StObject.set(x, "maxAgeSeconds", js.Array(value :_*))
  }
}
