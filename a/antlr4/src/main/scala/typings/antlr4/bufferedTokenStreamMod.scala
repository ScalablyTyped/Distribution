package typings.antlr4

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferedTokenStreamMod {
  
  @JSImport("antlr4/BufferedTokenStream", "BufferedTokenStream")
  @js.native
  open class BufferedTokenStream () extends StObject {
    
    def LA(i: Double): Any = js.native
    
    def LB(k: Double): Token = js.native
    
    def LT(k: Double): Token = js.native
    
    def adjustSeekIndex(i: Double): Double = js.native
    
    def consume(): Unit = js.native
    
    def fetch(n: Double): Double = js.native
    
    var fetchEOF: Boolean = js.native
    
    def fill(): Unit = js.native
    
    def get(index: Double): Token = js.native
    
    def getHiddenTokensToRight(tokenIndex: Double, channel: Any): js.Array[Token] = js.native
    
    def getSourceName(): Any = js.native
    
    def getText(interval: Interval): Any = js.native
    
    def getTokens(start: Double, stop: Double, types: Any): js.Array[Token] = js.native
    
    var index: Double = js.native
    
    def lazyInit(): Unit = js.native
    
    def mark(): Double = js.native
    
    def nextTokenOnChannel(i: Double, channel: Any): Double = js.native
    
    def previousTokenOnChannel(i: Double, channel: Any): Double = js.native
    
    def release(marker: Double): Double = js.native
    
    def reset(): Unit = js.native
    
    def seek(index: Double): Unit = js.native
    
    def setTokenSource(tokenSource: Any): Unit = js.native
    
    def setup(): Unit = js.native
    
    def sync(i: Double): Boolean = js.native
    
    var tokenSource: Any = js.native
    
    var tokens: js.Array[Token] = js.native
  }
}
