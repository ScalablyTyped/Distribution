package typings
package atAngularCompilerLib.srcOutputTsUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/ts_emitter", "TypeScriptEmitter")
@js.native
class TypeScriptEmitter ()
  extends atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter {
  def emitStatementsAndContext(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.Anon_SourceText = js.native
  def emitStatementsAndContext(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    preamble: java.lang.String
  ): atAngularCompilerLib.Anon_SourceText = js.native
  def emitStatementsAndContext(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    preamble: java.lang.String,
    emitSourceMaps: scala.Boolean
  ): atAngularCompilerLib.Anon_SourceText = js.native
  def emitStatementsAndContext(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    preamble: java.lang.String,
    emitSourceMaps: scala.Boolean,
    referenceFilter: ReferenceFilter
  ): atAngularCompilerLib.Anon_SourceText = js.native
  def emitStatementsAndContext(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    preamble: java.lang.String,
    emitSourceMaps: scala.Boolean,
    referenceFilter: ReferenceFilter,
    importFilter: ReferenceFilter
  ): atAngularCompilerLib.Anon_SourceText = js.native
}

