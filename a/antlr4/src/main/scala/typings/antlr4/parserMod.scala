package typings.antlr4

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("antlr4/Parser", JSImport.Default)
  @js.native
  open class default protected () extends Parser {
    def this(input: typings.antlr4.commonTokenStreamMod.default) = this()
  }
  
  @js.native
  trait Parser
    extends typings.antlr4.recognizerMod.default {
    
    var _errHandler: typings.antlr4.errorErrorStrategyMod.default = js.native
    
    def addContextToParseTree(): Unit = js.native
    
    /**
      * Registers `listener` to receive events during the parsing process.
      *
      * To support output-preserving grammar transformations (including but not
      * limited to left-recursion removal, automated left-factoring, and
      * optimized code generation), calls to listener methods during the parse
      * may differ substantially from calls made by {@link ParseTreeWalker.DEFAULT}
      * used after the parse is complete. In particular, rule entry and exit events
      * may occur in a different order during the parse than after the parser.
      * In addition, calls to certain rule entry methods may be omitted.
      *
      * With the following specific exceptions, calls to listener events are
      * _deterministic_, i.e. for identical input the calls to listener
      * methods will be the same.
      *
      * - Alterations to the grammar used to generate code may change the
      * behavior of the listener calls.
      * - Alterations to the command line options passed to ANTLR 4 when
      * generating the parser may change the behavior of the listener calls.
      * - Changing the version of the ANTLR Tool used to generate the parser
      * may change the behavior of the listener calls.
      *
      * @param listener the listener to add
      * @throws {string} if `listener` is `null`
      */
    def addParseListener(listener: typings.antlr4.treeParseTreeListenerMod.default): Unit = js.native
    
    /**
      * Specifies whether or not the parser should construct a parse tree during
      * the parsing process. The default value is `true`.
      */
    var buildParseTrees: Boolean = js.native
    
    /**
      * Consume and return the current symbol.
      *
      * E.g., given the following input with `A` being the current lookahead
      * symbol, this function moves the cursor to `B` and returns `A`.
      *
      * A B
      * ^
      *
      * If the parser is not in error recovery mode, the consumed symbol is added
      * to the parse tree using {@link ParserRuleContext.addChild(Token)}, and
      * {@link ParseTreeListener.visitTerminal} is called on any parse listeners.
      * If the parser _is_ in error recovery mode, the consumed symbol is
      * added to the parse tree using {@link ParserRuleContext.addErrorNode(Token)}, and
      * {@link ParseTreeListener.visitErrorNode} is called on any parse listeners.
      */
    def consume(): typings.antlr4.tokenMod.default = js.native
    
    /**
      * For debugging and other purposes.
      */
    def dumpDFA(): Unit = js.native
    
    def enterOuterAlt(): Unit = js.native
    
    def enterRecursionRule(
      localCtx: typings.antlr4.contextParserRuleContextMod.default,
      state: Double,
      ruleIndex: Double,
      precedence: Double
    ): Unit = js.native
    def enterRecursionRule(
      localCtx: typings.antlr4.contextParserRuleContextMod.default,
      state: Double,
      ruleIndex: Unit,
      precedence: Double
    ): Unit = js.native
    
    /**
      * Always called by generated parsers upon entry to a rule.
      * Access field {@link _ctx} get the current context.
      */
    def enterRule(localCtx: typings.antlr4.contextParserRuleContextMod.default, state: Double): Unit = js.native
    def enterRule(localCtx: typings.antlr4.contextParserRuleContextMod.default, state: Double, ruleIndex: Double): Unit = js.native
    
    def exitRule(): Unit = js.native
    
    /**
      * The ATN with bypass alternatives is expensive to create so we create it lazily.
      */
    def getATNWithBypassAlts(): typings.antlr4.atnAtnMod.default = js.native
    
    /**
      * Match needs to return the current input symbol, which gets put
      * into the label for the associated token ref; e.g., x=ID.
      */
    def getCurrentToken(): ReturnType[js.Function1[/* k */ Double, typings.antlr4.tokenMod.default]] = js.native
    
    /**
      * For debugging and other purposes.
      */
    def getDFAStrings(): String = js.native
    
    /**
      * Computes the set of input symbols which could follow the current parser
      * state and context, as given by {@link getState} and {@link getContext},
      * respectively.
      *
      * @see ATN.getExpectedTokens
      */
    def getExpectedTokens(): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    def getExpectedTokensWithinCurrentRule(): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    /**
      * Calls getTokenStream
      */
    def getInputStream(): typings.antlr4.commonTokenStreamMod.default = js.native
    
    def getInvokingContext(ruleIndex: Double): typings.antlr4.contextParserRuleContextMod.default = js.native
    
    def getParseListeners(): js.Array[typings.antlr4.treeParseTreeListenerMod.default] = js.native
    
    /**
      * Get the precedence level for the top-most precedence rule.
      *
      * @return The precedence level for the top-most precedence rule, or -1 if
      * the parser context is not nested within a precedence rule.
      */
    def getPrecedence(): Double = js.native
    
    def getRuleIndex(ruleName: String): Double = js.native
    
    /**
      * Return list of the rule names in your parser instance
      * leading up to a call to the current rule. You could override if
      * you want more details such as the file/line info of where
      * in the ATN a rule is invoked.
      *
      * this is very useful for error messages.
      */
    def getRuleInvocationStack(): js.Array[String] = js.native
    def getRuleInvocationStack(p: typings.antlr4.contextParserRuleContextMod.default): js.Array[String] = js.native
    
    def getSourceName(): String = js.native
    
    def getTokenFactory(): typings.antlr4.commonTokenFactoryMod.default = js.native
    
    def getTokenStream(): typings.antlr4.commonTokenStreamMod.default = js.native
    
    def inContext(context: typings.antlr4.contextParserRuleContextMod.default): Boolean = js.native
    
    /**
      * Checks whether or not `symbol` can follow the current state in the
      * ATN. The behavior of this method is equivalent to the following, but is
      * implemented such that the complete context-sensitive follow set does not
      * need to be explicitly constructed.
      *
      * `return getExpectedTokens().contains(symbol);`
      *
      * @param symbol the symbol type to check
      * @return `true` if `symbol` can follow the current state in
      * the ATN, otherwise `false`.
      */
    def isExpectedToken(symbol: typings.antlr4.tokenMod.default): Boolean = js.native
    
    /**
      * Match current input symbol against `ttype`. If the symbol type
      * matches, {@link ErrorStrategy.reportMatch} and {@link consume} are
      * called to complete the match process.
      *
      * If the symbol type does not match, {@link ErrorStrategy.recoverInline}
      * is called on the current error strategy to attempt recovery.
      * If {@link getBuildParseTree} is `true` and the token index of the symbol returned by
      * {@link ANTLRErrorStrategy.recoverInline} is `-1`, the symbol is added to
      * the parse tree by calling {@link ParserRuleContext.addErrorNode}.
      *
      * @return the matched symbol
      * @throws {RecognitionException} if the current input symbol did not match
      * `ttype` and the error strategy could not recover from the mismatched symbol
      */
    def `match`(): typings.antlr4.tokenMod.default = js.native
    
    /**
      * Match current input symbol as a wildcard. If the symbol type matches
      * (i.e. has a value greater than 0), {@link ErrorStrategy.reportMatch}
      * and {@link consume} are called to complete the match process.
      *
      * If the symbol type does not match, {@link ErrorStrategy.recoverInline}
      * is called on the current error strategy to attempt recovery.
      * If {@link getBuildParseTree} is `true` and the token index of the symbol
      * returned by {@link ErrorStrategy.recoverInline} is `-1`, the symbol is
      * added to the parse tree by calling {@link ParserRuleContext.addErrorNode}.
      *
      * @return the matched symbol
      * @throws {RecognitionException} if the current input symbol did not match
      * a wildcard and the error strategy could not recover from the mismatched
      * symbol
      */
    def matchWildcard(): typings.antlr4.tokenMod.default = js.native
    
    def notifyErrorListeners(msg: String, offendingToken: typings.antlr4.tokenMod.default): Unit = js.native
    def notifyErrorListeners(
      msg: String,
      offendingToken: typings.antlr4.tokenMod.default,
      err: typings.antlr4.errorRecognitionExceptionMod.default
    ): Unit = js.native
    
    def pushNewRecursionContext(localCtx: typings.antlr4.contextParserRuleContextMod.default, state: Double): Unit = js.native
    def pushNewRecursionContext(localCtx: typings.antlr4.contextParserRuleContextMod.default, state: Double, ruleIndex: Double): Unit = js.native
    
    /**
      * Remove `listener` from the list of parse listeners.
      *
      * If `listener` is `null` or has not been added as a parse
      * listener, this method does nothing.
      *
      * @param listener the listener to remove
      */
    def removeParseListener(listener: typings.antlr4.treeParseTreeListenerMod.default): Unit = js.native
    
    def removeParseListeners(): Unit = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Calls setTokenStream
      */
    def setInputStream(input: typings.antlr4.commonTokenStreamMod.default): Unit = js.native
    
    /**
      * Tell our token source and error strategy about a new way to create tokens.
      */
    def setTokenFactory(factory: typings.antlr4.commonTokenFactoryMod.default): Unit = js.native
    
    /**
      * Set the token stream and reset the parser.
      */
    def setTokenStream(stream: typings.antlr4.commonTokenStreamMod.default): Unit = js.native
    
    /**
      * During a parse is sometimes useful to listen in on the rule entry and exit
      * events as well as token matches. this is for quick and dirty debugging.
      */
    def setTrace(trace: Boolean): Unit = js.native
    
    /**
      * Notify any parse listeners of an enter rule event.
      */
    def triggerEnterRuleEvent(): Unit = js.native
    
    /**
      * Notify any parse listeners of an exit rule event.
      * @see addParseListener
      */
    def triggerExitRuleEvent(): Unit = js.native
    
    def unrollRecursionContexts(parentCtx: typings.antlr4.contextParserRuleContextMod.default): Unit = js.native
  }
}
