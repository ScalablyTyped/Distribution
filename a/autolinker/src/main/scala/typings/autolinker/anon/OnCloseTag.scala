package typings.autolinker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCloseTag extends js.Object {
  def onCloseTag(tagName: String, offset: Double): Unit = js.native
  def onComment(offset: Double): Unit = js.native
  def onDoctype(offset: Double): Unit = js.native
  def onOpenTag(tagName: String, offset: Double): Unit = js.native
  def onText(text: String, offset: Double): Unit = js.native
}

object OnCloseTag {
  @scala.inline
  def apply(
    onCloseTag: (String, Double) => Unit,
    onComment: Double => Unit,
    onDoctype: Double => Unit,
    onOpenTag: (String, Double) => Unit,
    onText: (String, Double) => Unit
  ): OnCloseTag = {
    val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
    __obj.asInstanceOf[OnCloseTag]
  }
  @scala.inline
  implicit class OnCloseTagOps[Self <: OnCloseTag] (val x: Self) extends AnyVal {
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
    def setOnCloseTag(value: (String, Double) => Unit): Self = this.set("onCloseTag", js.Any.fromFunction2(value))
    @scala.inline
    def setOnComment(value: Double => Unit): Self = this.set("onComment", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDoctype(value: Double => Unit): Self = this.set("onDoctype", js.Any.fromFunction1(value))
    @scala.inline
    def setOnOpenTag(value: (String, Double) => Unit): Self = this.set("onOpenTag", js.Any.fromFunction2(value))
    @scala.inline
    def setOnText(value: (String, Double) => Unit): Self = this.set("onText", js.Any.fromFunction2(value))
  }
  
}

