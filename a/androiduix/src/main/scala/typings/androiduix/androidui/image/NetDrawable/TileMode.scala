package typings.androiduix.androidui.image.NetDrawable

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.androidui.image.NetDrawable.TileMode.DEFAULT
import typings.androiduix.androidui.image.NetDrawable.TileMode.REPEAT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileMode extends js.Object

@JSGlobal("androidui.image.NetDrawable.TileMode")
@js.native
object TileMode extends js.Object {
  @js.native
  sealed trait DEFAULT extends TileMode
  
  @js.native
  sealed trait REPEAT extends TileMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileMode with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 1 */ @js.native
  object REPEAT extends TopLevel[REPEAT with Double]
  
}

