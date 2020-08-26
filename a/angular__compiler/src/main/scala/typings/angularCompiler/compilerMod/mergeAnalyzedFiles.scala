package typings.angularCompiler.compilerMod

import typings.angularCompiler.aotCompilerMod.NgAnalyzedFile
import typings.angularCompiler.aotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "mergeAnalyzedFiles")
@js.native
object mergeAnalyzedFiles extends js.Object {
  def apply(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

