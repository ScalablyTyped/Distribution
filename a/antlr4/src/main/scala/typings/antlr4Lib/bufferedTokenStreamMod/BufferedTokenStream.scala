package typings
package antlr4Lib.bufferedTokenStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/BufferedTokenStream", "BufferedTokenStream")
@js.native
class BufferedTokenStream () extends js.Object {
  var fetchEOF: scala.Boolean = js.native
  var index: scala.Double = js.native
  var tokenSource: js.Any = js.native
  var tokens: js.Array[antlr4Lib.tokenMod.Token] = js.native
  def LA(i: scala.Double): js.Any = js.native
  def LB(k: scala.Double): antlr4Lib.tokenMod.Token = js.native
  def LT(k: scala.Double): antlr4Lib.tokenMod.Token = js.native
  def adjustSeekIndex(i: scala.Double): scala.Double = js.native
  def consume(): scala.Unit = js.native
  def fetch(n: scala.Double): scala.Double = js.native
  def fill(): scala.Unit = js.native
  def get(index: scala.Double): antlr4Lib.tokenMod.Token = js.native
  def getHiddenTokensToRight(tokenIndex: scala.Double, channel: js.Any): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def getSourceName(): js.Any = js.native
  def getText(interval: antlr4Lib.intervalSetMod.Interval): js.Any = js.native
  def getTokens(start: scala.Double, stop: scala.Double, types: js.Any): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def lazyInit(): scala.Unit = js.native
  def mark(): scala.Double = js.native
  def nextTokenOnChannel(i: scala.Double, channel: js.Any): scala.Double = js.native
  def previousTokenOnChannel(i: scala.Double, channel: js.Any): scala.Double = js.native
  def release(marker: scala.Double): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def seek(index: scala.Double): scala.Unit = js.native
  def setTokenSource(tokenSource: js.Any): scala.Unit = js.native
  def setup(): scala.Unit = js.native
  def sync(i: scala.Double): scala.Boolean = js.native
}

