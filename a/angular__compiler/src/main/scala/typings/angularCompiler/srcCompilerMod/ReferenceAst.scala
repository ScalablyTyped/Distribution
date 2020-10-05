package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typings.angularCompiler.templateAstMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

