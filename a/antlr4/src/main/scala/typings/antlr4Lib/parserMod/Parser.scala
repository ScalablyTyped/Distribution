package typings
package antlr4Lib.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Parser", "Parser")
@js.native
class Parser protected ()
  extends antlr4Lib.recognizerMod.Recognizer {
  def this(input: antlr4Lib.commonTokenStreamMod.CommonTokenStream) = this()
  var _errHandler: antlr4Lib.errorErrorStrategyMod.ErrorStrategy = js.native
  var buildParseTrees: scala.Boolean = js.native
  def addContextToParseTree(): js.Any = js.native
  def addParseListener(lister: antlr4Lib.treeTreeMod.ParseTreeListener): scala.Unit = js.native
  def compileParseTreePattern(pattern: js.Any, patternRuleIndex: js.Any, lexer: antlr4Lib.lexerMod.Lexer): js.Any = js.native
  def consume(): js.Any = js.native
  def dumpDFA(): scala.Unit = js.native
  def enterOuterAlt(): scala.Unit = js.native
  def enterRecursionRule(
    localCtx: antlr4Lib.parserRuleContextMod.ParserRuleContext,
    state: js.Any,
    ruleIndex: js.Any,
    precedence: js.Any
  ): scala.Unit = js.native
  def enterRule(localCtx: antlr4Lib.parserRuleContextMod.ParserRuleContext, state: js.Any, ruleIndex: scala.Double): scala.Unit = js.native
  def exitRule(): scala.Unit = js.native
  def getATNWithBypassAlts(): js.Any = js.native
  def getCurrentToken(): antlr4Lib.tokenMod.Token = js.native
  def getDFAStrings(): js.Any = js.native
  def getExpectedTokens(): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def getExpectedTokensWithinCurrentRule(): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def getInputStream(): antlr4Lib.inputStreamMod.InputStream = js.native
  def getInvokingContext(ruleIndex: scala.Double): js.Any = js.native
  def getParseListeners(): js.Array[antlr4Lib.treeTreeMod.ParseTreeListener] = js.native
  def getPrecedence(): js.Any = js.native
  def getRuleIndex(ruleName: java.lang.String): scala.Double = js.native
  def getRuleInvocationStack(p: js.Any): js.Any = js.native
  def getSourceName(): js.Any = js.native
  def getTokenFactory(): js.Any = js.native
  def getTokenStream(): js.Any = js.native
  def isExpectedToken(symbol: antlr4Lib.tokenMod.Token): scala.Boolean = js.native
  def `match`(): antlr4Lib.tokenMod.Token = js.native
  def matchWildcard(): antlr4Lib.tokenMod.Token = js.native
  def notifyErrorListeners(msg: java.lang.String, offendingToken: antlr4Lib.tokenMod.Token, err: js.Any): scala.Unit = js.native
  def pushNewRecursionContext(
    localCtx: antlr4Lib.parserRuleContextMod.ParserRuleContext,
    state: js.Any,
    ruleIndex: js.Any,
    precedence: js.Any
  ): scala.Unit = js.native
  def removeParseListener(lister: antlr4Lib.treeTreeMod.ParseTreeListener): scala.Unit = js.native
  def removeParseListeners(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setTokenFactory(factory: js.Any): scala.Unit = js.native
  def setTokenStream(stream: js.Any): js.Any = js.native
  def setTrace(trace: scala.Boolean): scala.Unit = js.native
  def triggerEnterRuleEvent(): scala.Unit = js.native
  def triggerExitRuleEvent(): scala.Unit = js.native
  def unrollRecursionContexts(parentCtx: antlr4Lib.parserRuleContextMod.ParserRuleContext): scala.Unit = js.native
}

