package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  def onCloseTag(tagName: String, offset: Double): Unit
  def onComment(offset: Double): Unit
  def onDoctype(offset: Double): Unit
  def onOpenTag(tagName: String, offset: Double): Unit
  def onText(text: String, offset: Double): Unit
}

object Anon_Offset {
  @scala.inline
  def apply(
    onCloseTag: (String, Double) => Unit,
    onComment: Double => Unit,
    onDoctype: Double => Unit,
    onOpenTag: (String, Double) => Unit,
    onText: (String, Double) => Unit
  ): Anon_Offset = {
    val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

