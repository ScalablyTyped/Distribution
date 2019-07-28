package typings.androiduix.androiduiNs.attrNs.AttrBinderNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams
import typings.androiduix.androiduiNs.attrNs.AttrBinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBinderValue extends js.Object {
  var getter: js.UndefOr[js.Function1[/* host */ View | LayoutParams, _]] = js.native
  def setter(host: LayoutParams, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
  def setter(host: View, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
}

