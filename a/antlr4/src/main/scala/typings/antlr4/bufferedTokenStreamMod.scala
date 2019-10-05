package typings.antlr4

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/BufferedTokenStream", JSImport.Namespace)
@js.native
object bufferedTokenStreamMod extends js.Object {
  @js.native
  class BufferedTokenStream () extends js.Object {
    var fetchEOF: Boolean = js.native
    var index: Double = js.native
    var tokenSource: js.Any = js.native
    var tokens: js.Array[Token] = js.native
    def LA(i: Double): js.Any = js.native
    def LB(k: Double): Token = js.native
    def LT(k: Double): Token = js.native
    def adjustSeekIndex(i: Double): Double = js.native
    def consume(): Unit = js.native
    def fetch(n: Double): Double = js.native
    def fill(): Unit = js.native
    def get(index: Double): Token = js.native
    def getHiddenTokensToRight(tokenIndex: Double, channel: js.Any): js.Array[Token] = js.native
    def getSourceName(): js.Any = js.native
    def getText(interval: Interval): js.Any = js.native
    def getTokens(start: Double, stop: Double, types: js.Any): js.Array[Token] = js.native
    def lazyInit(): Unit = js.native
    def mark(): Double = js.native
    def nextTokenOnChannel(i: Double, channel: js.Any): Double = js.native
    def previousTokenOnChannel(i: Double, channel: js.Any): Double = js.native
    def release(marker: Double): Double = js.native
    def reset(): Unit = js.native
    def seek(index: Double): Unit = js.native
    def setTokenSource(tokenSource: js.Any): Unit = js.native
    def setup(): Unit = js.native
    def sync(i: Double): Boolean = js.native
  }
  
}

