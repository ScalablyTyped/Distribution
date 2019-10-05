package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Style extends js.Object

@JSGlobal("android.graphics.Paint.Style")
@js.native
object Style extends js.Object {
  @js.native
  sealed trait FILL extends Style
  
  @js.native
  sealed trait FILL_AND_STROKE extends Style
  
  @js.native
  sealed trait STROKE extends Style
  
  /* 0 */ val FILL: typings.androiduix.android.graphics.Paint.Style.FILL with Double = js.native
  /* 2 */ val FILL_AND_STROKE: typings.androiduix.android.graphics.Paint.Style.FILL_AND_STROKE with Double = js.native
  /* 1 */ val STROKE: typings.androiduix.android.graphics.Paint.Style.STROKE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Style with Double] = js.native
}

