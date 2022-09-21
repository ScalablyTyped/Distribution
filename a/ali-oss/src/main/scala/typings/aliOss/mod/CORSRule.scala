package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CORSRule extends StObject {
  
  /** configure for Access-Control-Allow-Headers header */
  var allowedHeader: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** configure for Access-Control-Allow-Methods header */
  var allowedMethod: String | js.Array[String]
  
  /** configure for Access-Control-Allow-Origin header */
  var allowedOrigin: String | js.Array[String]
  
  /** configure for Access-Control-Expose-Headers header */
  var exposeHeader: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** configure for Access-Control-Max-Age header */
  var maxAgeSeconds: js.UndefOr[String | js.Array[String]] = js.undefined
}
object CORSRule {
  
  inline def apply(allowedMethod: String | js.Array[String], allowedOrigin: String | js.Array[String]): CORSRule = {
    val __obj = js.Dynamic.literal(allowedMethod = allowedMethod.asInstanceOf[js.Any], allowedOrigin = allowedOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  
  extension [Self <: CORSRule](x: Self) {
    
    inline def setAllowedHeader(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeader", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeaderUndefined: Self = StObject.set(x, "allowedHeader", js.undefined)
    
    inline def setAllowedHeaderVarargs(value: String*): Self = StObject.set(x, "allowedHeader", js.Array(value*))
    
    inline def setAllowedMethod(value: String | js.Array[String]): Self = StObject.set(x, "allowedMethod", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodVarargs(value: String*): Self = StObject.set(x, "allowedMethod", js.Array(value*))
    
    inline def setAllowedOrigin(value: String | js.Array[String]): Self = StObject.set(x, "allowedOrigin", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginVarargs(value: String*): Self = StObject.set(x, "allowedOrigin", js.Array(value*))
    
    inline def setExposeHeader(value: String | js.Array[String]): Self = StObject.set(x, "exposeHeader", value.asInstanceOf[js.Any])
    
    inline def setExposeHeaderUndefined: Self = StObject.set(x, "exposeHeader", js.undefined)
    
    inline def setExposeHeaderVarargs(value: String*): Self = StObject.set(x, "exposeHeader", js.Array(value*))
    
    inline def setMaxAgeSeconds(value: String | js.Array[String]): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    inline def setMaxAgeSecondsVarargs(value: String*): Self = StObject.set(x, "maxAgeSeconds", js.Array(value*))
  }
}
