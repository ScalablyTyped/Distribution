package typings
package atAngularCompilerLib.srcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/config", "CompilerConfig")
@js.native
class CompilerConfig () extends js.Object {
  def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: atAngularCompilerLib.Anon_DefaultEncapsulation) = this()
  var defaultEncapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation | scala.Null = js.native
  var jitDevMode: scala.Boolean = js.native
  var missingTranslation: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy | scala.Null = js.native
  var preserveWhitespaces: scala.Boolean = js.native
  var strictInjectionParameters: scala.Boolean = js.native
  var useJit: scala.Boolean = js.native
}

