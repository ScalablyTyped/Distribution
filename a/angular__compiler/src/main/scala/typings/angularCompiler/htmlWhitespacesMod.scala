package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Attribute
import typings.angularCompiler.mlParserAstMod.Comment
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.mlParserAstMod.Expansion
import typings.angularCompiler.mlParserAstMod.ExpansionCase
import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlWhitespacesMod {
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "PRESERVE_WS_ATTR_NAME")
  @js.native
  val PRESERVE_WS_ATTR_NAME: /* "ngPreserveWhitespaces" */ String = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "WhitespaceVisitor")
  @js.native
  class WhitespaceVisitor ()
    extends StObject
       with Visitor {
    
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitElement(element: Element, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
    
    def visitText(text: Text): js.Any = js.native
    /* CompleteClass */
    override def visitText(text: Text, context: js.Any): js.Any = js.native
    def visitText(text: Text, context: SiblingVisitorContext): js.Any = js.native
  }
  
  inline def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWhitespaces")(htmlAstWithErrors.asInstanceOf[js.Any]).asInstanceOf[ParseTreeResult]
  
  inline def replaceNgsp(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceNgsp")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SiblingVisitorContext extends StObject {
    
    var next: js.UndefOr[Node] = js.undefined
    
    var prev: js.UndefOr[Node] = js.undefined
  }
  object SiblingVisitorContext {
    
    inline def apply(): SiblingVisitorContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiblingVisitorContext]
    }
    
    extension [Self <: SiblingVisitorContext](x: Self) {
      
      inline def setNext(value: Node): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: Node): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
