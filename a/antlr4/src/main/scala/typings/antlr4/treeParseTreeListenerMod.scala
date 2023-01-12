package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeParseTreeListenerMod {
  
  @JSImport("antlr4/tree/ParseTreeListener", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ParseTreeListener {
    
    /* CompleteClass */
    override def enterEveryRule(ctx: typings.antlr4.contextParserRuleContextMod.default): Unit = js.native
    
    /* CompleteClass */
    override def exitEveryRule(ctx: typings.antlr4.contextParserRuleContextMod.default): Unit = js.native
    
    /* CompleteClass */
    override def visitErrorNode(node: typings.antlr4.treeErrorNodeMod.default): Unit = js.native
    
    /* CompleteClass */
    override def visitTerminal(node: typings.antlr4.treeTerminalNodeMod.default): Unit = js.native
  }
  
  trait ParseTreeListener extends StObject {
    
    def enterEveryRule(ctx: typings.antlr4.contextParserRuleContextMod.default): Unit
    
    def exitEveryRule(ctx: typings.antlr4.contextParserRuleContextMod.default): Unit
    
    def visitErrorNode(node: typings.antlr4.treeErrorNodeMod.default): Unit
    
    def visitTerminal(node: typings.antlr4.treeTerminalNodeMod.default): Unit
  }
  object ParseTreeListener {
    
    inline def apply(
      enterEveryRule: typings.antlr4.contextParserRuleContextMod.default => Unit,
      exitEveryRule: typings.antlr4.contextParserRuleContextMod.default => Unit,
      visitErrorNode: typings.antlr4.treeErrorNodeMod.default => Unit,
      visitTerminal: typings.antlr4.treeTerminalNodeMod.default => Unit
    ): ParseTreeListener = {
      val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1(enterEveryRule), exitEveryRule = js.Any.fromFunction1(exitEveryRule), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
      __obj.asInstanceOf[ParseTreeListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseTreeListener] (val x: Self) extends AnyVal {
      
      inline def setEnterEveryRule(value: typings.antlr4.contextParserRuleContextMod.default => Unit): Self = StObject.set(x, "enterEveryRule", js.Any.fromFunction1(value))
      
      inline def setExitEveryRule(value: typings.antlr4.contextParserRuleContextMod.default => Unit): Self = StObject.set(x, "exitEveryRule", js.Any.fromFunction1(value))
      
      inline def setVisitErrorNode(value: typings.antlr4.treeErrorNodeMod.default => Unit): Self = StObject.set(x, "visitErrorNode", js.Any.fromFunction1(value))
      
      inline def setVisitTerminal(value: typings.antlr4.treeTerminalNodeMod.default => Unit): Self = StObject.set(x, "visitTerminal", js.Any.fromFunction1(value))
    }
  }
}
