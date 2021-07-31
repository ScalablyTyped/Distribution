package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultEncapsulation extends StObject {
  
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  var jitDevMode: js.UndefOr[Boolean] = js.undefined
  
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.undefined
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  
  var useJit: js.UndefOr[Boolean] = js.undefined
}
object DefaultEncapsulation {
  
  @scala.inline
  def apply(): DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultEncapsulation]
  }
  
  @scala.inline
  implicit class DefaultEncapsulationMutableBuilder[Self <: DefaultEncapsulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "defaultEncapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncapsulationUndefined: Self = StObject.set(x, "defaultEncapsulation", js.undefined)
    
    @scala.inline
    def setJitDevMode(value: Boolean): Self = StObject.set(x, "jitDevMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitDevModeUndefined: Self = StObject.set(x, "jitDevMode", js.undefined)
    
    @scala.inline
    def setMissingTranslation(value: MissingTranslationStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingTranslationNull: Self = StObject.set(x, "missingTranslation", null)
    
    @scala.inline
    def setMissingTranslationUndefined: Self = StObject.set(x, "missingTranslation", js.undefined)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setStrictInjectionParameters(value: Boolean): Self = StObject.set(x, "strictInjectionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictInjectionParametersUndefined: Self = StObject.set(x, "strictInjectionParameters", js.undefined)
    
    @scala.inline
    def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
