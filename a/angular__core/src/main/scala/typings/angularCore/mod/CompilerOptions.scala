package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerOptions extends StObject {
  
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.native
  
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.native
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  var providers: js.UndefOr[js.Array[StaticProvider]] = js.native
  
  var useJit: js.UndefOr[Boolean] = js.native
}
object CompilerOptions {
  
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit class CompilerOptionsMutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "defaultEncapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncapsulationUndefined: Self = StObject.set(x, "defaultEncapsulation", js.undefined)
    
    @scala.inline
    def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setProviders(value: js.Array[StaticProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: StaticProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
