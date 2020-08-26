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
  
}

