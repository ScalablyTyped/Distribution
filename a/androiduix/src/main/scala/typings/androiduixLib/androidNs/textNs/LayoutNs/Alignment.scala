package typings
package androiduixLib.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("android.text.Layout.Alignment")
@js.native
object Alignment extends js.Object {
  @js.native
  sealed trait ALIGN_CENTER
    extends androiduixLib.androidNs.textNs.LayoutNs.Alignment
  
  @js.native
  sealed trait ALIGN_LEFT
    extends androiduixLib.androidNs.textNs.LayoutNs.Alignment
  
  @js.native
  sealed trait ALIGN_NORMAL
    extends androiduixLib.androidNs.textNs.LayoutNs.Alignment
  
  @js.native
  sealed trait ALIGN_OPPOSITE
    extends androiduixLib.androidNs.textNs.LayoutNs.Alignment
  
  @js.native
  sealed trait ALIGN_RIGHT
    extends androiduixLib.androidNs.textNs.LayoutNs.Alignment
  
  /* 2 */ val ALIGN_CENTER: ALIGN_CENTER with scala.Double = js.native
  /* 3 */ val ALIGN_LEFT: ALIGN_LEFT with scala.Double = js.native
  /* 0 */ val ALIGN_NORMAL: ALIGN_NORMAL with scala.Double = js.native
  /* 1 */ val ALIGN_OPPOSITE: ALIGN_OPPOSITE with scala.Double = js.native
  /* 4 */ val ALIGN_RIGHT: ALIGN_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.textNs.LayoutNs.Alignment with scala.Double] = js.native
}

