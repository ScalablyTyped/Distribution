package typings.atAngularCompiler.srcOutputTsUnderscoreEmitterMod

import typings.atAngularCompiler.Anon_Context
import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/ts_emitter", "TypeScriptEmitter")
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

