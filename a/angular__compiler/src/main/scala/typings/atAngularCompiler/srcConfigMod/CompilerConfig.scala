package typings.atAngularCompiler.srcConfigMod

import typings.atAngularCompiler.Anon_DefaultEncapsulation
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/config", "CompilerConfig")
@js.native
class CompilerConfig () extends js.Object {
  def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: Anon_DefaultEncapsulation) = this()
  var defaultEncapsulation: ViewEncapsulation | Null = js.native
  var jitDevMode: Boolean = js.native
  var missingTranslation: MissingTranslationStrategy | Null = js.native
  var preserveWhitespaces: Boolean = js.native
  var strictInjectionParameters: Boolean = js.native
  var useJit: Boolean = js.native
}

