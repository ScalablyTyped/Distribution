package typings.angularCompiler

import typings.angularCompiler.abstractEmitterMod.OutputEmitter
import typings.angularCompiler.anon.Context
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/ts_emitter", JSImport.Namespace)
@js.native
object tsEmitterMod extends js.Object {
  @js.native
  class TypeScriptEmitter () extends OutputEmitter {
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement]): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String, emitSourceMaps: Boolean): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
  }
  
  def debugOutputAstAsTypeScript(ast: js.Array[_]): String = js.native
  def debugOutputAstAsTypeScript(ast: Expression): String = js.native
  def debugOutputAstAsTypeScript(ast: Statement): String = js.native
  def debugOutputAstAsTypeScript(ast: Type): String = js.native
  type ReferenceFilter = js.Function1[/* reference */ ExternalReference, Boolean]
}

