package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferedTokenStreamMod {
  
  @JSImport("antlr4/BufferedTokenStream", JSImport.Default)
  @js.native
  open class default protected () extends BufferedTokenStream {
    def this(tokenSource: typings.antlr4.tokenSourceMod.default) = this()
  }
  
  @js.native
  trait BufferedTokenStream
    extends typings.antlr4.tokenStreamMod.default {
    
    def LA(i: Double): Double = js.native
    
    def LB(k: Double): typings.antlr4.tokenMod.default = js.native
    
    def LT(k: Double): typings.antlr4.tokenMod.default = js.native
    
    /**
      * Allowed derived classes to modify the behavior of operations which change
      * the current stream position by adjusting the target token index of a seek
      * operation. The default implementation simply returns `i`. If an
      * exception is thrown in this method, the current stream index should not be
      * changed.
      *
      * For example, {@link CommonTokenStream} overrides this method to ensure
      * that the seek target is always an on-channel token.
      *
      * @param i The target token index.
      * @return The adjusted target token index.
      */
    def adjustSeekIndex(i: Double): Double = js.native
    
    def consume(): Unit = js.native
    
    /**
      * Add `n` elements to buffer.
      *
      * @return The actual number of elements added to the buffer.
      */
    def fetch(n: Double): Double = js.native
    
    /**
      * Get all tokens from lexer until EOF.
      */
    def fill(): Unit = js.native
    
    def filterForChannel(left: Double, right: Double, channel: Double): js.Array[typings.antlr4.tokenMod.default] | Null = js.native
    
    def get(index: Double): typings.antlr4.tokenMod.default = js.native
    
    /**
      * Collect all tokens on specified channel to the right of
      * the current token up until we see a token on `DEFAULT_TOKEN_CHANNEL` or
      * `EOF`. If channel is `-1`, find any non default channel token.
      */
    def getHiddenTokensToRight(tokenIndex: Double, channel: Double): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    def getSourceName(): String = js.native
    
    /**
      * Get the text of all tokens in this buffer.
      */
    def getText(interval: typings.antlr4.miscIntervalSetMod.default): String = js.native
    
    /**
      * Get all tokens from start..stop inclusively.
      */
    def getTokens(start: Double, stop: Double, types: Any): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    def lazyInit(): Unit = js.native
    
    def mark(): Double = js.native
    
    /**
      * Given a starting index, return the index of the next token on channel.
      *
      * @return `i` if `tokens[i]` is on channel. `-1` if there are no tokens
      * on channel between `i` and `EOF`.
      */
    def nextTokenOnChannel(i: Double): Double = js.native
    def nextTokenOnChannel(i: Double, channel: Double): Double = js.native
    
    /**
      * Given a starting index, return the index of the previous token on channel.
      *
      * @return `i` if `tokens[i]` is on channel. `-1` if there are no tokens
      * on channel between `i` and `0`.
      */
    def previousTokenOnChannel(i: Double, channel: Double): Double = js.native
    
    def release(marker: Double): Double = js.native
    
    def reset(): Unit = js.native
    
    def seek(index: Double): Unit = js.native
    
    /**
      * Reset this token stream by setting its token source.
      */
    def setTokenSource(tokenSource: typings.antlr4.tokenSourceMod.default): Unit = js.native
    
    def setup(): Unit = js.native
    
    /**
      * Make sure index `i` in tokens has a token.
      *
      * @return if a token is located at index `i`
      */
    def sync(i: Double): Boolean = js.native
  }
}
