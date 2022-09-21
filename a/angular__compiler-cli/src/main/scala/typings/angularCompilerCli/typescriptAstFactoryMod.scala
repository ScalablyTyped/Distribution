package typings.angularCompilerCli

import typings.angularCompilerCli.astFactoryMod.AstFactory
import typings.angularCompilerCli.astFactoryMod.LeadingComment
import typings.typescript.mod.ArrayLiteralExpression
import typings.typescript.mod.ElementAccessExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.MemberName
import typings.typescript.mod.PropertyAccessExpression
import typings.typescript.mod.Statement
import typings.typescript.mod.TemplateMiddle
import typings.typescript.mod.TemplateTail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptAstFactoryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/typescript_ast_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/typescript_ast_factory", "TypeScriptAstFactory")
  @js.native
  open class TypeScriptAstFactory protected ()
    extends StObject
       with AstFactory[Statement, Expression] {
    def this(annotateForClosureCompiler: Boolean) = this()
    
    /* private */ var annotateForClosureCompiler: Any = js.native
    
    @JSName("attachComments")
    var attachComments_Original: js.Function2[/* statement */ Statement, /* leadingComments */ js.Array[LeadingComment], Unit] = js.native
    
    def createArrayLiteral(): ArrayLiteralExpression = js.native
    def createArrayLiteral(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
    def createArrayLiteral(elements: Unit, multiLine: Boolean): ArrayLiteralExpression = js.native
    
    def createElementAccess(expression: Expression, index: Double): ElementAccessExpression = js.native
    
    def createPropertyAccess(expression: Expression, name: MemberName): PropertyAccessExpression = js.native
    
    /* private */ var externalSourceFiles: Any = js.native
  }
  
  inline def attachComments(statement: Statement, leadingComments: js.Array[LeadingComment]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(statement.asInstanceOf[js.Any], leadingComments.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTemplateMiddle(cooked: String, raw: String): TemplateMiddle = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateMiddle")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateMiddle]
  
  inline def createTemplateTail(cooked: String, raw: String): TemplateTail = (^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateTail")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateTail]
}
