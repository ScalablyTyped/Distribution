package typings.angularCompiler.publicApiMod

import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.templateAstMod.TemplateAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "TemplateParseResult")
@js.native
class TemplateParseResult ()
  extends typings.angularCompiler.srcCompilerMod.TemplateParseResult {
  def this(templateAst: js.Array[TemplateAst]) = this()
  def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(templateAst: Unit, usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: Unit,
    errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: Unit,
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: Unit,
    usedPipes: Unit,
    errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}
