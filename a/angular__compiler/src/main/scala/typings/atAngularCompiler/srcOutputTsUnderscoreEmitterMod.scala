package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/ts_emitter", JSImport.Namespace)
@js.native
object srcOutputTsUnderscoreEmitterMod extends js.Object {
  @js.native
  class TypeScriptEmitter () extends OutputEmitter {
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement]): Anon_Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String): Anon_Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String, emitSourceMaps: Boolean): Anon_Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): Anon_Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Anon_Context = js.native
  }
  
  def debugOutputAstAsTypeScript(ast: js.Array[_]): String = js.native
  def debugOutputAstAsTypeScript(ast: Expression): String = js.native
  def debugOutputAstAsTypeScript(ast: Statement): String = js.native
  def debugOutputAstAsTypeScript(ast: Type): String = js.native
  type ReferenceFilter = js.Function1[/* reference */ ExternalReference, Boolean]
}

