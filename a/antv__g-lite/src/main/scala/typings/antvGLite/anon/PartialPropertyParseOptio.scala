package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-lite.@antv/g-lite/dist/css.PropertyParseOptions> */
trait PartialPropertyParseOptio extends StObject {
  
  var forceUpdateGeometry: js.UndefOr[Boolean] = js.undefined
  
  var skipParse: js.UndefOr[Boolean] = js.undefined
  
  var skipUpdateAttribute: js.UndefOr[Boolean] = js.undefined
  
  var usedAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialPropertyParseOptio {
  
  inline def apply(): PartialPropertyParseOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPropertyParseOptio]
  }
  
  extension [Self <: PartialPropertyParseOptio](x: Self) {
    
    inline def setForceUpdateGeometry(value: Boolean): Self = StObject.set(x, "forceUpdateGeometry", value.asInstanceOf[js.Any])
    
    inline def setForceUpdateGeometryUndefined: Self = StObject.set(x, "forceUpdateGeometry", js.undefined)
    
    inline def setSkipParse(value: Boolean): Self = StObject.set(x, "skipParse", value.asInstanceOf[js.Any])
    
    inline def setSkipParseUndefined: Self = StObject.set(x, "skipParse", js.undefined)
    
    inline def setSkipUpdateAttribute(value: Boolean): Self = StObject.set(x, "skipUpdateAttribute", value.asInstanceOf[js.Any])
    
    inline def setSkipUpdateAttributeUndefined: Self = StObject.set(x, "skipUpdateAttribute", js.undefined)
    
    inline def setUsedAttributes(value: js.Array[String]): Self = StObject.set(x, "usedAttributes", value.asInstanceOf[js.Any])
    
    inline def setUsedAttributesUndefined: Self = StObject.set(x, "usedAttributes", js.undefined)
    
    inline def setUsedAttributesVarargs(value: String*): Self = StObject.set(x, "usedAttributes", js.Array(value*))
  }
}
