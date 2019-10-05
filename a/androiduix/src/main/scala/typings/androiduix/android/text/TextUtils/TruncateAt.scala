package typings.androiduix.android.text.TextUtils

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
  
  /* 2 */ val END: typings.androiduix.android.text.TextUtils.TruncateAt.END with Double = js.native
  /* 4 */ val END_SMALL: typings.androiduix.android.text.TextUtils.TruncateAt.END_SMALL with Double = js.native
  /* 3 */ val MARQUEE: typings.androiduix.android.text.TextUtils.TruncateAt.MARQUEE with Double = js.native
  /* 1 */ val MIDDLE: typings.androiduix.android.text.TextUtils.TruncateAt.MIDDLE with Double = js.native
  /* 0 */ val START: typings.androiduix.android.text.TextUtils.TruncateAt.START with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TruncateAt with Double] = js.native
}

