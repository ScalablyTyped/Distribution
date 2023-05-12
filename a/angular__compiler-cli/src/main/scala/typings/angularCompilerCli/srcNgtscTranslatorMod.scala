package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.Type
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.LeadingComment
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.TranslatorOptions
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.TemplateMiddle
import typings.typescript.mod.TemplateTail
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "Context")
  @js.native
  open class Context protected ()
    extends typings.angularCompilerCli.srcNgtscTranslatorSrcContextMod.Context {
    def this(isStatement: Boolean) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "ExpressionTranslatorVisitor")
  @js.native
  open class ExpressionTranslatorVisitor[TStatement, TExpression] protected ()
    extends typings.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.ExpressionTranslatorVisitor[TStatement, TExpression] {
    def this(
      factory: AstFactory[TStatement, TExpression],
      imports: ImportGenerator[TExpression],
      options: TranslatorOptions[TExpression]
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "ImportManager")
  @js.native
  open class ImportManager ()
    extends typings.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager {
    def this(rewriter: ImportRewriter) = this()
    def this(rewriter: Unit, prefix: String) = this()
    def this(rewriter: ImportRewriter, prefix: String) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator", "TypeScriptAstFactory")
  @js.native
  open class TypeScriptAstFactory protected ()
    extends typings.angularCompilerCli.srcNgtscTranslatorSrcTypescriptAstFactoryMod.TypeScriptAstFactory {
    def this(annotateForClosureCompiler: Boolean) = this()
  }
  
  inline def attachComments(statement: Statement, leadingComments: js.Array[LeadingComment]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(statement.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTemplateMiddle(cooked: String, raw: String): TemplateMiddle = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateMiddle")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateMiddle]
  
  inline def createTemplateTail(cooked: String, raw: String): TemplateTail = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateTail")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateTail]
  
  inline def translateExpression(expression: Expression, imports: ImportGenerator[typings.typescript.mod.Expression]): typings.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Expression]
  inline def translateExpression(
    expression: Expression,
    imports: ImportGenerator[typings.typescript.mod.Expression],
    options: TranslatorOptions[typings.typescript.mod.Expression]
  ): typings.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Expression]
  
  inline def translateStatement(
    statement: typings.angularCompiler.mod.Statement,
    imports: ImportGenerator[typings.typescript.mod.Expression]
  ): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[Statement]
  inline def translateStatement(
    statement: typings.angularCompiler.mod.Statement,
    imports: ImportGenerator[typings.typescript.mod.Expression],
    options: TranslatorOptions[typings.typescript.mod.Expression]
  ): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Statement]
  
  inline def translateType(
    `type`: Type,
    contextFile: SourceFile,
    reflector: ReflectionHost,
    refEmitter: ReferenceEmitter,
    imports: typings.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager
  ): TypeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("translateType")(`type`.asInstanceOf[js.Any], contextFile.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[TypeNode]
}
