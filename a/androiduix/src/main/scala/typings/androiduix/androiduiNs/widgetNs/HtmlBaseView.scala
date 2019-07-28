package typings.androiduix.androiduiNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.View
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlBaseView")
@js.native
class HtmlBaseView protected () extends View {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mHtmlTouchAble: js.Any = js.native
  def isHtmlTouchAble(): Boolean = js.native
  def setHtmlTouchAble(enable: Boolean): Unit = js.native
}

