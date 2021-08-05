package typings.antlr4

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("antlr4/tree/Tree", "ErrorNode")
  @js.native
  class ErrorNode protected () extends TerminalNode {
    def this(symbol: Token) = this()
  }
  
  @JSImport("antlr4/tree/Tree", "ErrorNodeImpl")
  @js.native
  class ErrorNodeImpl protected () extends TerminalNode {
    def this(token: Token) = this()
    
    def isErrorNode(): Boolean = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "INVALID_INTERVAL")
  @js.native
  val INVALID_INTERVAL: Interval = js.native
  
  @JSImport("antlr4/tree/Tree", "ParseTree")
  @js.native
  class ParseTree () extends StObject
  
  @JSImport("antlr4/tree/Tree", "ParseTreeVisitor")
  @js.native
  class ParseTreeVisitor () extends StObject {
    
    def visit(ctx: ParserRuleContext): js.Any = js.native
    
    def visitChildren(ctx: ParserRuleContext): js.Any = js.native
    
    def visitErrorNode(node: ErrorNode): js.Any = js.native
    
    def visitTerminal(node: TerminalNode): js.Any = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "ParseTreeWalker")
  @js.native
  class ParseTreeWalker () extends StObject {
    
    def enterRule(listener: ParseTreeListener, rule: js.Any): Unit = js.native
    
    def exitRule(listener: ParseTreeListener, rule: js.Any): Unit = js.native
    
    def walk(listener: ParseTreeListener, rule: js.Any): Unit = js.native
  }
  /* static members */
  object ParseTreeWalker {
    
    @JSImport("antlr4/tree/Tree", "ParseTreeWalker.DEFAULT")
    @js.native
    val DEFAULT: ParseTreeWalker = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "RuleNode")
  @js.native
  class RuleNode () extends ParseTree
  
  @JSImport("antlr4/tree/Tree", "TerminalNode")
  @js.native
  class TerminalNode protected () extends ParseTree {
    def this(symbol: Token) = this()
    
    def accept(visitor: ParseTreeVisitor): js.Any = js.native
    
    def getChild(i: Double): js.Any = js.native
    
    def getChildCount(): Double = js.native
    
    def getParent(): js.Any = js.native
    
    def getPayload(): Token = js.native
    
    def getSourceInterval(): Interval = js.native
    
    def getSymbol(): Token = js.native
    
    def getText(): String = js.native
    
    val parentCtx: js.Any = js.native
    
    val symbol: Token = js.native
  }
  
  @JSImport("antlr4/tree/Tree", "TerminalNodeImpl")
  @js.native
  class TerminalNodeImpl protected () extends TerminalNode {
    def this(symbol: Token) = this()
  }
  
  trait ParseTreeListener extends StObject {
    
    def enterEveryRule(node: ParserRuleContext): Unit
    
    def exitEveryRule(node: ParserRuleContext): Unit
    
    def visitErrorNode(node: ErrorNode): Unit
    
    def visitTerminal(node: TerminalNode): Unit
  }
  object ParseTreeListener {
    
    inline def apply(
      enterEveryRule: ParserRuleContext => Unit,
      exitEveryRule: ParserRuleContext => Unit,
      visitErrorNode: ErrorNode => Unit,
      visitTerminal: TerminalNode => Unit
    ): ParseTreeListener = {
      val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1(enterEveryRule), exitEveryRule = js.Any.fromFunction1(exitEveryRule), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
      __obj.asInstanceOf[ParseTreeListener]
    }
    
    extension [Self <: ParseTreeListener](x: Self) {
      
      inline def setEnterEveryRule(value: ParserRuleContext => Unit): Self = StObject.set(x, "enterEveryRule", js.Any.fromFunction1(value))
      
      inline def setExitEveryRule(value: ParserRuleContext => Unit): Self = StObject.set(x, "exitEveryRule", js.Any.fromFunction1(value))
      
      inline def setVisitErrorNode(value: ErrorNode => Unit): Self = StObject.set(x, "visitErrorNode", js.Any.fromFunction1(value))
      
      inline def setVisitTerminal(value: TerminalNode => Unit): Self = StObject.set(x, "visitTerminal", js.Any.fromFunction1(value))
    }
  }
}
