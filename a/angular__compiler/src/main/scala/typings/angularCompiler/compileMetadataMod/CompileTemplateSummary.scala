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
  
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], styles: js.Array[String]): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], animations = null, encapsulation = null)
    __obj.asInstanceOf[CompileTemplateSummary]
  }
  
  @scala.inline
  implicit class CompileTemplateSummaryMutableBuilder[Self <: CompileTemplateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[js.Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsNull: Self = StObject.set(x, "animations", null)
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulationNull: Self = StObject.set(x, "encapsulation", null)
    
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
