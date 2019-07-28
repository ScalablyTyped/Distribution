package typings.androiduix.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("android.text.Layout.Alignment")
@js.native
object Alignment extends js.Object {
  @js.native
  sealed trait ALIGN_CENTER extends Alignment
  
  @js.native
  sealed trait ALIGN_LEFT extends Alignment
  
  @js.native
  sealed trait ALIGN_NORMAL extends Alignment
  
  @js.native
  sealed trait ALIGN_OPPOSITE extends Alignment
  
  @js.native
  sealed trait ALIGN_RIGHT extends Alignment
  
  /* 2 */ val ALIGN_CENTER: typings.androiduix.androidNs.textNs.LayoutNs.Alignment.ALIGN_CENTER with Double = js.native
  /* 3 */ val ALIGN_LEFT: typings.androiduix.androidNs.textNs.LayoutNs.Alignment.ALIGN_LEFT with Double = js.native
  /* 0 */ val ALIGN_NORMAL: typings.androiduix.androidNs.textNs.LayoutNs.Alignment.ALIGN_NORMAL with Double = js.native
  /* 1 */ val ALIGN_OPPOSITE: typings.androiduix.androidNs.textNs.LayoutNs.Alignment.ALIGN_OPPOSITE with Double = js.native
  /* 4 */ val ALIGN_RIGHT: typings.androiduix.androidNs.textNs.LayoutNs.Alignment.ALIGN_RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
}

