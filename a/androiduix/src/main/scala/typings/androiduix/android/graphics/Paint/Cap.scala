package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Cap extends js.Object

@JSGlobal("android.graphics.Paint.Cap")
@js.native
object Cap extends js.Object {
  @js.native
  sealed trait BUTT extends Cap
  
  @js.native
  sealed trait ROUND extends Cap
  
  @js.native
  sealed trait SQUARE extends Cap
  
  /* 0 */ val BUTT: typings.androiduix.android.graphics.Paint.Cap.BUTT with Double = js.native
  /* 1 */ val ROUND: typings.androiduix.android.graphics.Paint.Cap.ROUND with Double = js.native
  /* 2 */ val SQUARE: typings.androiduix.android.graphics.Paint.Cap.SQUARE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cap with Double] = js.native
}

