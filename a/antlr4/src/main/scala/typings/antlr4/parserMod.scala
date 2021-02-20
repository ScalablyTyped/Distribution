package typings.antlr4

import typings.antlr4.commonTokenStreamMod.CommonTokenStream
import typings.antlr4.errorStrategyMod.ErrorStrategy
import typings.antlr4.inputStreamMod.InputStream
import typings.antlr4.lexerMod.Lexer
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import typings.antlr4.treeMod.ParseTreeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("antlr4/Parser", "Parser")
  @js.native
  class Parser protected () extends Recognizer {
    def this(input: CommonTokenStream) = this()
    
    var _errHandler: ErrorStrategy = js.native
    
    def addContextToParseTree(): js.Any = js.native
    
    def addParseListener(lister: ParseTreeListener): Unit = js.native
    
    var buildParseTrees: Boolean = js.native
    
    def compileParseTreePattern(pattern: js.Any, patternRuleIndex: js.Any, lexer: Lexer): js.Any = js.native
    
    def consume(): js.Any = js.native
    
    def dumpDFA(): Unit = js.native
    
    def enterOuterAlt(): Unit = js.native
    
    def enterRecursionRule(localCtx: ParserRuleContext, state: js.Any, ruleIndex: js.Any, precedence: js.Any): Unit = js.native
    
    def enterRule(localCtx: ParserRuleContext, state: js.Any, ruleIndex: Double): Unit = js.native
    
    def exitRule(): Unit = js.native
    
    def getATNWithBypassAlts(): js.Any = js.native
    
    def getCurrentToken(): Token = js.native
    
    def getDFAStrings(): js.Any = js.native
    
    def getExpectedTokens(): js.Array[Token] = js.native
    
    def getExpectedTokensWithinCurrentRule(): js.Array[Token] = js.native
    
    def getInputStream(): InputStream = js.native
    
    def getInvokingContext(ruleIndex: Double): js.Any = js.native
    
    def getParseListeners(): js.Array[ParseTreeListener] = js.native
    
    def getPrecedence(): js.Any = js.native
    
    def getRuleIndex(ruleName: String): Double = js.native
    
    def getRuleInvocationStack(p: js.Any): js.Any = js.native
    
    def getSourceName(): js.Any = js.native
    
    def getTokenFactory(): js.Any = js.native
    
    def getTokenStream(): js.Any = js.native
    
    def isExpectedToken(symbol: Token): Boolean = js.native
    
    def `match`(): Token = js.native
    
    def matchWildcard(): Token = js.native
    
    def notifyErrorListeners(msg: String, offendingToken: Token, err: js.Any): Unit = js.native
    
    def pushNewRecursionContext(localCtx: ParserRuleContext, state: js.Any, ruleIndex: js.Any, precedence: js.Any): Unit = js.native
    
    def removeParseListener(lister: ParseTreeListener): Unit = js.native
    
    def removeParseListeners(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setTokenFactory(factory: js.Any): Unit = js.native
    
    def setTokenStream(stream: js.Any): js.Any = js.native
    
    def setTrace(trace: Boolean): Unit = js.native
    
    def triggerEnterRuleEvent(): Unit = js.native
    
    def triggerExitRuleEvent(): Unit = js.native
    
    def unrollRecursionContexts(parentCtx: ParserRuleContext): Unit = js.native
  }
}
