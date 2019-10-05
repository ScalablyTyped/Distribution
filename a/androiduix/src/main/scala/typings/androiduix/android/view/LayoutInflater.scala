package typings.androiduix.android.view

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.LayoutInflater")
@js.native
class LayoutInflater protected () extends js.Object {
  def this(context: Context) = this()
  var mContext: Context = js.native
  def getContext(): Context = js.native
  def inflate(layout: String): View = js.native
  def inflate(layout: String, viewParent: ViewGroup): View = js.native
  def inflate(layout: String, viewParent: ViewGroup, attachToRoot: Boolean): View = js.native
  def inflate(layout: HTMLElement): View = js.native
  def inflate(layout: HTMLElement, viewParent: ViewGroup): View = js.native
  def inflate(layout: HTMLElement, viewParent: ViewGroup, attachToRoot: Boolean): View = js.native
}

/* static members */
@JSGlobal("android.view.LayoutInflater")
@js.native
object LayoutInflater extends js.Object {
  def from(context: Context): LayoutInflater = js.native
}

