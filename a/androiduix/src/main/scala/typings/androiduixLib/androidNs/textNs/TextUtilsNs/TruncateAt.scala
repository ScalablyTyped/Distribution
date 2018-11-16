package typings
package androiduixLib.androidNs.textNs.TextUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TruncateAt extends js.Object

@JSGlobal("android.text.TextUtils.TruncateAt")
@js.native
object TruncateAt extends js.Object {
  @js.native
  sealed trait END
    extends androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  
  @js.native
  sealed trait END_SMALL
    extends androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  
  @js.native
  sealed trait MARQUEE
    extends androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  
  @js.native
  sealed trait MIDDLE
    extends androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  
  @js.native
  sealed trait START
    extends androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  
  /* 2 */ val END: END with scala.Double = js.native
  /* 4 */ val END_SMALL: END_SMALL with scala.Double = js.native
  /* 3 */ val MARQUEE: MARQUEE with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 0 */ val START: START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt with scala.Double] = js.native
}

