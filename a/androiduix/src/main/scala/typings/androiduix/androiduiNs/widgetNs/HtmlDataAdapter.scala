package typings.androiduix.androiduiNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlDataAdapter extends js.Object {
  def onInflateAdapter(bindElement: HTMLElement): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context, parent: ViewGroup): Unit = js.native
}

