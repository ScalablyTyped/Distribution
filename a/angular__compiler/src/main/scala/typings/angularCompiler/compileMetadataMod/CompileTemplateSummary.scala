package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.coreMod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTemplateSummary extends StObject {
  
  var animations: js.Array[js.Any] | Null
  
  var encapsulation: ViewEncapsulation | Null
  
  var ngContentSelectors: js.Array[String]
  
  var styles: js.Array[String]
}
object CompileTemplateSummary {
  
  inline def apply(ngContentSelectors: js.Array[String], styles: js.Array[String]): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], animations = null, encapsulation = null)
    __obj.asInstanceOf[CompileTemplateSummary]
  }
  
  extension [Self <: CompileTemplateSummary](x: Self) {
    
    inline def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsNull: Self = StObject.set(x, "animations", null)
    
    inline def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationNull: Self = StObject.set(x, "encapsulation", null)
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
