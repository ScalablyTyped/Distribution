package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcNgtscTranslatorSrcTranslatorMod.TranslatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcTypescriptTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/typescript_translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateExpression(expression: Expression, imports: ImportGenerator[typings.typescript.mod.Expression]): typings.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Expression]
  inline def translateExpression(
    expression: Expression,
    imports: ImportGenerator[typings.typescript.mod.Expression],
    options: TranslatorOptions[typings.typescript.mod.Expression]
  ): typings.typescript.mod.Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("translateExpression")(expression.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Expression]
  
  inline def translateStatement(statement: Statement, imports: ImportGenerator[typings.typescript.mod.Expression]): typings.typescript.mod.Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Statement]
  inline def translateStatement(
    statement: Statement,
    imports: ImportGenerator[typings.typescript.mod.Expression],
    options: TranslatorOptions[typings.typescript.mod.Expression]
  ): typings.typescript.mod.Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("translateStatement")(statement.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.Statement]
}
