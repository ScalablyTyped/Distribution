package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInline extends StObject {
  
  var isInline: Boolean
  
  var templateUrl: String | Null
}
object IsInline {
  
  inline def apply(isInline: Boolean): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], templateUrl = null)
    __obj.asInstanceOf[IsInline]
  }
  
  extension [Self <: IsInline](x: Self) {
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlNull: Self = StObject.set(x, "templateUrl", null)
  }
}
