package typings.androiduix.android.graphics.Paint

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Style with Double] = js.native
  /* 0 */ @js.native
  object FILL extends TopLevel[FILL with Double]
  
  /* 2 */ @js.native
  object FILL_AND_STROKE extends TopLevel[FILL_AND_STROKE with Double]
  
  /* 1 */ @js.native
  object STROKE extends TopLevel[STROKE with Double]
  
}

