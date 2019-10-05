package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Align extends js.Object

@JSGlobal("android.graphics.Paint.Align")
@js.native
object Align extends js.Object {
  @js.native
  sealed trait CENTER extends Align
  
  @js.native
  sealed trait LEFT extends Align
  
  @js.native
  sealed trait RIGHT extends Align
  
  /* 1 */ val CENTER: typings.androiduix.android.graphics.Paint.Align.CENTER with Double = js.native
  /* 0 */ val LEFT: typings.androiduix.android.graphics.Paint.Align.LEFT with Double = js.native
  /* 2 */ val RIGHT: typings.androiduix.android.graphics.Paint.Align.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Align with Double] = js.native
}

