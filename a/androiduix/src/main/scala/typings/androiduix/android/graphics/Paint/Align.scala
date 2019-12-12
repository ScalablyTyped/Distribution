package typings.androiduix.android.graphics.Paint

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.graphics.Paint.Align.CENTER
import typings.androiduix.android.graphics.Paint.Align.LEFT
import typings.androiduix.android.graphics.Paint.Align.RIGHT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Align with Double] = js.native
  /* 1 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 0 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
}

