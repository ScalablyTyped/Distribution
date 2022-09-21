package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.astFactoryMod.AstFactory
import typings.angularCompilerCli.importGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcTranslatorMod.TranslatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translatorMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/translator", "Translator")
  @js.native
  open class Translator[TStatement, TExpression] protected () extends StObject {
    def this(factory: AstFactory[TStatement, TExpression]) = this()
    
    /* private */ var factory: Any = js.native
    
    /**
      * Translate the given output AST in the context of an expression.
      */
    def translateExpression(expression: Expression, imports: ImportGenerator[TExpression]): TExpression = js.native
    def translateExpression(
      expression: Expression,
      imports: ImportGenerator[TExpression],
      options: TranslatorOptions[TExpression]
    ): TExpression = js.native
    
    /**
      * Translate the given output AST in the context of a statement.
      */
    def translateStatement(statement: Statement, imports: ImportGenerator[TExpression]): TStatement = js.native
    def translateStatement(
      statement: Statement,
      imports: ImportGenerator[TExpression],
      options: TranslatorOptions[TExpression]
    ): TStatement = js.native
  }
}
