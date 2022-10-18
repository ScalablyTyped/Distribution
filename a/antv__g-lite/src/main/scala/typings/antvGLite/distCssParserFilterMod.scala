package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSStyleValue
import typings.antvGLite.distCssCssomMod.CSSUnitValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserFilterMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFilter(): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")().asInstanceOf[js.Array[ParsedFilterStyleProperty]]
  inline def parseFilter(filterStr: String): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFilterStyleProperty]]
  
  inline def parseParam(css: String): CSSStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParam")(css.asInstanceOf[js.Any]).asInstanceOf[CSSStyleValue]
  
  trait ParsedFilterStyleProperty extends StObject {
    
    var name: String
    
    var params: js.Array[CSSUnitValue]
  }
  object ParsedFilterStyleProperty {
    
    inline def apply(name: String, params: js.Array[CSSUnitValue]): ParsedFilterStyleProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFilterStyleProperty]
    }
    
    extension [Self <: ParsedFilterStyleProperty](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[CSSUnitValue]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: CSSUnitValue*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
}
