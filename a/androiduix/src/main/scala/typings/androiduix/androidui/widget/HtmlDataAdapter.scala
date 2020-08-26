package typings.androiduix.androidui.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.ViewGroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlDataAdapter extends js.Object {
  def onInflateAdapter(bindElement: HTMLElement): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: js.UndefOr[scala.Nothing], parent: ViewGroup): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context): Unit = js.native
  def onInflateAdapter(bindElement: HTMLElement, context: Context, parent: ViewGroup): Unit = js.native
}

