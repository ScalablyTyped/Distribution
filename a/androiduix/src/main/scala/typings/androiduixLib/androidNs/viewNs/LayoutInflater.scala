package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.LayoutInflater")
@js.native
class LayoutInflater protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def inflate(layout: java.lang.String): View = js.native
  def inflate(layout: java.lang.String, viewParent: ViewGroup): View = js.native
  def inflate(layout: java.lang.String, viewParent: ViewGroup, attachToRoot: scala.Boolean): View = js.native
  def inflate(layout: stdLib.HTMLElement): View = js.native
  def inflate(layout: stdLib.HTMLElement, viewParent: ViewGroup): View = js.native
  def inflate(layout: stdLib.HTMLElement, viewParent: ViewGroup, attachToRoot: scala.Boolean): View = js.native
}

/* static members */
@JSGlobal("android.view.LayoutInflater")
@js.native
object LayoutInflater extends js.Object {
  def from(context: androiduixLib.androidNs.contentNs.Context): androiduixLib.androidNs.viewNs.LayoutInflater = js.native
}

