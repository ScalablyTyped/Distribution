package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerOptions extends StObject {
  
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  /**
    * @deprecated not used at all in Ivy, providing this config option has no effect.
    */
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.undefined
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  var providers: js.UndefOr[js.Array[StaticProvider]] = js.undefined
  
  /**
    * @deprecated not used at all in Ivy, providing this config option has no effect.
    */
  var useJit: js.UndefOr[Boolean] = js.undefined
}
object CompilerOptions {
  
  inline def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "defaultEncapsulation", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncapsulationUndefined: Self = StObject.set(x, "defaultEncapsulation", js.undefined)
    
    inline def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
    
    inline def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setProviders(value: js.Array[StaticProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: StaticProvider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    inline def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
