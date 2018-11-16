package typings
package androiduixLib.androiduiNs.attrNs.AttrBinderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBinderValue extends js.Object {
  var getter: js.UndefOr[
    js.Function1[
      /* host */ androiduixLib.androidNs.viewNs.View | androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams, 
      _
    ]
  ] = js.native
  def setter(
    host: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams,
    attrValue: js.Any,
    attrBinder: androiduixLib.androiduiNs.attrNs.AttrBinder
  ): scala.Unit = js.native
  def setter(
    host: androiduixLib.androidNs.viewNs.View,
    attrValue: js.Any,
    attrBinder: androiduixLib.androiduiNs.attrNs.AttrBinder
  ): scala.Unit = js.native
}

