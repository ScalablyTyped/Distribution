package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlBaseView")
@js.native
class HtmlBaseView protected ()
  extends androiduixLib.androidNs.viewNs.View {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mHtmlTouchAble: js.Any = js.native
  def isHtmlTouchAble(): scala.Boolean = js.native
  def setHtmlTouchAble(enable: scala.Boolean): scala.Unit = js.native
}

