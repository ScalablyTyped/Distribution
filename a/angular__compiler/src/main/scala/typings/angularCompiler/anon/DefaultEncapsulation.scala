package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultEncapsulation extends js.Object {
  
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.native
  
  var jitDevMode: js.UndefOr[Boolean] = js.native
  
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.native
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  var strictInjectionParameters: js.UndefOr[Boolean] = js.native
  
  var useJit: js.UndefOr[Boolean] = js.native
}
object DefaultEncapsulation {
  
  @scala.inline
  def apply(): DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultEncapsulation]
  }
  
  @scala.inline
  implicit class DefaultEncapsulationOps[Self <: DefaultEncapsulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultEncapsulation(value: ViewEncapsulation): Self = this.set("defaultEncapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEncapsulation: Self = this.set("defaultEncapsulation", js.undefined)
    
    @scala.inline
    def setJitDevMode(value: Boolean): Self = this.set("jitDevMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitDevMode: Self = this.set("jitDevMode", js.undefined)
    
    @scala.inline
    def setMissingTranslation(value: MissingTranslationStrategy): Self = this.set("missingTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingTranslation: Self = this.set("missingTranslation", js.undefined)
    
    @scala.inline
    def setMissingTranslationNull: Self = this.set("missingTranslation", null)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setStrictInjectionParameters(value: Boolean): Self = this.set("strictInjectionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictInjectionParameters: Self = this.set("strictInjectionParameters", js.undefined)
    
    @scala.inline
    def setUseJit(value: Boolean): Self = this.set("useJit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseJit: Self = this.set("useJit", js.undefined)
  }
}
