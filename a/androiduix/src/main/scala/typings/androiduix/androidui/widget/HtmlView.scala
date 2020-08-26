package typings.androiduix.androidui.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlView extends HtmlBaseView {
  def getHtml(): String = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
  def setHtml(html: String): Unit = js.native
}

