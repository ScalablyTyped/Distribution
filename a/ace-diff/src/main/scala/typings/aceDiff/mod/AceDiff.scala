package typings.aceDiff.mod

import typings.aceDiff.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AceDiff extends js.Object {
  def destroy(): Unit = js.native
  def diff(): Unit = js.native
  def getEditors(): Left = js.native
  def getNumDiffs(): Double = js.native
  def setOptions(options: AceDiffOpts): Unit = js.native
}

object AceDiff {
  @scala.inline
  def apply(
    destroy: () => Unit,
    diff: () => Unit,
    getEditors: () => Left,
    getNumDiffs: () => Double,
    setOptions: AceDiffOpts => Unit
  ): AceDiff = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), diff = js.Any.fromFunction0(diff), getEditors = js.Any.fromFunction0(getEditors), getNumDiffs = js.Any.fromFunction0(getNumDiffs), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[AceDiff]
  }
  @scala.inline
  implicit class AceDiffOps[Self <: AceDiff] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDiff(value: () => Unit): Self = this.set("diff", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEditors(value: () => Left): Self = this.set("getEditors", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumDiffs(value: () => Double): Self = this.set("getNumDiffs", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOptions(value: AceDiffOpts => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
  
}

