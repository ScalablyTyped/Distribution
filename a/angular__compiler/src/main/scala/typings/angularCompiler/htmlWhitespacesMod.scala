package typings.angularCompiler

import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlWhitespacesMod {
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "PRESERVE_WS_ATTR_NAME")
  @js.native
  val PRESERVE_WS_ATTR_NAME: /* "ngPreserveWhitespaces" */ String = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "WhitespaceVisitor")
  @js.native
  class WhitespaceVisitor () extends Visitor {
    
    def visitText(text: Text): js.Any = js.native
    def visitText(text: Text, context: SiblingVisitorContext): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "removeWhitespaces")
  @js.native
  def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/html_whitespaces", "replaceNgsp")
  @js.native
  def replaceNgsp(value: String): String = js.native
  
  @js.native
  trait SiblingVisitorContext extends StObject {
    
    var next: js.UndefOr[Node] = js.native
    
    var prev: js.UndefOr[Node] = js.native
  }
  object SiblingVisitorContext {
    
    @scala.inline
    def apply(): SiblingVisitorContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiblingVisitorContext]
    }
    
    @scala.inline
    implicit class SiblingVisitorContextMutableBuilder[Self <: SiblingVisitorContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Node): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrev(value: Node): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
