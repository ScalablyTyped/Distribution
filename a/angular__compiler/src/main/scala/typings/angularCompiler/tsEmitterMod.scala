package typings.angularCompiler

import typings.angularCompiler.abstractEmitterMod.OutputEmitter
import typings.angularCompiler.anon.Context
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsEmitterMod {
  
  @JSImport("@angular/compiler/src/output/ts_emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/output/ts_emitter", "TypeScriptEmitter")
  @js.native
  class TypeScriptEmitter ()
    extends StObject
       with OutputEmitter {
    
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement]): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: String, emitSourceMaps: Boolean): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Boolean,
      referenceFilter: Unit,
      importFilter: ReferenceFilter
    ): Context = js.native
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
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Unit,
      referenceFilter: Unit,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Unit,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: String,
      emitSourceMaps: Unit,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(genFilePath: String, stmts: js.Array[Statement], preamble: Unit, emitSourceMaps: Boolean): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Boolean,
      referenceFilter: Unit,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Boolean,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Unit,
      referenceFilter: Unit,
      importFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Unit,
      referenceFilter: ReferenceFilter
    ): Context = js.native
    def emitStatementsAndContext(
      genFilePath: String,
      stmts: js.Array[Statement],
      preamble: Unit,
      emitSourceMaps: Unit,
      referenceFilter: ReferenceFilter,
      importFilter: ReferenceFilter
    ): Context = js.native
  }
  
  @scala.inline
  def debugOutputAstAsTypeScript(ast: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: Expression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: Statement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def debugOutputAstAsTypeScript(ast: Type): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugOutputAstAsTypeScript")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ReferenceFilter = js.Function1[/* reference */ ExternalReference, Boolean]
}
