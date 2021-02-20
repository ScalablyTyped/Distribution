package typings.angularCompiler

import typings.angularCompiler.anon.DefaultEncapsulation
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@angular/compiler/src/config", "CompilerConfig")
  @js.native
  class CompilerConfig () extends StObject {
    def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: DefaultEncapsulation) = this()
    
    var defaultEncapsulation: ViewEncapsulation | Null = js.native
    
    var jitDevMode: Boolean = js.native
    
    var missingTranslation: MissingTranslationStrategy | Null = js.native
    
    var preserveWhitespaces: Boolean = js.native
    
    var strictInjectionParameters: Boolean = js.native
    
    var useJit: Boolean = js.native
  }
  
  @JSImport("@angular/compiler/src/config", "preserveWhitespacesDefault")
  @js.native
  def preserveWhitespacesDefault(): Boolean = js.native
  @JSImport("@angular/compiler/src/config", "preserveWhitespacesDefault")
  @js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = js.native
  @JSImport("@angular/compiler/src/config", "preserveWhitespacesDefault")
  @js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = js.native
  @JSImport("@angular/compiler/src/config", "preserveWhitespacesDefault")
  @js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = js.native
}
