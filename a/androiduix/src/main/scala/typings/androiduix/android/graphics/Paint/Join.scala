package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Join extends js.Object

@JSGlobal("android.graphics.Paint.Join")
@js.native
object Join extends js.Object {
  @js.native
  sealed trait BEVEL extends Join
  
  @js.native
  sealed trait MITER extends Join
  
  @js.native
  sealed trait ROUND extends Join
  
  /* 2 */ val BEVEL: typings.androiduix.android.graphics.Paint.Join.BEVEL with Double = js.native
  /* 0 */ val MITER: typings.androiduix.android.graphics.Paint.Join.MITER with Double = js.native
  /* 1 */ val ROUND: typings.androiduix.android.graphics.Paint.Join.ROUND with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Join with Double] = js.native
}

