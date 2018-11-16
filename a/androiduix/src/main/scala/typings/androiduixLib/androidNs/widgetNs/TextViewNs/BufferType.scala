package typings
package androiduixLib.androidNs.widgetNs.TextViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferType extends js.Object

@JSGlobal("android.widget.TextView.BufferType")
@js.native
object BufferType extends js.Object {
  @js.native
  sealed trait EDITABLE
    extends androiduixLib.androidNs.widgetNs.TextViewNs.BufferType
  
  @js.native
  sealed trait NORMAL
    extends androiduixLib.androidNs.widgetNs.TextViewNs.BufferType
  
  @js.native
  sealed trait SPANNABLE
    extends androiduixLib.androidNs.widgetNs.TextViewNs.BufferType
  
  /* 2 */ val EDITABLE: EDITABLE with scala.Double = js.native
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 1 */ val SPANNABLE: SPANNABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.widgetNs.TextViewNs.BufferType with scala.Double] = js.native
}

