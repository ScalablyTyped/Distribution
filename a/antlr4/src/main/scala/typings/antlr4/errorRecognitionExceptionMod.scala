package typings.antlr4

import typings.antlr4.antlr4Ints.`-1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorRecognitionExceptionMod {
  
  @JSImport("antlr4/error/RecognitionException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RecognitionException {
    def this(params: RecognitionExceptionOpts) = this()
    
    /* CompleteClass */
    override val ctx: typings.antlr4.contextRuleContextMod.default = js.native
    
    /**
      * Gets the set of input symbols which could potentially follow the
      * previously matched symbol at the time this exception was thrown.
      *
      * If the set of expected tokens is not known and could not be computed,
      * this method returns `null`.
      *
      * @return The set of token types that could potentially follow the current
      * state in the ATN, or `null` if the information is not available.
      */
    /* CompleteClass */
    override def getExpectedTokens(): typings.antlr4.miscIntervalSetMod.default = js.native
    
    /* CompleteClass */
    override val input: typings.antlr4.inputStreamMod.default = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Get the ATN state number the parser was in at the time the error
      * occurred. For {@link NoViableAltException} and
      * {@link LexerNoViableAltException} exceptions, this is the
      * {@link DecisionState} number. For others, it is the state whose outgoing
      * edge we couldn't match.
      */
    /* CompleteClass */
    var offendingState: `-1` = js.native
    
    /**
      * The current {@link Token} when an error occurred. Since not all streams
      * support accessing symbols by index, we have to track the {@link Token}
      * instance itself
      */
    /* CompleteClass */
    var offendingToken: typings.antlr4.tokenMod.default = js.native
    
    /* CompleteClass */
    override val recognizer: typings.antlr4.recognizerMod.default = js.native
  }
  
  trait RecognitionException
    extends StObject
       with Error {
    
    val ctx: typings.antlr4.contextRuleContextMod.default
    
    /**
      * Gets the set of input symbols which could potentially follow the
      * previously matched symbol at the time this exception was thrown.
      *
      * If the set of expected tokens is not known and could not be computed,
      * this method returns `null`.
      *
      * @return The set of token types that could potentially follow the current
      * state in the ATN, or `null` if the information is not available.
      */
    def getExpectedTokens(): typings.antlr4.miscIntervalSetMod.default
    
    val input: typings.antlr4.inputStreamMod.default
    
    /**
      * Get the ATN state number the parser was in at the time the error
      * occurred. For {@link NoViableAltException} and
      * {@link LexerNoViableAltException} exceptions, this is the
      * {@link DecisionState} number. For others, it is the state whose outgoing
      * edge we couldn't match.
      */
    var offendingState: `-1`
    
    /**
      * The current {@link Token} when an error occurred. Since not all streams
      * support accessing symbols by index, we have to track the {@link Token}
      * instance itself
      */
    var offendingToken: typings.antlr4.tokenMod.default
    
    val recognizer: typings.antlr4.recognizerMod.default
  }
  object RecognitionException {
    
    inline def apply(
      ctx: typings.antlr4.contextRuleContextMod.default,
      getExpectedTokens: () => typings.antlr4.miscIntervalSetMod.default,
      input: typings.antlr4.inputStreamMod.default,
      message: String,
      name: String,
      offendingToken: typings.antlr4.tokenMod.default,
      recognizer: typings.antlr4.recognizerMod.default
    ): RecognitionException = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], getExpectedTokens = js.Any.fromFunction0(getExpectedTokens), input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offendingState = -1, offendingToken = offendingToken.asInstanceOf[js.Any], recognizer = recognizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecognitionException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecognitionException] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: typings.antlr4.contextRuleContextMod.default): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setGetExpectedTokens(value: () => typings.antlr4.miscIntervalSetMod.default): Self = StObject.set(x, "getExpectedTokens", js.Any.fromFunction0(value))
      
      inline def setInput(value: typings.antlr4.inputStreamMod.default): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOffendingState(value: `-1`): Self = StObject.set(x, "offendingState", value.asInstanceOf[js.Any])
      
      inline def setOffendingToken(value: typings.antlr4.tokenMod.default): Self = StObject.set(x, "offendingToken", value.asInstanceOf[js.Any])
      
      inline def setRecognizer(value: typings.antlr4.recognizerMod.default): Self = StObject.set(x, "recognizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecognitionExceptionOpts extends StObject {
    
    var ctx: typings.antlr4.contextRuleContextMod.default
    
    var input: typings.antlr4.inputStreamMod.default
    
    var message: String
    
    var recognizer: typings.antlr4.recognizerMod.default
  }
  object RecognitionExceptionOpts {
    
    inline def apply(
      ctx: typings.antlr4.contextRuleContextMod.default,
      input: typings.antlr4.inputStreamMod.default,
      message: String,
      recognizer: typings.antlr4.recognizerMod.default
    ): RecognitionExceptionOpts = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], recognizer = recognizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecognitionExceptionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecognitionExceptionOpts] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: typings.antlr4.contextRuleContextMod.default): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setInput(value: typings.antlr4.inputStreamMod.default): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRecognizer(value: typings.antlr4.recognizerMod.default): Self = StObject.set(x, "recognizer", value.asInstanceOf[js.Any])
    }
  }
}
