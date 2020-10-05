package typings.angularCompiler.mod

import typings.angularCompiler.aotCompilerMod.NgAnalyzedFile
import typings.angularCompiler.aotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "mergeAnalyzedFiles")
@js.native
object mergeAnalyzedFiles extends js.Object {
  def apply(analyzedFiles: js.Array[NgAnalyzedFile]): NgAnalyzedModules = js.native
}

