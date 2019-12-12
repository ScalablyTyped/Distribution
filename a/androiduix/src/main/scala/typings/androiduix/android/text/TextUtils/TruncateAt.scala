package typings.androiduix.android.text.TextUtils

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.text.TextUtils.TruncateAt.END
import typings.androiduix.android.text.TextUtils.TruncateAt.END_SMALL
import typings.androiduix.android.text.TextUtils.TruncateAt.MARQUEE
import typings.androiduix.android.text.TextUtils.TruncateAt.MIDDLE
import typings.androiduix.android.text.TextUtils.TruncateAt.START
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TruncateAt with Double] = js.native
  /* 2 */ @js.native
  object END extends TopLevel[END with Double]
  
  /* 4 */ @js.native
  object END_SMALL extends TopLevel[END_SMALL with Double]
  
  /* 3 */ @js.native
  object MARQUEE extends TopLevel[MARQUEE with Double]
  
  /* 1 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  /* 0 */ @js.native
  object START extends TopLevel[START with Double]
  
}

