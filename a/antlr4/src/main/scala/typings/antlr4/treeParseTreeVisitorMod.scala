package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeParseTreeVisitorMod {
  
  @JSImport("antlr4/tree/ParseTreeVisitor", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ParseTreeVisitor {
    
    /* CompleteClass */
    override def visit(tree: typings.antlr4.treeParseTreeMod.default): Any = js.native
    
    /* CompleteClass */
    override def visitChildren(node: typings.antlr4.treeRuleNodeMod.default): Any = js.native
    
    /* CompleteClass */
    override def visitErrorNode(node: typings.antlr4.treeErrorNodeMod.default): Unit = js.native
    
    /* CompleteClass */
    override def visitTerminal(node: typings.antlr4.treeTerminalNodeMod.default): Unit = js.native
  }
  
  trait ParseTreeVisitor extends StObject {
    
    def visit(tree: typings.antlr4.treeParseTreeMod.default): Any
    
    def visitChildren(node: typings.antlr4.treeRuleNodeMod.default): Any
    
    def visitErrorNode(node: typings.antlr4.treeErrorNodeMod.default): Unit
    
    def visitTerminal(node: typings.antlr4.treeTerminalNodeMod.default): Unit
  }
  object ParseTreeVisitor {
    
    inline def apply(
      visit: typings.antlr4.treeParseTreeMod.default => Any,
      visitChildren: typings.antlr4.treeRuleNodeMod.default => Any,
      visitErrorNode: typings.antlr4.treeErrorNodeMod.default => Unit,
      visitTerminal: typings.antlr4.treeTerminalNodeMod.default => Unit
    ): ParseTreeVisitor = {
      val __obj = js.Dynamic.literal(visit = js.Any.fromFunction1(visit), visitChildren = js.Any.fromFunction1(visitChildren), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
      __obj.asInstanceOf[ParseTreeVisitor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseTreeVisitor] (val x: Self) extends AnyVal {
      
      inline def setVisit(value: typings.antlr4.treeParseTreeMod.default => Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      inline def setVisitChildren(value: typings.antlr4.treeRuleNodeMod.default => Any): Self = StObject.set(x, "visitChildren", js.Any.fromFunction1(value))
      
      inline def setVisitErrorNode(value: typings.antlr4.treeErrorNodeMod.default => Unit): Self = StObject.set(x, "visitErrorNode", js.Any.fromFunction1(value))
      
      inline def setVisitTerminal(value: typings.antlr4.treeTerminalNodeMod.default => Unit): Self = StObject.set(x, "visitTerminal", js.Any.fromFunction1(value))
    }
  }
}
