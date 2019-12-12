package typings.androiduix.android.graphics.Paint

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.graphics.Paint.Join.BEVEL
import typings.androiduix.android.graphics.Paint.Join.MITER
import typings.androiduix.android.graphics.Paint.Join.ROUND
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Join with Double] = js.native
  /* 2 */ @js.native
  object BEVEL extends TopLevel[BEVEL with Double]
  
  /* 0 */ @js.native
  object MITER extends TopLevel[MITER with Double]
  
  /* 1 */ @js.native
  object ROUND extends TopLevel[ROUND with Double]
  
}

