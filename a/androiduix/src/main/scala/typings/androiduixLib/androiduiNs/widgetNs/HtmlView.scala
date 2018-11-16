package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlView")
@js.native
class HtmlView protected () extends HtmlBaseView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  def getHtml(): java.lang.String = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): scala.Unit = js.native
  def setHtml(html: java.lang.String): scala.Unit = js.native
}

