package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenIterator extends js.Object {
  def getCurrentToken(): Token = js.native
  def getCurrentTokenColumn(): Double = js.native
  def getCurrentTokenPosition(): Point = js.native
  def getCurrentTokenRange(): Range = js.native
  def getCurrentTokenRow(): Double = js.native
  def stepBackward(): Token = js.native
  def stepForward(): Token = js.native
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
  @scala.inline
  implicit class TokenIteratorOps[Self <: TokenIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCurrentToken(value: () => Token): Self = this.set("getCurrentToken", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTokenColumn(value: () => Double): Self = this.set("getCurrentTokenColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTokenPosition(value: () => Point): Self = this.set("getCurrentTokenPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTokenRange(value: () => Range): Self = this.set("getCurrentTokenRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTokenRow(value: () => Double): Self = this.set("getCurrentTokenRow", js.Any.fromFunction0(value))
    @scala.inline
    def setStepBackward(value: () => Token): Self = this.set("stepBackward", js.Any.fromFunction0(value))
    @scala.inline
    def setStepForward(value: () => Token): Self = this.set("stepForward", js.Any.fromFunction0(value))
  }
  
}

