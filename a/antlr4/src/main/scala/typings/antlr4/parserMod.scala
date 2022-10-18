package typings.antlr4

import typings.antlr4.commonTokenStreamMod.CommonTokenStream
import typings.antlr4.errorErrorStrategyMod.ErrorStrategy
import typings.antlr4.inputStreamMod.InputStream
import typings.antlr4.lexerMod.Lexer
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import typings.antlr4.treeTreeMod.ParseTreeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("antlr4/Parser", "Parser")
  @js.native
  open class Parser protected () extends Recognizer {
    def this(input: CommonTokenStream) = this()
    
    var _errHandler: ErrorStrategy = js.native
    
    def addContextToParseTree(): Any = js.native
    
    def addParseListener(lister: ParseTreeListener): Unit = js.native
    
    var buildParseTrees: Boolean = js.native
    
    def compileParseTreePattern(pattern: Any, patternRuleIndex: Any, lexer: Lexer): Any = js.native
    
    def consume(): Any = js.native
    
    def dumpDFA(): Unit = js.native
    
    def enterOuterAlt(): Unit = js.native
    
    def enterRecursionRule(localCtx: ParserRuleContext, state: Any, ruleIndex: Any, precedence: Any): Unit = js.native
    
    def enterRule(localCtx: ParserRuleContext, state: Any, ruleIndex: Double): Unit = js.native
    
    def exitRule(): Unit = js.native
    
    def getATNWithBypassAlts(): Any = js.native
    
    def getCurrentToken(): Token = js.native
    
    def getDFAStrings(): Any = js.native
    
    def getExpectedTokens(): js.Array[Token] = js.native
    
    def getExpectedTokensWithinCurrentRule(): js.Array[Token] = js.native
    
    def getInputStream(): InputStream = js.native
    
    def getInvokingContext(ruleIndex: Double): Any = js.native
    
    def getParseListeners(): js.Array[ParseTreeListener] = js.native
    
    def getPrecedence(): Any = js.native
    
    def getRuleIndex(ruleName: String): Double = js.native
    
    def getRuleInvocationStack(p: Any): Any = js.native
    
    def getSourceName(): Any = js.native
    
    def getTokenFactory(): Any = js.native
    
    def getTokenStream(): Any = js.native
    
    def isExpectedToken(symbol: Token): Boolean = js.native
    
    def `match`(): Token = js.native
    
    def matchWildcard(): Token = js.native
    
    def notifyErrorListeners(msg: String, offendingToken: Token, err: Any): Unit = js.native
    
    def pushNewRecursionContext(localCtx: ParserRuleContext, state: Any, ruleIndex: Any, precedence: Any): Unit = js.native
    
    def removeParseListener(lister: ParseTreeListener): Unit = js.native
    
    def removeParseListeners(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setTokenFactory(factory: Any): Unit = js.native
    
    def setTokenStream(stream: Any): Any = js.native
    
    def setTrace(trace: Boolean): Unit = js.native
    
    def triggerEnterRuleEvent(): Unit = js.native
    
    def triggerExitRuleEvent(): Unit = js.native
    
    def unrollRecursionContexts(parentCtx: ParserRuleContext): Unit = js.native
  }
}
