package typings.angularCompiler.anon

import typings.angularCompiler.mod.MissingTranslationStrategy
import typings.angularCompiler.mod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultEncapsulation extends StObject {
  
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.undefined
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  
  var useJit: js.UndefOr[Boolean] = js.undefined
}
object DefaultEncapsulation {
  
  inline def apply(): DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultEncapsulation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultEncapsulation] (val x: Self) extends AnyVal {
    
    inline def setDefaultEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "defaultEncapsulation", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncapsulationUndefined: Self = StObject.set(x, "defaultEncapsulation", js.undefined)
    
    inline def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
    
    inline def setMissingTranslationNull: Self = StObject.set(x, "missingTranslation", null)
    
    inline def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setStrictInjectionParameters(value: Boolean): Self = StObject.set(x, "strictInjectionParameters", value.asInstanceOf[js.Any])
    
    inline def setStrictInjectionParametersUndefined: Self = StObject.set(x, "strictInjectionParameters", js.undefined)
    
    inline def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    inline def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
