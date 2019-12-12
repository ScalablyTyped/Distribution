package typings.androiduix.android.graphics.Paint

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.graphics.Paint.Cap.BUTT
import typings.androiduix.android.graphics.Paint.Cap.ROUND
import typings.androiduix.android.graphics.Paint.Cap.SQUARE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cap with Double] = js.native
  /* 0 */ @js.native
  object BUTT extends TopLevel[BUTT with Double]
  
  /* 1 */ @js.native
  object ROUND extends TopLevel[ROUND with Double]
  
  /* 2 */ @js.native
  object SQUARE extends TopLevel[SQUARE with Double]
  
}

