package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenIterator extends js.Object {
  def getCurrentToken(): Token
  def getCurrentTokenColumn(): Double
  def getCurrentTokenPosition(): Point
  def getCurrentTokenRange(): Range
  def getCurrentTokenRow(): Double
  def stepBackward(): Token
  def stepForward(): Token
}

object TokenIterator {
  @scala.inline
  def apply(
    getCurrentToken: () => Token,
    getCurrentTokenColumn: () => Double,
    getCurrentTokenPosition: () => Point,
    getCurrentTokenRange: () => Range,
    getCurrentTokenRow: () => Double,
    stepBackward: () => Token,
    stepForward: () => Token
  ): TokenIterator = {
    val __obj = js.Dynamic.literal(getCurrentToken = js.Any.fromFunction0(getCurrentToken), getCurrentTokenColumn = js.Any.fromFunction0(getCurrentTokenColumn), getCurrentTokenPosition = js.Any.fromFunction0(getCurrentTokenPosition), getCurrentTokenRange = js.Any.fromFunction0(getCurrentTokenRange), getCurrentTokenRow = js.Any.fromFunction0(getCurrentTokenRow), stepBackward = js.Any.fromFunction0(stepBackward), stepForward = js.Any.fromFunction0(stepForward))
    __obj.asInstanceOf[TokenIterator]
  }
}

