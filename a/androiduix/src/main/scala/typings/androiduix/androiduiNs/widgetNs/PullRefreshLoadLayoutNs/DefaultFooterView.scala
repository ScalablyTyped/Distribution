package typings.androiduix.androiduiNs.widgetNs.PullRefreshLoadLayoutNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.widgetNs.ProgressBar
import typings.androiduix.androidNs.widgetNs.TextView
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.DefaultFooterView")
@js.native
class DefaultFooterView protected () extends FooterView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var progressBar: ProgressBar = js.native
  var textView: TextView = js.native
}

