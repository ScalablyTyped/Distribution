package typings.angularCompiler.publicApiMod

import typings.angularCompiler.compilerMod.NgAnalyzedFile
import typings.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "mergeAnalyzedFiles")
@js.native
object mergeAnalyzedFiles extends js.Object {
  def apply(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

