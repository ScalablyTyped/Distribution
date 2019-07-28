package typings.androiduix.androidNs.textNs.TextUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TruncateAt extends js.Object

@JSGlobal("android.text.TextUtils.TruncateAt")
@js.native
object TruncateAt extends js.Object {
  @js.native
  sealed trait END extends TruncateAt
  
  @js.native
  sealed trait END_SMALL extends TruncateAt
  
  @js.native
  sealed trait MARQUEE extends TruncateAt
  
  @js.native
  sealed trait MIDDLE extends TruncateAt
  
  @js.native
  sealed trait START extends TruncateAt
  
  /* 2 */ val END: typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt.END with Double = js.native
  /* 4 */ val END_SMALL: typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt.END_SMALL with Double = js.native
  /* 3 */ val MARQUEE: typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt.MARQUEE with Double = js.native
  /* 1 */ val MIDDLE: typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt.MIDDLE with Double = js.native
  /* 0 */ val START: typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt.START with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TruncateAt with Double] = js.native
}

